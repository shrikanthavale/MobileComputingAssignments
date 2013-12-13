/**
 * 
 */
package at.fhooe.mc.lbcas.component.gis;

import java.util.Observable;

/**
 * @author Shrikant Havale
 * 
 *         This class is observable of which other observers are keeping track.
 *         Class registers different observers and accordingly notifies them
 *         when there is change in GEO objects.
 * 
 */
public class GeoObjectObservable extends Observable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observable#setChanged()
	 */
	@Override
	public synchronized void setChanged() {
		super.setChanged();
	}

}
