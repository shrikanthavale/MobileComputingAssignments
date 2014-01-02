/**
 * 
 */
package at.fhooe.mc.lbcas.gis.temperatureimage;

/**
 * @author mypersonalpc
 * 
 */
public class SnowTemperature implements TemperatureImagePathIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.gis.temperatureimage.TemperatureImagePathIF#
	 * getTemperatureImagePath()
	 */
	@Override
	public String getTemperatureImagePath() {
		return "at/fhooe/mc/lbcas/gis/temperatureimage/snow.jpg";
	}

}
