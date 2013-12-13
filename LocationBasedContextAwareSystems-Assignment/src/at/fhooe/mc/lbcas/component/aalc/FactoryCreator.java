/**
 * 
 */
package at.fhooe.mc.lbcas.component.aalc;

import at.fhooe.mc.lbcas.componentcompositionparser.ComponentCompositionXMLReader;
import at.fhooe.mc.lbcas.contextruleparser.ContextRuleXMLReader;

/**
 * @author Shrikant Havale
 * 
 *         {@link ComponentFactoryCreator} class to create instances of Parser
 *         for parsing the XML data, this class returns different parsers based
 *         on string passed
 * 
 */
public abstract class FactoryCreator {

	/**
	 * factory method to give the instances of the different parsers based on
	 * the string passed
	 * 
	 * @param _parserType
	 *            parser type string to decide which parser to get data from
	 * @return instance of {@link XMLParserIF}
	 */
	public static XMLParserIF factoryMethod(String _parserType) {

		if ("DOMParser".equals(_parserType)) {
			return new DocumentObjectModelParser();
		} else if ("JAXBParser".equals(_parserType)) {
			return new JAXBParser();
		} else if ("ContextCompositionXMLReader".equals(_parserType))
			return new ComponentCompositionXMLReader();
		else if("ContextRuleXMLReader".equals(_parserType)){
			return new ContextRuleXMLReader();
		}
			return null;

	}
}
