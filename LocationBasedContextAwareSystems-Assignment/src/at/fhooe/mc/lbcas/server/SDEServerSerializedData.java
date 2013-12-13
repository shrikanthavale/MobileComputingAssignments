/**
 * 
 */
package at.fhooe.mc.lbcas.server;

import java.awt.Point;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Vector;

import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.entities.ObjektTeil;
import at.fhooe.mc.lbcas.entities.POIObject;
import at.fhooe.mc.lbcas.entities.PointObject;

/**
 * @author Shrikant Havale
 * 
 */
public class SDEServerSerializedData implements GEOServerInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.server.GEOServerInterface#typeQuery(java.util.List)
	 */
	@Override
	public Vector<GeoObject> typeQuery(List<Integer> _typeList) {

		System.out.println("Started Creating POI Objects");
		// container for storing list of GEO Objects
		Vector<GeoObject> objectContainerTemp = new Vector<GeoObject>();
		Vector<GeoObject> objectContainer = null;

		objectContainer = loadData();

		for (GeoObject geoObject : objectContainer) {

			List<ObjektTeil> m_listObjectParts = geoObject
					.getM_listObjectParts();

			// iterate through the objects
			for (ObjektTeil objektTeil : m_listObjectParts) {

				// check if it is point object
				if (objektTeil instanceof PointObject) {

					// cast to line object
					PointObject pointObject = (PointObject) objektTeil;

					// get the line
					Point point = pointObject.getM_pointData();

					// create the POI object out of it
					if (_typeList.contains(geoObject.getM_type())) {
						POIObject poiObject = new POIObject(
								geoObject.getM_id(), geoObject.getM_type(),
								point);
						objectContainerTemp.addElement(poiObject);
					}
				}
			}
			objectContainerTemp.addElement(geoObject);
		}

		System.out.println("Done Creating POI Objects");
		return objectContainerTemp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.server.GEOServerInterface#login(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String _user, String _pass, String _server) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.server.GEOServerInterface#loadData()
	 */
	@Override
	public Vector<GeoObject> loadData() {

		Vector<GeoObject> objectContainer = new Vector<>();
		GeoObject geoObject = null;
		try {

			System.out.println("Loading Serialized Data ..... Plese Wait");

			// load the serialized object located on F Drive of the computer
			// hard disk
			for (int geoObjectCounter = 0; geoObjectCounter <= 126510; geoObjectCounter++) {
				FileInputStream fileIn = new FileInputStream(
						"F:\\GeoObjectsSerialiazed\\GeoObject" + geoObjectCounter + ".ser"); //$NON-NLS-1$
				ObjectInputStream in = new ObjectInputStream(fileIn);
				geoObject = (GeoObject) in.readObject();
				objectContainer.addElement(geoObject);
				in.close();
				fileIn.close();
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		}

		System.out.println("Loading Serialized Data Completed ......");
		return objectContainer;
	}

}
