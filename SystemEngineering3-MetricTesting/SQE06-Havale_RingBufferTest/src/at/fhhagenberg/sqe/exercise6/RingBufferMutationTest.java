/**
 * 
 */
package at.fhhagenberg.sqe.exercise6;

import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This test case was added to improve PIT Mutation score for {@link RingBuffer}
 * testing. Initially {@link RingBuffer} test gave 90% coverage, as null checks
 * were missing in few test cases. This class covers all null checks and
 * mutation score is improved to 100%
 * 
 * @author Shrikant Havale - S1310455005 Nov 10, 2014
 * 
 */
public class RingBufferMutationTest {

	/**
	 * Ring Buffer Integer , for storing integer constants, used for testing
	 * isEmpty() method
	 */
	private RingBuffer<Integer> ringBuffer;

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
		ringBuffer = new RingBuffer<>(3);
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
	 * This method improves the PIT Mutation Test score by adding null checks in
	 * test case.
	 * 
	 * Test method for {@link at.fhhagenberg.sqe.exercise6.RingBuffer#dequeue()}
	 * .
	 */
	@Test
	public final void testFixMutationScore() {

		// local Iterator, used for testing if the value is actually enqueued or
		// not
		Iterator<Integer> iterator = null;

		// 1.a lets enqueue one element to the buffer
		ringBuffer.enqueue(10);

		// 1.b test if this element is actually inserted in queue
		// get the iterator for this queue
		iterator = ringBuffer.iterator();

		// get the value inserted
		Integer nextValue = iterator.next();

		// check for null
		if (nextValue != null) {
			Assert.assertEquals("Enqueued 10 at first position, But got "
					+ nextValue.intValue(), 10, nextValue.intValue());
		} else {
			// element iterated should not be null
			Assert.fail();
		}

		// reset the local variables
		nextValue = null;

		// get the first value inserted
		nextValue = ringBuffer.dequeue();

		if (nextValue != null) {
			Assert.assertEquals("Enqueued 10, But got " + nextValue.intValue(),
					10, nextValue.intValue());
		} else {
			// element iterated should not be null
			Assert.fail();
		}

		// reset the local variables
		iterator = null;
		nextValue = null;

	}

}
