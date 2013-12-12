/**
 * 
 */
package at.fhooe.mc.lbcas.component.displaymessages;

import java.awt.Font;
import java.util.Observable;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import at.fhooe.mc.lbcas.component.ComponentIF;

/**
 * @author Shrikant Havale
 * 
 *         This component is responsible for displaying the messages at the
 *         bottom of the panel
 */
public class DisplayMessagesComponent extends JPanel implements ComponentIF {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = -4686704821731794888L;

	/**
	 * label for displaying all the messages in the application
	 */
	private JLabel m_labelDisplyMessage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#createPanel()
	 */
	@Override
	public JPanel createPanel() {

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				getPanelName(), TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		this.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		m_labelDisplyMessage = new JLabel();
		m_labelDisplyMessage.setText(Messages
				.getString("DisplayMessagesComponent.InitialMessage")); //$NON-NLS-1$
		m_labelDisplyMessage
				.setFont(new Font(
						Messages.getString("DisplayMessagesComponent.MessageDisplayedFont"), Font.BOLD //$NON-NLS-1$
								| Font.ITALIC, 16));
		m_labelDisplyMessage.setHorizontalAlignment(SwingConstants.TRAILING);

		this.add(m_labelDisplyMessage);

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.component.ComponentIF#getPanelName()
	 */
	@Override
	public String getPanelName() {
		return Messages
				.getString("DisplayMessagesComponent.MessagePanelHeading"); //$NON-NLS-1$
	}

	/**
	 * This method updates the message accordingly set by other components
	 * 
	 * @param _message
	 *            to be displayed on the screen
	 */
	public void updateMessage(String _message) {
		m_labelDisplyMessage.setText(_message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// nothing do here
	}

	/**
	 * @return the m_labelDisplyMessage
	 */
	public JLabel getM_labelDisplyMessage() {
		return m_labelDisplyMessage;
	}

	/**
	 * @param m_labelDisplyMessage
	 *            the m_labelDisplyMessage to set
	 */
	public void setM_labelDisplyMessage(JLabel m_labelDisplyMessage) {
		this.m_labelDisplyMessage = m_labelDisplyMessage;
	}

}
