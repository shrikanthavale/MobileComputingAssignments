package at.fhooe.mc.lbcas.entities;

import java.awt.Image;
import java.awt.Point;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * a rudimentary class to represent point of interest objects
 */
public class POIObject extends GeoObject {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 3752720695613768566L;

	// the bitmap representing the POI on a map
	private static Image m_image = null;

	// private static hard coded list of point of interest of objects
	private static List<POIObject> listPOIObjects = new ArrayList<>();

	// the position of the POI on a map
	private Point m_point = null;

	// static block to pre-load the image
	static {
		try {
			// get the image from package
			URL resource = POIObject.class.getClassLoader().getResource(
					"at/fhooe/mc/lbcas/entities/pointofinteredtGIH.gif");

			// read the image
			m_image = ImageIO.read(resource);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor
	 * 
	 * @param _id
	 *            the id of the object
	 * @param _type
	 *            the type of the object
	 */
	public POIObject(String _id, int _type, Point _point) {
		// list of object parts will be null
		super(_id, _type, null);
		m_point = _point;
	}

	/**
	 * Returns the hard coded image
	 * 
	 * @return the m_image
	 */
	public static Image getM_image() {
		// return the image
		return m_image;
	}

	/**
	 * @param m_image
	 *            the m_image to set
	 */
	public void setM_image(Image m_image) {
		POIObject.m_image = m_image;
	}

	/**
	 * @return the m_point
	 */
	public Point getM_point() {
		return m_point;
	}

	/**
	 * @param m_point
	 *            the m_point to set
	 */
	public void setM_point(Point m_point) {
		this.m_point = m_point;
	}

	/**
	 * @return the listPOIObjects
	 */
	public static List<POIObject> getListPOIObjects() {
		return listPOIObjects;
	}

	/**
	 * Adds the POI object to static list, which could be accessed from anywhere
	 * 
	 * @param listPOIObjects
	 *            the listPOIObjects to set
	 */
	public static void addListPOIObjects(POIObject _tempPOIObject) {
		listPOIObjects.add(_tempPOIObject);
	}
}