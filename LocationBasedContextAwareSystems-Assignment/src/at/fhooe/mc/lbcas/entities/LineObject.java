/**
 * 
 */
package at.fhooe.mc.lbcas.entities;

/**
 * @author Shrikant Havale
 * 
 *         Line object containing one to one mapping with line
 */
public class LineObject extends ObjektTeil {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 3614893370191901857L;
	// variable for storing lines
	private Line m_line;

	/**
	 * @return the m_line
	 */
	public Line getM_line() {
		return m_line;
	}

	/**
	 * @param m_line
	 *            the m_line to set
	 */
	public void setM_line(Line m_line) {
		this.m_line = m_line;
	}

}
