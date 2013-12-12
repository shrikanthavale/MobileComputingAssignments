/**
 * 
 */
package at.fhooe.mc.se.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import at.fhooe.mc.se.model.MenuItemActionModel;
import at.fhooe.mc.se.util.Constants;

/**
 * @author Shrikant Havale This class creates the menu for main window. It also
 *         add event listeners for handling mouse clicks on menu
 * 
 */
public class MenuBarView extends JMenuBar {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 3481712573052692530L;

	/**
	 * single instance of MenuBarView
	 */
	private static MenuBarView menuBarView = new MenuBarView();

	/**
	 * static block that gets called during loading of class
	 */
	static {

		// add the main file menu
		JMenu fileMenu = new JMenu(Constants.FILE_MENU_HEADING);
		menuBarView.add(fileMenu);

		// add the help file menu
		JMenu helpMenu = new JMenu(Constants.HELP_MENU_HEADING);
		menuBarView.add(helpMenu);

		// add the file sub menu - Open Controls
		JMenuItem fileMenuSubMenuOpenControls = new JMenuItem(
				Constants.FILE_SUBMENU_OPENCONTROLSHEADING);
		fileMenu.add(fileMenuSubMenuOpenControls);
		fileMenuSubMenuOpenControls
				.setActionCommand(Constants.FILE_SUBMENU_OPENCONTROLS_ACTION_COMMAND);
		fileMenuSubMenuOpenControls.addActionListener(MenuItemActionModel
				.getInstance());

		// add the file sub menu - Open Controls
		JMenuItem fileMenuSubMenuCloseControls = new JMenuItem(
				Constants.FILE_SUBMENU_CLOSECONTROLSHEADING);
		fileMenu.add(fileMenuSubMenuCloseControls);
		fileMenuSubMenuCloseControls
				.setActionCommand(Constants.FILE_SUBMENU_CLOSECONTROLS_ACTION_COMMAND);
		fileMenuSubMenuCloseControls.addActionListener(MenuItemActionModel
				.getInstance());

		// add the second file sub menu - Open Editor
		JMenuItem fileMenuSubMenuOpenEditor = new JMenuItem(
				Constants.FILE_SUBMENU_OPENEDITORHEADING);
		fileMenu.add(fileMenuSubMenuOpenEditor);
		fileMenuSubMenuOpenEditor
				.setActionCommand(Constants.FILE_SUBMENU_OPENEDITOR_ACTION_COMMAND);
		fileMenuSubMenuOpenEditor.addActionListener(MenuItemActionModel
				.getInstance());

		// add the second file sub menu - Open Editor
		JMenuItem fileMenuSubMenuCloseEditor = new JMenuItem(
				Constants.FILE_SUBMENU_CLOSEEDITORHEADING);
		fileMenu.add(fileMenuSubMenuCloseEditor);
		fileMenuSubMenuCloseEditor
				.setActionCommand(Constants.FILE_SUBMENU_CLOSEEDITOR_ACTION_COMMAND);
		fileMenuSubMenuCloseEditor.addActionListener(MenuItemActionModel
				.getInstance());

		// add the third file sub menu - Exit
		JMenuItem fileMenuSubMenuExit = new JMenuItem(
				Constants.FILE_SUBMENU_EXITAPPLICATIONHEADING);
		fileMenu.add(fileMenuSubMenuExit);
		fileMenuSubMenuExit
				.setActionCommand(Constants.FILE_SUBMENU_EXITAPPLICATION_ACTION_COMMAND);
		fileMenuSubMenuExit.addActionListener(MenuItemActionModel
				.getInstance());

		// add the third file sub menu - Exit
		JMenuItem instructionsMenu = new JMenuItem(
				Constants.HELP_SUBMENU_INSTRUCTIONS);
		helpMenu.add(instructionsMenu);
		instructionsMenu
				.setActionCommand(Constants.HELP_SUBMENU_HELP_ACTION_COMMAND);
		instructionsMenu
				.addActionListener(MenuItemActionModel.getInstance());

	}

	/**
	 * private constructor to implement singleton behavior
	 */
	private MenuBarView() {
		super();
	}

	/**
	 * Get the singleton instance
	 * 
	 * @return MenuBarView single instance of complete Menu Bar
	 */
	public static MenuBarView getInstance() {
		return menuBarView;
	}

}
