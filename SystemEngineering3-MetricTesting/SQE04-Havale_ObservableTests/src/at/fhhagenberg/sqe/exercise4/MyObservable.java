/**
 * 
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observable;

/**
 * 
 * @author S1310455005 - Shrikant Havale
 * Nov 3, 2014
 * 
 */
public class MyObservable extends Observable {

	/**
	 * default constructor
	 */
	public MyObservable() {
	}
	
	@Override
	public synchronized void setChanged() {
		super.setChanged();
	}

}
