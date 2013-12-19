package at.fhooe.mc.lbcas.gis.drawingcontext;

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
public class DayDrawingContext implements DrawingContextIF {

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
	@Override
	public void drawObject(GeoObject _obj, Graphics _g,
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
				_obj.paint(_g, _matrix, Color.LIGHT_GRAY, new Color(238, 250,
						238));
			}
				break;
			// this case is used for drawing image of POI objects
			case 666: {
				_obj.paint(_g, _matrix, null, null);
			}
				break;
			case 931: {
				_obj.paint(_g, _matrix, Color.LIGHT_GRAY, new Color(240, 199,
						209));
			}
				break;
			case 932: {
				_obj.paint(_g, _matrix, new Color(240, 199, 209), new Color(
						225, 153, 120));
			}
				break;
			case 933: {
				_obj.paint(_g, _matrix, Color.LIGHT_GRAY, null);
			}
				break;
			case 934: {
				_obj.paint(_g, _matrix, Color.LIGHT_GRAY, null);
			}
				break;
			case 1101: {
				_obj.paint(_g, _matrix, new Color(202, 230, 177), new Color(
						177, 230, 216));
			}
				break;
			case 4310:
			case 4330:
			case 4335: {
				_obj.paint(_g, _matrix, new Color(193, 196, 231), new Color(
						193, 196, 231));
			}
				break;
			case 7110:
			case 3110: {
				_obj.paint(_g, _matrix, new Color(255, 127, 127), new Color(
						255, 127, 127));
			}
				break;
			case 7120:
			case 7170: {
				_obj.paint(_g, _matrix, new Color(202, 230, 177), new Color(
						202, 230, 177));
			}
				break;
			case 7180: {
				_obj.paint(_g, _matrix, Color.GRAY, Color.GRAY);
			}
				break;
			case 4210: {
				_obj.paint(_g, _matrix, new Color(241, 243, 170), new Color(
						241, 243, 170));
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
				_obj.paint(_g, _matrix, new Color(177, 230, 216), new Color(
						177, 230, 216));
			}
				break;
			case 1111: {
				_obj.paint(_g, _matrix, Color.LIGHT_GRAY, null);
			}
				break;
			default: {
				_obj.paint(_g, _matrix, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
			}
			} // switch
		}
	}
}