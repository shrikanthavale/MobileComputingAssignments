/**
 * 
 */
package at.fhooe.mc.lbcas.component.poicomponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;
import at.fhooe.mc.lbcas.component.displaymessages.DisplayMessagesComponent;
import at.fhooe.mc.lbcas.component.gis.ContextSituationObservable;
import at.fhooe.mc.lbcas.component.gis.GISComponent;
import at.fhooe.mc.lbcas.contextruleparser.NodeError;
import at.fhooe.mc.lbcas.contextruleparser.RulesEntity;
import at.fhooe.mc.lbcas.contextruleparser.TreeNode;
import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.entities.POIObject;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;
import at.fhooe.mc.lbcas.reflectionapi.ClientController;
import at.fhooe.mc.lbcas.reflectionapi.ClientControllerIF;
import at.fhooe.mc.lbcas.server.GEOServerInterface;

/**
 * @author Shrikant Havale
 * 
 *         This class contains the UI component related to Point of interest.
 *         creates the UI panel and accordingly handles the UI events
 * 
 */
public class POIComponent extends JPanel implements ComponentIF {

	/**
	 * default generated serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * check box for petrol station
	 */
	private JCheckBox m_checkBoxPetrolStation;

	/**
	 * check box context aware
	 */
	private static JCheckBox m_contextAwareCheckBox;

	/**
	 * button for setting the image icon
	 */
	private static JButton m_imageButton;

	/**
	 * check box hospital
	 */
	private JCheckBox m_checkBoxHospital;

	/**
	 * check box police station
	 */
	private JCheckBox m_checkBoxPoliceStation;

	/**
	 * check box bank
	 */
	private JCheckBox m_checkBoxBank;

	/**
	 * check box airport
	 */
	private JCheckBox m_checkBoxAirport;

	/**
	 * check box embassy
	 */
	private JCheckBox m_checkBoxEmbassy;

	/**
	 * check box theater
	 */
	private JCheckBox m_checkBoxTheater;

	/**
	 * SDE Server component for getting GEO Objects
	 */
	private GEOServerInterface m_geoServerInterface;

	/**
	 * CASMediator
	 */
	private MediatorIF m_casMediator;

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

		// label panel
		JLabel panelInnerHeadingLabel = new JLabel(
				Messages.getString("POIComponent.POIHeadingPanel")); //$NON-NLS-1$
		panelInnerHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelInnerHeadingLabel.setFont(new Font(Messages
				.getString("POIComponent.POILabelFont"), Font.BOLD, 14)); //$NON-NLS-1$
		this.add(panelInnerHeadingLabel, BorderLayout.NORTH);

		// create the combined panel
		JPanel combinePanel = new JPanel(new GridLayout(1, 2, 0, 0));
		JPanel fixedPOIPanel = new JPanel(new BorderLayout());
		JPanel variablePOIPane = new JPanel(new BorderLayout());
		combinePanel.add(fixedPOIPanel);
		combinePanel.add(variablePOIPane);
		this.add(combinePanel, BorderLayout.CENTER);

		// check box panel
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				"Fixed POI", TitledBorder.LEFT, TitledBorder.CENTER, new Font(
						"Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		panel_1.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// check box for petrol station
		m_checkBoxPetrolStation = new JCheckBox(
				Messages.getString("POIComponent.POIPertolStation")); //$NON-NLS-1$
		m_checkBoxPetrolStation.setToolTipText(Messages
				.getString("POIComponent.POIPertolStationCode")); //$NON-NLS-1$
		m_checkBoxPetrolStation.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(m_checkBoxPetrolStation);

		// check box hospital
		m_checkBoxHospital = new JCheckBox(
				Messages.getString("POIComponent.POIHopsital")); //$NON-NLS-1$
		m_checkBoxHospital.setToolTipText(Messages
				.getString("POIComponent.POIHopsitalCode")); //$NON-NLS-1$
		m_checkBoxHospital.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(m_checkBoxHospital);

		// check box police station
		m_checkBoxPoliceStation = new JCheckBox(
				Messages.getString("POIComponent.POIPoliceStation")); //$NON-NLS-1$
		m_checkBoxPoliceStation.setToolTipText(Messages
				.getString("POIComponent.POIPoliceStationCode")); //$NON-NLS-1$
		panel_1.add(m_checkBoxPoliceStation);

		// check box bank
		m_checkBoxBank = new JCheckBox(
				Messages.getString("POIComponent.POIBank")); //$NON-NLS-1$
		m_checkBoxBank.setToolTipText(Messages
				.getString("POIComponent.POIBankCode")); //$NON-NLS-1$
		panel_1.add(m_checkBoxBank);

		// check box airport
		m_checkBoxAirport = new JCheckBox(
				Messages.getString("POIComponent.POIAirport")); //$NON-NLS-1$
		m_checkBoxAirport.setToolTipText(Messages
				.getString("POIComponent.POIAirportCode")); //$NON-NLS-1$
		panel_1.add(m_checkBoxAirport);

		// check box embassy
		m_checkBoxEmbassy = new JCheckBox(
				Messages.getString("POIComponent.POIEmbassy")); //$NON-NLS-1$
		m_checkBoxEmbassy.setToolTipText(Messages
				.getString("POIComponent.POIEmbassyCode")); //$NON-NLS-1$
		panel_1.add(m_checkBoxEmbassy);

		// check box theater
		m_checkBoxTheater = new JCheckBox(
				Messages.getString("POIComponent.POITheater")); //$NON-NLS-1$
		m_checkBoxTheater.setToolTipText(Messages
				.getString("POIComponent.POITheaterCode")); //$NON-NLS-1$
		panel_1.add(m_checkBoxTheater);

		// add the panel_1 to fixed POI
		fixedPOIPanel.add(panel_1, BorderLayout.CENTER);

		// check box panel
		JPanel panelVariablePOI = new JPanel();
		panelVariablePOI.setLayout(new GridLayout(0, 1, 0, 0));
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				"Context Aware POI", TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		panelVariablePOI.setBorder(BorderFactory.createCompoundBorder(
				titledBorder, loweredbevel));

		// check box for context aware
		m_contextAwareCheckBox = new JCheckBox(); //$NON-NLS-1$
		m_contextAwareCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		m_contextAwareCheckBox.setSelected(true);
		panelVariablePOI.add(m_contextAwareCheckBox);

		// set the image in left side corner
		JPanel imagePanel = new JPanel();
		imagePanel.setLayout(new BorderLayout());
		imagePanel.setBackground(Color.lightGray);

		// just create the new button
		m_imageButton = new JButton();
		imagePanel.add(m_imageButton, BorderLayout.CENTER);
		m_imageButton.setEnabled(false);

		variablePOIPane.add(panelVariablePOI, BorderLayout.NORTH);
		// variablePOIPane.add(imagePanel, BorderLayout.CENTER);

		// button panel
		JPanel panel_2 = new JPanel();
		this.add(panel_2, BorderLayout.SOUTH);

		// collect button POI and fetch GEO Objects
		JButton buttonCollectPOI = new JButton(
				Messages.getString("POIComponent.POIButtonCollectPOI")); //$NON-NLS-1$
		panel_2.add(buttonCollectPOI);
		buttonCollectPOI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// get the GEO objects - method should be used in actual
				// connection to server
				Vector<GeoObject> objectContainer = getGeoObjectsForPOISelected();

				if (objectContainer != null)
					getCASMediator().communicateGeoObjects(objectContainer);
			}
		});

		// button check all
		JButton buttonCheckAll = new JButton(
				Messages.getString("POIComponent.POIButtonCheckAll")); //$NON-NLS-1$
		panel_2.add(buttonCheckAll);
		buttonCheckAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// check all the button
				if (m_checkBoxAirport.isEnabled())
					m_checkBoxAirport.setSelected(true);
				if (m_checkBoxBank.isEnabled())
					m_checkBoxBank.setSelected(true);
				if (m_checkBoxEmbassy.isEnabled())
					m_checkBoxEmbassy.setSelected(true);
				if (m_checkBoxHospital.isEnabled())
					m_checkBoxHospital.setSelected(true);
				if (m_checkBoxPetrolStation.isEnabled())
					m_checkBoxPetrolStation.setSelected(true);
				if (m_checkBoxPoliceStation.isEnabled())
					m_checkBoxPoliceStation.setSelected(true);
				if (m_contextAwareCheckBox.isEnabled())
					m_contextAwareCheckBox.setSelected(true);
				if (m_checkBoxTheater.isEnabled())
					m_checkBoxTheater.setSelected(true);
			}
		});

		// button reset all
		JButton buttonReset = new JButton(
				Messages.getString("POIComponent.POIButtonReset")); //$NON-NLS-1$
		panel_2.add(buttonReset);
		buttonReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// check all the button
				if (m_checkBoxAirport.isEnabled())
					m_checkBoxAirport.setSelected(false);
				if (m_checkBoxBank.isEnabled())
					m_checkBoxBank.setSelected(false);
				if (m_checkBoxEmbassy.isEnabled())
					m_checkBoxEmbassy.setSelected(false);
				if (m_checkBoxHospital.isEnabled())
					m_checkBoxHospital.setSelected(false);
				if (m_checkBoxPetrolStation.isEnabled())
					m_checkBoxPetrolStation.setSelected(false);
				if (m_checkBoxPoliceStation.isEnabled())
					m_checkBoxPoliceStation.setSelected(false);
				if (m_contextAwareCheckBox.isEnabled())
					m_contextAwareCheckBox.setSelected(false);
				if (m_checkBoxTheater.isEnabled())
					m_checkBoxTheater.setSelected(false);

				// get the geo objects - method should be used in actual
				// connection to server
				Vector<GeoObject> objectContainer = removeSelectedPOIObjects();

				if (objectContainer != null)
					getCASMediator().communicateGeoObjects(objectContainer);
			}

		});

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#getPanelName()
	 */
	@Override
	public String getPanelName() {
		return Messages.getString("POIComponent.POIComponentTabHeading"); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable _observable, Object _arg) {
		// observable instance of ContextSituation
		if (_observable instanceof ContextSituationObservable) {

			// set the values from context situation and validate the tree
			setContextSituationValuesTreeAndValidate(_arg);
		}

	}

	private void setContextSituationValuesTreeAndValidate(Object _arg) {

		// cast to context situation
		ContextSituation contextSituation = (ContextSituation) _arg;

		// tree node rules map
		Map<String, Map<TreeNode, RulesEntity>> m_treeNodeRulesMap = CASMediator
				.getM_treeNodeRulesMap();

		// iterate through the tree node map rule
		for (TreeNode treeNode : m_treeNodeRulesMap.get("POIRules").keySet()) {
			try {
				treeNode.setVariableParameters(contextSituation);
				Boolean result = (Boolean) treeNode.calculate();
				if (result) {
					adaptPOIComponent(m_treeNodeRulesMap.get("POIRules").get(
							treeNode));
				}
			} catch (NodeError e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("all")
	private void adaptPOIComponent(RulesEntity rulesEntity) {

		// create the client controller
		ClientControllerIF m_clientController = new ClientController();

		// interface package
		String m_componentInterfacePackage = "at.fhooe.mc.lbcas.component.ComponentIF";

		try {
			// get the class component
			Class<?> component = m_clientController.findModule(
					m_componentInterfacePackage,
					rulesEntity.getM_affectedComponent());

			if (component != null) {
				// create new object
				Object object = component.newInstance();

				// get the method name
				String methodName = rulesEntity.getM_methodName();

				// get the method parameter
				String methodParameterClass = rulesEntity.getM_parameterClass();

				// find the parameter class
				Class<?> parameterClass = m_clientController
						.findClass(methodParameterClass);

				if (parameterClass != null) {

					Object parameterClassInstance = parameterClass
							.newInstance();

					Class<?>[] interfaces = parameterClass.getInterfaces();

					for (Class<?> tempClass : interfaces) {
						try {
							Method method = component.getDeclaredMethod(
									methodName, tempClass);
							method.invoke(object, parameterClassInstance);
							break;
						} catch (NoSuchMethodException e) {
							// Do Nothing
						}
					}
				}
			}
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	public void setContextAwarePOI(PointOfInterstIF _poiInterstIF) {
		// adapt the POI
		_poiInterstIF.setPOIDetails(m_contextAwareCheckBox);

		// get the image from package
		URL resource = POIObject.class.getClassLoader().getResource(
				_poiInterstIF.getPOIImagePath());

		// set the image icon to button
		m_imageButton.setIcon(new ImageIcon(resource));
	}

	/**
	 * Set server method for loading the data from particular server. SDE
	 * Server, Dummy Server or Serialized Data
	 * 
	 * @param geoServerInterface
	 */
	public void setServer(GEOServerInterface _geoServerInterface) {
		m_geoServerInterface = _geoServerInterface;
	}

	/**
	 * Get the GEO objects selected for the POIs taken and communicate them to
	 * CAS Mediator.
	 * 
	 * @return {@link Vector} vector of GEO Objects
	 */
	private Vector<GeoObject> getGeoObjectsForPOISelected() {

		// object container
		Vector<GeoObject> objectContainer = null;

		// selected POI
		List<Integer> selectedPOIs = getSelectedObjectTypes();

		// establish the connection
		boolean isConnectionEstablished = m_geoServerInterface
				.login(Messages.getString("POIComponent.SDEServerUsername"), //$NON-NLS-1$
						Messages.getString("POIComponent.SDEServerUser"), Messages.getString("POIComponent.SDEServerPassword")); //$NON-NLS-1$ //$NON-NLS-2$

		// check for connection established
		if (isConnectionEstablished) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("POIComponent.SDEServerConnectionEstablished")); //$NON-NLS-1$

			// load the data from the server
			objectContainer = m_geoServerInterface.typeQuery(selectedPOIs);

		} else {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("POIComponent.DummyServerConnectionFailed")); //$NON-NLS-1$
			return null;
		}

		// check for null
		if (objectContainer == null) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("POIComponent.SDEServerErrorFetchingData")); //$NON-NLS-1$
		} else {

			getDisplayMessageComponent().updateMessage(
					Messages.getString("POIComponent.DataLoadedSuccess")); //$NON-NLS-1$

		}

		return objectContainer;

	}

	/**
	 * This method clears the selected POIs and refreshes the map
	 * 
	 * @return all the objects with POI objects
	 */
	private Vector<GeoObject> removeSelectedPOIObjects() {

		// object container
		Vector<GeoObject> objectContainer;

		// establish the connection
		boolean isConnectionEstablished = m_geoServerInterface
				.login(Messages.getString("POIComponent.SDEServerUsername"), //$NON-NLS-1$
						Messages.getString("POIComponent.SDEServerUser"), Messages.getString("POIComponent.SDEServerPassword")); //$NON-NLS-1$ //$NON-NLS-2$

		// check for connection established
		if (isConnectionEstablished) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("POIComponent.SDEServerConnectionEstablished")); //$NON-NLS-1$

			// load the data from the server
			objectContainer = m_geoServerInterface.clearPOIS();

		} else {
			getDisplayMessageComponent().updateMessage(
					Messages.getString("POIComponent.ServerConnectionFailed")); //$NON-NLS-1$
			return null;
		}

		// check for null
		if (objectContainer == null) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("POIComponent.SDEServerErrorFetchingData")); //$NON-NLS-1$
		} else {

			getDisplayMessageComponent().updateMessage(
					Messages.getString("POIComponent.DataLoadedSuccess")); //$NON-NLS-1$

		}

		return objectContainer;

	}

	/**
	 * This method returns all the object types which are selected by user on
	 * screen. Those object types are used later to draw POI on GIS Component
	 * 
	 * @return list of checked POIs
	 * 
	 */
	private List<Integer> getSelectedObjectTypes() {

		// checked POI
		List<Integer> checkedPOI = new ArrayList<>();

		// check box selected or not
		if (m_checkBoxAirport.isSelected())
			checkedPOI
					.add(Integer.parseInt(m_checkBoxAirport.getToolTipText()));
		if (m_checkBoxBank.isSelected())
			checkedPOI.add(Integer.parseInt(m_checkBoxBank.getToolTipText()));
		if (m_checkBoxEmbassy.isSelected())
			checkedPOI
					.add(Integer.parseInt(m_checkBoxEmbassy.getToolTipText()));
		if (m_checkBoxHospital.isSelected())
			checkedPOI
					.add(Integer.parseInt(m_checkBoxHospital.getToolTipText()));
		if (m_checkBoxPetrolStation.isSelected())
			checkedPOI.add(Integer.parseInt(m_checkBoxPetrolStation
					.getToolTipText()));
		if (m_contextAwareCheckBox.isSelected())
			checkedPOI.add(Integer.parseInt(m_contextAwareCheckBox
					.getToolTipText()));
		if (m_checkBoxPoliceStation.isSelected())
			checkedPOI.add(Integer.parseInt(m_checkBoxPoliceStation
					.getToolTipText()));
		if (m_checkBoxTheater.isSelected())
			checkedPOI
					.add(Integer.parseInt(m_checkBoxTheater.getToolTipText()));

		return checkedPOI;

	}

	/**
	 * This method gives the Display Message Component, which can be used to
	 * update text message.
	 * 
	 * @return
	 */
	private DisplayMessagesComponent getDisplayMessageComponent() {
		m_casMediator = CASMediator.getInstance();
		return (DisplayMessagesComponent) m_casMediator
				.getM_componentDisplayMessages();

	}

	/**
	 * This method gives the GISComponent via CASMediator
	 * 
	 * @return {@link GISComponent} GIS Component
	 */
	private MediatorIF getCASMediator() {
		m_casMediator = CASMediator.getInstance();
		return m_casMediator;
	}

	// updatemetho(Interface POI)
	// if instance resta
	// panel show

}
