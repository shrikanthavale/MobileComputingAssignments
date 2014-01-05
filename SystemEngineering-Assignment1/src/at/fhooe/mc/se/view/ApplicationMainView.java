/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import at.fhooe.mc.se.util.Constants;

/**
 * @author Shrikant Havale
 * @version 1.0 This class creates the main window and its internal GUI
 *          components
 */
public class ApplicationMainView {

	/**
	 * Variable representing the main window of the application
	 */
	private JFrame mMainWindow;

	/**
	 * Default constructor to initialize the frame
	 */
	public ApplicationMainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		mMainWindow = new JFrame();
		mMainWindow.setBounds(100, 100, 450, 300);
		mMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mMainWindow.setTitle(Constants.MAIN_WINDOW_HEADING);
		mMainWindow.setExtendedState(Frame.MAXIMIZED_BOTH);

		// add menu bar to the main window
		mMainWindow.setJMenuBar(MenuBarView.getInstance());

		// add the control panel to main window
		mMainWindow.getContentPane().add(ControlPanelView.getInstance(),
				BorderLayout.NORTH);

		// add the editor
		mMainWindow.getContentPane().add(DrawingAreaView.getInstance(),
				BorderLayout.CENTER);

		// add the help pane to west of frame
		mMainWindow.getContentPane().add(InstructionsManualView.getInstance(),
				BorderLayout.WEST);

		// add a separator
		JSeparator separator = new JSeparator();
		separator.setForeground(UIManager.getColor("Button.foreground"));
		separator.setBackground(UIManager.getColor("Button.darkShadow"));
		separator.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		separator.setOrientation(SwingConstants.VERTICAL);
		mMainWindow.add(separator, BorderLayout.EAST);

		// developer label name
		JLabel lblNewLabel = new JLabel("Developed By Shrikant Havale");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC,
				16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		mMainWindow.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);

	}

	/**
	 * Launch the application.
	 * 
	 * @param _args
	 *            parameters passed as runtime arguments if any
	 */
	public static void main(String[] _args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// create instance of the class
					ApplicationMainView window = new ApplicationMainView();

					// after initializing all the components set the frame to
					// visible
					window.getmMainWindow().setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @return the mMainWindow
	 */
	public JFrame getmMainWindow() {
		return mMainWindow;
	}

	/**
	 * @param mMainWindow
	 *            the mMainWindow to set
	 */
	public void setmMainWindow(JFrame mMainWindow) {
		this.mMainWindow = mMainWindow;
	}
}
