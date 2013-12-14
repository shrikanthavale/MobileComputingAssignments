/**
 * 
 */
package at.fhooe.mc.lbcas.mediator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.Set;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.aalc.FactoryCreator;
import at.fhooe.mc.lbcas.component.aalc.XMLParserIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;
import at.fhooe.mc.lbcas.component.displaymessages.DisplayMessagesComponent;
import at.fhooe.mc.lbcas.component.gis.ContextElementObservable;
import at.fhooe.mc.lbcas.component.gis.ContextSituationObservable;
import at.fhooe.mc.lbcas.component.gis.GeoObjectObservable;
import at.fhooe.mc.lbcas.componentcompositionparser.ComponentComposition;
import at.fhooe.mc.lbcas.contextrulejavacc.ContextRuleParser;
import at.fhooe.mc.lbcas.contextrulejavacc.ParseException;
import at.fhooe.mc.lbcas.contextruleparser.NodeError;
import at.fhooe.mc.lbcas.contextruleparser.RulesEntity;
import at.fhooe.mc.lbcas.contextruleparser.TreeNode;
import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.reflectionapi.ClientController;
import at.fhooe.mc.lbcas.reflectionapi.ClientControllerIF;
import at.fhooe.mc.lbcas.reflectionapi.ReflectionAPIFrame;

/**
 * @author Shrikant Havale
 * 
 *         This class act as mediator for communicating with the different
 *         components, also initializes the frame
 */
public class CASMediator implements MediatorIF {

	/**
	 * singleton instance of CASMediator
	 */
	private static MediatorIF m_casMediator = new CASMediator();

	/**
	 * component for displaying message window
	 */
	private ComponentIF m_componentDisplayMessages;

	/**
	 * component for Reflection API
	 */
	private ReflectionAPIFrame m_ReflectionAPIFrame;

	/**
	 * Main Tab Pane
	 */
	private JTabbedPane m_mainTabbedPane;
	
	/**
	 * new frame to be added
	 */
	private JFrame m_JFrame;

	/**
	 * observable geo object
	 */
	private GeoObjectObservable m_geoObjectObservable;

	/**
	 * observable context element
	 */
	private ContextElementObservable m_contextElementObservable;

	/**
	 * observable context situation
	 */
	private ContextSituationObservable m_conteContextSituationObservable;

	/**
	 * client controller for ReflectionAPI
	 */
	private ClientControllerIF m_clientController;

	/**
	 * parser for parsing component composition XML
	 */
	private XMLParserIF m_componentCompositionXMLReader;
	
	/**
	 * parser for reading the rules file
	 */
	private XMLParserIF m_contextRuleXMLReader;

	/**
	 * component comosition list
	 */
	private HashMap<String, ComponentComposition> m_componentCompositionList;

	/**
	 * constant string for the interface component
	 */
	private static final String m_componentInterfacePackage = "at.fhooe.mc.lbcas.component.ComponentIF";
	
	/**
	 * Hash map for storing different rules as list and key as type of rule
	 */
	private static Map<String, List<RulesEntity>> m_ruleMap = new HashMap<>();
	
	/**
	 * Hash map for storing Rules Entity and its corresponding tree node
	 */
	private static Map<String , Map <TreeNode, RulesEntity>> m_treeNodeRulesMap = new HashMap<>();
	
	/**
	 * private constructor to avoid external initialization for singleton
	 * pattern
	 */
	private CASMediator() {
	}

	/**
	 * This method initializes the frame and creates the tab mechanism
	 */
	public void initializeFrame() {

		// initialize the observable
		m_geoObjectObservable = new GeoObjectObservable();
		m_contextElementObservable = new ContextElementObservable();
		m_conteContextSituationObservable = new ContextSituationObservable();

		// Initialize the frame
		m_JFrame = new JFrame("GIS Frame");

		// add the window listener
		m_JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// integrate UI into frame
		m_JFrame.setLayout(new BorderLayout());

		// set it to maximized
		m_JFrame.setExtendedState(Frame.MAXIMIZED_BOTH);

		// create the client controller
		m_clientController = new ClientController();

		// create a panel for all tabs
		JPanel panelForAllTabs = new JPanel(new BorderLayout());

		// create a border for the panel
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				"Components", TitledBorder.LEFT, TitledBorder.CENTER, new Font(
						"Tahoma", Font.BOLD | Font.ITALIC, 12));
		panelForAllTabs.setBorder(BorderFactory.createCompoundBorder(
				titledBorder, loweredbevel));

		// create a tab pane inside panel
		m_mainTabbedPane = new JTabbedPane();
		panelForAllTabs.add(m_mainTabbedPane, BorderLayout.CENTER);

		// add the panel containing the tabs
		m_JFrame.getContentPane().add(panelForAllTabs, BorderLayout.CENTER);

		m_componentDisplayMessages = new DisplayMessagesComponent();
		JPanel messagePanel = m_componentDisplayMessages.createPanel();
		m_JFrame.add(messagePanel, BorderLayout.SOUTH);

		// get the required parser
		m_componentCompositionXMLReader = FactoryCreator
				.factoryMethod("ContextCompositionXMLReader");

		m_componentCompositionList = m_componentCompositionXMLReader
				.readComponentComposition("at/fhooe/mc/lbcas/componentcompositionparser/ComponentComposition.xml");
		
		// create the rule parser
		m_contextRuleXMLReader = FactoryCreator.factoryMethod("ContextRuleXMLReader");
		
		// read the xml file
		List<RulesEntity> gisRules = m_contextRuleXMLReader.readContextRules("at/fhooe/mc/lbcas/contextruleparser/GISRules.xml");
		m_ruleMap.put("GISRules", gisRules);
		
		List<RulesEntity> poiRules = m_contextRuleXMLReader.readContextRules("at/fhooe/mc/lbcas/contextruleparser/POIRules.xml");
		m_ruleMap.put("POIRules", poiRules);
		
		List<RulesEntity> temperatureRules = m_contextRuleXMLReader.readContextRules("at/fhooe/mc/lbcas/contextruleparser/TemperatureRules.xml");
		m_ruleMap.put("TemperatureRules", temperatureRules);
		
		try {
			for(String key : m_ruleMap.keySet()){
				Map<TreeNode, RulesEntity> tempHashMap = new HashMap<>();
				for(RulesEntity tempRulesEntity : m_ruleMap.get(key)){
					String rule = tempRulesEntity.getM_ruleCondition();
					ContextRuleParser contextRuleParser = new ContextRuleParser(new ByteArrayInputStream(rule.getBytes()));
					TreeNode treeNode = contextRuleParser.execute();
					tempHashMap.put(treeNode, tempRulesEntity);
				}
				m_treeNodeRulesMap.put(key, tempHashMap);
			}
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		// add the Reflection API component
		m_ReflectionAPIFrame = new ReflectionAPIFrame(
				m_componentCompositionList);

		// validate and pack
		m_JFrame.validate();
		m_JFrame.pack();
		m_JFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// this logic is because of error in JFileChoose component from Swing,
		// when the application is closed it throws exception, as component is
		// not destroyed
		m_JFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				PrintStream nullStream = new PrintStream(new OutputStream() {
					public void write(int b) throws IOException {
					}

					public void write(byte b[]) throws IOException {
					}

					public void write(byte b[], int off, int len)
							throws IOException {
					}
				});
				System.setErr(nullStream);
				System.setOut(nullStream);
				System.exit(0);
			}
		});

		// set it to visible
		m_JFrame.setVisible(true);
		m_ReflectionAPIFrame.setVisible(true);

	}

	/**
	 * Start the application
	 * 
	 * @param args
	 *            arguments
	 */
	public static void main(String[] args) {
		getInstance().initializeFrame();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.mediator.MediatorIF#communicateGeoObjects(java.util
	 * .Vector)
	 */
	@Override
	public void communicateGeoObjects(Vector<GeoObject> _geoObjects) {

		// geo objects changed
		m_geoObjectObservable.setChanged();

		// notify all the observers about new GEO objects
		m_geoObjectObservable.notifyObservers(_geoObjects);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.mediator.MediatorIF#communicateContextElements()
	 */
	@Override
	public void communicateContextElements(
			Vector<ContextElement> _contextElements) {

		// context element changed
		m_contextElementObservable.setChanged();

		// notify observers
		m_contextElementObservable.notifyObservers(_contextElements);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.mediator.MediatorIF#communicateContextSituation(at.
	 * fhooe.mc.lbcas.component.contextmanagement.ContextSituation)
	 */
	@Override
	public void communicateContextSituation(ContextSituation _contextSituation) {

		// context situation changed
		m_conteContextSituationObservable.setChanged();

		// notify observers
		m_conteContextSituationObservable.notifyObservers(_contextSituation);
		
		 for(TreeNode treeNode : m_treeNodeRulesMap.get("GISRules").keySet()){
			 try {
				treeNode.setVariableParameters(_contextSituation); 
				treeNode.calculate();
			} catch (NodeError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.mediator.MediatorIF#communicateSelectedComponents(java
	 * .util.List)
	 */
	@Override
	@SuppressWarnings("all")
	public void communicateSelectedComponents(Set<String> _listComponents) {

		try {

			// no parameter class array
			Class<?>[] noParams = {};

			Class<?> parameterDynamicProperyComponentsList[] = { List.class };

			for (String selectedComponent : _listComponents) {

				// get the class component
				Class<?> component = m_clientController.findModule(
						m_componentInterfacePackage, selectedComponent);

				if (component != null) {

					// create new object
					Object object = component.newInstance();

					// method for creating panel
					Method methodCreatePanel = component.getDeclaredMethod(
							"createPanel", noParams);

					// method for panel name
					Method methodPanelName = component.getDeclaredMethod(
							"getPanelName", noParams);

					// add it to tab
					m_mainTabbedPane
							.addTab((String) methodPanelName.invoke(object,
									noParams), (JPanel) methodCreatePanel
									.invoke(object, noParams));

					// add the observers
					m_geoObjectObservable.addObserver((Observer) object);
					m_contextElementObservable.addObserver((Observer) object);
					m_conteContextSituationObservable
							.addObserver((Observer) object);

					HashMap<String, String> methodNamesParameters = m_componentCompositionList
							.get(selectedComponent).getM_hashMapComponents()
							.get(selectedComponent);

					for (String key : methodNamesParameters.keySet()) {

						String methodName = key;

						String methodParameterClass = methodNamesParameters
								.get(key);

						Class<?> parameterClass = m_clientController
								.findClass(methodParameterClass);

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
			}

		}

		catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method returns the single instance of mediator which can be used for
	 * communication with other components
	 * 
	 * @return {@link MediatorIF} singleton instance of CASMediator
	 */
	public static MediatorIF getInstance() {
		return m_casMediator;
	}

	/**
	 * @return the m_mainTabbedPane
	 */
	public JTabbedPane getM_mainTabbedPane() {
		return m_mainTabbedPane;
	}

	/**
	 * @param m_mainTabbedPane
	 *            the m_mainTabbedPane to set
	 */
	public void setM_mainTabbedPane(JTabbedPane m_mainTabbedPane) {
		this.m_mainTabbedPane = m_mainTabbedPane;
	}

	/**
	 * @return the m_JFrame
	 */
	public JFrame getM_JFrame() {
		return m_JFrame;
	}

	/**
	 * @param m_JFrame
	 *            the m_JFrame to set
	 */
	public void setM_JFrame(JFrame m_JFrame) {
		this.m_JFrame = m_JFrame;
	}

	/**
	 * @return the m_componentDisplayMessages
	 */
	public ComponentIF getM_componentDisplayMessages() {
		return m_componentDisplayMessages;
	}

	/**
	 * @param m_componentDisplayMessages
	 *            the m_componentDisplayMessages to set
	 */
	public void setM_componentDisplayMessages(
			ComponentIF m_componentDisplayMessages) {
		this.m_componentDisplayMessages = m_componentDisplayMessages;
	}

}
