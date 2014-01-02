/**
 * 
 */
package at.fhooe.mc.lbcas.gis.drawingcontext;

import java.awt.Graphics;

import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.geo.GeoTransformationMatrix;

/**
 * @author mypersonalpc
 * 
 */
public interface DrawingContextIF {

	public void drawObject(GeoObject _obj, Graphics _g,
			GeoTransformationMatrix _matrix);
}
