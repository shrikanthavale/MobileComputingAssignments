/**
 * 
 */
package at.fhooe.mc.lbcas.component.poicomponent;

import javax.swing.JCheckBox;

/**
 * @author Shrikant Havale
 * 
 */
public class OfficePointOfInterest implements PointOfInterstIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.component.poicomponent.PointOfInterstIF#setPOIDetails
	 * (javax.swing.JCheckBox)
	 */
	@Override
	public void setPOIDetails(JCheckBox _checkBox) {
		_checkBox.setText(Messages.getString("POIComponent.POIOffice"));
		_checkBox.setToolTipText(Messages
				.getString("POIComponent.POIOfficeCode"));

	}

	@Override
	public String getPOIImagePath() {
		return "at/fhooe/mc/lbcas/component/poicomponent/officeicon.jpg";
	}

	@Override
	public int getPointOfInterestCode() {
		return Integer.parseInt(Messages
				.getString("POIComponent.POIOfficeCode"));
	}

}
