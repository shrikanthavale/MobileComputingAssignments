package at.fhhagenberg.sqe.exercise8;

import fit.ColumnFixture;

/**
 * This class is model for the application and contains logic for calculating
 * the area and perimeter of triangle based on the values enter in the view.
 * 
 * @author Shrikant Havale - S1310455005 Oct 19, 2014
 * 
 */
public class TriangleFixture extends ColumnFixture {

	/**
	 * side A of the triangle
	 */
	public Integer sideA;

	/**
	 * side B of the triangle
	 */
	public Integer sideB;

	/**
	 * side C of the triangle
	 */
	public Integer sideC;

	/**
	 * single side in string
	 */
	public String side;

	/**
	 * Calculate the area of the triangle.
	 * 
	 * @return area of the triangle
	 * 
	 */
	public double calculateArea() {

		// half the perimeter
		double halfPerimeter = calculatePerimeter() / 2.0;

		// area is given by
		double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
				* (halfPerimeter - sideB) * (halfPerimeter - sideC));

		// return area
		return  Math.floor(area * 100) / 100;
	}

	/**
	 * Calculates the perimeter of the triangle.
	 * 
	 * @return perimeter of the triangle
	 */
	public double calculatePerimeter() {
		// return summation of all 3 sides
		return sideA + sideB + sideC;
	}

	/**
	 * Validates the side of the triangle for following conditions using regular
	 * expression Empty or NULL not allowed Characters, Special Symbols not
	 * allowed Only integer, float, and double values allowed.
	 * 
	 * @return true - if input is valid and and false if input is not valid.
	 * 
	 */
	public boolean validateSingleSide() {

		String regexInteger = "^-?\\d+$"; //$NON-NLS-1$

		//String exponentialFormat = "[+-]?(?=\\d*[.eE])(?=\\.?\\d)\\d*\\.?\\d*(?:[eE][+-]?\\d+)?";

		// check for null or empty side
		if (side == null || side.length() < 1) {
			return false;
		}// check for decimal numbers
		else if (!side.matches(regexInteger)) {
			return false;
		}// check for greater than 0
		else if (Double.parseDouble(side) <= 0) {
			return false;
		}else if(Double.parseDouble(side) > Integer.MAX_VALUE){
			return false;
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
	 */
	public boolean validateSummationRule3Sides() {

		// first check
		if ((sideA <= sideB) && (sideA <= sideC)) {
			if ((sideB <= sideC)) {
				if ((sideA + sideB) <= sideC) {
					return false;
				}
			} else {
				if ((sideA + sideC) <= sideB) {
					return false;
				}
			}
		}// second check
		else if ((sideB <= sideA) && (sideB <= sideC)) {
			if ((sideA <= sideC)) {
				if ((sideB + sideA) <= sideC) {
					return false;
				}
			} else {
				if ((sideB + sideC) <= sideA) {
					return false;
				}
			}
		}// second check
		else if ((sideC <= sideA) && (sideC <= sideB)) {
			if ((sideA <= sideB)) {
				if ((sideC + sideA) <= sideB) {
					return false;
				}
			} else {
				if ((sideC + sideB) <= sideA) {
					return false;
				}
			}
		}

		return true;
	}

}
