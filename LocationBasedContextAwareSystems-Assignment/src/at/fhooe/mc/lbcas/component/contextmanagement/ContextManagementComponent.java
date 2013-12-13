/**
 * 
 */
package at.fhooe.mc.lbcas.component.contextmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.DeviceContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.DeviceContextElement.Device;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.DeviceContextElement.Software;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement.GeographicalLocation;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.LocationContextElement.PhysicalLocation;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TimeContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TimeContextElement.Date;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TimeContextElement.Time;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.UserContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.UserContextElement.Health;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.UserContextElement.UserProfile;
import at.fhooe.mc.lbcas.component.gis.ContextElementObservable;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;

/**
 * @author Shrikant Havale
 * 
 *         This components combines all the context elements into one context
 *         situation. Few Context elements are captured from AALC component like
 *         Time, Device and User context. And position context is captured from
 *         GPS component. User is also given option to change the context
 *         elements using UI of this component.
 * 
 */
public class ContextManagementComponent extends JPanel implements ComponentIF {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8238454112202190438L;

	/**
	 * time context panel
	 */
	private JPanel m_timeContextPanel;

	/**
	 * label for context id in time context
	 */
	private JLabel m_timeContextContextIdLabel;

	/**
	 * text for context id in time context
	 */
	private JTextField m_timeContextContextIdText;

	/**
	 * label for date in time context
	 */
	private JLabel m_timeContextDateLabel;

	/**
	 * label for day in time context
	 */
	private JTextField m_timeContextDateDayText;

	/**
	 * text for month in time context
	 */
	private JTextField m_timeContextDateMonthText;

	/**
	 * text for the year in time context
	 */
	private JTextField m_timeContextDateYearText;

	/*
	 * label for time in time context
	 */
	private JLabel m_timeContextTimeLabel;

	/**
	 * text for hour in time context
	 */
	private JTextField m_timeContextTimeHourText;

	/**
	 * text for minutes in time context
	 */
	private JTextField m_timeContextTimeMinutesText;

	/**
	 * text for seconds in time context
	 */
	private JTextField m_timeContextTimeSecondsText;

	/**
	 * position context panel
	 */
	private JPanel m_positionContextPanel;

	/**
	 * radio for time context day
	 */
	private JRadioButton m_timeContextDayRadio;

	/**
	 * radio for time context night
	 */
	private JRadioButton m_timeContextNightRadio;

	/**
	 * position context ID label
	 */
	private JLabel m_positionContextContextIDLabel;

	/**
	 * text for context id in context
	 */
	private JTextField m_positionContextContextIDText;

	/**
	 * label for physical location context
	 */
	private JLabel m_positionContextPhysicalLocationLabel;

	/**
	 * Text for country
	 */
	private JTextField m_positionContextPhysicalLocationCountryText;

	/**
	 * text for state
	 */
	private JTextField m_positionContextPhysicalLocationStateText;

	/**
	 * text for city
	 */
	private JTextField m_positionContextPhysicalLocationCityText;

	/**
	 * text for pincode
	 */
	private JTextField m_positionContextPhysicalLocationPincodeText;

	/**
	 * label for geographical location label
	 */
	private JLabel m_positionContextGeographicalLocationLabel;

	/**
	 * geographical location latitude text
	 */
	private JTextField m_positionContextGeographicalLocationLatitudeText;

	/**
	 * geographical location longitude text
	 */
	private JTextField m_positionContextGeographicalLocationLongitudeText;

	/**
	 * geographical location altitude text
	 */
	private JTextField m_positionContextGeographicalLocationAltitudeText;

	/**
	 * update position context button
	 */
	private JButton m_updatePositionContextButton;

	/**
	 * user context panel
	 */
	private JPanel m_userContextPanel;

	/**
	 * label for user context context ID
	 */
	private JLabel m_userContextContextIDLabel;

	/**
	 * user context context id text
	 */
	private JTextField m_userContextContextIDText;

	/**
	 * user context age label
	 */
	private JLabel m_userContextAgeLabel;

	/**
	 * user context age text
	 */
	private JTextField m_userContextAgeText;

	/**
	 * user context health label
	 */
	private JLabel m_userContextHealthLabel;

	/**
	 * user context blood pressure text
	 */
	private JTextField m_userContextHealthBloodPressure;

	/**
	 * user context heart rate text
	 */
	private JTextField m_userContextHealthHeartRate;

	/**
	 * user context health voice tone
	 */
	private JTextField m_userContextHealthVoiceTone;

	/**
	 * user context update button
	 */
	private JButton m_userContextUpdateButton;

	/**
	 * user context radio single
	 */
	private JRadioButton m_userContextRadioSingle;

	/**
	 * user context radio married
	 */
	private JRadioButton m_userContextRadioMarried;

	/**
	 * device context panel
	 */
	private JPanel m_deviceContextPanel;

	/**
	 * device context context id label
	 */
	private JLabel m_deviceContextContextIDLabel;

	/**
	 * device context context id text
	 */
	private JTextField m_deviceContextContextIDText;

	/**
	 * device context memory label
	 */
	private JLabel m_deviceContextMemoryLabel;

	/**
	 * device context memory text
	 */
	private JTextField m_deviceContextMemoryText;

	/**
	 * device context software label
	 */
	private JLabel m_deviceContextSoftwareLabel;

	/**
	 * device context operating system
	 */
	private JTextField m_deviceContextOperatingSyste;

	/**
	 * device context operating system version
	 */
	private JTextField m_deviceOperatingSystemVersion;

	/**
	 * device context update context button
	 */
	private JButton m_deviceContextUpdateContextButton;

	/**
	 * device context audio label
	 */
	private JLabel m_deviceContextAudioLabel;

	/**
	 * device context audio radio yes
	 */
	private JRadioButton m_deviceContextAudioRadioYes;

	/**
	 * device context audio radio no
	 */
	private JRadioButton m_deviceContextAudioRadioNo;

	/**
	 * device context battery
	 */
	private JLabel m_deviceContextBatteryLabel;

	/**
	 * device context battery percentage slider
	 */
	private JSlider m_deviceContextBatteryPercentageSlider;

	/**
	 * transmission frequency panel
	 */
	private JPanel m_transmissionFrequencyPanel;

	/**
	 * transmission frequency seconds text
	 */
	private JTextField m_transmissionFrequencySecondsText;

	/**
	 * context situation
	 */
	private ContextSituation m_contextSituation = new ContextSituation();

	/**
	 * is transmitted boolean variable
	 */
	private boolean isTransmissionStarted = false;

	/**
	 * grouping the radio button for day and night
	 */
	private ButtonGroup m_groupradioButtonsDayNight = null;

	/**
	 * grouping the radio button for male and female
	 */
	private ButtonGroup m_groupradioButtonsMaleFemale = null;

	/**
	 * grouping the radio button for single and Married
	 */
	private ButtonGroup m_groupradioButtonsSingleMarried = null;

	/**
	 * grouping the radio button for Audio Yes No
	 */
	private ButtonGroup m_groupradioButtonsAudioYesNo = null;

	/**
	 * user context radio male
	 */
	private JRadioButton m_userContextRadioMale;

	/**
	 * user context radio female
	 */
	private JRadioButton m_userContextRadioFemale;

	/**
	 * CAS Mediator interface
	 */
	private MediatorIF m_CASMediator;

	/**
	 * transmission frequency seconds label
	 */
	private JLabel m_transmissionFrequencySecondsLabel;

	/**
	 * button for starting transmitting context situation
	 */
	private JButton m_startTransmittingContextSituation;

	/**
	 * button for stopping transmitting context situation
	 */
	private JButton m_stopTransmittingContextSituation;

	/**
	 * temperature context panel
	 */
	private JPanel m_TemperatureContextPanel;

	/**
	 * temperature text
	 */
	private JTextField m_temperatureText;

	/**
	 * temperature label
	 */
	private JLabel m_temperatureLabel;

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#createPanel()
	 */
	@Override
	public JPanel createPanel() {

		// set layout
		this.setLayout(new GridLayout(3, 2, 0, 0));

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				getPanelName(), TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		this.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// time context panel
		m_timeContextPanel = new JPanel();
		m_timeContextPanel.setBorder(new TitledBorder(new LineBorder(new Color(
				0, 0, 0), 1, true), "Time Context", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		this.add(m_timeContextPanel);
		m_timeContextPanel.setLayout(null);

		// time context label
		m_timeContextContextIdLabel = new JLabel("Context ID");
		m_timeContextContextIdLabel.setBounds(10, 23, 70, 14);
		m_timeContextPanel.add(m_timeContextContextIdLabel);

		// create text for context id
		m_timeContextContextIdText = new JTextField();
		m_timeContextContextIdText.setBounds(90, 20, 50, 20);
		m_timeContextPanel.add(m_timeContextContextIdText);
		m_timeContextContextIdText.setColumns(10);

		// label for time context date
		m_timeContextDateLabel = new JLabel("Date");
		m_timeContextDateLabel.setBounds(10, 54, 70, 14);
		m_timeContextPanel.add(m_timeContextDateLabel);

		// time context date day
		m_timeContextDateDayText = new JTextField();
		m_timeContextDateDayText.setBounds(90, 51, 50, 20);
		m_timeContextPanel.add(m_timeContextDateDayText);
		m_timeContextDateDayText.setColumns(10);

		// time context date month
		m_timeContextDateMonthText = new JTextField();
		m_timeContextDateMonthText.setBounds(155, 51, 50, 20);
		m_timeContextPanel.add(m_timeContextDateMonthText);
		m_timeContextDateMonthText.setColumns(10);

		// time context date year
		m_timeContextDateYearText = new JTextField();
		m_timeContextDateYearText.setBounds(226, 51, 60, 20);
		m_timeContextPanel.add(m_timeContextDateYearText);
		m_timeContextDateYearText.setColumns(10);

		// time context time label
		m_timeContextTimeLabel = new JLabel("Time");
		m_timeContextTimeLabel.setBounds(10, 92, 46, 14);
		m_timeContextPanel.add(m_timeContextTimeLabel);

		// time context time hour
		m_timeContextTimeHourText = new JTextField();
		m_timeContextTimeHourText.setBounds(90, 89, 50, 20);
		m_timeContextPanel.add(m_timeContextTimeHourText);
		m_timeContextTimeHourText.setColumns(10);

		// time context time minutes
		m_timeContextTimeMinutesText = new JTextField();
		m_timeContextTimeMinutesText.setBounds(155, 89, 50, 20);
		m_timeContextPanel.add(m_timeContextTimeMinutesText);
		m_timeContextTimeMinutesText.setColumns(10);

		// time context time seconds
		m_timeContextTimeSecondsText = new JTextField();
		m_timeContextTimeSecondsText.setBounds(226, 89, 58, 20);
		m_timeContextPanel.add(m_timeContextTimeSecondsText);
		m_timeContextTimeSecondsText.setColumns(10);

		JButton m_UpdateTimeContextButton = new JButton("Update Time Context");
		m_UpdateTimeContextButton.setBounds(294, 88, 160, 23);
		// m_timeContextPanel.add(m_UpdateTimeContextButton);

		m_timeContextDayRadio = new JRadioButton("Day");
		m_timeContextDayRadio.setBounds(164, 19, 60, 23);
		m_timeContextPanel.add(m_timeContextDayRadio);

		m_timeContextNightRadio = new JRadioButton("Night");
		m_timeContextNightRadio.setBounds(226, 19, 88, 23);
		m_timeContextPanel.add(m_timeContextNightRadio);

		// Group the buttons
		m_groupradioButtonsDayNight = new ButtonGroup();
		m_groupradioButtonsDayNight.add(m_timeContextDayRadio);
		m_groupradioButtonsDayNight.add(m_timeContextNightRadio);

		m_timeContextDayRadio.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (m_timeContextDayRadio.isSelected()) {
					m_timeContextPanel.setBackground(Color.ORANGE);
				} else {
					m_timeContextPanel.setBackground(Color.GRAY);
				}
			}
		});

		m_timeContextNightRadio.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (m_timeContextNightRadio.isSelected()) {
					m_timeContextPanel.setBackground(Color.GRAY);
				} else {
					m_timeContextPanel.setBackground(Color.ORANGE);
				}
			}
		});

		m_positionContextPanel = new JPanel();
		m_positionContextPanel.setBorder(new TitledBorder(new LineBorder(
				new Color(0, 0, 0), 1, true), "Position Context",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.add(m_positionContextPanel);
		m_positionContextPanel.setLayout(null);

		m_positionContextContextIDLabel = new JLabel("Context ID");
		m_positionContextContextIDLabel.setBounds(10, 24, 60, 14);
		m_positionContextPanel.add(m_positionContextContextIDLabel);

		m_positionContextContextIDText = new JTextField();
		m_positionContextContextIDText.setBounds(121, 21, 86, 20);
		m_positionContextContextIDText.setColumns(10);
		m_positionContextPanel.add(m_positionContextContextIDText);

		m_positionContextPhysicalLocationLabel = new JLabel("Physical");
		m_positionContextPhysicalLocationLabel.setBounds(10, 49, 89, 20);
		m_positionContextPanel.add(m_positionContextPhysicalLocationLabel);

		m_positionContextPhysicalLocationCountryText = new JTextField();
		m_positionContextPhysicalLocationCountryText.setBounds(122, 49, 86, 20);
		m_positionContextPanel
				.add(m_positionContextPhysicalLocationCountryText);
		m_positionContextPhysicalLocationCountryText.setColumns(10);

		m_positionContextPhysicalLocationStateText = new JTextField();
		m_positionContextPhysicalLocationStateText.setBounds(239, 49, 86, 20);
		m_positionContextPanel.add(m_positionContextPhysicalLocationStateText);
		m_positionContextPhysicalLocationStateText.setColumns(10);

		m_positionContextPhysicalLocationCityText = new JTextField();
		m_positionContextPhysicalLocationCityText.setBounds(357, 49, 86, 20);
		m_positionContextPanel.add(m_positionContextPhysicalLocationCityText);
		m_positionContextPhysicalLocationCityText.setColumns(10);

		m_positionContextPhysicalLocationPincodeText = new JTextField();
		m_positionContextPhysicalLocationPincodeText.setBounds(475, 49, 86, 20);
		m_positionContextPanel
				.add(m_positionContextPhysicalLocationPincodeText);
		m_positionContextPhysicalLocationPincodeText.setColumns(10);

		m_positionContextGeographicalLocationLabel = new JLabel("Geographical");
		m_positionContextGeographicalLocationLabel.setBounds(10, 80, 105, 20);
		m_positionContextPanel.add(m_positionContextGeographicalLocationLabel);

		m_positionContextGeographicalLocationLatitudeText = new JTextField();
		m_positionContextGeographicalLocationLatitudeText.setBounds(121, 80,
				86, 20);
		m_positionContextPanel
				.add(m_positionContextGeographicalLocationLatitudeText);
		m_positionContextGeographicalLocationLatitudeText.setColumns(10);

		m_positionContextGeographicalLocationLongitudeText = new JTextField();
		m_positionContextGeographicalLocationLongitudeText.setBounds(239, 80,
				86, 20);
		m_positionContextPanel
				.add(m_positionContextGeographicalLocationLongitudeText);
		m_positionContextGeographicalLocationLongitudeText.setColumns(10);

		m_positionContextGeographicalLocationAltitudeText = new JTextField();
		m_positionContextGeographicalLocationAltitudeText.setBounds(357, 80,
				86, 20);
		m_positionContextPanel
				.add(m_positionContextGeographicalLocationAltitudeText);
		m_positionContextGeographicalLocationAltitudeText.setColumns(10);

		m_updatePositionContextButton = new JButton("Update Position Context");
		m_updatePositionContextButton.setBounds(478, 80, 180, 23);
		// m_positionContextPanel.add(m_updatePositionContextButton);

		m_userContextPanel = new JPanel();
		m_userContextPanel.setLayout(null);
		m_userContextPanel.setBorder(new TitledBorder(new LineBorder(new Color(
				0, 0, 0), 1, true), "User Context", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		this.add(m_userContextPanel);

		m_userContextContextIDLabel = new JLabel("Context ID");
		m_userContextContextIDLabel.setBounds(10, 23, 70, 14);
		m_userContextPanel.add(m_userContextContextIDLabel);

		m_userContextContextIDText = new JTextField();
		m_userContextContextIDText.setColumns(10);
		m_userContextContextIDText.setBounds(90, 20, 50, 20);
		m_userContextPanel.add(m_userContextContextIDText);

		m_userContextAgeLabel = new JLabel("Age");
		m_userContextAgeLabel.setBounds(10, 54, 70, 14);
		m_userContextPanel.add(m_userContextAgeLabel);

		m_userContextAgeText = new JTextField();
		m_userContextAgeText.setColumns(10);
		m_userContextAgeText.setBounds(90, 51, 50, 20);
		m_userContextPanel.add(m_userContextAgeText);

		m_userContextHealthLabel = new JLabel("Health");
		m_userContextHealthLabel.setBounds(10, 92, 46, 14);
		m_userContextPanel.add(m_userContextHealthLabel);

		m_userContextHealthBloodPressure = new JTextField();
		m_userContextHealthBloodPressure.setColumns(10);
		m_userContextHealthBloodPressure.setBounds(90, 89, 50, 20);
		m_userContextPanel.add(m_userContextHealthBloodPressure);

		m_userContextHealthHeartRate = new JTextField();
		m_userContextHealthHeartRate.setColumns(10);
		m_userContextHealthHeartRate.setBounds(155, 89, 50, 20);
		m_userContextPanel.add(m_userContextHealthHeartRate);

		m_userContextHealthVoiceTone = new JTextField();
		m_userContextHealthVoiceTone.setColumns(10);
		m_userContextHealthVoiceTone.setBounds(226, 89, 58, 20);
		m_userContextPanel.add(m_userContextHealthVoiceTone);

		m_userContextUpdateButton = new JButton("Update User Context");
		m_userContextUpdateButton.setBounds(101, 141, 148, 23);
		// m_userContextPanel.add(m_userContextUpdateButton);

		m_userContextRadioMale = new JRadioButton("Male");
		m_userContextRadioMale.setBounds(155, 19, 60, 23);
		m_userContextPanel.add(m_userContextRadioMale);

		m_userContextRadioFemale = new JRadioButton("Female");
		m_userContextRadioFemale.setBounds(222, 19, 88, 23);
		m_userContextPanel.add(m_userContextRadioFemale);

		m_groupradioButtonsMaleFemale = new ButtonGroup();
		m_groupradioButtonsMaleFemale.add(m_userContextRadioMale);
		m_groupradioButtonsMaleFemale.add(m_userContextRadioFemale);

		m_userContextRadioSingle = new JRadioButton("Single");
		m_userContextRadioSingle.setBounds(155, 48, 60, 23);
		m_userContextPanel.add(m_userContextRadioSingle);

		m_userContextRadioMarried = new JRadioButton("Married");
		m_userContextRadioMarried.setBounds(222, 48, 88, 23);
		m_userContextPanel.add(m_userContextRadioMarried);

		m_groupradioButtonsSingleMarried = new ButtonGroup();
		m_groupradioButtonsSingleMarried.add(m_userContextRadioMarried);
		m_groupradioButtonsSingleMarried.add(m_userContextRadioSingle);

		// device context panel
		m_deviceContextPanel = new JPanel();
		m_deviceContextPanel.setLayout(null);
		m_deviceContextPanel.setBorder(new TitledBorder(new LineBorder(
				new Color(0, 0, 0), 1, true), "Device Context",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.add(m_deviceContextPanel);

		m_deviceContextContextIDLabel = new JLabel("Context ID");
		m_deviceContextContextIDLabel.setBounds(10, 23, 70, 14);
		m_deviceContextPanel.add(m_deviceContextContextIDLabel);

		m_deviceContextContextIDText = new JTextField();
		m_deviceContextContextIDText.setColumns(10);
		m_deviceContextContextIDText.setBounds(90, 20, 50, 20);
		m_deviceContextPanel.add(m_deviceContextContextIDText);

		m_deviceContextMemoryLabel = new JLabel("Memory");
		m_deviceContextMemoryLabel.setBounds(158, 23, 70, 14);
		m_deviceContextPanel.add(m_deviceContextMemoryLabel);

		m_deviceContextMemoryText = new JTextField();
		m_deviceContextMemoryText.setColumns(10);
		m_deviceContextMemoryText.setBounds(222, 20, 50, 20);
		m_deviceContextPanel.add(m_deviceContextMemoryText);

		m_deviceContextSoftwareLabel = new JLabel("Software");
		m_deviceContextSoftwareLabel.setBounds(10, 130, 55, 14);
		m_deviceContextPanel.add(m_deviceContextSoftwareLabel);

		m_deviceContextOperatingSyste = new JTextField();
		m_deviceContextOperatingSyste.setColumns(10);
		m_deviceContextOperatingSyste.setBounds(99, 130, 106, 20);
		m_deviceContextPanel.add(m_deviceContextOperatingSyste);

		m_deviceOperatingSystemVersion = new JTextField();
		m_deviceOperatingSystemVersion.setColumns(10);
		m_deviceOperatingSystemVersion.setBounds(231, 130, 106, 20);
		m_deviceContextPanel.add(m_deviceOperatingSystemVersion);

		m_deviceContextUpdateContextButton = new JButton(
				"Update Device Context");
		m_deviceContextUpdateContextButton.setBounds(101, 141, 148, 23);
		// m_deviceContextPanel.add(m_deviceContextUpdateContextButton);

		m_deviceContextAudioLabel = new JLabel("Audio");
		m_deviceContextAudioLabel.setBounds(10, 48, 46, 14);
		m_deviceContextPanel.add(m_deviceContextAudioLabel);

		m_deviceContextAudioRadioYes = new JRadioButton("Yes");
		m_deviceContextAudioRadioYes.setBounds(87, 44, 57, 23);
		m_deviceContextPanel.add(m_deviceContextAudioRadioYes);

		m_deviceContextAudioRadioNo = new JRadioButton("No");
		m_deviceContextAudioRadioNo.setBounds(168, 44, 109, 23);
		m_deviceContextPanel.add(m_deviceContextAudioRadioNo);

		m_groupradioButtonsAudioYesNo = new ButtonGroup();
		m_groupradioButtonsAudioYesNo.add(m_deviceContextAudioRadioYes);
		m_groupradioButtonsAudioYesNo.add(m_deviceContextAudioRadioNo);

		m_deviceContextBatteryLabel = new JLabel("Battery Percentage");
		m_deviceContextBatteryLabel.setBounds(10, 73, 120, 29);
		m_deviceContextPanel.add(m_deviceContextBatteryLabel);

		m_deviceContextBatteryPercentageSlider = new JSlider();
		m_deviceContextBatteryPercentageSlider
				.setToolTipText("battery percentage");
		m_deviceContextBatteryPercentageSlider.setSnapToTicks(true);
		m_deviceContextBatteryPercentageSlider.setPaintTicks(true);
		m_deviceContextBatteryPercentageSlider.setMajorTickSpacing(10);
		m_deviceContextBatteryPercentageSlider.setBounds(122, 73, 250, 26);
		m_deviceContextPanel.add(m_deviceContextBatteryPercentageSlider);

		m_deviceContextBatteryPercentageSlider
				.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						int temperature = m_deviceContextBatteryPercentageSlider
								.getValue();
						if (temperature < 10) {
							m_deviceContextPanel.setBackground(new Color(0,
									191, 255));
						} else if (temperature >= 10 && temperature <= 25) {
							m_deviceContextPanel.setBackground(new Color(255,
									140, 0));
						} else if (temperature > 25) {
							m_deviceContextPanel.setBackground(new Color(220,
									20, 60));
						}
					}
				});

		// temperature context panel
		m_TemperatureContextPanel = new JPanel();
		m_TemperatureContextPanel.setBorder(new TitledBorder(new LineBorder(
				new Color(0, 0, 0)), "Temperature Context",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.add(m_TemperatureContextPanel);
		m_TemperatureContextPanel.setLayout(null);

		m_temperatureLabel = new JLabel("Temperature");
		m_temperatureLabel.setBounds(10, 49, 100, 14);
		m_TemperatureContextPanel.add(m_temperatureLabel);

		m_temperatureText = new JTextField();
		m_temperatureText.setBounds(140, 46, 86, 20);
		m_TemperatureContextPanel.add(m_temperatureText);
		m_temperatureText.setColumns(10);
		m_temperatureText.getDocument().addDocumentListener(
				new DocumentListener() {
					public void changedUpdate(DocumentEvent e) {

						if (m_temperatureText.getText().trim() != "") {
							int temperature = Integer
									.parseInt(m_temperatureText.getText());
							if (temperature < 10) {
								m_TemperatureContextPanel
										.setBackground(new Color(0, 191, 255));
							} else if (temperature >= 10 && temperature <= 25) {
								m_TemperatureContextPanel
										.setBackground(new Color(255, 140, 0));
							} else if (temperature > 25) {
								m_TemperatureContextPanel
										.setBackground(new Color(220, 20, 60));
							}
						}
					}

					public void removeUpdate(DocumentEvent e) {
						// do nothing
					}

					public void insertUpdate(DocumentEvent e) {
						if (m_temperatureText.getText().trim() != "") {
							int temperature = Integer
									.parseInt(m_temperatureText.getText());
							if (temperature < 10) {
								m_TemperatureContextPanel
										.setBackground(new Color(0, 191, 255));
							} else if (temperature >= 10 && temperature <= 25) {
								m_TemperatureContextPanel
										.setBackground(new Color(255, 140, 0));
							} else if (temperature > 25) {
								m_TemperatureContextPanel
										.setBackground(new Color(220, 20, 60));
							}
						}
					}
				});

		m_transmissionFrequencyPanel = new JPanel();
		m_transmissionFrequencyPanel.setBorder(new TitledBorder(new LineBorder(
				new Color(0, 0, 0)), "Transmission Frequency",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.add(m_transmissionFrequencyPanel);
		m_transmissionFrequencyPanel.setLayout(null);

		final JSlider m_transmissionFrequencySlider = new JSlider();
		m_transmissionFrequencySlider.setMajorTickSpacing(1);
		m_transmissionFrequencySlider.setSnapToTicks(true);
		m_transmissionFrequencySlider.setPaintTicks(true);
		m_transmissionFrequencySlider.setPaintLabels(true);
		m_transmissionFrequencySlider.setMaximum(10);
		m_transmissionFrequencySlider.setBounds(71, 28, 200, 37);
		m_transmissionFrequencyPanel.add(m_transmissionFrequencySlider);

		m_transmissionFrequencySecondsText = new JTextField();
		m_transmissionFrequencySecondsText.setBounds(111, 76, 95, 20);
		m_transmissionFrequencyPanel.add(m_transmissionFrequencySecondsText);
		m_transmissionFrequencySecondsText.setColumns(10);

		m_startTransmittingContextSituation = new JButton("Start Transmitting");
		m_startTransmittingContextSituation.setBounds(90, 107, 166, 23);
		m_transmissionFrequencyPanel.add(m_startTransmittingContextSituation);

		m_stopTransmittingContextSituation = new JButton("Stop Transmitting");
		m_stopTransmittingContextSituation.setBounds(260, 107, 166, 23);
		m_transmissionFrequencyPanel.add(m_stopTransmittingContextSituation);

		m_transmissionFrequencySecondsLabel = new JLabel("Seconds");
		m_transmissionFrequencySecondsLabel.setBounds(10, 28, 46, 23);
		m_transmissionFrequencyPanel.add(m_transmissionFrequencySecondsLabel);

		m_startTransmittingContextSituation
				.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						isTransmissionStarted = true;
						new Thread() {
							public void run() {
								try {
									collectContextDataCreatContextSituation();
								} catch (NumberFormatException e) {
									e.printStackTrace();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}.start();
					}
				});

		m_stopTransmittingContextSituation
				.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						isTransmissionStarted = false;
					}
				});

		m_transmissionFrequencySlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				m_transmissionFrequencySecondsText
						.setText(m_transmissionFrequencySlider.getValue() + "");

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
		return "Context Management Component";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void update(Observable _observable, Object _arg) {

		// for listening context elements, specifically position
		if (_observable instanceof ContextElementObservable) {

			// cast to context element
			Vector<ContextElement> contextElements = (Vector<ContextElement>) _arg;

			for (ContextElement contextElement : contextElements) {

				if ("locationcontext".equals(contextElement.getContexttype())) {

					m_positionContextContextIDText.setText(contextElement
							.getLocationContextElement().getContextid() + "");
					m_positionContextGeographicalLocationLatitudeText
							.setText(contextElement.getLocationContextElement()
									.getGeographicalLocation().getLatitude()
									+ "");
					m_positionContextGeographicalLocationLongitudeText
							.setText(contextElement.getLocationContextElement()
									.getGeographicalLocation().getLongitude()
									+ "");
					m_positionContextGeographicalLocationAltitudeText
							.setText(contextElement.getLocationContextElement()
									.getGeographicalLocation().getAltitude()
									+ "");

					if (contextElement.getLocationContextElement()
							.getPhysicalLocation() != null) {

						PhysicalLocation physicalLocation = contextElement
								.getLocationContextElement()
								.getPhysicalLocation();
						m_positionContextPhysicalLocationCountryText
								.setText(physicalLocation.getCountry());
						m_positionContextPhysicalLocationStateText
								.setText(physicalLocation.getState());
						m_positionContextPhysicalLocationCityText
								.setText(physicalLocation.getCity());
						m_positionContextPhysicalLocationPincodeText
								.setText(physicalLocation.getPincode() + "");

					}

				} else if ("timecontext"
						.equals(contextElement.getContexttype())) {

					m_timeContextContextIdText.setText(contextElement
							.getTimeContextElement().getContextid() + "");
					m_timeContextTimeHourText.setText(contextElement
							.getTimeContextElement().getTime().getHour()
							+ "");
					m_timeContextTimeMinutesText.setText(contextElement
							.getTimeContextElement().getTime().getMinutes()
							+ "");
					m_timeContextTimeSecondsText.setText(contextElement
							.getTimeContextElement().getTime().getSeconds()
							+ "");

					if (contextElement.getTimeContextElement().getTime()
							.getHour() < 12) {
						m_timeContextDayRadio.setSelected(true);
					} else {
						m_timeContextNightRadio.setSelected(true);
					}

					if (contextElement.getTimeContextElement().getDate() != null) {

						Date date = contextElement.getTimeContextElement()
								.getDate();
						m_timeContextDateDayText.setText(date.getDay() + "");
						m_timeContextDateMonthText
								.setText(date.getMonth() + "");
						m_timeContextDateYearText.setText(date.getYear() + "");

					}

				} else if ("usercontext"
						.equals(contextElement.getContexttype())) {

					UserProfile userProfile = contextElement
							.getUserContextElement().getUserProfile();
					Health health = contextElement.getUserContextElement()
							.getHealth();

					m_userContextContextIDText.setText(contextElement
							.getUserContextElement().getContextid());
					if (userProfile.getSex().equalsIgnoreCase("Male")) {
						m_userContextRadioMale.setSelected(true);
					} else {
						m_userContextRadioFemale.setSelected(true);
					}

					m_userContextAgeText.setText(userProfile.getAge() + "");
					if (userProfile.getMaritalStatus().equalsIgnoreCase(
							"Single")) {
						m_userContextRadioSingle.setSelected(true);
					} else {
						m_userContextRadioMarried.setSelected(true);
					}

					m_userContextHealthBloodPressure.setText(health
							.getBloodPressure());
					m_userContextHealthHeartRate.setText(health.getHeartRate());
					m_userContextHealthVoiceTone.setText(health.getVoiceTone());

				} else if ("devicecontext".equals(contextElement
						.getContexttype())) {

					Device device = contextElement.getDeviceContextElement()
							.getDevice();
					Software software = contextElement
							.getDeviceContextElement().getSoftware();

					m_deviceContextContextIDText.setText(contextElement
							.getDeviceContextElement().getContextid() + "");
					m_deviceContextMemoryText.setText(device.getMemory() + "");
					if (device.isAudio()) {
						m_deviceContextAudioRadioYes.setSelected(true);
					} else {
						m_deviceContextAudioRadioNo.setSelected(true);
					}

					m_deviceContextBatteryPercentageSlider.setValue(device
							.getBatteryPercentage());

					m_deviceContextOperatingSyste.setText(software
							.getOperatingsystem());
					m_deviceOperatingSystemVersion.setText(software
							.getVersion() + "");

				} else if ("temperaturecontext".equals(contextElement
						.getContexttype())) {
					m_temperatureText.setText(contextElement
							.getTemperatureContextElement()
							.getCurrentTemperature().getTemperaturevalue()
							+ "");
				}
			}
		}

	}

	/**
	 * this method collects all the context elements and converts them into
	 * context situation for communication
	 * 
	 * @throws InterruptedException
	 * @throws NumberFormatException
	 */
	private void collectContextDataCreatContextSituation()
			throws NumberFormatException, InterruptedException {

		while (isTransmissionStarted) {
			Vector<ContextElement> contextElements = new Vector<>();

			m_CASMediator = getCASMediator();

			// create the time context element
			ContextElement contextElement = new ContextElement();
			contextElement.setContexttype("timecontext");
			TimeContextElement timeContextElement = new TimeContextElement();
			Date date = new Date();
			Time time = new Time();
			timeContextElement.setDate(date);
			timeContextElement.setTime(time);
			timeContextElement.setContextid(Integer
					.parseInt(m_timeContextContextIdText.getText()));
			date.setDay(Integer.parseInt(m_timeContextDateDayText.getText()));
			date.setMonth(Integer.parseInt(m_timeContextDateMonthText.getText()));
			date.setYear(Integer.parseInt(m_timeContextDateYearText.getText()));
			time.setHour(Integer.parseInt(m_timeContextTimeHourText.getText()));
			time.setMinutes(Integer.parseInt(m_timeContextTimeMinutesText
					.getText()));
			time.setSeconds(Integer.parseInt(m_timeContextTimeSecondsText
					.getText()));
			time.setAMPM(m_timeContextDayRadio.isSelected() ? "AM" : "PM");
			contextElement.setTimeContextElement(timeContextElement);
			contextElements.addElement(contextElement);

			// create the position context
			contextElement = new ContextElement();
			contextElement.setContexttype("locationcontext");
			LocationContextElement locationContextElement = new LocationContextElement();
			PhysicalLocation physicalLocation = new PhysicalLocation();
			GeographicalLocation geographicalLocation = new GeographicalLocation();
			locationContextElement.setContextid(Integer
					.parseInt(m_positionContextContextIDText.getText()));
			locationContextElement.setPhysicalLocation(physicalLocation);
			locationContextElement
					.setGeographicalLocation(geographicalLocation);
			physicalLocation
					.setCountry(m_positionContextPhysicalLocationCountryText
							.getText());
			physicalLocation
					.setState(m_positionContextPhysicalLocationStateText
							.getText());
			physicalLocation.setCity(m_positionContextPhysicalLocationCityText
					.getText());
			physicalLocation.setPincode(Integer
					.parseInt(m_positionContextPhysicalLocationPincodeText
							.getText()));
			geographicalLocation
					.setAltitude(Float
							.parseFloat(m_positionContextGeographicalLocationAltitudeText
									.getText()));
			geographicalLocation
					.setLatitude(Double
							.parseDouble(m_positionContextGeographicalLocationLatitudeText
									.getText()));
			geographicalLocation
					.setLongitude(Double
							.parseDouble(m_positionContextGeographicalLocationLongitudeText
									.getText()));
			contextElement.setLocationContextElement(locationContextElement);
			contextElements.addElement(contextElement);

			// get the User context
			contextElement = new ContextElement();
			contextElement.setContexttype("usercontext");
			UserContextElement userContextElement = new UserContextElement();
			UserProfile userProfile = new UserProfile();
			Health health = new Health();
			userContextElement.setContextid(m_userContextContextIDText
					.getText());
			userContextElement.setHealth(health);
			userContextElement.setUserProfile(userProfile);
			userProfile
					.setAge(Integer.parseInt(m_userContextAgeText.getText()));
			userProfile
					.setMaritalStatus(m_userContextRadioSingle.isSelected() ? "Single"
							: "Married");
			userProfile.setSex(m_userContextRadioMale.isSelected() ? "Male"
					: "Female");
			health.setBloodPressure(m_userContextHealthBloodPressure.getText());
			health.setHeartRate(m_userContextHealthHeartRate.getText());
			health.setVoiceTone(m_userContextHealthVoiceTone.getText());
			contextElement.setUserContextElement(userContextElement);
			contextElements.addElement(contextElement);

			// get the device context
			contextElement = new ContextElement();
			contextElement.setContexttype("devicecontext");
			DeviceContextElement deviceContextElement = new DeviceContextElement();
			Device device = new Device();
			Software software = new Software();
			deviceContextElement.setContextid(Integer
					.parseInt(m_deviceContextContextIDText.getText()));
			deviceContextElement.setDevice(device);
			deviceContextElement.setSoftware(software);
			device.setAudio(m_deviceContextAudioRadioYes.isSelected());
			device.setBatteryPercentage(m_deviceContextBatteryPercentageSlider
					.getValue());
			device.setMemory(Integer.parseInt(m_deviceContextMemoryText
					.getText()));
			software.setOperatingsystem(m_deviceContextOperatingSyste.getText());
			software.setVersion(Float.parseFloat(m_deviceOperatingSystemVersion
					.getText()));
			contextElement.setDeviceContextElement(deviceContextElement);
			contextElements.addElement(contextElement);

			// put the context elements in context situation
			m_contextSituation.setContextElements(contextElements);

			// communicate the context situation
			m_CASMediator.communicateContextSituation(m_contextSituation);
			Thread.sleep(Integer.parseInt(m_transmissionFrequencySecondsText
					.getText()) * 1000);
		}

	}

	private MediatorIF getCASMediator() {
		return CASMediator.getInstance();
	}

}
