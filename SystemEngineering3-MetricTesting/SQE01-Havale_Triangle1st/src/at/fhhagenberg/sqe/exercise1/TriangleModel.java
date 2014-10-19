/**
 * 
 */
package at.fhhagenberg.sqe.exercise1;


/**
 * This class is model for the application and contains logic for calculating the area and perimeter 
 * of triangle based on the values enter in the view.
 * 
 * @author Shrikant Havale - S1310455005
 * Oct 19, 2014
 * 
 */
public class TriangleModel {


	/**
	 * Calculate the area of the triangle.
	 * 
	 * @param sideA - one of the side length of the triangle
	 * @param sideB - one of the side length of the triangle
	 * @param sideC - one of the side length of the triangle
	 * @return area of the triangle
	 * 
	 */
	public double calculateArea(double sideA, double sideB, double sideC){
		
		// half the perimeter
		double halfPerimeter = calculatePerimeter(sideA, sideB, sideC) / 2.0;
		
		// area is given by
		double area = Math.sqrt(halfPerimeter * (halfPerimeter  - sideA )  
											  *	(halfPerimeter - sideB )  
											  *	(halfPerimeter - sideC ));
		
		// return area 
		return area;
		
	}
	
	/**
	 * Calculates the perimeter of the triangle.
	 * 
	 * @param sideA - one of the side length of the triangle
	 * @param sideB - one of the side length of the triangle
	 * @param sideC - one of the side length of the triangle
	 * @return perimeter of the triangle
	 */
	public double calculatePerimeter(double sideA, double sideB, double sideC){
		// return summation of all 3 sides
		return sideA + sideB + sideC;
	}
	
	
	public void validateSingleSide(String side) throws TriangleException{
		
		String regexDecimal = "^-?\\d*\\.\\d+$";
		
		String regexInteger = "^-?\\d+$";
		
		String regexDouble = regexDecimal + "|" + regexInteger;
		
		// check for null or empty side
		if(side == null || side.length() < 1){
			throw new TriangleException("Cannot be blank");
			
		}// check for decimal numbers
		else if(!side.matches(regexDouble)){
			throw new TriangleException("Invalid Input");
			
		}
		
	}
	
	public void validateInput(double sideA, double sideB, double sideC){
		
		
	}
}
