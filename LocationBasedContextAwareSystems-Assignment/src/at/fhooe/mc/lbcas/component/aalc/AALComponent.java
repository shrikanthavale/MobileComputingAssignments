/**
 * 
 */
package at.fhooe.mc.lbcas.component.aalc;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Observable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;

/**
 * @author Shrikant Havale
 * 
 *         This component is responsible to use the XML parsers and read the
 *         data from XML and accordingly display them
 * 
 */
public class AALComponent extends JPanel implements ComponentIF {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 5182240171895965796L;

	/**
	 * top heading panel
	 */
	private JLabel m_headingPanel;

	/**
	 * internal panel
	 */
	private JPanel m_internalPanel;

	/**
	 * radio panel
	 */
	private JPanel m_radioPanel;

	/**
	 * time context radio
	 */
	private JRadioButton m_timeContext;

	/**
	 * device context radio
	 */
	private JRadioButton m_deviceContext;

	/**
	 * location context radio
	 */
	private JRadioButton m_locationContext;

	/**
	 * user context radio
	 */
	private JRadioButton m_userContext;

	/**
	 * grouping the radio button
	 */
	private ButtonGroup m_group = null;

	/**
	 * displaying data panel
	 */
	private JPanel m_displayDataPanel;

	/**
	 * file chooser pane;
	 */
	private JPanel m_fileChooserPanel;

	/**
	 * get data button
	 */
	private JButton m_getDataButton;

	/**
	 * text pane for showing data of JAXBParser
	 */
	private JTextPane m_jaxbParsedDatatextPane;

	/**
	 * scroll pane for jaxb parsed data
	 */
	private JScrollPane m_jaxbScrollPaneTextPane;

	/**
	 * text pane for showing data for DOM Parser
	 */
	private JTextPane m_domParsedDatetextPane;

	/**
	 * scroll pane for DOM parsed data
	 */
	private JScrollPane m_domScrollPaneTextPane;

	/**
	 * parsed data panel
	 */
	private JPanel m_jaxbParsedDataPanel;

	/**
	 * DOM parsed data panel
	 */
	private JPanel m_domParsedDataPanel;

	/**
	 * Empty label to align UI
	 */
	private JLabel m_displayDataPanelEmptyLabel;

	/**
	 * Text pane for displaying the XML data
	 */
	private JTextPane m_XMLDataPane;

	/**
	 * panel for holding the text pane which displays the XML
	 */
	private JPanel m_XMLDataPanePanel;

	/**
	 * parser interface
	 */
	private XMLParserIF abstractXMLParser;

	/**
	 * scroll pane for XML Text Pane
	 */
	private JScrollPane m_scrollPaneForXMLTextPane;

	/**
	 * context elements
	 */
	private ContextElement m_contextElement;

	/**
	 * push data button
	 */
	private JButton m_pushDataButton;

	/**
	 * CAS Mediator
	 */
	private MediatorIF m_MediatorIF;

	/**
	 * Google app engine URL for the XML files
	 */
	private static String m_urlForContextData = "http://1.contextdata.appspot.com/";

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#createPanel()
	 */
	@Override
	public JPanel createPanel() {

		// set the layout
		this.setLayout(new BorderLayout(0, 0));

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				getPanelName(), TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		this.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// heading panel
		m_headingPanel = new JLabel(
				Messages.getString("AALComponent.HeadingLabel")); //$NON-NLS-1$
		m_headingPanel.setFont(new Font("Tahoma", Font.BOLD, 14)); //$NON-NLS-1$
		m_headingPanel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(m_headingPanel, BorderLayout.NORTH);

		// internal panel
		m_internalPanel = new JPanel();
		this.add(m_internalPanel, BorderLayout.CENTER);
		m_internalPanel.setLayout(new BorderLayout(0, 0));

		// radio panel
		m_radioPanel = new JPanel();
		m_internalPanel.add(m_radioPanel, BorderLayout.NORTH);
		m_radioPanel.setLayout(new GridLayout(0, 1, 0, 0));

		// time radio button
		m_timeContext = new JRadioButton(
				Messages.getString("AALComponent.RadioTimeContext")); //$NON-NLS-1$
		m_radioPanel.add(m_timeContext);

		// device radio button
		m_deviceContext = new JRadioButton(
				Messages.getString("AALComponent.RadioDeviceContext")); //$NON-NLS-1$
		m_radioPanel.add(m_deviceContext);

		// location radio button
		m_locationContext = new JRadioButton(
				Messages.getString("AALComponent.RadioLocationContext")); //$NON-NLS-1$
		m_radioPanel.add(m_locationContext);

		// user context radio button
		m_userContext = new JRadioButton(
				Messages.getString("AALComponent.RadioUserContext")); //$NON-NLS-1$
		m_radioPanel.add(m_userContext);

		// Group the buttons
		m_group = new ButtonGroup();
		m_group.add(m_timeContext);
		m_group.add(m_deviceContext);
		m_group.add(m_locationContext);
		m_group.add(m_userContext);

		// file chooser panel
		m_fileChooserPanel = new JPanel();
		m_radioPanel.add(m_fileChooserPanel);
		m_fileChooserPanel.setLayout(new GridLayout(0, 2, 3, 0));

		// get data button
		m_getDataButton = new JButton(
				Messages.getString("AALComponent.ParseXMLButton")); //$NON-NLS-1$
		m_fileChooserPanel.add(m_getDataButton);

		// get data button
		m_pushDataButton = new JButton(
				Messages.getString("AALComponent.PushXMLButton")); //$NON-NLS-1$
		m_fileChooserPanel.add(m_pushDataButton);

		// display data panel
		m_displayDataPanel = new JPanel();
		m_internalPanel.add(m_displayDataPanel, BorderLayout.CENTER);
		m_displayDataPanel.setLayout(new GridLayout(0, 2, 0, 0));

		// xml data panel
		m_XMLDataPanePanel = new JPanel();
		m_XMLDataPanePanel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "XML Data", //$NON-NLS-1$ //$NON-NLS-2$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		m_displayDataPanel.add(m_XMLDataPanePanel);
		m_XMLDataPanePanel.setLayout(new GridLayout(0, 1, 0, 0));

		// xml data pane
		m_XMLDataPane = new JTextPane();
		m_scrollPaneForXMLTextPane = new JScrollPane(m_XMLDataPane);
		m_XMLDataPanePanel.add(m_scrollPaneForXMLTextPane);
		m_XMLDataPane.setEditable(false);

		// empty label
		m_displayDataPanelEmptyLabel = new JLabel(""); //$NON-NLS-1$
		m_displayDataPanel.add(m_displayDataPanelEmptyLabel);

		// panel for displaying parsed data
		m_jaxbParsedDataPanel = new JPanel();
		m_jaxbParsedDataPanel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "JAXB-Parser", //$NON-NLS-1$ //$NON-NLS-2$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		m_displayDataPanel.add(m_jaxbParsedDataPanel);
		m_jaxbParsedDataPanel.setLayout(new GridLayout(0, 1, 0, 0));

		// text pane
		m_jaxbParsedDatatextPane = new JTextPane();
		m_jaxbScrollPaneTextPane = new JScrollPane(m_jaxbParsedDatatextPane);
		m_jaxbParsedDataPanel.add(m_jaxbScrollPaneTextPane);
		m_jaxbParsedDatatextPane.setEditable(false);

		// panel for displaying parse data
		m_domParsedDataPanel = new JPanel();
		m_domParsedDataPanel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "DOM-Parser", //$NON-NLS-1$ //$NON-NLS-2$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		m_displayDataPanel.add(m_domParsedDataPanel);
		m_domParsedDataPanel.setLayout(new GridLayout(0, 1, 0, 0));

		// parse data
		m_domParsedDatetextPane = new JTextPane();
		m_domScrollPaneTextPane = new JScrollPane(m_domParsedDatetextPane);
		m_domParsedDataPanel.add(m_domScrollPaneTextPane);
		m_domParsedDatetextPane.setEditable(false);

		// left empty panel for alignment
		JPanel panel_3 = new JPanel();
		this.add(panel_3, BorderLayout.WEST);

		// left empty label
		JLabel lblNewLabel_1 = new JLabel("                     "); //$NON-NLS-1$
		panel_3.add(lblNewLabel_1);

		// right empty panel for alignment
		JPanel panel_4 = new JPanel();
		this.add(panel_4, BorderLayout.EAST);

		// right empty label
		JLabel label = new JLabel("                     "); //$NON-NLS-1$
		panel_4.add(label);

		// add the get data button listener
		m_getDataButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					extractXMLData();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});

		// add the get data button listener
		m_pushDataButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Vector<ContextElement> contextElements = new Vector<>();
				contextElements.addElement(m_contextElement);
				m_MediatorIF = getCASMediator();
				m_MediatorIF.communicateContextElements(contextElements);

			}
		});

		// return the panel
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#getPanelName()
	 */
	@Override
	public String getPanelName() {
		return Messages.getString("AALComponent.PanelName"); //$NON-NLS-1$
	}

	/**
	 * This method calls the corresponding parser and fetches the data after
	 * parsing. Also displays the parsed data in text pane
	 * 
	 * @throws URISyntaxException
	 */
	private void extractXMLData() throws URISyntaxException {

		String completeURL = "";

		// create the string url
		if (m_timeContext.isSelected()) {
			// url for time context
			completeURL = m_urlForContextData + "TimeContextElement.xml";
		} else if (m_deviceContext.isSelected()) {
			// url for device context
			completeURL = m_urlForContextData + "DeviceContextElement.xml";
		} else if (m_userContext.isSelected()) {
			// url for user context
			completeURL = m_urlForContextData + "UserContextElement.xml";
		} else if (m_locationContext.isSelected()) {
			// url for location context
			completeURL = m_urlForContextData + "LocationContextElement.xml";
		}

		// string capturing formatted data
		String formattedString = ""; //$NON-NLS-1$

		// string xml DATA
		String xmlData = readFileContent(completeURL);

		// data pane
		m_XMLDataPane.setText(xmlData);

		// get the required parser
		abstractXMLParser = FactoryCreator.factoryMethod(Messages
				.getString("AALComponent.JAXBParserConstantString")); //$NON-NLS-1$

		// get the context element data JAXBParser
		ContextElement contextElementJAXB = abstractXMLParser
				.extractData(completeURL);

		// get the formatted String
		formattedString = getFormattedString(contextElementJAXB);

		// set it to text pane
		m_jaxbParsedDatatextPane.setText(formattedString);

		// get the context element using DOM Parser
		abstractXMLParser = FactoryCreator.factoryMethod(Messages
				.getString("AALComponent.DOMParserConstantString")); //$NON-NLS-1$
		ContextElement contextElementDOM = abstractXMLParser
				.extractData(completeURL);

		// get the formatted string
		formattedString = getFormattedString(contextElementDOM);

		// set it to text pane
		m_domParsedDatetextPane.setText(formattedString);

		// store it in context element
		m_contextElement = contextElementJAXB;
	}

	/**
	 * Formats the context element object data in readable formt and passes back
	 * 
	 * @param contextElement
	 *            accepts the context element with the data
	 * @return String properly formatted to be displayed on screen
	 */
	private String getFormattedString(ContextElement contextElement) {

		// formatted String
		String formattedString = ""; //$NON-NLS-1$

		if (m_timeContext.isSelected()
				|| contextElement.getContexttype().equalsIgnoreCase(
						"timecontext")) { //$NON-NLS-1$

			// display context id
			formattedString = formattedString + "Time Context" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "Context ID: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getContextid()
					+ "\n"; //$NON-NLS-1$

			// display date
			formattedString = formattedString + "Date" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString + "\t" + "Day: " //$NON-NLS-1$ //$NON-NLS-2$
					+ contextElement.getTimeContextElement().getDate().getDay()
					+ "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Month: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getDate()
							.getMonth() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Year: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getDate()
							.getYear() + "\n"; //$NON-NLS-1$

			// display Time
			formattedString = formattedString + "Time" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Hours: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getTime()
							.getHour() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Minutes: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getTime()
							.getMinutes() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Seconds: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getTime()
							.getSeconds() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Milliseconds: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getTime()
							.getMiliseconds() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "AM/PM: " //$NON-NLS-1$
					+ contextElement.getTimeContextElement().getTime()
							.getAMPM() + "\n"; //$NON-NLS-1$

		} else if (m_userContext.isSelected()
				|| contextElement.getContexttype().equalsIgnoreCase(
						"usercontext")) { //$NON-NLS-1$

			// display context id
			formattedString = formattedString + "User Context" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "Context ID: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getContextid()
					+ "\n"; //$NON-NLS-1$

			// display user profile
			formattedString = formattedString + "User Profile" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Age: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getUserProfile()
							.getAge() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Marital Status: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getUserProfile()
							.getMaritalStatus() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Gender: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getUserProfile()
							.getSex() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Nationality: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getUserProfile()
							.getNationality() + "\n"; //$NON-NLS-1$

			// display health data
			formattedString = formattedString + "Health" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Blood Pressure: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getHealth()
							.getBloodPressure() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Heart Rate: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getHealth()
							.getHeartRate() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Disabled: " //$NON-NLS-1$
					+ (contextElement.getUserContextElement().getHealth()
							.isDisabled() ? "Yes" : "No") + "\n"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Voice Tone: " //$NON-NLS-1$
					+ contextElement.getUserContextElement().getHealth()
							.getVoiceTone() + "\n"; //$NON-NLS-1$

		} else if (m_locationContext.isSelected()
				|| contextElement.getContexttype().equalsIgnoreCase(
						"locationcontext")) { //$NON-NLS-1$

			// display context id
			formattedString = formattedString + "Location Context" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "Context ID: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement().getContextid()
					+ "\n"; //$NON-NLS-1$

			// display physical location
			formattedString = formattedString + "Physical Location" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Country: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getPhysicalLocation().getCountry() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "State: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getPhysicalLocation().getState() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "City: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getPhysicalLocation().getCity() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Pincode: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getPhysicalLocation().getPincode() + "\n"; //$NON-NLS-1$

			// display geographical location data
			formattedString = formattedString + "Geographical Location" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Latitude: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getGeographicalLocation().getLatitude() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Longitude: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getGeographicalLocation().getLongitude() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Altitude: " //$NON-NLS-1$
					+ contextElement.getLocationContextElement()
							.getGeographicalLocation().getAltitude() + "\n"; //$NON-NLS-1$

			// display place
			formattedString = formattedString + "Geographical Location" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Indoor/Outdoor : " //$NON-NLS-1$
					+ contextElement.getLocationContextElement().getPlace()
							.getIndoor() + "\n"; //$NON-NLS-1$

		} else if (m_deviceContext.isSelected()
				|| contextElement.getContexttype().equalsIgnoreCase(
						"devicecontext")) { //$NON-NLS-1$

			// display context id
			formattedString = formattedString + "Device Context" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "Context ID: " //$NON-NLS-1$
					+ contextElement.getDeviceContextElement().getContextid()
					+ "\n"; //$NON-NLS-1$

			// display date
			formattedString = formattedString + "Device" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Audio: " //$NON-NLS-1$
					+ (contextElement.getDeviceContextElement().getDevice()
							.isAudio() ? "Yes" : "No") + "\n"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Battery Percentage: " //$NON-NLS-1$
					+ contextElement.getDeviceContextElement().getDevice()
							.getBatteryPercentage() + "%" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Display: " //$NON-NLS-1$
					+ contextElement.getDeviceContextElement().getDevice()
							.getDisplay() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Memory: " //$NON-NLS-1$
					+ contextElement.getDeviceContextElement().getDevice()
							.getMemory() + " GB" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$

			// display Time
			formattedString = formattedString + "Software" + "\n"; //$NON-NLS-1$ //$NON-NLS-2$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Operating System: " //$NON-NLS-1$
					+ contextElement.getDeviceContextElement().getSoftware()
							.getOperatingsystem() + "\n"; //$NON-NLS-1$
			formattedString = formattedString
					+ "\t" //$NON-NLS-1$
					+ "Version: " //$NON-NLS-1$
					+ contextElement.getDeviceContextElement().getSoftware()
							.getVersion() + "\n"; //$NON-NLS-1$

		}

		// return the formatted string
		return formattedString;
	}

	/**
	 * Read the file content after accepting the urlPath of XML file
	 * 
	 * @param urlPath
	 *            url Path
	 * @return string data of read XML
	 */
	private String readFileContent(String urlPath) {

		// new string builder
		StringBuilder result = new StringBuilder();

		// URL
		URL url;
		try {

			// get the URL
			url = new URL(urlPath);

			// get the input stream
			InputStream is = url.openStream();

			// byte array
			byte[] buf = new byte[1024];
			int read = -1;
			while ((read = is.read(buf, 0, buf.length)) != -1) {
				result.append(new String(buf, 0, read, "utf-8"));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	/**
	 * Method returning CAS Mediator
	 * 
	 * @return {@link MediatorIF} mediator CAS
	 */
	private MediatorIF getCASMediator() {
		return CASMediator.getInstance();
	}

}
