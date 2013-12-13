/**
 * 
 */
package at.fhooe.mc.lbcas.component.aalc;

import java.util.HashMap;
import java.util.List;

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.componentcompositionparser.ComponentComposition;
import at.fhooe.mc.lbcas.contextruleparser.RulesEntity;

/**
 * @author Shrikant Havale
 * 
 *         Interface for different parsers
 * 
 */
public interface XMLParserIF {

	/**
	 * This method is used to extract the data from the XML file selected.
	 * 
	 * @param _filePath
	 *            path of the XML file to be opened
	 * 
	 * @return {@link ContextElement}
	 */
	public ContextElement extractData(String _filePath);

	/**
	 * reads the component composition XML file and returns the list of
	 * Component Composition containing the name of the component and if it
	 * should be loaded or not
	 * 
	 * @param _filePath
	 *            file path of component composition XML filr
	 * @return {@link HashMap} {@link ComponentComposition}
	 */
	public HashMap<String, ComponentComposition> readComponentComposition(
			String _filePath);

	/**
	 * Method for parsing the rules file GIS,POI,Temperature
	 * 
	 * @param _filePath
	 * @return
	 */
	public List<RulesEntity> readContextRules(String _filePath);
}
