/**
 * 
 */
package at.fhhagenberg.sqe.exercise3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import at.fhhagenberg.sqe.exercise3.model.Messages;
import at.fhhagenberg.sqe.exercise3.model.Triangle;
import at.fhhagenberg.sqe.exercise3.utility.TriangleException;

/**
 * This class writes the JUnit test for the {@link Triangle} model. It is
 * responsible for testing validation methods and calculating area and perimeter
 * methods for a Triangle.
 * 
 * @author Shrikant Havale - S1310455005 Oct 24, 2014
 * 
 */
public class TriangleTest {

	/**
	 * Triangle varaiable to be tested
	 */
	private Triangle triangle;

	/**
	 * For getting expected exception
	 */
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		triangle = null;
	}

	/**
	 * This method tests the validate side method of Triangle for empty input .
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideEmpty() throws TriangleException,
			Exception {

		// 1. Test for blank side input
		// what exception is expected
		expectedException.expect(TriangleException.class);
		expectedException.expectMessage(Messages
				.getString("Triangle.cannotbeblankmessage"));
		triangle.validateSingleSide("");

	}

	/**
	 * This method tests the validate side method of Triangle for null input.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideNull() throws TriangleException,
			Exception {

		// 1. Test for null side input
		// what exception is expected
		expectedException.expect(TriangleException.class);
		expectedException.expectMessage(Messages
				.getString("Triangle.cannotbeblankmessage"));
		triangle.validateSingleSide(null);

	}

	/**
	 * This method tests the validate side method of Triangle for spaces input.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideSpaces() throws TriangleException,
			Exception {

		// 1. Test for blank spaces side input
		// what exception is expected
		expectedException.expect(TriangleException.class);
		expectedException.expectMessage(Messages
				.getString("Triangle.invalidinputmessage"));
		triangle.validateSingleSide("                ");

	}

	/**
	 * This method tests the validate side method of Triangle for characters
	 * input.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideCharacters()
			throws TriangleException, Exception {

		// 1. Test for characters side input
		// what exception is expected
		expectedException.expect(TriangleException.class);
		expectedException.expectMessage(Messages
				.getString("Triangle.invalidinputmessage"));
		triangle.validateSingleSide("AABBCC");

	}

	/**
	 * This method tests the validate side method of Triangle for special symbol
	 * input.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideSpecialSymbol()
			throws TriangleException, Exception {

		// 1. Test for special symbol side input
		// what exception is expected
		expectedException.expect(TriangleException.class);
		expectedException.expectMessage(Messages
				.getString("Triangle.invalidinputmessage"));
		triangle.validateSingleSide("$$%%^^");

	}

	/**
	 * This method tests the validate side method of Triangle for side length
	 * greater than 0.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideLengthGreaterThan0()
			throws TriangleException, Exception {

		// 1. Test for number less than zero as side input
		// what exception is expected
		expectedException.expect(TriangleException.class);
		expectedException.expectMessage(Messages
				.getString("Triangle.greaterthan0message"));
		triangle.validateSingleSide("-100");

	}

	/**
	 * This method tests the validate side method of Triangle for all the
	 * possible numbers which are acceptable as length of side.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSingleSide(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 *             in general any exception
	 * @throws TriangleException
	 *             Exception specific to triangle side properties
	 * 
	 */
	@Test
	public final void testValidateSingleSideAcceptableNumbers()
			throws TriangleException, Exception {

		// 1. Test for valid side input
		Assert.assertTrue(triangle.validateSingleSide("10"));

		// 2. Test for valid side input
		Assert.assertTrue(triangle.validateSingleSide("10.0"));

		// 3. Test for valid side input
		Assert.assertTrue(triangle.validateSingleSide("10.0E2"));

		// 4. Test for valid side input
		Assert.assertTrue(triangle.validateSingleSide("0.98E2"));

		// 5. Test for valid side input
		Assert.assertTrue(triangle.validateSingleSide("0.987756"));

	}

	/**
	 * This method tests if summation of two smallest side is larger than third
	 * side , creates test cases for these scenarios.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#validateSummationRule3Sides(double, double, double)}
	 * .
	 */
	@Test
	public final void testValidateSummationRule3Sides() {

		// local variable to keep track of exception
		boolean exceptionOccurred = false;

		try {
			triangle.validateSummationRule3Sides(1.0, 2.0, 3.0);
		} catch (TriangleException e) {
			// for invalid result exception occurred, set the assertion flag
			exceptionOccurred = true;
			Assert.assertEquals("Summation Rule Failed", Messages
					.getString("Triangle.sideAsideBgreaterthanSideCmessage"), e
					.getMessage());
		} catch (Exception e) {
			// nothing to do here
		}

		// assertion
		Assert.assertTrue(exceptionOccurred);

		// reset the flag
		exceptionOccurred = false;

		try {
			triangle.validateSummationRule3Sides(3.0, 2.0, 1.0);
		} catch (TriangleException e) {
			// for invalid result exception occurred, set the assertion flag
			exceptionOccurred = true;
			Assert.assertEquals("Summation Rule Failed", Messages
					.getString("Triangle.sideBsideCgreaterthanSideAmessage"), e
					.getMessage());
		} catch (Exception e) {
			// nothing to do here
		}

		// assertion
		Assert.assertTrue(exceptionOccurred);

		// reset the flag
		exceptionOccurred = false;

		try {
			triangle.validateSummationRule3Sides(1.0, 3.0, 2.0);
		} catch (TriangleException e) {
			// for invalid result exception occurred, set the assertion flag
			exceptionOccurred = true;
			Assert.assertEquals("Summation Rule Failed", Messages
					.getString("Triangle.sideAsideCgreaterthanSideBmessage"), e
					.getMessage());
		} catch (Exception e) {
			// nothing to do here
		}

		// assertion
		Assert.assertTrue(exceptionOccurred);

		// reset the flag
		exceptionOccurred = false;

	}

	/**
	 * This methods tests the if the area of triangle is calculated correctly
	 * for the given sides of the triangle.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#calculateArea(double, double, double)}
	 * .
	 */
	@Test
	public final void testCalculateArea() {
		
		//1.a Assume a right angled triangle for
		Assert.assertEquals(6.0, triangle.calculateArea(3.0, 4.0, 5.0), 0.0001);
		
		//1.b Area of triangle till 4 decimal places
		Assert.assertEquals(4.2508, Double.parseDouble(String.format("%.5g%n", triangle.calculateArea(2.98676324, 3.4569874, 3.0253489))), 0.0001);
	}

	/**
	 * This methods tests the if the perimeter of triangle is calculated correctly
	 * for the given sides of the triangle.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#calculatePerimeter(double, double, double)}
	 * .
	 */
	@Test
	public final void testCalculatePerimeter() {
		
		//1.a Assume a right angled triangle for
		Assert.assertEquals(12.0, triangle.calculatePerimeter(3.0, 4.0, 5.0), 0.0001);
		
		//1.b Area of triangle till 4 decimal places
		Assert.assertEquals(9.4691, Double.parseDouble(String.format("%.5g%n", triangle.calculatePerimeter(2.98676324, 3.4569874, 3.0253489))), 0.0001);
	}

}
