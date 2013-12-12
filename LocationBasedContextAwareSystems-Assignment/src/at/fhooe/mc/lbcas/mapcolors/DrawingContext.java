package at.fhooe.mc.lbcas.mapcolors;

import java.awt.Color;
import java.awt.Graphics;

import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.geo.GeoTransformationMatrix;

/**
 * This class is responsible for setting the appropriate colors depending upon
 * GEO Object type and calling the paint method for actual drawing of object
 * 
 * @author Shrikant Havale
 * 
 */
public class DrawingContext {

	/**
	 * Set the color values for the GEO objects based on their type rivers -->
	 * blue woods --> green ... --> ...
	 * 
	 * @param _obj
	 *            GeoObject to be drawn
	 * @param _g
	 *            Graphics object to set the color and draw
	 * @param _matrix
	 *            matrix for adjusting coordinates of polygons and lines and
	 *            points
	 */
	public static void drawObject(GeoObject _obj, Graphics _g,
			GeoTransformationMatrix _matrix) {

		// check for the null
		if (_obj != null && _g != null && _matrix != null) {

			// object type check
			switch (_obj.getM_type()) {

			case 1112: {
				_obj.paint(_g, _matrix, new Color(255, 127, 127), new Color(
						211, 255, 190));
			}
				break;
			case 233: {
				_obj.paint(_g, _matrix, Color.BLACK, Color.WHITE);
			}
				break;
			// this case is used for drawing image of POI objects
			case 666: {
				_obj.paint(_g, _matrix, null, null);
			}
				break;
			case 931: {
				_obj.paint(_g, _matrix, Color.BLACK, Color.RED);
			}
				break;
			case 932: {
				_obj.paint(_g, _matrix, Color.RED, Color.ORANGE);
			}
				break;
			case 933: {
				_obj.paint(_g, _matrix, Color.BLACK, null);
			}
				break;
			case 934: {
				_obj.paint(_g, _matrix, Color.BLACK, null);
			}
				break;
			case 1101: {
				_obj.paint(_g, _matrix, Color.GREEN, Color.MAGENTA);
			}
				break;
			case 4310:
			case 4330:
			case 4335: {
				_obj.paint(_g, _matrix, Color.BLUE, Color.BLUE);
			}
				break;
			case 7110:
			case 3110: {
				_obj.paint(_g, _matrix, Color.RED, Color.RED);
			}
				break;
			case 7120:
			case 7170: {
				_obj.paint(_g, _matrix, Color.GREEN, Color.GREEN);
			}
				break;
			case 7180: {
				_obj.paint(_g, _matrix, Color.DARK_GRAY, Color.DARK_GRAY);
			}
				break;
			case 4210: {
				_obj.paint(_g, _matrix, Color.YELLOW, Color.YELLOW);
			}
				break;
			case 7314:
			case 7366:
			case 7321:
			case 7315:
			case 7397:
			case 7380:
			case 7324:
			case 7367:
			case 7311:
			case 7313:
			case 7369:
			case 7317:
			case 7342:
			case 7326:
			case 7322:
			case 7339:
			case 7310:
			case 7349:
			case 7337:
			case 7318:
			case 7319:
			case 7360:
			case 7395:
			case 7373:
			case 7316:
			case 7385:
			case 7312:
			case 7374:
			case 7383:
			case 7377:
			case 7320:
			case 7352:
			case 7341:
			case 7356:
			case 7365:
			case 9999: {
				_obj.paint(_g, _matrix, Color.MAGENTA, Color.MAGENTA);
			}
				break;
			case 1111: {
				_obj.paint(_g, _matrix, Color.BLACK, null);
			}
				break;
			default: {
				_obj.paint(_g, _matrix, Color.BLACK, Color.BLACK);
			}
			} // switch
		}
	}
}