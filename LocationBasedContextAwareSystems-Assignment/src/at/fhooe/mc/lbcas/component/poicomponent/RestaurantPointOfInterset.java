/**
 * 
 */
package at.fhooe.mc.lbcas.component.poicomponent;

import javax.swing.JCheckBox;

/**
 * @author Shrikant Havale
 * 
 */
public class RestaurantPointOfInterset implements PointOfInterstIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.component.poicomponent.PointOfInterstIF#setPOIDetails()
	 */
	@Override
	public void setPOIDetails(JCheckBox _checkBox) {

		_checkBox.setText("Restaurant");
		_checkBox.setToolTipText(Messages
				.getString("POIComponent.POIRestaurantCode"));
	}

	@Override
	public String getPOIImagePath() {
		return "at/fhooe/mc/lbcas/component/poicomponent/restaurant.jpg";
	}
}
