package at.fhhagenberg.sqe.exercise1;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * This class is a frame containing a panel. Panel contains several components for capturing input and displaying output
 * related to area and perimeter of the triangle.
 * 
 * @author Shrikant Havale - S1310455005
 * Oct 18, 2014
 *
 */
public class TriangleFrame extends JFrame {

	/**
	 * Generated serial version id
	 */
	private static final long serialVersionUID = 6859019311177187596L;
	
	/**
	 * Panel to display all the contents, like labels buttons text etc
	 */
	private JPanel triangleContentPanel;
	
	/**
	 * Application Heading
	 */
	private JLabel applicationHeadingLabel;


	/**
	 * Constructor for the Triangle Frame. It is responsible for creating the layout and UI for the application.
	 * This method creates text fields for taking input the parameters of triangle. And also components for displaying 
	 * area and perimeter of the triangle
	 */
	public TriangleFrame() {
		
		// for closing the grame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// setting the bounds of the frame
		setBounds(100, 100, 450, 300);
		
		// create new panel inside the triangle
		triangleContentPanel = new JPanel();
		
		//set the border and layout
		triangleContentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		triangleContentPanel.setLayout(new BorderLayout(0, 0));
		
		// set the panel of this frame to triangleContentPanel
		setContentPane(triangleContentPanel);
		
		// create a heading label
		applicationHeadingLabel = new JLabel("Triangle Application");
		
		// modify the properties and place it in the center
		applicationHeadingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		applicationHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		//add the label to NORTH of the panel
		triangleContentPanel.add(applicationHeadingLabel, BorderLayout.NORTH);
	}

}
