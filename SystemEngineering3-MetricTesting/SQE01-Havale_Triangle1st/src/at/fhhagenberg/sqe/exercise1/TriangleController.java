/**
 * 
 */
package at.fhhagenberg.sqe.exercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

/**
 * This class is controller responsible for providing the interaction between
 * {@link TriangleView} and model
 * 
 * @author Shrikant Havale - S1310455005 Oct 19, 2014
 * 
 */
public class TriangleController {

	/**
	 * Add the button click listeners for all the buttons present in view
	 */
	public void addButtonClickListeners() {

		// action listener for the calculate button
		getTriangleView().getCalculateButton().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						// get the sides of triangle entered
						double sideA = Double.parseDouble(getTriangleView()
								.getSideATextfield().getText());
						double sideB = Double.parseDouble(getTriangleView()
								.getSideBTextfield().getText());
						double sideC = Double.parseDouble(getTriangleView()
								.getSideCTextfield().getText());

						try {

							// validate all 3 sides for summation property of
							// triangle
							getTriangleModel().validateSummationRule3Sides(
									sideA, sideB, sideC);

							// calculate area and perimeter, call the model
							double area = getTriangleModel().calculateArea(
									sideA, sideB, sideC);
							double perimeter = getTriangleModel()
									.calculatePerimeter(sideA, sideB, sideC);

							// pass the data from model back to UI
							getTriangleView().getPerimeterTriangleValueLabel()
									.setText(perimeter + ""); //$NON-NLS-1$
							getTriangleView().getAreaTriangleValueLabel()
									.setText(area + ""); //$NON-NLS-1$

						} catch (TriangleException triangleException) {

							// show the error message
							getTriangleView().getSumSidesErrorMessage()
									.setText(triangleException.getMessage());

						} catch (Exception exception) {

							// show the error message
							getTriangleView().getSumSidesErrorMessage()
									.setText(exception.getMessage());
						}

					}
				});

		// action listener for the reset button
		getTriangleView().getResetButton().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						// clear all the entries calculate and entered by the
						// user
						getTriangleView().getPerimeterTriangleValueLabel()
								.setText(""); //$NON-NLS-1$
						getTriangleView().getAreaTriangleValueLabel().setText(
								""); //$NON-NLS-1$
						getTriangleView().getSideATextfield().setText(""); //$NON-NLS-1$
						getTriangleView().getSideBTextfield().setText(""); //$NON-NLS-1$
						getTriangleView().getSideCTextfield().setText(""); //$NON-NLS-1$
						getTriangleView().getSideAValidationMessage().setText(
								Messages.getString("TriangleController.blankerrormessage")); //$NON-NLS-1$
						getTriangleView().getSideBValidationMessage().setText(
								Messages.getString("TriangleController.blankerrormessage")); //$NON-NLS-1$
						getTriangleView().getSideCValidationMessage().setText(
								Messages.getString("TriangleController.blankerrormessage")); //$NON-NLS-1$
						getTriangleView().getCalculateButton()
								.setEnabled(false);
						getTriangleView().getSumSidesErrorMessage().setText(""); //$NON-NLS-1$
					}
				});

	}

	/**
	 * Add text change listener for three text fields present in view
	 * {@link TriangleView}, to handle the validations
	 */
	public void addTextChangeListenerForSides() {

		// side A text change listener
		getTriangleView().getSideATextfield().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				// get the string
				String sideText = ((JTextField) e.getSource()).getText();

				try {
					// validate the input
					getTriangleModel().validateSingleSide(sideText);

					// if everything is ok, clear the message
					getTriangleView().getSideAValidationMessage().setText(""); //$NON-NLS-1$

				} catch (TriangleException triangleException) {

					// show the error message
					getTriangleView().getSideAValidationMessage().setText(
							triangleException.getMessage());

				} catch (Exception exception) {

					// show the error message
					getTriangleView().getSideAValidationMessage().setText(
							exception.getMessage());
				}

				// enable or disable the calculate button
				getTriangleView().getCalculateButton().setEnabled(
						enableDisableCalculateMethod());
				getTriangleView().getSumSidesErrorMessage().setText(""); //$NON-NLS-1$
			}

		});

		// side B text change listener
		getTriangleView().getSideBTextfield().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				// get the string
				String sideText = ((JTextField) e.getSource()).getText();

				try {
					// validate the input
					getTriangleModel().validateSingleSide(sideText);

					// if everything is ok, clear the message
					getTriangleView().getSideBValidationMessage().setText(""); //$NON-NLS-1$

				} catch (TriangleException triangleException) {

					// show the error message
					getTriangleView().getSideBValidationMessage().setText(
							triangleException.getMessage());

				} catch (Exception exception) {

					// show the error message
					getTriangleView().getSideBValidationMessage().setText(
							exception.getMessage());
				}

				// enable or disable the calculate button
				getTriangleView().getCalculateButton().setEnabled(
						enableDisableCalculateMethod());
				getTriangleView().getSumSidesErrorMessage().setText(""); //$NON-NLS-1$
			}
		});

		// side C text change listener
		getTriangleView().getSideCTextfield().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				// get the string
				String sideText = ((JTextField) e.getSource()).getText();

				try {
					// validate the input
					getTriangleModel().validateSingleSide(sideText);

					// if everything is ok, clear the message
					getTriangleView().getSideCValidationMessage().setText(""); //$NON-NLS-1$

				} catch (TriangleException triangleException) {

					// show the error message
					getTriangleView().getSideCValidationMessage().setText(
							triangleException.getMessage());

				} catch (Exception exception) {

					// show the error message
					getTriangleView().getSideCValidationMessage().setText(
							exception.getMessage());
				}

				// enable or disable the calculate button
				getTriangleView().getCalculateButton().setEnabled(
						enableDisableCalculateMethod());
				getTriangleView().getSumSidesErrorMessage().setText(""); //$NON-NLS-1$
			}
		});

	}

	/**
	 * This method checks if all the validations are passed and accordingly
	 * enable or disable the calculate button
	 * 
	 * return boolean true/false depending on error message, if no validation
	 * error message then return true else false
	 */
	private boolean enableDisableCalculateMethod() {

		// get the validation messages
		String validationAmessage = getTriangleView()
				.getSideAValidationMessage().getText();
		String validationBmessage = getTriangleView()
				.getSideBValidationMessage().getText();
		String validationCmessage = getTriangleView()
				.getSideCValidationMessage().getText();

		// check for empty validation messages
		if ("".equals(validationAmessage) && "".equals(validationBmessage) //$NON-NLS-1$ //$NON-NLS-2$
				&& "".equals(validationCmessage)) { //$NON-NLS-1$
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Triangle view instance {@link TriangleView}
	 * 
	 * @return TriangleView
	 */
	private TriangleView getTriangleView() {
		return Triangle1st.getTriangleMain().getTriangleView();
	}

	/**
	 * Triangle Model instance {@link TriangleModel}
	 * 
	 * @return {@link TriangleModel}
	 */
	private TriangleModel getTriangleModel() {
		return Triangle1st.getTriangleMain().getTriangleModel();
	}
}
