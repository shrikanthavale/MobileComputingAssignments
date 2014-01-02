/**
 * 
 */
package at.fhooe.mc.lbcas.component.poicomponent;

import javax.swing.JCheckBox;

/**
 * @author mypersonalpc
 * 
 */
public class HomePointOfInterest implements PointOfInterstIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.component.poicomponent.PointOfInterstIF#setPOIDetails
	 * (javax.swing.JCheckBox)
	 */
	@Override
	public void setPOIDetails(JCheckBox _checkBox) {
		_checkBox.setText("Home");
		_checkBox.setToolTipText(Messages
				.getString("POIComponent.POIRestaurantCode"));
	}

	@Override
	public String getPOIImagePath() {
		return "at/fhooe/mc/lbcas/component/poicomponent/home.jpg";
	}

}
