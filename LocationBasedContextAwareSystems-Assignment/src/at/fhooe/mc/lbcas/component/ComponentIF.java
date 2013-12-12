/**
 * 
 */
package at.fhooe.mc.lbcas.component;

import java.util.Observer;

import javax.swing.JPanel;

/**
 * @author Shrikant Havale
 * 
 *         This class represents the abstraction of different components like
 *         GIS, GPS , POI or the controlling panel containing buttons to perform
 *         the activity. This interface also act as like observer, used in
 *         observer pattern
 * 
 */
public interface ComponentIF extends Observer {

	/**
	 * Creates all the components in the panel and return the final Panel object
	 * 
	 * @return {@link JPanel} panel containing all the UI components
	 */
	public JPanel createPanel();

	/**
	 * This method returns the component name
	 * 
	 * @return {@link String} returns the name of the panel for setting up the
	 *         heading
	 */
	public String getPanelName();

}
