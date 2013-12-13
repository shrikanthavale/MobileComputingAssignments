/**
 * 
 */
package at.fhooe.mc.lbcas.componentcompositionparser;

import java.util.HashMap;

/**
 * @author Shrikant Havale
 * 
 *         Component Composition bean for storing the data from component
 *         composition XML file
 */
public class ComponentComposition {

	/**
	 * component key
	 */
	private String m_componentKey;

	/**
	 * for string component name
	 */
	private String m_componentName;

	/**
	 * boolean should the component be loaded
	 */
	private boolean m_shouldLoaded;

	/**
	 * hash map for storing the dynamic values of the component
	 */
	private HashMap<String, HashMap<String, String>> m_hashMapComponents = new HashMap<String, HashMap<String, String>>();

	/**
	 * @return the componentName
	 */
	public String getComponentName() {
		return m_componentName;
	}

	/**
	 * @param componentName
	 *            the componentName to set
	 */
	public void setComponentName(String componentName) {
		this.m_componentName = componentName;
	}

	/**
	 * @return the shouldLoaded
	 */
	public boolean isShouldLoaded() {
		return m_shouldLoaded;
	}

	/**
	 * @param shouldLoaded
	 *            the shouldLoaded to set
	 */
	public void setShouldLoaded(boolean shouldLoaded) {
		this.m_shouldLoaded = shouldLoaded;
	}

	/**
	 * @return the m_componentKey
	 */
	public String getM_componentKey() {
		return m_componentKey;
	}

	/**
	 * @param m_componentKey
	 *            the m_componentKey to set
	 */
	public void setM_componentKey(String m_componentKey) {
		this.m_componentKey = m_componentKey;
	}

	/**
	 * @return the m_hashMapComponents
	 */
	public HashMap<String, HashMap<String, String>> getM_hashMapComponents() {
		return m_hashMapComponents;
	}

	/**
	 * @param m_hashMapComponents the m_hashMapComponents to set
	 */
	public void setM_hashMapComponents(HashMap<String, HashMap<String, String>> m_hashMapComponents) {
		this.m_hashMapComponents = m_hashMapComponents;
	}

}
