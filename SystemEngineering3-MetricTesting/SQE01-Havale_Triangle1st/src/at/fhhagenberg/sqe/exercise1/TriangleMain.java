package at.fhhagenberg.sqe.exercise1;


/**
 * This class is the main class of the application, from where the project
 * execution starts. It contains main method which is responsible for invoking
 * frame object and in turn this frame creates UI.
 * 
 * @author Shrikant Havale - S1310455005 Oct 18, 2014
 * 
 */
public class TriangleMain {

	/**
	 * Create reference for triangle frame, for adding the frame
	 */
	private TriangleView triangleView;
	
	/**
	 * create the reference for the controller
	 */
	private TriangleController triangleController;
	
	/**
	 * create a reference of the model
	 */
	private TriangleModel triangleModel;
	
	/**
	 * Singleton instance of TriangleMain
	 */
	private static TriangleMain triangleMain;
	
	/**
	 * static block to initialize the singleton instance
	 */
	static{
		// initialize the singleton class
		triangleMain = new TriangleMain();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		// initialize the view
		triangleMain.triangleView = new TriangleView();
		triangleMain.triangleView.setVisible(true);
		
		// initialize the controller
		triangleMain.triangleController = new TriangleController();
		triangleMain.triangleController.addButtonClickListeners();
		triangleMain.triangleController.addTextChangeListenerForSides();
		
		// initialize the model
		triangleMain.triangleModel = new TriangleModel();
	}

	/**
	 * Create the application. Empty private constructor to avoid external initialization of 
	 * singleton class
	 */
	private TriangleMain() {
		
	}

	/**
	 * @return the triangleMain
	 */
	public static TriangleMain getTriangleMain() {
		return triangleMain;
	}

	/**
	 * @return the triangleView
	 */
	public TriangleView getTriangleView() {
		return triangleView;
	}

	/**
	 * @return the triangleController
	 */
	public TriangleController getTriangleController() {
		return triangleController;
	}

	/**
	 * @return the triangleModel
	 */
	public TriangleModel getTriangleModel() {
		return triangleModel;
	}
	
}
