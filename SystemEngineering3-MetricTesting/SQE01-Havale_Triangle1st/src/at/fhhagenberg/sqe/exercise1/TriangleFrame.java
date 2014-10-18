package at.fhhagenberg.sqe.exercise1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
	 * center panel
	 */
	private JPanel mainWindowCenterPanel;
	
	/**
	 * side A Label
	 */
	private JLabel sideALabel;
	
	/**
	 * side B Label
	 */	
	private JLabel sideBLabel;
	
	/**
	 * side C Label
	 */	
	private JLabel sideCLabel;
	
	/**
	 * Text field for entering value of side A
	 */	
	private JTextField sideATextfield;

	/**
	 * Text field for entering value of side B
	 */	
	private JTextField sideBTextfield;

	/**
	 * Text field for entering value of side C
	 */	
	private JTextField sideCTextfield;

	/**
	 * Validation Message for invalid input of side A
	 */	
	private JLabel sideAValidationMessage;

	/**
	 * Validation Message for invalid input of side B
	 */	
	private JLabel sideBValidationMessage;
	
	/**
	 * Validation Message for invalid input of side C
	 */	
	private JLabel sideCValidationMessage;
	
	/**
	 * South panel - main window - currently empty
	 */
	private JPanel mainWindowSouthPanel;
	
	/**
	 * West panel - main window - currently empty
	 */
	private JPanel mainWindowWestPanel;
	
	/**
	 * East panel - main window - currently empty
	 */
	private JPanel mainWindowEastPanel;
	
	/**
	 * panel containing components for capturing sides of triangle and showing output
	 */
	private JPanel inputPanel;
	
	/**
	 * North panel - main window - currently empty
	 */
	private JPanel mainWindowNorthPanel;
	
	/**
	 * button for calculating area and perimeter of triangle
	 */
	private JButton calculateButton;
	
	/**
	 * enter message label
	 */
	private JLabel enterMessageLabel;
	
	/**
	 * reset button - to reset the values entered
	 */
	private JButton btnReset;
	
	/**
	 * inner panels - to adjust UI
	 */
	private JPanel innerWindowNorthPanel;
	
	/**
	 * inner panels - to adjust UI
	 */	
	private JPanel innerWindowSouthPanel;
	
	/**
	 * inner panels - to adjust UI
	 */
	private JPanel innerWindowCenterPanel;
	
	/**
	 * label for triangle area 
	 */
	private JLabel areaTriangleLabel;
	
	/**
	 * label for value of triangle area
	 */
	private JLabel areaTriangleValueLabel;
	
	/**
	 * label for triangle perimeter 
	 */
	private JLabel perimeterTriangleLabel;
	
	/**
	 * label for value of triangle perimeter 
	 */
	private JLabel perimeterTriangleValueLabel;
	
	/**
	 * output panel
	 */
	private JPanel outputPanel;


	/**
	 * Constructor for the Triangle Frame. It is responsible for creating the layout and UI for the application.
	 * This method creates text fields for taking input the parameters of triangle. And also components for displaying 
	 * area and perimeter of the triangle
	 */
	public TriangleFrame() {
		
		// for closing the grame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SE3 - Metrics & Testing - Assignment 1");
		
		// setting the bounds of the frame
		setBounds(100, 100, 578, 416);
		
		// create new panel inside the triangle
		triangleContentPanel = new JPanel();
		
		//set the border and layout
		triangleContentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		triangleContentPanel.setLayout(new BorderLayout(10, 10));
		
		// set the panel of this frame to triangleContentPanel
		setContentPane(triangleContentPanel);
		
		mainWindowNorthPanel = new JPanel();
		triangleContentPanel.add(mainWindowNorthPanel, BorderLayout.NORTH);
		mainWindowNorthPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		// create a heading label
		applicationHeadingLabel = new JLabel("Triangle Application");
		mainWindowNorthPanel.add(applicationHeadingLabel);
		
		// modify the properties and place it in the center
		applicationHeadingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		applicationHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		// enter message label
		enterMessageLabel = new JLabel("Enter 3 sides of triangle and press calculate");
		enterMessageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterMessageLabel.setVerticalAlignment(SwingConstants.CENTER);
		mainWindowNorthPanel.add(enterMessageLabel);
		
		// empty west panel
		mainWindowWestPanel = new JPanel();
		triangleContentPanel.add(mainWindowWestPanel, BorderLayout.WEST);
		
		// empty south panel
		mainWindowSouthPanel = new JPanel();
		triangleContentPanel.add(mainWindowSouthPanel, BorderLayout.SOUTH);
		
		// empty east panel
		mainWindowEastPanel = new JPanel();
		triangleContentPanel.add(mainWindowEastPanel, BorderLayout.EAST);
		
		//center panel for storing inputOutput panel
		mainWindowCenterPanel = new JPanel();
		triangleContentPanel.add(mainWindowCenterPanel, BorderLayout.CENTER);
		mainWindowCenterPanel.setLayout(new BorderLayout(0, 0));
		
		innerWindowNorthPanel = new JPanel();
		mainWindowCenterPanel.add(innerWindowNorthPanel, BorderLayout.NORTH);
		innerWindowNorthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		// panel for storing all triangle input output parameters
		inputPanel = new JPanel();
		innerWindowNorthPanel.add(inputPanel);
		inputPanel.setLayout(new GridLayout(4, 3, 20, 20));
		
		// side A label
		sideALabel = new JLabel("Side A");
		sideALabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputPanel.add(sideALabel);
		
		// side A text field
		sideATextfield = new JTextField();
		sideATextfield.setToolTipText("Enter the length of first side of triangle in cm");
		inputPanel.add(sideATextfield);
		sideATextfield.setColumns(10);
		
		// side A error validation message
		sideAValidationMessage = new JLabel("Cannot be blank");
		sideAValidationMessage.setForeground(Color.RED);
		inputPanel.add(sideAValidationMessage);
		
		// side B label
		sideBLabel = new JLabel("Side B");
		sideBLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputPanel.add(sideBLabel);
		
		// side B text field
		sideBTextfield = new JTextField();
		sideBTextfield.setToolTipText("Enter the length of second side of triangle in cm");
		inputPanel.add(sideBTextfield);
		sideBTextfield.setColumns(10);
		
		// side B error validation message
		sideBValidationMessage = new JLabel("Cannot be blank");
		sideBValidationMessage.setForeground(Color.RED);
		inputPanel.add(sideBValidationMessage);

		// side C error validation message
		sideCLabel = new JLabel("Side C");
		sideCLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputPanel.add(sideCLabel);

		// side C textfield
		sideCTextfield = new JTextField();
		sideCTextfield
				.setToolTipText("Enter the length of third side of triangle in cm");
		inputPanel.add(sideCTextfield);
		sideCTextfield.setColumns(10);

		// side C validation message
		sideCValidationMessage = new JLabel("Cannot be blank");
		sideCValidationMessage.setForeground(Color.RED);
		inputPanel.add(sideCValidationMessage);

		// inner panels - UI alignment
		innerWindowCenterPanel = new JPanel();
		mainWindowCenterPanel.add(innerWindowCenterPanel, BorderLayout.CENTER);
		innerWindowCenterPanel
				.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// output panel
		outputPanel = new JPanel();
		innerWindowCenterPanel.add(outputPanel);
		outputPanel.setLayout(new GridLayout(2, 2, 20, 20));

		// triangle area label
		areaTriangleLabel = new JLabel("Triangle Area :");
		areaTriangleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outputPanel.add(areaTriangleLabel);

		// triangle value label
		areaTriangleValueLabel = new JLabel("");
		areaTriangleValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outputPanel.add(areaTriangleValueLabel);

		//perimeter triangle label
		perimeterTriangleLabel = new JLabel("Triangle Perimeter : ");
		perimeterTriangleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outputPanel.add(perimeterTriangleLabel);

		// perimeter triangle value
		perimeterTriangleValueLabel = new JLabel("");
		perimeterTriangleValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outputPanel.add(perimeterTriangleValueLabel);

		// inner panels - UI alignment
		innerWindowSouthPanel = new JPanel();
		mainWindowCenterPanel.add(innerWindowSouthPanel, BorderLayout.SOUTH);

		// calculate button
		calculateButton = new JButton("Calculate");
		innerWindowSouthPanel.add(calculateButton);
		calculateButton
				.setToolTipText("Calculate Area and Perimeter for above values");

		// reset button
		btnReset = new JButton("Reset");
		innerWindowSouthPanel.add(btnReset);
		
	}

}
