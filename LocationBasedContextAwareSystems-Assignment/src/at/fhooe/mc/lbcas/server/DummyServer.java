package at.fhooe.mc.lbcas.server;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import at.fhooe.mc.lbcas.entities.AreaObject;
import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.entities.ObjektTeil;
import de.intergis.JavaClient.comm.CgConnection;
import de.intergis.JavaClient.comm.CgGeoConnection;
import de.intergis.JavaClient.comm.CgGeoInterface;
import de.intergis.JavaClient.comm.CgIGeoObject;
import de.intergis.JavaClient.comm.CgIGeoPart;
import de.intergis.JavaClient.comm.CgResultSet;
import de.intergis.JavaClient.comm.CgStatement;
import de.intergis.JavaClient.gui.IgcConnection;

/**
 * This class represents the dummy server, which can be hosted locally and the
 * data can be extracted from local server. But this to work server has to start
 * up locally
 * 
 * @author University
 * 
 */
public class DummyServer implements GEOServerInterface {

	// the connection to the geo server
	CgGeoConnection m_geoConnection = null;

	// the query interface of the server to extract data
	CgGeoInterface m_geoInterface = null;

	/**
	 * loads the data from dummy server
	 * 
	 * @return {@link Vector} of {@link GeoObject} returns the list of
	 *         GeoObjects
	 */
	@Override
	public Vector<GeoObject> loadData() {

		// vector for holding GeoObject
		Vector<GeoObject> objectContainer = new Vector<GeoObject>();

		try {
			// hard code the data type to be fetched in query
			String cmd = "select * from data where type in (233, 931, 932, 933, 934, 1101)";

			// execute the statement
			CgStatement stmt = m_geoInterface.Execute(cmd);

			// cursor
			CgResultSet cursor = stmt.getCursor();

			String id = null;
			int type = 0;
			Polygon poly = null;

			// while there are still objects in the queue
			while (cursor.next()) {

				// list of object parts
				List<ObjektTeil> listObjektTeils = new ArrayList<>();

				CgIGeoObject obj = cursor.getObject();

				// extract object ID
				id = obj.getName();

				// extract object type/category (for instance wood, river, land,
				// ...)
				type = obj.getCategory();

				// extract object geometry, which could be build up from many
				// parts
				CgIGeoPart[] parts = obj.getParts();
				for (int i = 0; i < parts.length; i++) {
					int pointCount = parts[i].getPointCount();
					int[] xArray = parts[i].getX();
					int[] yArray = parts[i].getY();
					poly = new Polygon(xArray, yArray, pointCount);
					// put everything together into our GEO object
					// representation
					AreaObject areaObject = new AreaObject();
					areaObject.setM_polygon(poly);
					listObjektTeils.add(areaObject);
				} // for i

				// create geo object
				GeoObject geo = new GeoObject(id, type, listObjektTeils);
				objectContainer.addElement(geo);

			} // while cursor

		} catch (Exception _e) {
			_e.printStackTrace();
			return null;
		}

		return objectContainer;
	}

	/*
	 * This method helps in login into dummy server after accepting user name,
	 * password and server name
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.interfaces.GEOServerInterface#login(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String _user, String _pass, String _server) {

		try {
			// the geo server gets initialized
			m_geoConnection = new IgcConnection(new CgConnection(_user, _pass,
					_server, null));

			// the query interface of the server is retrieved
			m_geoInterface = m_geoConnection.getInterface();

			// if no exception occurred return true
			return true;

		} catch (Exception _e) {
			// in case of exception print the stack trace and return false
			_e.printStackTrace();

			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.interfaces.GEOServerInterface#typeQuery(int[])
	 */
	@Override
	public Vector<GeoObject> typeQuery(List<Integer> _types) {

		// empty string
		String allTypes = "";

		// loop through the
		for (Integer temp : _types) {
			allTypes = allTypes + temp + ", ";
		}

		// remove the last comma and space
		allTypes.substring(0, allTypes.length() - 2);

		// vector for holding GeoObject
		Vector<GeoObject> objectContainer = new Vector<GeoObject>();

		try {

			// hard code the data type to be fetched in query
			String cmd = "select * from data where type in (" + allTypes + " )";

			// execute the statement
			CgStatement stmt = m_geoInterface.Execute(cmd);

			// cursor
			CgResultSet cursor = stmt.getCursor();

			String id = null;
			int type = 0;
			Polygon poly = null;

			// list of object parts
			List<ObjektTeil> listObjektTeils = new ArrayList<>();

			// while there are still objects in the queue
			while (cursor.next()) {

				CgIGeoObject obj = cursor.getObject();

				// extract object ID
				id = obj.getName();

				// extract object type/category (for instance wood, river, land,
				// ...)
				type = obj.getCategory();

				// extract object geometry, which could be build up from many
				// parts
				CgIGeoPart[] parts = obj.getParts();
				for (int i = 0; i < parts.length; i++) {
					int pointCount = parts[i].getPointCount();
					int[] xArray = parts[i].getX();
					int[] yArray = parts[i].getY();
					poly = new Polygon(xArray, yArray, pointCount);
					// put everything together into our geo object
					// representation
					AreaObject areaObject = new AreaObject();
					areaObject.setM_polygon(poly);
					listObjektTeils.add(areaObject);
				} // for i

				// create geo object
				GeoObject geo = new GeoObject(id, type, listObjektTeils);
				objectContainer.addElement(geo);

			} // while cursor

		} catch (Exception _e) {
			_e.printStackTrace();
			return null;
		}

		return objectContainer;
	}

}
