package at.fhhagenberg.sqe.exercise3;

import at.fhhagenberg.sqe.exercise3.controller.TriangleController;
import at.fhhagenberg.sqe.exercise3.model.Triangle;
import at.fhhagenberg.sqe.exercise3.ui.TriangleView;

/**
 * This class is the main class of the application, from where the project
 * execution starts. It contains main method which is responsible for invoking
 * frame object and in turn this frame creates UI.
 * 
 * @author Shrikant Havale - S1310455005 Oct 18, 2014
 * 
 */
public class Triangle1st {

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
	private Triangle triangle;

	/**
	 * Singleton instance of Triangle1st
	 */
	private static Triangle1st triangle1st;

	/**
	 * static block to initialize the singleton instance
	 */
	static {
		// initialize the singleton class
		triangle1st = new Triangle1st();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// initialize the view
		triangle1st.triangleView = new TriangleView();
		triangle1st.triangleView.setVisible(true);

		// initialize the controller
		triangle1st.triangleController = new TriangleController();
		triangle1st.triangleController.addButtonClickListeners();
		triangle1st.triangleController.addTextChangeListenerForSides();

		// initialize the model
		triangle1st.triangle = new Triangle();
	}

	/**
	 * Create the application. Empty private constructor to avoid external
	 * initialization of singleton class
	 */
	private Triangle1st() {

	}

	/**
	 * @return the triangle1st
	 */
	public static Triangle1st getTriangleMain() {
		return triangle1st;
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
	 * @return the triangle
	 */
	public Triangle getTriangleModel() {
		return triangle;
	}

}
