/**
 * 
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observable;
import java.util.Observer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author S1310455005 - Shrikant Havale
 * Nov 4, 2014
 * 
 */
public class ObservableShuntTest implements Observer{
	
	/**
	 * observable
	 */
	private MyObservable myObservable;
	
	/**
	 * check if same object is received
	 */
	private Object objectReference = null;
	
	/**
	 * counter how many times method is called
	 */
	private int notificationMethodCounter = 0;
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		// observable
		myObservable = new MyObservable();
		
		// register 
		myObservable.addObserver(this);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public final void testNotifyObservers() {
		
		// create a object, to check if same object is received or not
		Object referenceObject = new Object();
		
		// 1. Making sure that only one observer is registered
		Assert.assertEquals(1, myObservable.countObservers());
		
		//2. Making sure initial counter for how many times method is called in observer is 0
		Assert.assertEquals(0, this.getNotificationMethodCounter());
		
		// changing the observable
		myObservable.setChanged();
		
		// notifying the observer
		myObservable.notifyObservers(referenceObject);
		
		//3. As only one observer is registered, and no other way counter can be modified, counter should be 1 now
		Assert.assertEquals(1, this.getNotificationMethodCounter());
		
		//4 Check if object being passed from here is captured there
		Assert.assertEquals(referenceObject, this.getObjectReference());
	}

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
