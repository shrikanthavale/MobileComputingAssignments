/**
 * 
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observable;

/**
 * This class is just created , so that observable set change method can be called.
 * As the method is protected, a class needs to be created extending {@link Observable}
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
