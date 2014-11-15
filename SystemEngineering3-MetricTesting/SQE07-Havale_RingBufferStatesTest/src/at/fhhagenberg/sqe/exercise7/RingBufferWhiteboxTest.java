/**
 * 
 */
package at.fhhagenberg.sqe.exercise7;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This methods tries to complete the coverage test for the {@link RingBuffer}.
 * {@link RingBufferTest} which was written for testing {@link RingBuffer} 
 * Didn't cover all the lines of code. This was shown by Eclemma coverage
 * analysis tool.
 * 
 * Now this class will test remaining functionalities and try to make the
 * coverage {@link RingBuffer} 100%.
 * 
 * @author Shrikant Havale - S1310455005 Nov 9, 2014
 * 
 */
public class RingBufferWhiteboxTest {

	/**
	 * Ring Buffer Integer , for storing integer constants, used for testing
	 * isEmpty() method
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
	 * Test method for Iterator used in {@link RingBuffer} class Covering few
	 * test cases like hasNext() returning true or false, and trying to get
	 * element when the cursor goes beyond.
	 * 
	 * {@link at.fhhagenberg.sqe.exercise7.RingBuffer#iterator()}.
	 */
	@Test
	public final void testIterator() {

		// local Iterator, used for testing if the value is actually enqueued or
		// not
		Iterator<Integer> iterator = null;

		// 1.a lets enqueue one element to the buffer
		ringBuffer.enqueue(10);

		// 1.b test if this element is actually inserted in queue
		// get the iterator for this queue
		iterator = ringBuffer.iterator();

		// 1.c iterator hasNext() should return true as we inserted one element.
		Assert.assertTrue(iterator.hasNext());

		// 1.d get the value inserted
		iterator.next();

		// 1.e Now iterator should return false, as we already read one value
		Assert.assertFalse(iterator.hasNext());

		// 1.f Now we read one element already, so next should throw
		// NoSuchElementException
		// what exception is expected
		expectedException.expect(NoSuchElementException.class);
		iterator.next();

		// reset the local variables
		iterator = null;
	}

	/**
	 * Test method for Iterator used in {@link RingBuffer} class Covering few
	 * test cases like hasNext() returning true or false, and trying to get
	 * element when the cursor goes beyond.
	 * 
	 * {@link at.fhhagenberg.sqe.exercise7.RingBuffer#remove()}.
	 */
	@Test
	public final void testIteratorRemove() {

		// local Iterator, used for testing if the value is actually enqueued or
		// not
		Iterator<Integer> iterator = null;

		// 1.a lets enqueue one element to the buffer
		ringBuffer.enqueue(10);

		// 1.b test if this element is actually inserted in queue
		// get the iterator for this queue
		iterator = ringBuffer.iterator();

		// 1.c try to remove the element using iterator, and expect operation
		// not supported exception
		expectedException.expect(UnsupportedOperationException.class);
		iterator.remove();

	}

}
