package at.fhooe.mc.se.util;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shrikant Havale
 * @version 1.0 This class stores the constants that are used in entire project
 *          Paramters like button names, heaings, actions can be changed in
 *          here.
 */
public class Constants {

	/**
	 * Main window heading
	 */
	public static final String MAIN_WINDOW_HEADING = "CLASS DIAGRAM CREATOR / EDITOR";

	/**
	 * Heading of File Menu
	 */
	public static final String FILE_MENU_HEADING = "File";

	/**
	 * Heading of Help Menu
	 */
	public static final String HELP_MENU_HEADING = "Help";

	/**
	 * Heading of file sub menu "Open controls"
	 */
	public static final String FILE_SUBMENU_OPENCONTROLSHEADING = "Open Controls";

	/**
	 * Heading of file sub menu "Close Controls"
	 */
	public static final String FILE_SUBMENU_CLOSECONTROLSHEADING = "Close Controls";

	/**
	 * Heading of file sub menu "Open Editor"
	 */
	public static final String FILE_SUBMENU_OPENEDITORHEADING = "Open Editor";

	/**
	 * Heading of file sub menu Close Editor
	 */
	public static final String FILE_SUBMENU_CLOSEEDITORHEADING = "Close Editor";

	/**
	 * Heading of file sub menu "Instruction"
	 */
	public static final String HELP_SUBMENU_INSTRUCTIONS = "Instructions";

	/**
	 * Heading of file sub menu "Exit"
	 */
	public static final String FILE_SUBMENU_EXITAPPLICATIONHEADING = "Exit";

	/**
	 * Action used on click menu "Open Controls"
	 */
	public static final String FILE_SUBMENU_OPENCONTROLS_ACTION_COMMAND = "OpenControls";

	/**
	 * Action used on click menu "Close Controls"
	 */
	public static final String FILE_SUBMENU_CLOSECONTROLS_ACTION_COMMAND = "CloseControls";

	/**
	 * Action used on click menu "Open Editor"
	 */
	public static final String FILE_SUBMENU_OPENEDITOR_ACTION_COMMAND = "OpenEditor";

	/**
	 * Action used on click menu "Close Editor"
	 */
	public static final String FILE_SUBMENU_CLOSEEDITOR_ACTION_COMMAND = "CloseEditor";

	/**
	 * Action used on click menu "Exit"
	 */
	public static final String FILE_SUBMENU_EXITAPPLICATION_ACTION_COMMAND = "Exit";

	/**
	 * Action used on click menu "Exit"
	 */
	public static final String HELP_SUBMENU_HELP_ACTION_COMMAND = "Instructions";

	/**
	 * Control panel background color
	 */
	public static final String CONTROL_PANEL_BACKGROUND_COLOR = "InternalFrame.inactiveTitleBackground";

	/**
	 * Action used on click button "Create Class"
	 */
	public static final String CREATE_CLASS_BUTTON_ACTION_COMMAND = "CreateClass";

	/**
	 * Action used on click button "Delete Class"
	 */
	public static final String DELETE_CLASS_BUTTON_ACTION_COMMAND = "DeleteClass";

	/**
	 * Action used on click button "Remove All Associations"
	 */
	public static final String REMOVE_ALL_ASSOCIATIONS_BUTTON_ACTION_COMMAND = "RemoveAllAssociations";

	/**
	 * Action used on click button "Create Class"
	 */
	public static final String REFRESH_EDITOR_BUTTON_ACTION_COMMAND = "RefreshEditor";

	/**
	 * button name for remove class
	 */
	public static final String DELETE_CLASS_BUTTON_NAME = "Remove Class";

	/**
	 * button name for creating association
	 */
	public static final String CREATE_ASSOCIATION_ACTION_COMMAND = "createassociation";

	/**
	 * button for adding association
	 */
	public static final String CREATE_ASSOCIATION_BUTTON_NAME = "Create Association";

	/**
	 * button name for create class
	 */
	public static final String CREATE_CLASS_BUTTON_NAME = "Create Class";

	/**
	 * button name for remove all connections
	 */
	public static final String REMOVE_ALL_ASSOCIATIONS_BUTTON_NAME = "Remove All Associations";

	/**
	 * button name for refresh editor
	 */
	public static final String REFRESH_EDITOR_BUTTON_NAME = "Refresh Editor";

	/**
	 * dummy text for starting of class
	 */
	public static final String TEXT_PANE_DEFAULT_TEXT = " Class Name \n ------------------------------------"
			+ " \n "
			+ "Attributes "
			+ "\n"
			+ "\n"
			+ "------------------------------------"
			+ "\n"
			+ " Methods "
			+ "\n\n";

	/**
	 * application help text constant
	 */
	public static final String APPLICATION_HELPTEXT_CONSTANT = "HOW TO USE !!!!!!!!!!!! \n ----------------------------\n"
			+ "1. Helps you creating diagram \n similar to class diagrams \n"
			+ "2. Navigate to FILE Menu \n"
			+ "3. Open Controls - \n Will open the Top panel \n"
			+ "4. Top Panel contains \n buttons to perform require action \n"
			+ "5. Close Controls - \n Will close the Top panel \n"
			+ "6. Open Editor - \n Will open the editor \n"
			+ "7. Editor is place \nwhere diagram will be created \n"
			+ "8. Create Class - \nbutton will create a rectangle \n"
			+ "9. Inside this attributes\n and methods could be written \n"
			+ "10. For creating association\n simply drag mouse in editor \n"
			+ "11. Line will be drawn between\n point when mouse was pressed \n"
			+ "    and when mouse was released \n"
			+ "12. To remove class, \nclick on the required class \n"
			+ "13. And press remove \nclass button \n"
			+ "14. To remove all associations,\n click on remove associations \n"
			+ "15. To completely refresh\n the editor and start fresh\n"
			+ "16. Press Refresh Editor Button \n\n\n";

	/**
	 * private constructor to avoid initialization
	 */
	private Constants() {
	}

	/**
	 * variable to store list of start points,
	 */
	private static List<Point> xPositionPointMap = new ArrayList<>();

	/**
	 * variable to store list of end points
	 */
	private static List<Point> yPositionPointMap = new ArrayList<>();

	/**
	 * @return the xPositionPointMap
	 */
	public static List<Point> getxPositionPointMap() {
		return xPositionPointMap;
	}

	/**
	 * @param xPositionPointMap
	 *            the xPositionPointMap to set
	 */
	public static void setxPositionPointMap(List<Point> xPositionPointMap) {
		Constants.xPositionPointMap = xPositionPointMap;
	}

	/**
	 * @return the yPositionPointMap
	 */
	public static List<Point> getyPositionPointMap() {
		return yPositionPointMap;
	}

	/**
	 * @param yPositionPointMap
	 *            the yPositionPointMap to set
	 */
	public static void setyPositionPointMap(List<Point> yPositionPointMap) {
		Constants.yPositionPointMap = yPositionPointMap;
	}

}