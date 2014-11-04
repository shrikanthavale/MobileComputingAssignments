/**
 * 
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observer;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author S1310455005 - Shrikant Havale
 * Nov 4, 2014
 * 
 */
public class ObservableMockTest {
	
	/**
	 * mock the observer
	 */
	private Observer mockObserver;
	
	/**
	 * observable
	 */
	private MyObservable myObservable;

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
		mockObserver = EasyMock.createMock(Observer.class);
		myObservable = new MyObservable();
		myObservable.addObserver(mockObserver);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testNotifyObservers() {
		// explain the behavior of what should happen
		mockObserver.update(myObservable, "Shrikant");
		
		// make sure that it is called only once
		EasyMock.expectLastCall().times(1);
		
		// play the mock behavior
		EasyMock.replay(mockObserver);
		
		// create scenario for calling the update method
		myObservable.setChanged();
		myObservable.notifyObservers("Shrikant");
		
		// verify the behavior
		EasyMock.verify(mockObserver);
	}

}
