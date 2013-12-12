/**
 * 
 */
package at.fhooe.mc.se.controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import at.fhooe.mc.se.model.ApplicationEditorModel;
import at.fhooe.mc.se.util.Constants;

/**
 * @author Shrikant Havale This class handles the button click event for all the
 *         buttons present in the application. Button click events for the
 *         create class, refresh associations, delete class etc.
 * 
 */
public class ApplicationEditorController implements ActionListener {

	/**
	 * instance of model
	 */
	ApplicationEditorModel applicationEditorModel = new ApplicationEditorModel();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// as per the action commands for different buttons, accordingly
		// different action is performed

		switch (e.getActionCommand()) {
		case Constants.CREATE_CLASS_BUTTON_ACTION_COMMAND:
			applicationEditorModel.createTextPane();
			break;
		case Constants.CREATE_ASSOCIATION_ACTION_COMMAND:
			applicationEditorModel.createAssociation();
			break;
		case "createAssociationText":
			applicationEditorModel.createAssociationText();
			break;
		case "createcomment":
			applicationEditorModel.createCommentBox();
			break;
		case Constants.DELETE_CLASS_BUTTON_ACTION_COMMAND:
			applicationEditorModel.deleteClass();
			break;
		case "deletecomment":
			applicationEditorModel.deleteComment();
			break;
		case "deleteassociation":
			applicationEditorModel.removeAssociation();
			break;
		case "deleteassociationtext":
			applicationEditorModel.deleteAssociationText();
			break;
		case Constants.REMOVE_ALL_ASSOCIATIONS_BUTTON_ACTION_COMMAND:
			applicationEditorModel.removeAllAssociations();
			break;
		case Constants.REFRESH_EDITOR_BUTTON_ACTION_COMMAND:
			applicationEditorModel.refreshEditor();
			break;
		default:
			break;
		}
	}

	/**
	 * Get the singleton instance
	 * 
	 * @return ApplicationEditorController single instance of Menu item action
	 *         event
	 */
	public static ApplicationEditorController getInstance() {
		return new ApplicationEditorController();
	}

	/**
	 * @param g
	 */
	public void paintComponents(Graphics g) {
		applicationEditorModel.paintComponents(g);
	}

}
