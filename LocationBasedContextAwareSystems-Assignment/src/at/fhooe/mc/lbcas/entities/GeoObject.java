package at.fhooe.mc.lbcas.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import at.fhooe.mc.lbcas.geo.GeoTransformationMatrix;

/**
 * The class is a first very "rudimentary" representation of a GEO object
 */
public class GeoObject implements Serializable {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 5694780264990269901L;

	// the id of the object
	protected String m_id = null;

	// the type of the object
	protected int m_type = 0;

	// list of the object parts
	private List<ObjektTeil> m_listObjectParts = new ArrayList<>();

	/**
	 * 
	 * @param _id
	 *            id of the object
	 * @param _type
	 *            type of the object
	 * @param _objeObjektTeil
	 *            geometry of the
	 */
	public GeoObject(String _id, int _type, List<ObjektTeil> _objeObjektTeil) {
		m_id = _id;
		m_type = _type;
		m_listObjectParts = _objeObjektTeil;
	}

	/**
	 * Returns the minimum bounding box of the object
	 * 
	 * @return the minimum bounding box of the object in form of a rectangle
	 * @see java.awt.Rectangle
	 */
	public Rectangle getBoundingBox() {

		// rectangle bounds
		Rectangle bounds = null;

		// check for null or empty list
		if (m_listObjectParts != null && m_listObjectParts.size() > 0) {

			// iterate through list of objects
			for (ObjektTeil objektTeil : m_listObjectParts) {
				// check if list contains area object
				if (objektTeil instanceof AreaObject) {
					AreaObject areaObject = (AreaObject) objektTeil;
					if (bounds != null) {
						bounds = bounds.union((areaObject.getM_polygon()
								.getBounds()));
					} else {
						bounds = areaObject.getM_polygon().getBounds();
					}
					// check if list contains line object
				} else if (objektTeil instanceof LineObject) {
					return new Rectangle();
				} // check if list contains point object
				else if (objektTeil instanceof PointObject) {
					return new Rectangle();
				}

			}
		} else if (this instanceof POIObject) {
			return new Rectangle();
		}

		// return bounds
		return bounds;

	}

	/**
	 * Checks if a given point (world coordinate system) lies inside the object
	 * 
	 * @param _point
	 *            {@link Point} object to check if it is present in GEOObjects
	 * @return true, if the point is inside the object
	 */
	public boolean contains(Point _point) {

		// check null or empty object list
		if (m_listObjectParts != null && m_listObjectParts.size() > 0) {

			// iterate through the list of objects
			for (ObjektTeil objektTeil : m_listObjectParts) {

				// check for area object
				if (objektTeil instanceof AreaObject) {
					if (((AreaObject) objektTeil).getM_polygon().contains(
							_point))
						return true;
				}
				// check for line object
				else if (objektTeil instanceof LineObject) {
					if (((LineObject) objektTeil).getM_line().contains(_point))
						return true;
				}

				// check for the point object
				else if (objektTeil instanceof PointObject) {
					if (((PointObject) objektTeil).getM_pointData().x == _point.x
							&& ((PointObject) objektTeil).getM_pointData().y == _point.y)
						return true;
				}

			}
		}

		// return false if point doesn't contain
		return false;
	}

	/**
	 * The object can use the given drawing context to paint (resp. represent)
	 * itself
	 * 
	 * @param _g
	 *            a drawing context used to paint the object
	 * 
	 * @param _matrix
	 *            the current transformation matrix used to transfer the world
	 *            coordinate system based points of the object into the window
	 *            coordinate based coordinate space
	 * @param _fillColor
	 *            color to be used to fill the border of area, line or point
	 * @param _borderColor
	 *            color to be used to draw the border of area, line or point
	 * 
	 * @see java.awt.Graphics
	 * @see GeoTransformationsmatrix
	 */
	public void paint(Graphics _g, GeoTransformationMatrix _matrix,
			Color _borderColor, Color _fillColor) {

		// check for the empty list or null
		if (m_listObjectParts != null && m_listObjectParts.size() > 0) {

			// iterate through the objects
			for (ObjektTeil objektTeil : m_listObjectParts) {

				// check for the area object
				if (objektTeil instanceof AreaObject) {

					// cast to area object
					AreaObject areaObject = (AreaObject) objektTeil;

					Polygon smallPolygon = _matrix.multiply(areaObject
							.getM_polygon());

					// fill the polygon
					if (_fillColor != null) {
						_g.setColor(_fillColor);
						_g.fillPolygon(smallPolygon);
					}

					// set the border of the polygon
					_g.setColor(_borderColor);

					// draw the polygon
					_g.drawPolygon(smallPolygon);

					// Now consider drawing the holes
					for (ObjektTeil objektTeil2 : areaObject
							.getM_listObjectParts()) {

						if (_fillColor != null) {
							_g.setColor(new Color(211, 255, 190));
							_g.fillPolygon(((AreaObject) objektTeil2)
									.getM_polygon());
						}

						_g.setColor(new Color(255, 127, 127));
						_g.drawPolygon(_matrix
								.multiply(((AreaObject) objektTeil2)
										.getM_polygon()));
					}

				}
				// check if it is line object
				else if (objektTeil instanceof LineObject) {

					// cast to line object
					LineObject lineObject = (LineObject) objektTeil;

					// get the line
					Line line = lineObject.getM_line();

					// convert the point , similar to multiply polygon method
					line.convertPointAndMultiply(_matrix);

					// set the border color
					_g.setColor(_borderColor);

					// draw the poly line
					_g.drawPolyline(Line.convertIntegerListArray(line
							.getM_xCoordinate()), Line
							.convertIntegerListArray(line.getM_yCoordinate()),
							line.getM_xCoordinate().size());
				}

				// check if it is point object
				if (objektTeil instanceof PointObject) {

					// cast to line object
					PointObject pointObject = (PointObject) objektTeil;

					// get the line
					Point point = pointObject.getM_pointData();

					// convert the point , using to multiply point method
					point = _matrix.multiply(point);

					// set the border color
					_g.setColor(_borderColor);

					// draw the poly line
					_g.drawLine(point.x, point.y, point.x, point.y);

				}
			}
		}

		// check for the instance
		if (this instanceof POIObject) {

			// cast the object
			POIObject poiObject = (POIObject) this;

			// get the point
			Point point = poiObject.getM_point();

			// convert the point , using to multiply point method
			point = _matrix.multiply(point);

			// draws the image
			_g.drawImage(poiObject.getM_image(), point.x, point.y, new Panel());
		}

	}

	/**
	 * Returns the internal information of the object in form of an string
	 * 
	 * @return a string representation of the object
	 */
	public String toString() {
		return "OBJ[ " + m_id + " ;\t " + m_type + "\t POLY ]";
	}

	/**
	 * @return the m_id
	 */
	public String getM_id() {
		return m_id;
	}

	/**
	 * @param m_id
	 *            the m_id to set
	 */
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	/**
	 * @return the m_type
	 */
	public int getM_type() {
		return m_type;
	}

	/**
	 * @param m_type
	 *            the m_type to set
	 */
	public void setM_type(int m_type) {
		this.m_type = m_type;
	}

	/**
	 * @return the m_listObjectParts
	 */
	public List<ObjektTeil> getM_listObjectParts() {
		return m_listObjectParts;
	}

	/**
	 * @param m_listObjectParts
	 *            the m_listObjectParts to set
	 */
	public void setM_listObjectParts(List<ObjektTeil> m_listObjectParts) {
		this.m_listObjectParts = m_listObjectParts;
	}

}