/**
 * 
 */
package at.fhooe.mc.lbcas.gis.temperatureimage;

/**
 * @author Shrikant Havale
 * 
 */
public class HotTemperature implements TemperatureImagePathIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.gis.temperatureimage.TemperatureImagePathIF#
	 * getTemperatureImagePath()
	 */
	@Override
	public String getTemperatureImagePath() {
		return "at/fhooe/mc/lbcas/gis/temperatureimage/hotsun.jpg";
	}

}
