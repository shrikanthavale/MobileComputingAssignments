/**
 * 
 */
package at.fhooe.mc.lbcas.server;

import java.awt.Point;
import java.util.List;
import java.util.Vector;

import at.fhooe.mc.lbcas.entities.GeoObject;

/**
 * Interface containing method definition for establishing the connection with
 * server and fetching the GeOObjects based on conditions
 * 
 * @author Shrikant Havale
 * 
 */
public interface GEOServerInterface {

	/**
	 * Method helps in connecting to GEOServer
	 * 
	 * @param _user
	 *            username required to access the server
	 * @param _pass
	 *            password required to access the server
	 * @param _server
	 *            server name
	 * @return true if connection was successful else false
	 */
	public boolean login(String _user, String _pass, String _server);

	/**
	 * This method accepts the array of types and returns the geo objects of
	 * only those types.
	 * 
	 * @param _types
	 *            types like wood river etc
	 * @return {@link Vector} {@link GeoObject} vectors of GEO Objects
	 */
	public Vector<GeoObject> typeQuery(List<Integer> _typeList);

	/**
	 * This loads all the GEO Objects from the layers mentioned inside the
	 * method.
	 * 
	 * @return {@link Vector}{@link GeoObject} vector of geo objects from the
	 *         layers specified inside method
	 */
	public Vector<GeoObject> loadData();

	public Vector<GeoObject> clearPOIS();

	public Vector<GeoObject> typeQuery(List<Integer> _typeList,
			List<Point> _gpsCoordinates, String _imagePath);

}
