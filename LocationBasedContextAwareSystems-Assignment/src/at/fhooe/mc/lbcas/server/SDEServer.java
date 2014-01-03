package at.fhooe.mc.lbcas.server;

import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import at.fhooe.mc.lbcas.entities.AreaObject;
import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.entities.Line;
import at.fhooe.mc.lbcas.entities.LineObject;
import at.fhooe.mc.lbcas.entities.ObjektTeil;
import at.fhooe.mc.lbcas.entities.POIObject;
import at.fhooe.mc.lbcas.entities.PointObject;

import com.esri.sde.sdk.client.SeColumnDefinition;
import com.esri.sde.sdk.client.SeConnection;
import com.esri.sde.sdk.client.SeException;
import com.esri.sde.sdk.client.SeQuery;
import com.esri.sde.sdk.client.SeRow;
import com.esri.sde.sdk.client.SeShape;
import com.esri.sde.sdk.client.SeSqlConstruct;
import com.esri.sde.sdk.client.SeTable;

/**
 * This class is responsible for establishing the connection with SDE Server and
 * loading the data from different layers of the map present on SDE server.
 * Objects from layers are converted to {@link GeoObject} and stored in
 * container for painting them.
 * 
 * @author Shrikant Havale
 * 
 */
public class SDEServer implements GEOServerInterface {

	// connection object
	protected SeConnection m_conn = null;

	// object container for storing GEO objects
	private static Vector<GeoObject> m_objectContainer = null;

	// object container for POI
	private static Vector<GeoObject> m_poicontainer = null;

	/**
	 * This method establishes connection to server and loads the data from
	 * different layers of the map and converts them to GEOObject.
	 * 
	 * @return vector containing all GeoObjects from different layers
	 */
	@Override
	public Vector<GeoObject> loadData() {

		System.out.println("Connected ............ Loading Data Please Wait");

		if (m_objectContainer == null) {
			try {

				// container for storing list of GEO Objects
				m_objectContainer = new Vector<GeoObject>();

				// hard coded layer names for getting objects
				String[] layerNames = new String[] {
						"SDE.GEO_ADMIN.ADMINAREA_1_BUNDESLAENDER_BMN31",
						"SDE.GEO_ADMIN.ADMINAREA_0_LANDESGRENZEN_BMN31",
						"SDE.GEO_ADMIN.AREA_Wald_BMN31",
						"SDE.GEO_ADMIN.AREA_GEWAESSER_BMN31",
						"SDE.GEO_ADMIN.AREA_WOHNGEBIETE_BMN31",
						"SDE.GEO_ADMIN.LINE_EISENBAHNGLEISE_BMN31",
						"SDE.GEO_ADMIN.POINT_POI_BMN31" };

				// iterate through every layer
				for (int layerCounter = 0; layerCounter < layerNames.length; layerCounter++) {

					// each layer gets queried separately
					SeSqlConstruct sqlConstruct = new SeSqlConstruct(
							layerNames[layerCounter]);

					// get the table of the corresponding layer
					SeTable tableForLayer = new SeTable(m_conn,
							layerNames[layerCounter]);

					// get the column definitions of the table
					SeColumnDefinition[] columnDefinition = tableForLayer
							.describe();

					// column array variable
					String columnNames[] = new String[columnDefinition.length];

					// get the column names in the column array
					for (int columnnCount = 0; columnnCount < columnDefinition.length; columnnCount++) {
						// add only relevant columns
						columnNames[columnnCount] = columnDefinition[columnnCount]
								.getName();
					}

					// build the query
					SeQuery query = new SeQuery(m_conn, columnNames,
							sqlConstruct);

					// prepare the query
					query.prepareQuery();

					// execute the query
					query.execute();

					// string for GEO object type
					String geoObjectID = null;

					// for storing GEO object type
					int geoObjectType = -1;

					// area object for storing normal polygons
					List<ObjektTeil> listObjectParts = null;

					// create the row variable
					SeRow row = null;

					// iterate through the individual objects in the layer
					while ((row = query.fetch()) != null) {

						// Retrieve data from the first column
						for (int columnCounter = 0; columnCounter < columnDefinition.length; columnCounter++) {

							int dataType = columnDefinition[columnCounter]
									.getType();

							if (columnDefinition[columnCounter].getName()
									.equals("OBJECTID")
									|| columnDefinition[columnCounter]
											.getName().equals("FEATTYP")
									|| columnDefinition[columnCounter]
											.getName().equals("SHAPE"))
								switch (dataType) {
								case SeColumnDefinition.TYPE_STRING:
									break;
								case SeColumnDefinition.TYPE_INT16:
									geoObjectType = row.getShort(columnCounter);
									break;
								case SeColumnDefinition.TYPE_INT32:
									geoObjectID = String.valueOf(row
											.getInteger(columnCounter)
											.intValue());
									break;
								case SeColumnDefinition.TYPE_INT64:
									break;
								case SeColumnDefinition.TYPE_FLOAT64:
									break;
								case SeColumnDefinition.TYPE_SHAPE:
									// get the shape
									SeShape shape = row.getShape(columnCounter);

									if (shape.getType() == SeShape.TYPE_POLYGON) {
										// if the shape is of type POLYGON call
										// the
										// appropriate method
										listObjectParts = this
												.createAreaObjectForPolygons(shape);
									} else if (shape.getType() == SeShape.TYPE_MULTI_POLYGON) {
										// if the shape is of type multi polygon
										// call appropriate method
										listObjectParts = this
												.createAreaObjectForPolygons(shape);
									} else if (shape.getType() == SeShape.TYPE_LINE) {
										// if the shape of the object is of type
										// Line
										listObjectParts = this
												.createLineObjectsForSimpleLine(shape);
									} else if (shape.getType() == SeShape.TYPE_MULTI_LINE) {
										// if the shape of the object is of type
										// multi Line
										listObjectParts = this
												.createLineObjectsForSimpleLine(shape);
									} else if (shape.getType() == SeShape.TYPE_SIMPLE_LINE) {
										// if the shape of the object is of type
										// Simple Line
										listObjectParts = this
												.createLineObjectsForSimpleLine(shape);
									} else if (shape.getType() == SeShape.TYPE_MULTI_SIMPLE_LINE) {
										// check if the shape of object is of
										// type
										// type multi simple line
										listObjectParts = this
												.createLineObjectsForSimpleLine(shape);
									} else if (shape.getType() == SeShape.TYPE_POINT) {
										// if the shape of the object is of type
										// point
										listObjectParts = this
												.createPointObjectsForPoints(shape);
									} else if (shape.getType() == SeShape.TYPE_MULTI_POINT) {
										// if the shape of the object is multi
										// point
										listObjectParts = this
												.createPointObjectsForPoints(shape);
									}
									// Call a function to retrieve the shape
									// attributes
									break;
								} // switch
							if (listObjectParts != null
									&& listObjectParts.size() > 0) {
								GeoObject geoObject = new GeoObject(
										geoObjectID, geoObjectType,
										listObjectParts);
								m_objectContainer.addElement(geoObject);
								listObjectParts = null;

							}

						}// for j
					}// while row
				} // for i --> layers
				m_conn.close();
			} catch (Exception _e) {
				_e.printStackTrace();
				return null;
			}
		}

		System.out.println("Data Loaded Successfully ................ ");
		return m_objectContainer;
	}

	/**
	 * This method will create {@link PointObject} from the coordinates of the
	 * shape. Method should be used only for POINT or MULTI POINT
	 * 
	 * @param shape
	 * @return
	 * @throws SeException
	 */
	private List<ObjektTeil> createPointObjectsForPoints(SeShape shape)
			throws SeException {

		// list of object parts
		List<ObjektTeil> listObjectParts = new ArrayList<>();

		// all coordinates of shape
		double[][][] pointArray = shape.getAllCoords();

		// logic for external points and points inside it
		for (int numberPoints = 0; numberPoints < pointArray.length; numberPoints++) {

			for (int innerPointsCount = 0; innerPointsCount < pointArray[numberPoints].length; innerPointsCount++) {

				// line object
				PointObject pointObject = new PointObject();

				// capture all the points from the line
				for (int actualPoint = 0; actualPoint < pointArray[numberPoints][innerPointsCount].length; actualPoint += 2) {
					pointObject
							.setM_pointData(new Point(
									(int) (pointArray[numberPoints][innerPointsCount][actualPoint]),
									(int) (pointArray[numberPoints][innerPointsCount][actualPoint + 1])));

				}

				// add the line to object parts
				listObjectParts.add(pointObject);

			}
		}

		// return the list of object parts
		return listObjectParts;

	}

	/**
	 * This methods accepts the shape of type simple line and generates the list
	 * of object parts
	 * 
	 * @param shape
	 *            simple line shape containing the coordinates to draw the line
	 * @return List<ObjektTeil> {@link List{@link ObjektTeil} list of simple
	 *         line objects.
	 * @throws SeException
	 *             seexception
	 */
	private List<ObjektTeil> createLineObjectsForSimpleLine(SeShape shape)
			throws SeException {

		// list of object parts
		List<ObjektTeil> listObjectParts = new ArrayList<>();

		// all coordinates of shape
		double[][][] pointArray = shape.getAllCoords();

		// logic for external lines and lines inside it
		for (int numberLines = 0; numberLines < pointArray.length; numberLines++) {

			for (int innerLineCounts = 0; innerLineCounts < pointArray[numberLines].length; innerLineCounts++) {

				// line object
				LineObject lineObject = new LineObject();

				// create a line
				Line line = new Line();

				// capture all the points from the line
				for (int singleLinePoints = 0; singleLinePoints < pointArray[numberLines][innerLineCounts].length; singleLinePoints += 2) {
					line.addPoints(
							(int) (pointArray[numberLines][innerLineCounts][singleLinePoints]),
							(int) (pointArray[numberLines][innerLineCounts][singleLinePoints + 1]));
				}

				// add the line to area object
				lineObject.setM_line(line);

				// add the line to object parts
				listObjectParts.add(lineObject);

			}
		}

		// return the list of object parts
		return listObjectParts;
	}

	/**
	 * This method accepts the shape of polygon type and stores it in area
	 * object and creates list of object parts
	 * 
	 * @param _shape
	 *            polygon shape containing the coordinates of the object
	 * @return List<ObjektTeil> {@link List{@link ObjektTeil} list of area
	 *         objects containing the polygon
	 * @throws SeException
	 * @{@link SeException}
	 */
	private List<ObjektTeil> createAreaObjectForPolygons(SeShape _shape)
			throws SeException {

		// list of object parts
		List<ObjektTeil> listObjectParts = new ArrayList<>();

		// get all the coordinates of the polygon
		double[][][] pointArray = _shape.getAllCoords();

		// logic for external polygons and polygons inside it
		for (int numberPolygons = 0; numberPolygons < pointArray.length; numberPolygons++) {

			// outermost polygon part
			AreaObject outerMostAreaObject = new AreaObject();

			// the first one will be always outermost
			boolean isOuterMostPolygon = true;

			// loop through the outermost and its internals
			for (int innerPolygonsCount = 0; innerPolygonsCount < pointArray[numberPolygons].length; innerPolygonsCount++) {

				// create a polygon object
				Polygon polygon = new Polygon();

				// capture all the points from the polygon
				for (int singlePolygonPoints = 0; singlePolygonPoints < pointArray[numberPolygons][innerPolygonsCount].length; singlePolygonPoints += 2) {
					polygon.addPoint(
							(int) (pointArray[numberPolygons][innerPolygonsCount][singlePolygonPoints]),
							(int) (pointArray[numberPolygons][innerPolygonsCount][singlePolygonPoints + 1]));
				}

				if (isOuterMostPolygon) {
					// if its the main one - then directly consider it as main
					// area object
					outerMostAreaObject.setM_polygon(polygon);

					// make the flag false
					isOuterMostPolygon = false;

				} else {
					// area object for storing the polygon
					AreaObject areaObject = new AreaObject();

					// add the polygon to area object
					areaObject.setM_polygon(polygon);

					// add as child of outer most one
					outerMostAreaObject.getM_listObjectParts().add(areaObject);
				}

			}

			// add all these outermost area objects to one GEO Object
			listObjectParts.add(outerMostAreaObject);
		}

		// return the area object
		return listObjectParts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.interfaces.GEOServerInterface#login(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String _user, String _pass, String _server) {
		try {

			// establish the connection
			m_conn = new SeConnection(_server, 5151, "SDE", _user, _pass);

			// if no exception connection successful
			return true;

		} catch (SeException seException) {
			System.out.println("Connection to SDE Server Failed");
			return false;

		} catch (Exception e) {
			System.out.println("Connection to SDE Server Failed");
			return false;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.interfaces.GEOServerInterface#typeQuery(int[])
	 */
	@Override
	public Vector<GeoObject> typeQuery(List<Integer> _typeList) {

		System.out.println("LOADING POI .........");

		int contextAwarePOI = _typeList.get(_typeList.size() - 1);

		// remove previous POIs
		if (m_poicontainer != null)
			m_objectContainer.removeAll(m_poicontainer);

		m_poicontainer = new Vector<>();

		for (GeoObject geoObject : m_objectContainer) {

			int geoObjectType = geoObject.getM_type();

			String geoObjectID = geoObject.getM_id();

			List<ObjektTeil> listObjectParts = geoObject.getM_listObjectParts();
			ObjektTeil objektTeil = listObjectParts.get(0);

			POIObject poiObject = null;

			if (objektTeil instanceof PointObject
					&& _typeList.contains(geoObjectType)) {
				// if the shape of the object is of type
				// point
				poiObject = new POIObject(null, geoObjectID, geoObjectType,
						((PointObject) objektTeil).getM_pointData());

				m_poicontainer.addElement(poiObject);

			}
		}

		// HOME POI
		if (contextAwarePOI == -8888) {
			String imageURL = "at/fhooe/mc/lbcas/component/poicomponent/homeicon.jpg";
			Point point = new Point(522778, 353723);
			POIObject poiObject = new POIObject(imageURL, "-8888", -8888, point);
			m_poicontainer.addElement(poiObject);

		}

		// Office POI
		if (contextAwarePOI == -9999) {
			String imageURL = "at/fhooe/mc/lbcas/component/poicomponent/officeicon.jpg";
			Point point = new Point(525778, 356723);
			POIObject poiObject = new POIObject(imageURL, "-9999", -9999, point);
			m_poicontainer.addElement(poiObject);
		}

		m_objectContainer.addAll(m_poicontainer);
		System.out.println("Data Loaded Successfully ................ ");

		return m_objectContainer;
	}

	@Override
	public Vector<GeoObject> clearPOIS() {

		System.out.println("CLEARING POI .........");
		// remove previous POIs
		if (m_poicontainer != null)
			m_objectContainer.removeAll(m_poicontainer);

		return m_objectContainer;
	}

	@Override
	public Vector<GeoObject> typeQuery(List<Integer> _typeList,
			List<Point> _gpsCoordinates, String _imagePath) {

		if (m_poicontainer != null)
			m_poicontainer.clear();

		for (GeoObject geoObject : m_objectContainer) {

			int geoObjectType = geoObject.getM_type();
			String geoObjectID = geoObject.getM_id();

			List<ObjektTeil> listObjectParts = geoObject.getM_listObjectParts();

			if (listObjectParts != null && listObjectParts.size() > 0) {
				ObjektTeil objektTeil = listObjectParts.get(0);

				if (objektTeil instanceof PointObject
						&& _typeList.contains(geoObjectType)) {

					PointObject pointObject = (PointObject) objektTeil;

					for (Point point : _gpsCoordinates) {
						if ((Math.abs(pointObject.getM_pointData().x - point.x) < 1000)
								&& (Math.abs(pointObject.getM_pointData().y
										- point.y) < 1000)) {

							POIObject restaurantPOI = new POIObject(_imagePath,
									geoObjectID, geoObjectType,
									pointObject.getM_pointData());
							m_poicontainer.add(restaurantPOI);

						}
					}
				}
			}
		}

		// HOME POI
		if (_typeList.contains(-8888)) {
			Point point = new Point(522778, 353723);
			POIObject poiObject = new POIObject(_imagePath, "-8888", -8888,
					point);
			m_poicontainer.addElement(poiObject);

		}

		// Office POI
		if (_typeList.contains(-9999)) {
			Point point = new Point(525778, 356723);
			POIObject poiObject = new POIObject(_imagePath, "-9999", -9999,
					point);
			m_poicontainer.addElement(poiObject);
		}

		return m_poicontainer;
	}

}