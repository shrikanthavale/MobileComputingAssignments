package at.fhooe.mc.lbcas.server;

import java.awt.Polygon;
import java.util.Vector;

import de.intergis.JavaClient.comm.CgConnection;
import de.intergis.JavaClient.comm.CgGeoConnection;
import de.intergis.JavaClient.comm.CgGeoInterface;
import de.intergis.JavaClient.comm.CgIGeoObject;
import de.intergis.JavaClient.comm.CgIGeoPart;
import de.intergis.JavaClient.comm.CgResultSet;
import de.intergis.JavaClient.comm.CgStatement;
import de.intergis.JavaClient.gui.IgcConnection;

/**
 * Class to access the DummyGIS GEO data server
 */

public class DummyGIS {

	// the connection object to the GEO data server
	CgGeoConnection m_geoConnection = null;

	// the query interface to the GEO data server
	CgGeoInterface m_geoInterface = null;

	/**
	 * Default Empty constructor
	 */
	public DummyGIS() {
	}

	public boolean init() {
		try {
			// Initialized server connection
			m_geoConnection = new IgcConnection(new CgConnection("admin",
					"admin", "T:localhost:4949", null));

			// receive query interface from server
			m_geoInterface = m_geoConnection.getInterface();

			// return boolean true on successful connection
			return true;

		} catch (Exception _e) {
			// print the stack trace
			_e.printStackTrace();
		}

		// in case of connection exception return false
		return false;
	}

	/**
	 * extract geo data objects from the server
	 */
	protected Vector<Polygon> extractData(String _stmt) {
		try {
			CgStatement stmt = m_geoInterface.Execute(_stmt);
			CgResultSet cursor = stmt.getCursor();
			Vector<Polygon> objectContainer = new Vector<Polygon>();
			while (cursor.next()) {
				// cursor to the result set
				CgIGeoObject obj = cursor.getObject();
				// extract object name
				System.out.println("NAME --> " + obj.getName());
				// extract object category, resp. type (water, wood, ...)
				System.out.println("TYPE --> " + obj.getCategory());
				// extract object parts (in case a multi polygon is present)
				CgIGeoPart[] parts = obj.getParts();
				for (int i = 0; i < parts.length; i++) {
					System.out.println("PART " + i);
					// number of points inside this part of the geo object
					// geometry
					int pointCount = parts[i].getPointCount();
					// receive the x coordinate parts
					int[] xArray = parts[i].getX();
					// receive the y coordinate parts
					int[] yArray = parts[i].getY();
					// construct a corresponding polygon (no real multi polygons
					// are expected)
					Polygon poly = new Polygon(xArray, yArray, pointCount);
					for (int j = 0; j < pointCount; j++) {
						System.out.println("[" + xArray[j] + " ; " + yArray[j]
								+ "]");
					} // for j
					objectContainer.addElement(poly);
				} // for i
				System.out.println();
			} // while cursor
			return objectContainer;
		} catch (Exception _e) {
			_e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unused")
	public static void main(String[] _argv) {
		DummyGIS server = new DummyGIS();
		if (server.init()) {
			Vector<Polygon> objects = server
					.extractData("select * from data where type = 1101");
		}
	}
}
