/**
 * 
 */
package at.fhooe.mc.lbcas.component.poicomponent;

import javax.swing.JCheckBox;

/**
 * This interface should be implemented by different Point of interests. Based
 * on the required POI, say example restaurant , method should be override to
 * update the check box code and label
 * 
 * @author Shrikant Havale
 * 
 */
public interface PointOfInterstIF {

	/**
	 * This method will set the POI label and its code as per the context
	 * changes. For Restaurant label and code will be different and so on
	 * 
	 * @param _checkBox
	 *            checkbox whose label and code is to be updated
	 */
	public void setPOIDetails(JCheckBox _checkBox);

	/**
	 * This method returns the image of the restaurant, home or office based on
	 * the POI selected
	 * 
	 * @return path of the image
	 */
	public String getPOIImagePath();

	/**
	 * Returns the code about the point of interest , so that it can be searched
	 * in the GEO server for its location
	 * 
	 * @return code to be searched
	 */
	public int getPointOfInterestCode();

}
