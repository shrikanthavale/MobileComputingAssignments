/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

/**
 * @author Shrikant Havale
 * 
 *         This class is entity for storing different rules from GISRules,
 *         POIRules etc after the parser reads the XML
 * 
 */
public class RulesEntity {

	/**
	 * Rule Type - GIS, POI, Temperature
	 */
	private String m_ruleType = null;

	/**
	 * rule id
	 */
	private int m_ruleID;

	/**
	 * rule name
	 */
	private String m_ruleName = null;

	/**
	 * rule condition
	 */
	private String m_ruleCondition = null;

	/**
	 * method name to be called
	 */
	private String m_methodName = null;

	/**
	 * parameter class to be passed
	 */
	private String m_parameterClass = null;

	/**
	 * @return the m_ruleType
	 */
	public String getM_ruleType() {
		return m_ruleType;
	}

	/**
	 * @param m_ruleType
	 *            the m_ruleType to set
	 */
	public void setM_ruleType(String m_ruleType) {
		this.m_ruleType = m_ruleType;
	}

	/**
	 * @return the m_ruleID
	 */
	public int getM_ruleID() {
		return m_ruleID;
	}

	/**
	 * @param m_ruleID
	 *            the m_ruleID to set
	 */
	public void setM_ruleID(int m_ruleID) {
		this.m_ruleID = m_ruleID;
	}

	/**
	 * @return the m_ruleName
	 */
	public String getM_ruleName() {
		return m_ruleName;
	}

	/**
	 * @param m_ruleName
	 *            the m_ruleName to set
	 */
	public void setM_ruleName(String m_ruleName) {
		this.m_ruleName = m_ruleName;
	}

	/**
	 * @return the m_ruleCondition
	 */
	public String getM_ruleCondition() {
		return m_ruleCondition;
	}

	/**
	 * @param m_ruleCondition
	 *            the m_ruleCondition to set
	 */
	public void setM_ruleCondition(String m_ruleCondition) {
		this.m_ruleCondition = m_ruleCondition;
	}

	/**
	 * @return the m_methodName
	 */
	public String getM_methodName() {
		return m_methodName;
	}

	/**
	 * @param m_methodName
	 *            the m_methodName to set
	 */
	public void setM_methodName(String m_methodName) {
		this.m_methodName = m_methodName;
	}

	/**
	 * @return the m_parameterClass
	 */
	public String getM_parameterClass() {
		return m_parameterClass;
	}

	/**
	 * @param m_parameterClass
	 *            the m_parameterClass to set
	 */
	public void setM_parameterClass(String m_parameterClass) {
		this.m_parameterClass = m_parameterClass;
	}

}
