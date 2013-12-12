/**
 * 
 */
package at.fhooe.mc.se.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import at.fhooe.mc.se.util.Constants;
import at.fhooe.mc.se.view.ControlPanelView;
import at.fhooe.mc.se.view.DrawingAreaView;
import at.fhooe.mc.se.view.InstructionsManualView;

/**
 * @author mypersonalpc This class listens to all menu item events and
 *         accordingly to take appropriate actions.
 * 
 */
public class MenuItemActionModel implements ActionListener {

	/**
	 * single instance of MenuBarView
	 */
	private static MenuItemActionModel menuItemActionModel = new MenuItemActionModel();

	/**
	 * call the super constructor
	 */
	private MenuItemActionModel() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// based on different menu items clicked, different actions are carried
		// out
		switch (e.getActionCommand()) {
		case Constants.FILE_SUBMENU_OPENCONTROLS_ACTION_COMMAND:
			ControlPanelView.getInstance().setVisible(true);
			break;
		case Constants.FILE_SUBMENU_CLOSECONTROLS_ACTION_COMMAND:
			ControlPanelView.getInstance().setVisible(false);
			break;
		case Constants.FILE_SUBMENU_OPENEDITOR_ACTION_COMMAND:
			DrawingAreaView.getInstance().setVisible(true);
			break;
		case Constants.FILE_SUBMENU_CLOSEEDITOR_ACTION_COMMAND:
			DrawingAreaView.getInstance().setVisible(false);
			break;
		case Constants.HELP_SUBMENU_HELP_ACTION_COMMAND:
			InstructionsManualView.getInstance().setVisible(
					!InstructionsManualView.getInstance().isVisible());
			break;
		case Constants.FILE_SUBMENU_EXITAPPLICATION_ACTION_COMMAND:
			System.exit(0);
			break;
		default:
			break;
		}

	}

	/**
	 * Get the singleton instance
	 * 
	 * @return MenuItemActionModel single instance of Menu item action event
	 */
	public static MenuItemActionModel getInstance() {
		return menuItemActionModel;
	}

}
