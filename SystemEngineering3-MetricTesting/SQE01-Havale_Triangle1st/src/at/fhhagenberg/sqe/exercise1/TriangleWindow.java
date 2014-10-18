package at.fhhagenberg.sqe.exercise1;


/**
 * This class is the main class of the application, from where the project
 * execution starts. It contains main method which is responsible for invoking
 * frame object and in turn this frame creates UI.
 * 
 * @author Shrikant Havale - S1310455005 Oct 18, 2014
 * 
 */
public class TriangleWindow {

	/**
	 * Create reference for triangle frame, for adding the frame
	 */
	private TriangleFrame triangleFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TriangleWindow window = new TriangleWindow();
		window.triangleFrame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public TriangleWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		triangleFrame = new TriangleFrame();
	}

}
