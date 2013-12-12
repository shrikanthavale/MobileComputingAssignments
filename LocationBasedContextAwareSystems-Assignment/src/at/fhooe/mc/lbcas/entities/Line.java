package at.fhooe.mc.lbcas.entities;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import at.fhooe.mc.lbcas.geo.GeoTransformationMatrix;

/**
 * @author Shrikant Havale
 * 
 *         This class represents the line object which contains the list of x
 *         and y points to be added.
 */
public class Line implements Serializable {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 4521856339948207518L;

	// variable for storing x coordinates of the line
	private List<Integer> m_xCoordinate = new ArrayList<>();

	// variable for storing y coordinates of the line
	private List<Integer> m_yCoordinate = new ArrayList<>();

	// variable for storing point, combined
	private List<Point> m_listPoints = new ArrayList<>();

	/**
	 * Add the list of points making the line
	 * 
	 * @param _xCoordinate
	 *            - x coordinate of the line
	 * @param _yCoordiante
	 *            - y coordinate of the line
	 */
	public void addPoints(int _xCoordinate, int _yCoordiante) {
		m_xCoordinate.add(_xCoordinate);
		m_yCoordinate.add(_yCoordiante);
		m_listPoints.add(new Point(_xCoordinate, _yCoordiante));
	}

	/**
	 * Returns boolean value depending upon point contained in the line
	 * 
	 * @param _point
	 *            accepts the point represented in x and y coordinate
	 * @return boolean true if point is present in the line, false if point is
	 *         not present
	 */
	public boolean contains(Point _point) {
		return m_xCoordinate.contains(_point.x)
				&& m_yCoordinate.contains(_point.y);
	}

	/**
	 * Utility method to convert {@link List{@link Integer} to array of
	 * integers
	 * 
	 * @param _listIntegers
	 *            accepts the integer lists
	 * @return int[] returns the array containing integers
	 */

	public static int[] convertIntegerListArray(List<Integer> _listIntegers) {

		// initialize array of integers
		int[] arrayIntegers = new int[_listIntegers.size()];

		// array count
		int arrayCount = 0;

		// iterate through
		for (Integer tempInteger : _listIntegers) {
			arrayIntegers[arrayCount] = tempInteger;
			arrayCount++;
		}

		// return the final array
		return arrayIntegers;
	}

	/**
	 * Convert the point and multiply to suit the coordinates as per the map.
	 * Internally it uses multiply method of {@link GeoTransformationMatrix}
	 * 
	 * @param _matrix
	 * 
	 */
	public void convertPointAndMultiply(GeoTransformationMatrix _matrix) {

		// list for storing multiplied cooordinates
		List<Point> listMultipliedPoints = new ArrayList<>();

		// iterate through list of points
		for (Point temPoint : m_listPoints) {

			// get the multiplied points
			Point multipliedPoint = _matrix.multiply(temPoint);
			listMultipliedPoints.add(multipliedPoint);
		}

		this.getM_xCoordinate().clear();
		this.getM_yCoordinate().clear();

		// create list with new multiplied points
		for (Point temPoint : listMultipliedPoints) {
			this.getM_xCoordinate().add(temPoint.x);
			this.getM_yCoordinate().add(temPoint.y);
		}

	}

	/**
	 * @return the m_xCoordinate
	 */
	public List<Integer> getM_xCoordinate() {
		return m_xCoordinate;
	}

	/**
	 * @param m_xCoordinate
	 *            the m_xCoordinate to set
	 */
	public void setM_xCoordinate(List<Integer> m_xCoordinate) {
		this.m_xCoordinate = m_xCoordinate;
	}

	/**
	 * @return the m_yCoordinate
	 */
	public List<Integer> getM_yCoordinate() {
		return m_yCoordinate;
	}

	/**
	 * @param m_yCoordinate
	 *            the m_yCoordinate to set
	 */
	public void setM_yCoordinate(List<Integer> m_yCoordinate) {
		this.m_yCoordinate = m_yCoordinate;
	}

	/**
	 * @return the m_listPoints
	 */
	public List<Point> getM_listPoints() {
		return m_listPoints;
	}

	/**
	 * @param m_listPoints
	 *            the m_listPoints to set
	 */
	public void setM_listPoints(List<Point> m_listPoints) {
		this.m_listPoints = m_listPoints;
	}

}
