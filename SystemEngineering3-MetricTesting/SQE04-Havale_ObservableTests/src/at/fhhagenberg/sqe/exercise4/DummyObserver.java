/**
 * 
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observable;
import java.util.Observer;

/**
 * @author S1310455005 - Shrikant Havale
 * Nov 3, 2014
 * 
 */
public class DummyObserver implements Observer {
	
	/**
	 * counter how many times method is called
	 */
	private int notificationMethodCounter = 0;
	

	/**
	 * check if same object is received
	 */
	private Object objectReference = null;
	
	
	/**
	 * default constructor
	 */
	public DummyObserver() {
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		
		// update method should be called only once
		notificationMethodCounter++;
		
		// assign the captured object
		objectReference = arg;

	}

	/**
	 * @return the notificationMethodCounter
	 */
	public int getNotificationMethodCounter() {
		return notificationMethodCounter;
	}

	/**
	 * @return the objectReference
	 */
	public Object getObjectReference() {
		return objectReference;
	}
	
}
