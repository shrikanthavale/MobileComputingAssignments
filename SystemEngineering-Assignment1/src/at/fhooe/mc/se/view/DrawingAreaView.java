/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.UIManager;

import at.fhooe.mc.se.controller.ApplicationEditorController;

/**
 * @author Shrikant Havale This class is responsible for creating the editor. In
 *         this editor several classes (Text pane would be added) and
 *         Associations can be constructed in them.
 * 
 */
public class DrawingAreaView extends JPanel {

	/**
	 * default serial version id
	 */
	private static final long serialVersionUID = 8473538594475781297L;

	/**
	 * create instance of an application editor
	 */
	private static DrawingAreaView drawingAreaView = new DrawingAreaView();

	/**
	 * instance of model logic
	 */
	private static ApplicationEditorController applicationEditorController = new ApplicationEditorController();

	/**
	 * static block for initializing the application editor
	 */
	static {

		// ui properties for application editor
		drawingAreaView.setForeground(UIManager
				.getColor("Button.disabledShadow"));
		drawingAreaView
				.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		drawingAreaView.setLayout(null);

		// add a new separator to distinguish between controls and editor
		JSeparator separator = new JSeparator();
		separator.setForeground(UIManager.getColor("Button.foreground"));
		separator.setBackground(UIManager.getColor("Button.darkShadow"));
		separator.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		drawingAreaView.add(separator);

	}

	/**
	 * default constructor
	 */
	private DrawingAreaView() {
		super();
	}

	/**
	 * @return {@link DrawingAreaView} single instance of application editor
	 */
	public static DrawingAreaView getInstance() {
		return drawingAreaView;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		applicationEditorController.paintComponents(g);
	}

}
