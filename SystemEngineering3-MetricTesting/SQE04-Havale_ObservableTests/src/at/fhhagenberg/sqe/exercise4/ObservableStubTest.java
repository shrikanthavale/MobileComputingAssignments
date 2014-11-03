/**
 * 
 */
package at.fhhagenberg.sqe.exercise4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author S1310455005 - Shrikant Havale
 * Nov 3, 2014
 * 
 */
public class ObservableStubTest {

	/**
	 * observable
	 */
	private MyObservable myObservable;
	
	/**
	 * observer
	 */
	private DummyObserver dummyObserver;

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
		
		// observer
		dummyObserver = new DummyObserver();
		
		// register 
		myObservable.addObserver(dummyObserver);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testNotifyObservers() {

		// 1. Making sure that only one observer is registered
		Assert.assertEquals(1, myObservable.countObservers());
		
		//2. Making sure initial counter for how many times method is called in observer is 0
		Assert.assertEquals(0, dummyObserver.getNotificationMethodCounter());
		
		// changing the observable
		myObservable.setChanged();
		
		// notifying the observer
		myObservable.notifyObservers("shrikant");
		
		//3. As only one observer is registered, and no other way counter can be modified, counter should be 1 now
		Assert.assertEquals(1, dummyObserver.getNotificationMethodCounter());
	}

}
