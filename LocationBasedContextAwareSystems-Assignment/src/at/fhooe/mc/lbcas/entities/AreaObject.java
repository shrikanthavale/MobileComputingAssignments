/**
 * 
 */
package at.fhooe.mc.lbcas.entities;

import java.awt.Polygon;

/**
 * @author Shrikant Havale
 * 
 *         This Area object contains the polygons of different size and shapes
 */
public class AreaObject extends ObjektTeil {

	/**
	 * generated serial version
	 */
	private static final long serialVersionUID = 1383395197717701572L;
	/**
	 * polygon representing an area object
	 */
	private Polygon m_polygon;

	/**
	 * @return the m_polygon
	 */
	public Polygon getM_polygon() {
		return m_polygon;
	}

	/**
	 * @param m_polygon
	 *            the m_polygon to set
	 */
	public void setM_polygon(Polygon m_polygon) {
		this.m_polygon = m_polygon;
	}

}
