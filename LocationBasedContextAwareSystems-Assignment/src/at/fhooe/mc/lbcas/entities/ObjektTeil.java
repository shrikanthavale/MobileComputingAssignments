/**
 * 
 */
package at.fhooe.mc.lbcas.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents different type of objects that can layer from a map
 * returns.
 * 
 * @author Shrikant Havale
 * 
 */
public class ObjektTeil implements Serializable {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -2895770562771636217L;

	// storing the object part number
	private int m_objectPartNumber;

	// storing the object parts
	private List<ObjektTeil> m_listObjectParts = new ArrayList<>();

	/**
	 * @return the m_objectPartNumber
	 */
	public int getM_objectPartNumber() {
		return m_objectPartNumber;
	}

	/**
	 * @param m_objectPartNumber
	 *            the m_objectPartNumber to set
	 */
	public void setM_objectPartNumber(int m_objectPartNumber) {
		this.m_objectPartNumber = m_objectPartNumber;
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
