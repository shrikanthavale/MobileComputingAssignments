/**
 * 
 */
package at.fhooe.mc.se.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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
	private static JPanel firstButtonPanel = new ControlPanelView();

	/**
	 * single instance of ControlPanelView
	 */
	private static JPanel secondButtonPanel = new ControlPanelView();

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
	 * grid panel
	 */
	private static JPanel gridPanel;

	/**
	 * create state button
	 */
	private static JButton ovalPanelButton;

	/**
	 * create direction arrow button
	 */
	private static JButton directedArrowButton;

	/**
	 * create delete state button
	 */
	private static JButton deleteOvalPanel;

	/**
	 * create delete direction button
	 */
	private static JButton deleteDirectedArrow;

	/**
	 * static block for initializing the panel and adding required components
	 */
	static {

		// create the grid panel
		gridPanel = new JPanel(new GridLayout(2, 1, 0, 0));

		firstButtonPanel.setBackground(UIManager
				.getColor(Constants.CONTROL_PANEL_BACKGROUND_COLOR));
		firstButtonPanel.setBounds(0, 0, 600, 33);
		firstButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));

		secondButtonPanel.setBackground(UIManager
				.getColor(Constants.CONTROL_PANEL_BACKGROUND_COLOR));
		secondButtonPanel.setBounds(0, 0, 600, 33);
		secondButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));

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
		firstButtonPanel.add(createRectangleButton);

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
		firstButtonPanel.add(createAssociationButton);

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
		createAssociationTextButton
				.addActionListener(ApplicationEditorController.getInstance());
		firstButtonPanel.add(createAssociationTextButton);

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
		firstButtonPanel.add(createCommentBoxButton);

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
		firstButtonPanel.add(deleteRectangleButton);

		// create button delete comment box
		deleteCommentBox = new JButton("Delete Comment");
		deleteCommentBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteCommentBox.setToolTipText("Delete Comment");
		deleteCommentBox.setForeground(UIManager.getColor("Button.foreground"));
		deleteCommentBox.setBackground(UIManager.getColor("Button.background"));
		deleteCommentBox.setActionCommand("deletecomment");
		deleteCommentBox.addActionListener(ApplicationEditorController
				.getInstance());
		firstButtonPanel.add(deleteCommentBox);

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
		firstButtonPanel.add(deleteAssociation);

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
		firstButtonPanel.add(deleteAssociationText);

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
		firstButtonPanel.add(deleteAllConnection);

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
		firstButtonPanel.add(resetDiagramButton);

		// create the state chart diagram rounded oval button
		ovalPanelButton = new JButton(Constants.OVAL_PANEL_BUTTON_NAME);
		ovalPanelButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ovalPanelButton.setToolTipText(Constants.OVAL_PANEL_BUTTON_NAME);
		ovalPanelButton.setForeground(UIManager.getColor("Button.foreground"));
		ovalPanelButton.setBackground(UIManager.getColor("Button.background"));
		ovalPanelButton
				.setActionCommand(Constants.CREATE_OVAL_BUTTON_ACTION_COMMAND);
		ovalPanelButton.addActionListener(ApplicationEditorController
				.getInstance());
		secondButtonPanel.add(ovalPanelButton);

		// create a button for directed arrow
		directedArrowButton = new JButton(Constants.DIRECTED_LINE_BUTTON_NAME);
		directedArrowButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		directedArrowButton.setToolTipText(Constants.DIRECTED_LINE_BUTTON_NAME);
		directedArrowButton.setForeground(UIManager
				.getColor("Button.foreground"));
		directedArrowButton.setBackground(UIManager
				.getColor("Button.background"));
		directedArrowButton
				.setActionCommand(Constants.CREATE_DIRECTED_LINE_BUTTON_ACTION_COMMAND);
		directedArrowButton.addActionListener(ApplicationEditorController
				.getInstance());
		secondButtonPanel.add(directedArrowButton);

		// create a button for delete oval panel
		deleteOvalPanel = new JButton(Constants.DELETE_OVAL_PANEL_BUTTON_NAME);
		deleteOvalPanel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteOvalPanel.setToolTipText(Constants.DELETE_OVAL_PANEL_BUTTON_NAME);
		deleteOvalPanel.setForeground(UIManager.getColor("Button.foreground"));
		deleteOvalPanel.setBackground(UIManager.getColor("Button.background"));
		deleteOvalPanel
				.setActionCommand(Constants.DELETE_OVAL_BUTTON_ACTION_COMMAND);
		deleteOvalPanel.addActionListener(ApplicationEditorController
				.getInstance());
		secondButtonPanel.add(deleteOvalPanel);

		// create a button for delete oval panel
		deleteDirectedArrow = new JButton(
				Constants.DELTE_DIRECTED_ARROW_BUTTON_NAME);
		deleteDirectedArrow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteDirectedArrow
				.setToolTipText(Constants.DELTE_DIRECTED_ARROW_BUTTON_NAME);
		deleteDirectedArrow.setForeground(UIManager
				.getColor("Button.foreground"));
		deleteDirectedArrow.setBackground(UIManager
				.getColor("Button.background"));
		deleteDirectedArrow
				.setActionCommand(Constants.DELETE_DIRECTED_LINE_BUTTON_ACTION_COMMAND);
		deleteDirectedArrow.addActionListener(ApplicationEditorController
				.getInstance());
		secondButtonPanel.add(deleteDirectedArrow);

		gridPanel.add(firstButtonPanel);
		gridPanel.add(secondButtonPanel);
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
	 * @return ControlPanelView single instance of left side control panel
	 */
	public static JPanel getInstance() {
		return gridPanel;
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

	/**
	 * @return the gridPanel
	 */
	public static JPanel getGridPanel() {
		return gridPanel;
	}

	/**
	 * @param gridPanel
	 *            the gridPanel to set
	 */
	public static void setGridPanel(JPanel gridPanel) {
		ControlPanelView.gridPanel = gridPanel;
	}

	/**
	 * @return the secondButtonPanel
	 */
	public static JPanel getSecondButtonPanel() {
		return secondButtonPanel;
	}

	/**
	 * @param secondButtonPanel
	 *            the secondButtonPanel to set
	 */
	public static void setSecondButtonPanel(JPanel secondButtonPanel) {
		ControlPanelView.secondButtonPanel = secondButtonPanel;
	}

}
