/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

import at.fhooe.mc.se.controller.ApplicationEditorController;
import at.fhooe.mc.se.util.Constants;

/**
 * @author Shrikant Havale This class gives single and same instance every time
 *         for the top control panel. All the controls like buttons required on
 *         this panel are created in this class.
 * 
 */
public class ControlPanelView extends JPanel {

	/**
	 * generated serial version ID
	 */
	private static final long serialVersionUID = -4623839070407547708L;

	/**
	 * single instance of ControlPanelView
	 */
	private static ControlPanelView controlPanelView = new ControlPanelView();

	/**
	 * button for creating rectangle
	 */
	private static JButton createRectangleButton = null;

	/**
	 * button for reseting the editor
	 */
	private static JButton resetDiagramButton = null;

	/**
	 * button for deleting rectangle
	 */
	private static JButton deleteRectangleButton = null;

	/**
	 * button for adding an association
	 */
	private static JButton createAssociationButton = null;

	/**
	 * button for creating the association text
	 */
	private static JButton createAssociationTextButton = null;

	/**
	 * button for deleting the connections
	 */
	private static JButton deleteAllConnection = null;

	/**
	 * create a button for comment box
	 */
	private static JButton createCommentBoxButton;

	/**
	 * button for deleting comment
	 */
	private static JButton deleteCommentBox;

	/**
	 * button for deleting association
	 */
	private static JButton deleteAssociation;

	/**
	 * button for deleting association text
	 */
	private static JButton deleteAssociationText;

	/**
	 * static block for initializing the panel and adding required components
	 */
	static {

		controlPanelView.setBackground(UIManager
				.getColor(Constants.CONTROL_PANEL_BACKGROUND_COLOR));
		controlPanelView.setBounds(0, 0, 600, 33);
		controlPanelView.setLayout(new FlowLayout(FlowLayout.CENTER, 1,
				10));

		// create first button create rectangle
		createRectangleButton = new JButton(Constants.CREATE_CLASS_BUTTON_NAME);
		createRectangleButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		createRectangleButton
				.setToolTipText(Constants.CREATE_CLASS_BUTTON_NAME);
		createRectangleButton.setForeground(UIManager
				.getColor("Button.foreground"));
		createRectangleButton.setBackground(UIManager
				.getColor("Button.background"));
		createRectangleButton
				.setActionCommand(Constants.CREATE_CLASS_BUTTON_ACTION_COMMAND);
		createRectangleButton.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(createRectangleButton);

		// create association button for adding a association
		createAssociationButton = new JButton(
				Constants.CREATE_ASSOCIATION_BUTTON_NAME);
		createAssociationButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		createAssociationButton
				.setToolTipText(Constants.CREATE_ASSOCIATION_BUTTON_NAME);
		createAssociationButton.setForeground(UIManager
				.getColor("Button.foreground"));
		createAssociationButton.setBackground(UIManager
				.getColor("Button.background"));
		createAssociationButton
				.setActionCommand(Constants.CREATE_ASSOCIATION_ACTION_COMMAND);
		createAssociationButton.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(createAssociationButton);

		// create association button for adding a association text
		createAssociationTextButton = new JButton("Create Association Text");
		createAssociationTextButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		createAssociationTextButton
				.setToolTipText("create text to be associated with association");
		createAssociationTextButton.setForeground(UIManager
				.getColor("Button.foreground"));
		createAssociationTextButton.setBackground(UIManager
				.getColor("Button.background"));
		createAssociationTextButton.setActionCommand("createAssociationText");
		createAssociationTextButton.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(createAssociationTextButton);

		// create comment button for adding a association
		createCommentBoxButton = new JButton("Create Comment");
		createCommentBoxButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		createCommentBoxButton.setToolTipText("Create Comment");
		createCommentBoxButton.setForeground(UIManager
				.getColor("Button.foreground"));
		createCommentBoxButton.setBackground(UIManager
				.getColor("Button.background"));
		createCommentBoxButton.setActionCommand("createcomment");
		createCommentBoxButton.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(createCommentBoxButton);

		// create second button delete rectangle
		deleteRectangleButton = new JButton(Constants.DELETE_CLASS_BUTTON_NAME);
		deleteRectangleButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteRectangleButton
				.setToolTipText(Constants.DELETE_CLASS_BUTTON_NAME);
		deleteRectangleButton.setForeground(UIManager
				.getColor("Button.foreground"));
		deleteRectangleButton.setBackground(UIManager
				.getColor("Button.background"));
		deleteRectangleButton
				.setActionCommand(Constants.DELETE_CLASS_BUTTON_ACTION_COMMAND);
		deleteRectangleButton.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(deleteRectangleButton);

		// create button delete comment box
		deleteCommentBox = new JButton("Delete Comment");
		deleteCommentBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteCommentBox.setToolTipText("Delete Comment");
		deleteCommentBox.setForeground(UIManager.getColor("Button.foreground"));
		deleteCommentBox.setBackground(UIManager.getColor("Button.background"));
		deleteCommentBox.setActionCommand("deletecomment");
		deleteCommentBox.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(deleteCommentBox);

		// create button delete association
		deleteAssociation = new JButton("Delete Association");
		deleteAssociation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteAssociation.setToolTipText("Delete Association");
		deleteAssociation
				.setForeground(UIManager.getColor("Button.foreground"));
		deleteAssociation
				.setBackground(UIManager.getColor("Button.background"));
		deleteAssociation.setActionCommand("deleteassociation");
		deleteAssociation.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(deleteAssociation);

		// create button delete association box
		deleteAssociationText = new JButton("Delete Association Text");
		deleteAssociationText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteAssociationText.setToolTipText("Delete Association Text");
		deleteAssociationText.setForeground(UIManager
				.getColor("Button.foreground"));
		deleteAssociationText.setBackground(UIManager
				.getColor("Button.background"));
		deleteAssociationText.setActionCommand("deleteassociationtext");
		deleteAssociationText.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(deleteAssociationText);

		// create third button removing all connections
		deleteAllConnection = new JButton(
				Constants.REMOVE_ALL_ASSOCIATIONS_BUTTON_NAME);
		deleteAllConnection.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteAllConnection
				.setToolTipText(Constants.REMOVE_ALL_ASSOCIATIONS_BUTTON_NAME);
		deleteAllConnection.setForeground(UIManager
				.getColor("Button.foreground"));
		deleteAllConnection.setBackground(UIManager
				.getColor("Button.background"));
		deleteAllConnection
				.setActionCommand(Constants.REMOVE_ALL_ASSOCIATIONS_BUTTON_ACTION_COMMAND);
		deleteAllConnection.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(deleteAllConnection);

		// create fourth button reseting the editor
		resetDiagramButton = new JButton(Constants.REFRESH_EDITOR_BUTTON_NAME);
		resetDiagramButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		resetDiagramButton.setToolTipText(Constants.REFRESH_EDITOR_BUTTON_NAME);
		resetDiagramButton.setForeground(UIManager
				.getColor("Button.foreground"));
		resetDiagramButton.setBackground(UIManager
				.getColor("Button.background"));
		resetDiagramButton
				.setActionCommand(Constants.REFRESH_EDITOR_BUTTON_ACTION_COMMAND);
		resetDiagramButton.addActionListener(ApplicationEditorController
				.getInstance());
		controlPanelView.add(resetDiagramButton);

	}

	/**
	 * private constructor to avoid initialization
	 */
	private ControlPanelView() {
		super();
	}

	/**
	 * Get the singleton instance
	 * 
	 * @return ControlPanelView single instance of left side control
	 *         panel
	 */
	public static ControlPanelView getInstance() {
		return controlPanelView;
	}

	/**
	 * @return the createRectangleButton
	 */
	public JButton getCreateRectangleButton() {
		return createRectangleButton;
	}

	/**
	 * @param createRectangleButton
	 *            the createRectangleButton to set
	 */
	public void setCreateRectangleButton(JButton createRectangleButton) {
		ControlPanelView.createRectangleButton = createRectangleButton;
	}

	/**
	 * @return the resetDiagramButton
	 */
	public static JButton getResetDiagramButton() {
		return resetDiagramButton;
	}

	/**
	 * @param resetDiagramButton
	 *            the resetDiagramButton to set
	 */
	public static void setResetDiagramButton(JButton resetDiagramButton) {
		ControlPanelView.resetDiagramButton = resetDiagramButton;
	}

	/**
	 * @return the deleteRectangleButton
	 */
	public static JButton getDeleteRectangleButton() {
		return deleteRectangleButton;
	}

	/**
	 * @param deleteRectangleButton
	 *            the deleteRectangleButton to set
	 */
	public static void setDeleteRectangleButton(JButton deleteRectangleButton) {
		ControlPanelView.deleteRectangleButton = deleteRectangleButton;
	}

	/**
	 * @return the deleteAllConnection
	 */
	public static JButton getDeleteAllConnection() {
		return deleteAllConnection;
	}

	/**
	 * @param deleteAllConnection
	 *            the deleteAllConnection to set
	 */
	public static void setDeleteAllConnection(JButton deleteAllConnection) {
		ControlPanelView.deleteAllConnection = deleteAllConnection;
	}

}
