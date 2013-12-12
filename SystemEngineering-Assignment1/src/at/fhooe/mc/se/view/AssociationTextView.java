/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.Color;

import javax.swing.JTextField;

import at.fhooe.mc.se.model.CustomMouseModel;

/**
 * @author Shrikant Havale
 * 
 *         This class creates the label for representing the associations
 *         between the classes
 * 
 */
public class AssociationTextView extends JTextField {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = -1226264520404274463L;

	/**
	 * Mouse event listener for text association
	 */
	private CustomMouseModel customMouseModel = new CustomMouseModel();

	/**
	 * default constructor
	 */
	public AssociationTextView() {
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
	public AssociationTextView(int xPositionTextPane,
			int yPositionTextPane) {
		super();
		this.setBounds(xPositionTextPane, yPositionTextPane, 150, 30);
		this.setBackground(Color.GRAY);
		this.addMouseListener(customMouseModel);
		this.addMouseMotionListener(customMouseModel);
		this.setText("Name Association");
	}
}
