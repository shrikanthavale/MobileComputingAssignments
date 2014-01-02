/**
 * 
 */
package at.fhooe.mc.lbcas.server;

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

	// object container for storing GEO objects
	private static Vector<GeoObject> m_objectContainer = null;

	// point of interest container
	private static Vector<GeoObject> m_pointInterestContainer = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.server.GEOServerInterface#typeQuery(java.util.List)
	 */
	@Override
	public Vector<GeoObject> typeQuery(List<Integer> _typeList) {

		System.out.println("LOADING POI .........");

		if (m_pointInterestContainer != null) {
			m_objectContainer.removeAll(m_pointInterestContainer);
		}
		m_pointInterestContainer = new Vector<>();

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
				poiObject = new POIObject(geoObjectID, geoObjectType,
						((PointObject) objektTeil).getM_pointData());

				m_pointInterestContainer.addElement(poiObject);

			}
		}

		m_objectContainer.addAll(m_pointInterestContainer);

		System.out.println("Data Loaded Successfully ................ ");

		return m_objectContainer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.server.GEOServerInterface#login(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String _user, String _pass, String _server) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.server.GEOServerInterface#loadData()
	 */
	@Override
	public Vector<GeoObject> loadData() {

		System.out.println("Loading Serialized Data ..... Plese Wait");

		if (m_objectContainer == null) {
			m_objectContainer = new Vector<>();
			GeoObject geoObject = null;
			try {

				// load the serialized object located on F Drive of the computer
				// hard disk
				for (int geoObjectCounter = 0; geoObjectCounter <= 126510; geoObjectCounter++) {
					FileInputStream fileIn = new FileInputStream(
							"F:\\GeoObjectsSerialiazed\\GeoObject" + geoObjectCounter + ".ser"); //$NON-NLS-1$
					ObjectInputStream in = new ObjectInputStream(fileIn);
					geoObject = (GeoObject) in.readObject();
					m_objectContainer.addElement(geoObject);
					in.close();
					fileIn.close();
				}
			} catch (IOException ioException) {
				ioException.printStackTrace();
			} catch (ClassNotFoundException classNotFoundException) {
				classNotFoundException.printStackTrace();
			}

		}
		System.out.println("Loading Serialized Data Completed ......");
		return m_objectContainer;
	}

	@Override
	public Vector<GeoObject> clearPOIS() {
		if (m_pointInterestContainer != null)
			m_objectContainer.removeAll(m_pointInterestContainer);
		return m_objectContainer;
	}

}
