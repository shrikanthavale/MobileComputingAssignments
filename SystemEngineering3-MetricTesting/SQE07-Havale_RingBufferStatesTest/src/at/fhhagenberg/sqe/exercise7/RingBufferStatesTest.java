/**
 * 
 */
package at.fhhagenberg.sqe.exercise7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This Class tests the different states of {@link RingBuffer} like, EMPTY,
 * FILLED, FULL based on different transitions performed like, initialize,
 * enqueue, dequeue etc.
 * 
 * @author Shrikant Havale - S1310455005 Nov 15, 2014
 * 
 */
public class RingBufferStatesTest {

	/**
	 * Ring Buffer Integer
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
		// Initialize the ring buffer
		ringBuffer = new RingBuffer<>(2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// release the memory
		ringBuffer = null;
	}

	/**
	 * This method tests the different states of {@link RingBuffer} like, EMPTY,
	 * FILLED, FULL based on different transitions performed like, initialize,
	 * enqueue, dequeue etc.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise7.RingBuffer#enqueue(java.lang.Object)}
	 * .
	 */
	@Test
	public final void testRingBufferStates() {

		// 1.a Ring buffer is already initialized in setUp method, after
		// initialization it should be Empty State
		Assert.assertTrue("Ring Buffer STATE is NOT EMPTY ", ringBuffer.isEmpty());
		
		// 1.b After adding one element, Ring Buffer goes to Filled states
		ringBuffer.enqueue(1);
		Assert.assertTrue("Ring Buffer STATE is NOT FILLED ", (!ringBuffer.isEmpty() && !ringBuffer.isFull()));

		// 1.b After adding one more element, Ring Buffer goes to Full state
		ringBuffer.enqueue(2);
		Assert.assertTrue("Ring Buffer STATE is NOT FULL ", ringBuffer.isFull());
		
		// 1.c After removing one element, Ring Buffer should go again to Filled State
		Integer valueReturned = ringBuffer.dequeue();
		Assert.assertEquals("Value Returned Doesn't Match ", 1, valueReturned.intValue());
		Assert.assertTrue("Ring Buffer STATE is NOT FILLED ", (!ringBuffer.isEmpty() && !ringBuffer.isFull()));

		// 1.d After removing one more element, Ring Buffer should go again to Empty state
		ringBuffer.dequeue();
		Assert.assertTrue("Ring Buffer STATE is NOT FILLED ", ringBuffer.isEmpty());

		// 1.e Trying to remove the element from Empty, Ring Buffer should go to Error state
		// what exception is expected
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Ring buffer underflow");
		ringBuffer.dequeue();
		
		// 1.e Trying to add one more element in Full state, Ring Buffer should go to Error state
		// what exception is expected
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Ring buffer overflow");
		ringBuffer.enqueue(1);
		ringBuffer.enqueue(2);
		ringBuffer.enqueue(3);
		
	}

}
