/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextPane;

import at.fhooe.mc.se.model.CustomMouseModel;
import at.fhooe.mc.se.util.Constants;

/**
 * @author Shrikant Havale This class creates the text panes with some default
 *         properties and listeners
 * 
 */
public class ClassBoxView extends JTextPane {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 6742791839227629826L;

	/**
	 * Mouse event listener for text pane
	 */
	private CustomMouseModel customMouseModel = new CustomMouseModel();

	/**
	 * default constructor
	 */
	public ClassBoxView() {
		super();
	}

	/**
	 * constructor creating the text pane based on the position and default
	 * properties like background color.
	 * 
	 * @param xPositionTextPane
	 *            - x position where text pane should be created
	 * @param yPositionTextPane
	 *            - y position where text pane should be created
	 */
	public ClassBoxView(int xPositionTextPane,
			int yPositionTextPane) {
		super();
		this.setBounds(xPositionTextPane, yPositionTextPane, 150, 150);
		this.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.setBackground(Color.LIGHT_GRAY);
		this.addMouseListener(customMouseModel);
		this.addMouseMotionListener(customMouseModel);
		this.setText(Constants.TEXT_PANE_DEFAULT_TEXT);
	}

}
