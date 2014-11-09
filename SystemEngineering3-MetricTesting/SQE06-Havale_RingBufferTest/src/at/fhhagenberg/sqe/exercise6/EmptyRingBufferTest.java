/**
 * 
 */
package at.fhhagenberg.sqe.exercise6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This test case tests for the empty queue and full queue. Basically tests two
 * scenarios, what happens when element is added to full queue and what happens
 * if element is removed from empty queue
 * 
 * @author Shrikant Havale - S1310455005 
 * Oct 23, 2014
 * 
 */
public class EmptyRingBufferTest {

	/**
	 * queue variable for testing
	 */
	private RingBuffer<Integer> ringBuffer;

	/**
	 * For getting expected exception
	 */
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

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
		// create a queue object
		ringBuffer = new RingBuffer<>(3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// release the object
		ringBuffer = null;
	}

	/**
	 * Test method for {@link at.fhhagenberg.sqe.exercise6.RingBuffer#isEmpty()}
	 * .
	 */
	@Test
	public void testIsEmpty() {
		// Initially queue is empty
		Assert.assertTrue("Initially Queue Should be Empty",
				ringBuffer.isEmpty());
	}

	/**
	 * This method tries to add more elements than the size of the queue, and
	 * tests if exception is thrown or not
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise6.RingBuffer#enqueue(java.lang.Object)}
	 * .
	 */
	@Test
	public void testEnqueueOverFlow() {

		// 1.a size of the queue is 3, so lets add 3 elements to the queue
		ringBuffer.enqueue(10);
		ringBuffer.enqueue(20);
		ringBuffer.enqueue(30);

		// what exception is expected
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Ring buffer overflow");

		// 1.b now lets try to add one more element , to see if exception occurs
		ringBuffer.enqueue(40);

	}

	/**
	 * This method tries to remove elements from the queue even after the queue is empty, and
	 * tests if exception is thrown or not 
	 * 
	 * Test method for {@link at.fhhagenberg.sqe.exercise6.RingBuffer#dequeue()}
	 * .
	 */
	@Test
	public void testDequeueEmpty() {
		
		// 1.a lets add 2 elements to the queue
		ringBuffer.enqueue(10);
		ringBuffer.enqueue(20);

		// what exception to expect
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Ring buffer underflow");

		// 1.b lets try to remove 3 elements from queue
		ringBuffer.dequeue();
		ringBuffer.dequeue();
		ringBuffer.dequeue();
		
	}

}
