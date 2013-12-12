/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import at.fhooe.mc.se.util.Constants;

/**
 * @author Shrikant Havale
 * 
 */
public class InstructionsManualView extends JPanel {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = -1763182311923381063L;

	/**
	 * single instance of application help panel
	 */
	private static InstructionsManualView instructionsManualView = new InstructionsManualView();

	/**
	 * static block for initializing the application editor
	 */
	static {

		// ui properties for application editor
		instructionsManualView.setForeground(UIManager
				.getColor("Button.disabledShadow"));
		instructionsManualView.setBackground(UIManager
				.getColor("CheckBox.darkShadow"));
		instructionsManualView.setLayout(new BorderLayout());

		// add a new separator to distinguish between controls and editor
		JSeparator separator = new JSeparator();
		separator.setForeground(UIManager.getColor("Button.foreground"));
		separator.setBackground(UIManager.getColor("Button.darkShadow"));
		separator.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		separator.setOrientation(SwingConstants.VERTICAL);
		instructionsManualView.add(separator, BorderLayout.EAST);
		instructionsManualView.add(separator, BorderLayout.SOUTH);

		// add the help pane containing the details of use of application
		JTextPane helpTextPane = new JTextPane();
		helpTextPane.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		helpTextPane.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		helpTextPane.setBackground(Color.GRAY);
		helpTextPane.setForeground(Color.BLACK);
		helpTextPane.setText(Constants.APPLICATION_HELPTEXT_CONSTANT);
		helpTextPane.setEnabled(false);
		helpTextPane.setEditable(false);
		instructionsManualView.add(helpTextPane, BorderLayout.CENTER);

	}

	/**
	 * 
	 */
	private InstructionsManualView() {
		super();
	}

	/**
	 * @return {@link InstructionsManualView} single instance of application help
	 *         panel
	 */
	public static InstructionsManualView getInstance() {
		return instructionsManualView;
	}

}
