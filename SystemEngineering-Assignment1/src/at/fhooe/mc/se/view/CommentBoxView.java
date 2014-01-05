/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

import at.fhooe.mc.se.model.CustomMouseModel;

/**
 * @author Shrikant Havale
 * 
 */
public class CommentBoxView extends JTextArea {

	/**
	 * default serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Mouse event listener for text association
	 */
	private CustomMouseModel customMouseModel = new CustomMouseModel();

	/**
	 * default constructor
	 */
	public CommentBoxView() {
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
	public CommentBoxView(int xPositionTextPane, int yPositionTextPane) {
		super();
		this.setBounds(xPositionTextPane, yPositionTextPane, 100, 100);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createDashedBorder(new Color(235), 2,
				1.0F, 1.0F, true));
		this.addMouseListener(customMouseModel);
		this.addMouseMotionListener(customMouseModel);

	}
}
