/**
 * 
 */
package at.fhooe.mc.lbcas.component.temperaturemodule;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TemperatureContextElement;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement.TemperatureContextElement.CurrentTemperature;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;

/**
 * @author Shrikant Havale
 * 
 *         This is the external component temperature which will be added as JAR
 *         for the actual other components
 * 
 */
public class TemperatureComponent extends JPanel implements ComponentIF {

	/**
	 * generated serial version ID
	 */
	private static final long serialVersionUID = -5725896865448903277L;

	/**
	 * temperature text
	 */
	private JTextField m_temperatureText;

	/**
	 * temperature slider
	 */
	private JSlider m_temperatureSlider;

	/**
	 * mediator interface
	 */
	private MediatorIF m_CASMediator;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// Do Nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#createPanel()
	 */
	@Override
	public JPanel createPanel() {

		// set the layout
		this.setLayout(null);

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				getPanelName(), TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		this.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// create the temperature slider
		m_temperatureSlider = new JSlider();
		m_temperatureSlider.setMinorTickSpacing(10);
		m_temperatureSlider.setSnapToTicks(true);
		m_temperatureSlider.setPaintTicks(true);
		m_temperatureSlider.setPaintLabels(true);
		m_temperatureSlider.setBounds(187, 78, 404, 50);
		m_temperatureSlider.setMinimum(-40);
		m_temperatureSlider.setMaximum(40);
		this.add(m_temperatureSlider);

		// create the temperature label
		JLabel m_temperatureLabel = new JLabel("Temperature");
		m_temperatureLabel.setBounds(87, 82, 90, 23);
		this.add(m_temperatureLabel);

		// create the temperature text
		m_temperatureText = new JTextField();
		m_temperatureText.setBounds(267, 130, 108, 22);
		this.add(m_temperatureText);
		m_temperatureText.setColumns(10);

		m_temperatureText.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				m_temperatureSlider.setValue(Integer.parseInt(m_temperatureText
						.getText()));
			}

			@Override
			public void keyReleased(KeyEvent e) {
				m_temperatureSlider.setValue(Integer.parseInt(m_temperatureText
						.getText()));
			}

			@Override
			public void keyPressed(KeyEvent e) {
				m_temperatureSlider.setValue(Integer.parseInt(m_temperatureText
						.getText()));
			}
		});

		m_temperatureSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				m_temperatureText.setText(m_temperatureSlider.getValue() + "");
				collectTemperatureContextData();

			}

			/**
			 * this method collects the temperature and creates the context
			 * element and communicates to Mediator
			 */
			private void collectTemperatureContextData() {

				// vector context elements
				Vector<ContextElement> contextElements = new Vector<>();

				// context elements
				ContextElement contextElement = new ContextElement();

				// temperature context element
				TemperatureContextElement temperatureContextElement = new TemperatureContextElement();
				temperatureContextElement.setContextid(333);
				CurrentTemperature currentTemperature = new CurrentTemperature();
				currentTemperature.setTemperatureunit("Degree Celcius");
				currentTemperature.setTemperaturevalue(m_temperatureSlider
						.getValue());
				temperatureContextElement
						.setCurrentTemperature(currentTemperature);

				// set it to context element
				contextElement
						.setTemperatureContextElement(temperatureContextElement);
				contextElement.setContexttype("temperaturecontext");
				contextElements.addElement(contextElement);

				// get the mediator instance and communicate
				m_CASMediator = CASMediator.getInstance();
				m_CASMediator.communicateContextElements(contextElements);
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
		return "Temperature Component";
	}

}
