/**
 * 
 */
package at.fhooe.mc.lbcas.component.aalc;

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

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.DeviceContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.DeviceContextElement.Device;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.DeviceContextElement.Software;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement.GeographicalLocation;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement.PhysicalLocation;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement.Place;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TimeContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TimeContextElement.Date;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TimeContextElement.Time;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.UserContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.UserContextElement.Health;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.UserContextElement.UserProfile;
import at.fhooe.mc.lbcas.componentcompositionparser.ComponentComposition;
import at.fhooe.mc.lbcas.contextruleparser.RulesEntity;

/**
 * @author Shrikant Havale
 * 
 *         This class uses DOM Parser to extract data out of the XML and returns
 *         the data in format of Context Element
 * 
 */
public class DocumentObjectModelParser implements XMLParserIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.aalc.XMLParserIF#extractData()
	 */
	@Override
	public ContextElement extractData(String _filePath) {

		// create new context element
		ContextElement contextElement = new ContextElement();

		try {
			// create the file
			URL url = new URL(_filePath);

			// create document builder factory
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();

			// create document builder
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			// create Document
			Document doc = dBuilder.parse(url.openStream());
			doc.getDocumentElement().normalize();

			// Get the document's root XML node
			NodeList root = doc.getChildNodes();

			// get the root node
			Node contextElementNode = getNode("ContextElement", root);
			String contextType = getNodeAttr("contexttype", contextElementNode);

			if ("timecontext".equals(contextType)) {

				// create new time context element
				TimeContextElement timeContextElement = new TimeContextElement();

				// create date element
				Date date = new Date();

				// create time element
				Time time = new Time();

				// set date and time
				timeContextElement.setDate(date);
				timeContextElement.setTime(time);

				// get the time context node
				Node timeContextNode = getNode("TimeContextElement",
						contextElementNode.getChildNodes());

				// get the contextID
				int contextID = Integer.parseInt(getNodeAttr("contextid",
						timeContextNode));
				timeContextElement.setContextid(contextID);

				// get the DATE
				int dayDate = Integer.parseInt(getNodeAttr("Day",
						getNode("Date", timeContextNode.getChildNodes())));
				int monthDate = Integer.parseInt(getNodeAttr("Month",
						getNode("Date", timeContextNode.getChildNodes())));
				int yearDate = Integer.parseInt(getNodeAttr("Year",
						getNode("Date", timeContextNode.getChildNodes())));
				timeContextElement.getDate().setDay(dayDate);
				timeContextElement.getDate().setMonth(monthDate);
				timeContextElement.getDate().setYear(yearDate);

				// get the month
				int hourTime = Integer.parseInt(getNodeAttr("Hour",
						getNode("Time", timeContextNode.getChildNodes())));
				int minutesTime = Integer.parseInt(getNodeAttr("Minutes",
						getNode("Time", timeContextNode.getChildNodes())));
				int secondsTime = Integer.parseInt(getNodeAttr("Seconds",
						getNode("Time", timeContextNode.getChildNodes())));
				int milliSecondsTime = Integer.parseInt(getNodeAttr(
						"Miliseconds",
						getNode("Time", timeContextNode.getChildNodes())));
				String ampmTime = getNodeAttr("AMPM",
						getNode("Time", timeContextNode.getChildNodes()));
				timeContextElement.getTime().setHour(hourTime);
				timeContextElement.getTime().setMinutes(minutesTime);
				timeContextElement.getTime().setSeconds(secondsTime);
				timeContextElement.getTime().setMiliseconds(milliSecondsTime);
				timeContextElement.getTime().setAMPM(ampmTime);

				// set the time context in main context
				contextElement.setContexttype("timecontext");
				contextElement.setTimeContextElement(timeContextElement);

			} else if ("usercontext".equals(contextType)) {

				// create new user context element
				UserContextElement userContextElement = new UserContextElement();

				// set health and user profile
				userContextElement.setHealth(new Health());
				userContextElement.setUserProfile(new UserProfile());

				// get the time context node
				Node userContextNode = getNode("UserContextElement",
						contextElementNode.getChildNodes());

				// get the contextID
				String contextID = getNodeAttr("contextid", userContextNode);
				userContextElement.setContextid(contextID);

				// get the Health
				String bloodPressure = getNodeAttr("BloodPressure",
						getNode("Health", userContextNode.getChildNodes()));
				String heartRate = getNodeAttr("HeartRate",
						getNode("Health", userContextNode.getChildNodes()));
				boolean disabled = Boolean.parseBoolean(getNodeAttr("Disabled",
						getNode("Health", userContextNode.getChildNodes())));
				String voiceTone = getNodeAttr("VoiceTone",
						getNode("Health", userContextNode.getChildNodes()));

				userContextElement.getHealth().setBloodPressure(bloodPressure);
				userContextElement.getHealth().setHeartRate(heartRate);
				userContextElement.getHealth().setDisabled(disabled);
				userContextElement.getHealth().setVoiceTone(voiceTone);

				// get the user profile
				int age = Integer
						.parseInt(getNodeAttr(
								"Age",
								getNode("UserProfile",
										userContextNode.getChildNodes())));
				String maritalStatus = getNodeAttr("MaritalStatus",
						getNode("UserProfile", userContextNode.getChildNodes()));
				String sex = getNodeAttr("Sex",
						getNode("UserProfile", userContextNode.getChildNodes()));
				String natinality = getNodeAttr("Nationality",
						getNode("UserProfile", userContextNode.getChildNodes()));

				userContextElement.getUserProfile().setAge(age);
				userContextElement.getUserProfile().setMaritalStatus(
						maritalStatus);
				userContextElement.getUserProfile().setSex(sex);
				userContextElement.getUserProfile().setNationality(natinality);

				// set the time context in main context
				contextElement.setContexttype("usercontext");
				contextElement.setUserContextElement(userContextElement);

			} else if ("locationcontext".equals(contextType)) {

				// create new location context element
				LocationContextElement locationContextElement = new LocationContextElement();

				// create location context element
				locationContextElement
						.setGeographicalLocation(new GeographicalLocation());
				locationContextElement
						.setPhysicalLocation(new PhysicalLocation());
				locationContextElement.setPlace(new Place());

				// create location context node
				Node locationContextNode = getNode("LocationContextElement",
						contextElementNode.getChildNodes());

				// get the context id
				String contextid = getNodeAttr("contextid", locationContextNode);
				locationContextElement
						.setContextid(Integer.parseInt(contextid));

				// get the physical location
				String country = getNodeAttr(
						"country",
						getNode("PhysicalLocation",
								locationContextNode.getChildNodes()));
				String state = getNodeAttr(
						"state",
						getNode("PhysicalLocation",
								locationContextNode.getChildNodes()));
				String city = getNodeAttr(
						"city",
						getNode("PhysicalLocation",
								locationContextNode.getChildNodes()));
				String pincode = getNodeAttr(
						"pincode",
						getNode("PhysicalLocation",
								locationContextNode.getChildNodes()));

				locationContextElement.getPhysicalLocation()
						.setCountry(country);
				locationContextElement.getPhysicalLocation().setState(state);
				locationContextElement.getPhysicalLocation().setCity(city);
				locationContextElement.getPhysicalLocation().setPincode(
						Integer.parseInt(pincode));

				// get the geographical location
				String latitude = getNodeAttr(
						"Latitude",
						getNode("GeographicalLocation",
								locationContextNode.getChildNodes()));
				String altitude = getNodeAttr(
						"Altitude",
						getNode("GeographicalLocation",
								locationContextNode.getChildNodes()));
				String longitude = getNodeAttr(
						"Longitude",
						getNode("GeographicalLocation",
								locationContextNode.getChildNodes()));

				locationContextElement.getGeographicalLocation().setLongitude(
						Double.parseDouble(longitude));
				locationContextElement.getGeographicalLocation().setAltitude(
						Float.parseFloat(altitude));
				locationContextElement.getGeographicalLocation().setLatitude(
						Double.parseDouble(latitude));

				// get the place
				String placeIndoorOutdoor = getNodeAttr("indoor",
						getNode("Place", locationContextNode.getChildNodes()));
				locationContextElement.getPlace().setIndoor(placeIndoorOutdoor);

				contextElement.setContexttype("locationcontext");
				contextElement
						.setLocationContextElement(locationContextElement);

			} else if ("devicecontext".equals(contextType)) {

				// create new Device context element
				DeviceContextElement deviceContextElement = new DeviceContextElement();

				// create device context element
				deviceContextElement.setDevice(new Device());
				deviceContextElement.setSoftware(new Software());

				// create location context node
				Node deviceContextNode = getNode("DeviceContextElement",
						contextElementNode.getChildNodes());

				// get the context id
				String contextid = getNodeAttr("contextid", deviceContextNode);
				deviceContextElement.setContextid(Integer.parseInt(contextid));

				// get the physical location
				String audio = getNodeAttr("Audio",
						getNode("Device", deviceContextNode.getChildNodes()));
				String batteryPercentage = getNodeAttr("BatteryPercentage",
						getNode("Device", deviceContextNode.getChildNodes()));
				String display = getNodeAttr("Display",
						getNode("Device", deviceContextNode.getChildNodes()));
				String memory = getNodeAttr("Memory",
						getNode("Device", deviceContextNode.getChildNodes()));

				deviceContextElement.getDevice().setAudio(
						Boolean.parseBoolean(audio));
				deviceContextElement.getDevice().setBatteryPercentage(
						Integer.parseInt(batteryPercentage));
				deviceContextElement.getDevice().setDisplay(display);
				deviceContextElement.getDevice().setMemory(
						Integer.parseInt(memory));

				// get the geographical location
				String opearatingSystem = getNodeAttr("operatingsystem",
						getNode("Software", deviceContextNode.getChildNodes()));
				String version = getNodeAttr("version",
						getNode("Software", deviceContextNode.getChildNodes()));

				deviceContextElement.getSoftware().setOperatingsystem(
						opearatingSystem);
				deviceContextElement.getSoftware().setVersion(
						Float.parseFloat(version));

				contextElement.setContexttype("devicecontext");
				contextElement.setDeviceContextElement(deviceContextElement);

			}

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		// return the context
		return contextElement;

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
	@SuppressWarnings("unused")
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
		// Do nothing
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
