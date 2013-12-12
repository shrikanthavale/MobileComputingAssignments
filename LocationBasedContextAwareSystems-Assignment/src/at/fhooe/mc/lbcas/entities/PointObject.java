/**
 * 
 */
package at.fhooe.mc.lbcas.entities;

import java.awt.Point;

/**
 * @author Shrikant Havale
 * 
 *         This class represents the single point object
 */
public class PointObject extends ObjektTeil {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 534759552457755952L;

	// point data
	private Point m_pointData;

	/**
	 * @return the m_pointData
	 */
	public Point getM_pointData() {
		return m_pointData;
	}

	/**
	 * @param m_pointData
	 *            the m_pointData to set
	 */
	public void setM_pointData(Point m_pointData) {
		this.m_pointData = m_pointData;
	}

}
