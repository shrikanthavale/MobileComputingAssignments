/**
 * 
 */
package at.fhhagenberg.sqe.exercise1;

/**
 * This class is model for the application and contains logic for calculating
 * the area and perimeter of triangle based on the values enter in the view.
 * 
 * @author Shrikant Havale - S1310455005 Oct 19, 2014
 * 
 */
public class TriangleModel {

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
	 * @throws TriangleException
	 *             throws exception for invalid inputs
	 */
	public void validateSingleSide(String side) throws TriangleException,
			Exception {

		String regexDecimal = Messages.getString("TriangleModel.floatregularexpression"); //$NON-NLS-1$

		String regexInteger = Messages.getString("TriangleModel.integerregularexpression"); //$NON-NLS-1$

		String regexDouble = regexDecimal + "|" + regexInteger; //$NON-NLS-1$

		try {
			// check for null or empty side
			if (side == null || side.length() < 1) {
				throw new TriangleException(Messages.getString("TriangleModel.emptyerrormessage")); //$NON-NLS-1$

			}// check for decimal numbers
			else if (!side.matches(regexDouble)) {
				throw new TriangleException(Messages.getString("TriangleModel.invalidinputerrormessage")); //$NON-NLS-1$

			}// check for greater than 0
			else if (Double.parseDouble(side) <= 0.0) {
				throw new TriangleException(Messages.getString("TriangleModel.greaterthan0errormessage")); //$NON-NLS-1$
			}
		} catch (TriangleException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

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
								Messages.getString("TriangleModel.sumsideAsideBgreaterthanC")); //$NON-NLS-1$
					}
				} else {
					if ((sideA + sideC) <= sideB) {
						throw new TriangleException(
								Messages.getString("TriangleModel.sumsideAsideCgreaterthanB")); //$NON-NLS-1$
					}
				}
			}// second check
			else if ((sideB <= sideA) && (sideB <= sideC)) {
				if ((sideA <= sideC)) {
					if ((sideB + sideA) <= sideC) {
						throw new TriangleException(
								Messages.getString("TriangleModel.sumsideAsideBgreaterthanC")); //$NON-NLS-1$
					}
				} else {
					if ((sideB + sideC) <= sideA) {
						throw new TriangleException(
								Messages.getString("TriangleModel.sumsideBsideCgreaterthanA")); //$NON-NLS-1$
					}
				}
			}// second check
			else if ((sideC <= sideA) && (sideC <= sideB)) {
				if ((sideA <= sideB)) {
					if ((sideC + sideA) <= sideB) {
						throw new TriangleException(
								Messages.getString("TriangleModel.sumsideAsideCgreaterthanB")); //$NON-NLS-1$
					}
				} else {
					if ((sideC + sideB) <= sideA) {
						throw new TriangleException(
								Messages.getString("TriangleModel.sumsideBsideCgreaterthanA")); //$NON-NLS-1$
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
