/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import at.fhooe.mc.lbcas.component.aalc.XMLParserIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.componentcompositionparser.ComponentComposition;

/**
 * @author Shrikant Havale
 * 
 *         This class uses DOM Parser to extract data out of the XML and returns
 *         the data in format of Context Element
 * 
 */
public class ContextRuleXMLReader implements XMLParserIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.component.aalc.XMLParserIF#extractData(java.lang.String
	 * )
	 */
	@Override
	public ContextElement extractData(String _filePath) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * reads the component composition XML file and returns the list of
	 * Component Composition containing the name of the component and if it
	 * should be loaded or not
	 * 
	 * @param _filePath
	 *            file path of component composition XML file
	 * @return {@link HashMap} {@link ComponentComposition}
	 */
	@Override
	public HashMap<String, RulesEntity> readContextRules(String _filePath) {

		// for storing list of components
		HashMap<String, RulesEntity> rulesFromXML = new HashMap<String, RulesEntity>();

		try {

			URL resource = ContextRuleXMLReader.class.getClassLoader()
					.getResource(_filePath);

			// create document builder factory
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();

			// create document builder
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			// create Document
			Document doc = dBuilder.parse(resource.openStream());
			doc.getDocumentElement().normalize();

			// Get the document's root XML node
			NodeList root = doc.getChildNodes();

			// get the root node
			Node componentElementNode = getNode("rules", root);

			// get the child nodes
			NodeList componentNodeList = componentElementNode.getChildNodes();

			// iterate through child nodes
			for (int iterator = 0; iterator < componentNodeList.getLength(); iterator++) {

				// get the item
				Node component = componentNodeList.item(iterator);

				if (component.getNodeType() != Node.TEXT_NODE) {

					RulesEntity rulesEntity = new RulesEntity();

					Node ruleIDNode = getNode("ruleId",
							component.getChildNodes());
					Node ruleNameNode = getNode("rulename",
							component.getChildNodes());
					Node ruleConditionNode = getNode("rulecondition",
							component.getChildNodes());
					Node methodNameNode = getNode("methodName",
							component.getChildNodes());
					Node parameterNode = getNode("parameter",
							component.getChildNodes());

					// get the component node name and should be loaded value
					String ruleID = getNodeValue(ruleIDNode);
					String ruleName = getNodeValue(ruleNameNode);
					String ruleCondition = getNodeValue(ruleConditionNode);
					String methodName = getNodeValue(methodNameNode);
					String parameter = getNodeValue(parameterNode);

					rulesEntity.setM_methodName(methodName);
					rulesEntity.setM_parameterClass(parameter);
					rulesEntity.setM_ruleCondition(ruleCondition);
					rulesEntity.setM_ruleID(Integer.parseInt(ruleID));
					rulesEntity.setM_ruleName(ruleName);
					rulesEntity.setM_ruleType("GISRules");

					// add it to the Map
					rulesFromXML.put(rulesEntity.getM_ruleType(), rulesEntity);
				}
			}

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		// return the context
		return rulesFromXML;

	}

	/**
	 * This method gives the node after accepting all the nodes list and name of
	 * the tag
	 * 
	 * @param tagName
	 *            element to be searched
	 * @param nodes
	 *            list of nodes from where the list is to be searched
	 * @return found node
	 */
	private Node getNode(String tagName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				return node;
			}
		}

		return null;
	}

	/**
	 * This method gives the node value after accepting the node
	 * 
	 * @param node
	 *            Node whose value is required
	 * @return value in string format
	 */
	private String getNodeValue(Node node) {
		NodeList childNodes = node.getChildNodes();
		for (int x = 0; x < childNodes.getLength(); x++) {
			Node data = childNodes.item(x);
			if (data.getNodeType() == Node.TEXT_NODE)
				return data.getNodeValue();
		}
		return "";
	}

	/**
	 * Returns the value of node from list of child nodes , requires tag name of
	 * the node to be searched
	 * 
	 * @param tagName
	 *            whose value is required
	 * @param nodes
	 *            list of nodes
	 * @return String value of the node
	 */
	@SuppressWarnings("unused")
	private String getNodeValue(String tagName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				NodeList childNodes = node.getChildNodes();
				for (int y = 0; y < childNodes.getLength(); y++) {
					Node data = childNodes.item(y);
					if (data.getNodeType() == Node.TEXT_NODE)
						return data.getNodeValue();
				}
			}
		}
		return "";
	}

	/**
	 * This method gives the attribute value of a particular node
	 * 
	 * @param attrName
	 *            attrName whose value is required
	 * @param node
	 *            node who has that attribute
	 * @return String value of the attribute
	 */
	@SuppressWarnings("unused")
	private String getNodeAttr(String attrName, Node node) {
		NamedNodeMap attrs = node.getAttributes();
		for (int y = 0; y < attrs.getLength(); y++) {
			Node attr = attrs.item(y);
			if (attr.getNodeName().equalsIgnoreCase(attrName)) {
				return attr.getNodeValue();
			}
		}
		return "";
	}

	/**
	 * Returns the value of the attribute accepts tag name and list of nodes
	 * 
	 * @param tagName
	 *            name of the node whose attribute value is required
	 * @param attrName
	 *            name of the attribute in the node whose value is required
	 * @param nodes
	 *            list of nodes from where node is to be returned
	 * @return String Value of the attribute
	 */
	@SuppressWarnings("unused")
	private String getNodeAttr(String tagName, String attrName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				NodeList childNodes = node.getChildNodes();
				for (int y = 0; y < childNodes.getLength(); y++) {
					Node data = childNodes.item(y);
					if (data.getNodeType() == Node.ATTRIBUTE_NODE) {
						if (data.getNodeName().equalsIgnoreCase(attrName))
							return data.getNodeValue();
					}
				}
			}
		}

		return "";
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

}
