package at.fhhagenberg.sqe.exercise3.model;

import at.fhhagenberg.sqe.exercise3.utility.TriangleException;

/**
 * This class is model for the application and contains logic for calculating
 * the area and perimeter of triangle based on the values enter in the view.
 * 
 * @author Shrikant Havale - S1310455005 Oct 19, 2014
 * 
 */
public class Triangle {

	/**
	 * Calculate the area of the triangle.
	 * 
	 * @param sideA
	 *            - one of the side length of the triangle
	 * @param sideB
	 *            - one of the side length of the triangle
	 * @param sideC
	 *            - one of the side length of the triangle
	 * @return area of the triangle
	 * 
	 */
	public double calculateArea(double sideA, double sideB, double sideC) {

		// half the perimeter
		double halfPerimeter = calculatePerimeter(sideA, sideB, sideC) / 2.0;

		// area is given by
		double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
				* (halfPerimeter - sideB) * (halfPerimeter - sideC));

		// return area
		return area;
	}

	/**
	 * Calculates the perimeter of the triangle.
	 * 
	 * @param sideA
	 *            - one of the side length of the triangle
	 * @param sideB
	 *            - one of the side length of the triangle
	 * @param sideC
	 *            - one of the side length of the triangle
	 * @return perimeter of the triangle
	 */
	public double calculatePerimeter(double sideA, double sideB, double sideC) {
		// return summation of all 3 sides
		return sideA + sideB + sideC;
	}

	/**
	 * Validates the side of the triangle for following conditions using regular
	 * expression Empty or NULL not allowed Characters, Special Symbols not
	 * allowed Only integer, float, and double values allowed.
	 * 
	 * @param side
	 *            side of triangle to be validated
	 * @return true - if input is valid and no exception is thrown.
	 * @throws TriangleException
	 *             throws exception for invalid inputs
	 * 
	 */
	public boolean validateSingleSide(String side) throws TriangleException,
			Exception {

		String regexInteger = "^-?\\d+$"; //$NON-NLS-1$

		String exponentialFormat = "[+-]?(?=\\d*[.eE])(?=\\.?\\d)\\d*\\.?\\d*(?:[eE][+-]?\\d+)?";

		try {
			// check for null or empty side
			if (side == null || side.length() < 1) {
				throw new TriangleException(
						Messages.getString("Triangle.cannotbeblankmessage")); //$NON-NLS-1$

			}// check for decimal numbers
			else if (!side.matches(exponentialFormat + "|" + regexInteger)) {
				throw new TriangleException(
						Messages.getString("Triangle.invalidinputmessage")); //$NON-NLS-1$

			}// check for greater than 0
			else if (Double.parseDouble(side) <= 0.0) {
				throw new TriangleException(
						Messages.getString("Triangle.greaterthan0message")); //$NON-NLS-1$
			}
		} catch (TriangleException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return true;

	}

	/**
	 * Validates the basic property of constructing triangle. Sum of two
	 * smallest sides of triangle should be always greater than third side.
	 * 
	 * if this condition is not satisfied triangle cannot be constructed and
	 * thus perimeter or area cannot be calculated.
	 * 
	 * @param sideA
	 *            - one of the side length of the triangle
	 * @param sideB
	 *            - one of the side length of the triangle
	 * @param sideC
	 *            - one of the side length of the triangle
	 * @throws TriangleException
	 *             , Exception
	 */
	public void validateSummationRule3Sides(double sideA, double sideB,
			double sideC) throws TriangleException, Exception {

		try {
			// first check
			if ((sideA <= sideB) && (sideA <= sideC)) {
				if ((sideB <= sideC)) {
					if ((sideA + sideB) <= sideC) {
						throw new TriangleException(
								Messages.getString("Triangle.sideAsideBgreaterthanSideCmessage")); //$NON-NLS-1$
					}
				} else {
					if ((sideA + sideC) <= sideB) {
						throw new TriangleException(
								Messages.getString("Triangle.sideAsideCgreaterthanSideBmessage")); //$NON-NLS-1$
					}
				}
			}// second check
			else if ((sideB <= sideA) && (sideB <= sideC)) {
				if ((sideA <= sideC)) {
					if ((sideB + sideA) <= sideC) {
						throw new TriangleException(
								Messages.getString("Triangle.sideAsideBgreaterthanSideCmessage")); //$NON-NLS-1$
					}
				} else {
					if ((sideB + sideC) <= sideA) {
						throw new TriangleException(
								Messages.getString("Triangle.sideBsideCgreaterthanSideAmessage")); //$NON-NLS-1$
					}
				}
			}// second check
			else if ((sideC <= sideA) && (sideC <= sideB)) {
				if ((sideA <= sideB)) {
					if ((sideC + sideA) <= sideB) {
						throw new TriangleException(
								Messages.getString("Triangle.sideAsideCgreaterthanSideBmessage")); //$NON-NLS-1$
					}
				} else {
					if ((sideC + sideB) <= sideA) {
						throw new TriangleException(
								Messages.getString("Triangle.sideBsideCgreaterthanSideAmessage")); //$NON-NLS-1$
					}
				}
			}
		} catch (TriangleException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
