package at.fhooe.mc.lbcas.component.gps;

/**
 * Datum: 10. 5. 2006
 * @author Lin Yen-Chia
 * @version 1.2
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Observable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement.GeographicalLocation;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;

/**
 * Die Main-Klasse mit den GUI Komponenten. GPS Datensätze werden geparsed und
 * es zeigt die Positionen der Satelliten an. Es gibt zusätzlich noch Daten wie
 * PDOP, HDOP, Longitude, Latitude, usw. an.
 * 
 */
public class GPSComponent extends JPanel implements ComponentIF {
	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = -8463802202464708918L;

	/**
	 * error file
	 */
	private static boolean m_useErrorFile = false;

	/**
	 * GPS Info Panel
	 */
	private GPSInfoPanel m_gpsInfoPanel;

	/**
	 * GPS Satellite Panel
	 */
	private GPSSatellitePanel m_gpsSatPanel;

	/**
	 * NMEA Parser
	 */
	private NMEAParser m_NMEAParser;

	/**
	 * Tie Fighter
	 */
	private static boolean m_useTiefighter;

	/**
	 * CAS Mediator
	 */
	private MediatorIF m_CASMediator;

	/**
	 * Main Methode.
	 * 
	 * <pre>
	 * Übergabeparameter:
	 * 			-EF -errorFile: Verwendet "GPS-Log-I.log" als Datei
	 * 			-T -useT: Es werden Tiefighter gezeichnet.
	 * </pre>
	 * 
	 * @param args
	 *            Übergabeparameter
	 */
	public static void main(String[] _args) {

		// programm wurde möglicherweise mit "-t" als parameter aufgerufen
		for (int i = 0; i < _args.length; i++) {
			if (_args[i].equalsIgnoreCase("-useT")
					|| _args[i].equalsIgnoreCase("-T"))
				m_useTiefighter = true;
			else if (_args[i].equalsIgnoreCase("-errorFile")
					|| _args[i].equalsIgnoreCase("-EF"))
				m_useErrorFile = true;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable _observable, Object _arg) {

		if (_observable instanceof NMEAParser) {

			// create the nmea INFO
			NMEAInfo nmeaInfo = null;

			// List of context elements
			Vector<ContextElement> contextElementVector = new Vector<>();

			// create the context element to communicate
			ContextElement contextElement = new ContextElement();
			LocationContextElement locationContextElement = new LocationContextElement();

			GeographicalLocation geographicalLocation = new GeographicalLocation();
			// get the nmeaInfo
			if (_arg instanceof NMEAInfo) {
				nmeaInfo = (NMEAInfo) _arg;
			}

			// create the location context element from the nmeaInfo Object
			geographicalLocation
					.setLatitude((nmeaInfo.getLatitudeGrad() + nmeaInfo
							.getLatitudeMinuten() / 60));
			geographicalLocation
					.setLongitude((nmeaInfo.getLongitudeGrad() + nmeaInfo
							.getLongitudeMinuten() / 60));
			geographicalLocation.setAltitude((float) nmeaInfo.getSatHoehe());
			locationContextElement.setContextid(1000);
			locationContextElement
					.setGeographicalLocation(geographicalLocation);
			contextElement.setContexttype("locationcontext");
			// set in the context element
			contextElement.setLocationContextElement(locationContextElement);
			// add it to vector
			contextElementVector.addElement(contextElement);

			// communicate to CAS Mediator
			m_CASMediator = getCASMediator();
			m_CASMediator.communicateContextElements(contextElementVector);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#createPanel()
	 */
	@Override
	public JPanel createPanel() {
		m_NMEAParser = null;
		InputStream inputStream = null;
		try {

			// read the file
			if (m_useErrorFile) {
				// get the image from package
				inputStream = GPSComponent.class
						.getClassLoader()
						.getResourceAsStream(
								"at/fhooe/mc/lbcas/component/gps/GPS-Log-II.log");
				m_NMEAParser = new NMEAParser(inputStream);
			} else {
				inputStream = GPSComponent.class
						.getClassLoader()
						.getResourceAsStream(
								"at/fhooe/mc/lbcas/component/gps/GPS-Log-III.log");
				m_NMEAParser = new NMEAParser(inputStream);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// create a thread
		final Thread threadParser = new Thread(m_NMEAParser);

		// set the layout
		this.setLayout(new BorderLayout());

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				getPanelName(), TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		this.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// button for starting thread
		JButton startThreadButton = new JButton("Start Thread");
		startThreadButton.setBounds(100, 80, 180, 23);
		startThreadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// start the thread
				threadParser.start();
			}
		});

		// button for starting thread
		JButton stopThreadButton = new JButton("Stop Thread");
		stopThreadButton.setBounds(300, 80, 180, 23);
		stopThreadButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// stop the thread
				threadParser.suspend();
				;
			}
		});

		// Information panel
		m_gpsInfoPanel = new GPSInfoPanel();
		m_gpsInfoPanel.setLayout(null);
		m_gpsInfoPanel.add(startThreadButton);
		m_gpsInfoPanel.add(stopThreadButton);

		m_gpsInfoPanel.setSize(600, 100);
		m_gpsInfoPanel.setMinimumSize(new Dimension(600, 100));
		m_gpsInfoPanel.setPreferredSize(new Dimension(600, 100));

		// GPS satellite panel
		m_gpsSatPanel = new GPSSatellitePanel(m_useTiefighter);
		m_gpsSatPanel.setSize(600, 600);
		m_gpsSatPanel.setMinimumSize(new Dimension(600, 600));
		m_gpsSatPanel.setPreferredSize(new Dimension(600, 600));

		// adding the observers
		m_NMEAParser.addObserver(m_gpsInfoPanel);
		m_NMEAParser.addObserver(m_gpsSatPanel);
		m_NMEAParser.addObserver(this);

		// adding the panels
		this.add(m_gpsSatPanel, BorderLayout.CENTER);
		this.add(m_gpsInfoPanel, BorderLayout.EAST);

		new Thread() {
			public void run() {
				m_gpsInfoPanel.repaint();
				m_gpsSatPanel.repaint();
			}
		}.start();

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#getPanelName()
	 */
	@Override
	public String getPanelName() {
		return "GPS Component";
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
