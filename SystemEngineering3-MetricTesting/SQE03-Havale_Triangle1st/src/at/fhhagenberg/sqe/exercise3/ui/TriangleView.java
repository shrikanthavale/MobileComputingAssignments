package at.fhhagenberg.sqe.exercise3.ui;

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
 * This class is a frame containing a panel. Panel contains several components
 * for capturing input and displaying output related to area and perimeter of
 * the triangle.
 * 
 * @author Shrikant Havale - S1310455005 Oct 18, 2014
 * 
 */
public class TriangleView extends JFrame {

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
	 * panel containing components for capturing sides of triangle and showing
	 * output
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
	private JButton resetButton;

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
	 * error message for sum of sides
	 */
	private JLabel sumSidesErrorMessage;

	/**
	 * for combining output and error
	 */
	private JPanel innerOutputErrorPanel;
	private JPanel innerSumErrorPanel;

	/**
	 * Constructor for the Triangle Frame. It is responsible for creating the
	 * layout and UI for the application. This method creates text fields for
	 * taking input the parameters of triangle. And also components for
	 * displaying area and perimeter of the triangle
	 */
	public TriangleView() {

		// for closing the grame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(Messages.getString("TriangleView.frametitle")); //$NON-NLS-1$

		// setting the bounds of the frame
		setBounds(100, 100, 747, 423);

		// create new panel inside the triangle
		triangleContentPanel = new JPanel();

		// set the border and layout
		triangleContentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		triangleContentPanel.setLayout(new BorderLayout(10, 10));

		// set the panel of this frame to triangleContentPanel
		setContentPane(triangleContentPanel);

		mainWindowNorthPanel = new JPanel();
		triangleContentPanel.add(mainWindowNorthPanel, BorderLayout.NORTH);
		mainWindowNorthPanel.setLayout(new GridLayout(2, 1, 0, 0));

		// create a heading label
		applicationHeadingLabel = new JLabel(Messages.getString("TriangleView.frameheading")); //$NON-NLS-1$
		mainWindowNorthPanel.add(applicationHeadingLabel);

		// modify the properties and place it in the center
		applicationHeadingLabel.setFont(new Font(Messages.getString("TriangleView.tahomafont"), Font.PLAIN, 20)); //$NON-NLS-1$
		applicationHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);

		// enter message label
		enterMessageLabel = new JLabel(
				Messages.getString("TriangleView.entermessage")); //$NON-NLS-1$
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

		// center panel for storing inputOutput panel
		mainWindowCenterPanel = new JPanel();
		triangleContentPanel.add(mainWindowCenterPanel, BorderLayout.CENTER);
		mainWindowCenterPanel.setLayout(new BorderLayout(0, 0));

		innerWindowNorthPanel = new JPanel();
		mainWindowCenterPanel.add(innerWindowNorthPanel, BorderLayout.NORTH);
		innerWindowNorthPanel
				.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

		// panel for storing all triangle input output parameters
		inputPanel = new JPanel();
		innerWindowNorthPanel.add(inputPanel);
		inputPanel.setLayout(new GridLayout(4, 3, 20, 20));

		// side A label
		sideALabel = new JLabel(Messages.getString("TriangleView.sideAlabel")); //$NON-NLS-1$
		sideALabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputPanel.add(sideALabel);

		// side A text field
		sideATextfield = new JTextField();
		sideATextfield
				.setToolTipText(Messages.getString("TriangleView.sideAtooltip")); //$NON-NLS-1$
		inputPanel.add(sideATextfield);
		sideATextfield.setColumns(10);

		// side A error validation message
		sideAValidationMessage = new JLabel(Messages.getString("TriangleView.emptyerrormessage")); //$NON-NLS-1$
		sideAValidationMessage.setForeground(Color.RED);
		inputPanel.add(sideAValidationMessage);

		// side B label
		sideBLabel = new JLabel(Messages.getString("TriangleView.sideBlabel")); //$NON-NLS-1$
		sideBLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputPanel.add(sideBLabel);

		// side B text field
		sideBTextfield = new JTextField();
		sideBTextfield
				.setToolTipText(Messages.getString("TriangleView.sideBtooltip")); //$NON-NLS-1$
		inputPanel.add(sideBTextfield);
		sideBTextfield.setColumns(10);

		// side B error validation message
		sideBValidationMessage = new JLabel(Messages.getString("TriangleView.emptyerrormessage")); //$NON-NLS-1$
		sideBValidationMessage.setForeground(Color.RED);
		inputPanel.add(sideBValidationMessage);

		// side C error validation message
		sideCLabel = new JLabel(Messages.getString("TriangleView.sideClabel")); //$NON-NLS-1$
		sideCLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputPanel.add(sideCLabel);

		// side C textfield
		sideCTextfield = new JTextField();
		sideCTextfield
				.setToolTipText(Messages.getString("TriangleView.sideCtooltip")); //$NON-NLS-1$
		inputPanel.add(sideCTextfield);
		sideCTextfield.setColumns(10);

		// side C validation message
		sideCValidationMessage = new JLabel(Messages.getString("TriangleView.emptyerrormessage")); //$NON-NLS-1$
		sideCValidationMessage.setForeground(Color.RED);
		inputPanel.add(sideCValidationMessage);

		// inner panels - UI alignment
		innerWindowCenterPanel = new JPanel();
		mainWindowCenterPanel.add(innerWindowCenterPanel, BorderLayout.CENTER);
		innerWindowCenterPanel
				.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// for combining error and output panel
		innerOutputErrorPanel = new JPanel();
		innerWindowCenterPanel.add(innerOutputErrorPanel);
		innerOutputErrorPanel.setLayout(new BorderLayout(0, 10));

		// output panel
		outputPanel = new JPanel();
		innerOutputErrorPanel.add(outputPanel, BorderLayout.CENTER);
		outputPanel.setLayout(new GridLayout(2, 2, 10, 10));

		// triangle area label
		areaTriangleLabel = new JLabel(Messages.getString("TriangleView.trianglearealabel")); //$NON-NLS-1$
		areaTriangleLabel.setFont(new Font(Messages.getString("TriangleView.tahomafont"), Font.PLAIN, 20)); //$NON-NLS-1$
		outputPanel.add(areaTriangleLabel);

		// triangle value label
		areaTriangleValueLabel = new JLabel(""); //$NON-NLS-1$
		areaTriangleValueLabel.setFont(new Font(Messages.getString("TriangleView.tahomafont"), Font.PLAIN, 20)); //$NON-NLS-1$
		outputPanel.add(areaTriangleValueLabel);

		// perimeter triangle label
		perimeterTriangleLabel = new JLabel(Messages.getString("TriangleView.triangleperimeterlabel")); //$NON-NLS-1$
		perimeterTriangleLabel.setFont(new Font(Messages.getString("TriangleView.tahomafont"), Font.PLAIN, 20)); //$NON-NLS-1$
		outputPanel.add(perimeterTriangleLabel);

		// perimeter triangle value
		perimeterTriangleValueLabel = new JLabel(""); //$NON-NLS-1$
		perimeterTriangleValueLabel.setFont(new Font(Messages.getString("TriangleView.tahomafont"), Font.PLAIN, 20)); //$NON-NLS-1$
		outputPanel.add(perimeterTriangleValueLabel);

		innerSumErrorPanel = new JPanel();
		innerOutputErrorPanel.add(innerSumErrorPanel, BorderLayout.SOUTH);

		// error message for sum of sides
		sumSidesErrorMessage = new JLabel(""); //$NON-NLS-1$
		innerSumErrorPanel.add(sumSidesErrorMessage);
		sumSidesErrorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		sumSidesErrorMessage.setForeground(Color.RED);

		// inner panels - UI alignment
		innerWindowSouthPanel = new JPanel();
		mainWindowCenterPanel.add(innerWindowSouthPanel, BorderLayout.SOUTH);

		// calculate button
		calculateButton = new JButton(Messages.getString("TriangleView.calculatebuttonlabel")); //$NON-NLS-1$
		innerWindowSouthPanel.add(calculateButton);
		calculateButton
				.setToolTipText(Messages.getString("TriangleView.calculatebuttontooltip")); //$NON-NLS-1$
		calculateButton.setEnabled(false);

		// reset button
		resetButton = new JButton(Messages.getString("TriangleView.resetbuttonlabel")); //$NON-NLS-1$
		innerWindowSouthPanel.add(resetButton);

	}

	/**
	 * @return the sideATextfield
	 */
	public JTextField getSideATextfield() {
		return sideATextfield;
	}

	/**
	 * @param sideATextfield
	 *            the sideATextfield to set
	 */
	public void setSideATextfield(JTextField sideATextfield) {
		this.sideATextfield = sideATextfield;
	}

	/**
	 * @return the sideBTextfield
	 */
	public JTextField getSideBTextfield() {
		return sideBTextfield;
	}

	/**
	 * @param sideBTextfield
	 *            the sideBTextfield to set
	 */
	public void setSideBTextfield(JTextField sideBTextfield) {
		this.sideBTextfield = sideBTextfield;
	}

	/**
	 * @return the sideCTextfield
	 */
	public JTextField getSideCTextfield() {
		return sideCTextfield;
	}

	/**
	 * @param sideCTextfield
	 *            the sideCTextfield to set
	 */
	public void setSideCTextfield(JTextField sideCTextfield) {
		this.sideCTextfield = sideCTextfield;
	}

	/**
	 * @return the sideAValidationMessage
	 */
	public JLabel getSideAValidationMessage() {
		return sideAValidationMessage;
	}

	/**
	 * @param sideAValidationMessage
	 *            the sideAValidationMessage to set
	 */
	public void setSideAValidationMessage(JLabel sideAValidationMessage) {
		this.sideAValidationMessage = sideAValidationMessage;
	}

	/**
	 * @return the sideBValidationMessage
	 */
	public JLabel getSideBValidationMessage() {
		return sideBValidationMessage;
	}

	/**
	 * @param sideBValidationMessage
	 *            the sideBValidationMessage to set
	 */
	public void setSideBValidationMessage(JLabel sideBValidationMessage) {
		this.sideBValidationMessage = sideBValidationMessage;
	}

	/**
	 * @return the sideCValidationMessage
	 */
	public JLabel getSideCValidationMessage() {
		return sideCValidationMessage;
	}

	/**
	 * @param sideCValidationMessage
	 *            the sideCValidationMessage to set
	 */
	public void setSideCValidationMessage(JLabel sideCValidationMessage) {
		this.sideCValidationMessage = sideCValidationMessage;
	}

	/**
	 * @return the calculateButton
	 */
	public JButton getCalculateButton() {
		return calculateButton;
	}

	/**
	 * @param calculateButton
	 *            the calculateButton to set
	 */
	public void setCalculateButton(JButton calculateButton) {
		this.calculateButton = calculateButton;
	}

	/**
	 * @return the btnReset
	 */
	public JButton getResetButton() {
		return resetButton;
	}

	/**
	 * @param btnReset
	 *            the btnReset to set
	 */
	public void setResetButton(JButton btnReset) {
		this.resetButton = btnReset;
	}

	/**
	 * @return the areaTriangleValueLabel
	 */
	public JLabel getAreaTriangleValueLabel() {
		return areaTriangleValueLabel;
	}

	/**
	 * @param areaTriangleValueLabel
	 *            the areaTriangleValueLabel to set
	 */
	public void setAreaTriangleValueLabel(JLabel areaTriangleValueLabel) {
		this.areaTriangleValueLabel = areaTriangleValueLabel;
	}

	/**
	 * @return the perimeterTriangleValueLabel
	 */
	public JLabel getPerimeterTriangleValueLabel() {
		return perimeterTriangleValueLabel;
	}

	/**
	 * @param perimeterTriangleValueLabel
	 *            the perimeterTriangleValueLabel to set
	 */
	public void setPerimeterTriangleValueLabel(
			JLabel perimeterTriangleValueLabel) {
		this.perimeterTriangleValueLabel = perimeterTriangleValueLabel;
	}

	/**
	 * @return the sumSidesErrorMessage
	 */
	public JLabel getSumSidesErrorMessage() {
		return sumSidesErrorMessage;
	}

	/**
	 * @param sumSidesErrorMessage
	 *            the sumSidesErrorMessage to set
	 */
	public void setSumSidesErrorMessage(JLabel sumSidesErrorMessage) {
		this.sumSidesErrorMessage = sumSidesErrorMessage;
	}

}
