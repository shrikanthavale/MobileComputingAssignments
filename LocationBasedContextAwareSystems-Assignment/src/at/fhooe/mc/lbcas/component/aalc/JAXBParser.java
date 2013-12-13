/**
 * 
 */
package at.fhooe.mc.lbcas.component.aalc;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ObjectFactory;
import at.fhooe.mc.lbcas.componentcompositionparser.ComponentComposition;
import at.fhooe.mc.lbcas.contextruleparser.RulesEntity;

/**
 * @author Shrikant Havale
 * 
 *         This class uses JAXBParser for parsing the XML data and convert it
 *         into {@link ContextElement} object
 * 
 */
public class JAXBParser implements XMLParserIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.aalc.XMLParserIF#extractData()
	 */
	@Override
	public ContextElement extractData(String _filePath) {

		// create the context element
		ContextElement contextElement = new ObjectFactory()
				.createContextElement();
		try {

			// read the file
			URL url = new URL(_filePath);

			// create the JAXB
			JAXBContext jaxbContext = JAXBContext
					.newInstance(ContextElement.class);

			// create the un-marshaller
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			// unmarshal the file and get the object
			contextElement = (ContextElement) unmarshaller.unmarshal(url
					.openStream());

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (MalformedURLException exception) {
			exception.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// return the context element
		return contextElement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.component.aalc.XMLParserIF#readComponentComposition
	 * (java.lang.String)
	 */
	@Override
	public HashMap<String, ComponentComposition> readComponentComposition(
			String _filePath) {
		// Do Nothing
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.component.aalc.XMLParserIF#readContextRules(java.lang
	 * .String)
	 */
	@Override
	public HashMap<String, RulesEntity> readContextRules(String _filePath) {
		// Do Nothing
		return null;
	}
}
