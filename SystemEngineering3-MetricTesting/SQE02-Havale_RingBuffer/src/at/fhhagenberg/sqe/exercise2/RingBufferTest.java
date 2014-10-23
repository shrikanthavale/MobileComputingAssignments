/**
 * 
 */
package at.fhhagenberg.sqe.exercise2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This class tests the implementation of {@link RingBuffer}. It test
 * implementation of methods like enqueue, dequeue , isEmpty , size and so on
 * using JUnit.
 * 
 * @author Shrikant Havale Oct 23, 2014
 * 
 */
public class RingBufferTest {

	/**
	 * Ring Buffer Integer , for storing integer constants
	 */
	private RingBuffer<Integer> ringBufferInteger;

	/**
	 * Ring Buffer String , for storing string constants
	 */
	private RingBuffer<String> ringBufferString;

	@Rule
	private ExpectedException exception = ExpectedException.none();

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
	 * JUnit test fixture creating a fixed set of object for testing purpose. It
	 * creates RingBuffer test object which are used further for testing.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Initialize the ring buffer
		ringBufferInteger = new RingBuffer<>(3);
		ringBufferString = new RingBuffer<>(3);
	}

	/**
	 * Release the object initialized in setup method
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// release the memory
		ringBufferInteger = null;
		ringBufferString = null;
	}

	/**
	 * This method tests if the Ring Buffer is empty or not. Elements are added
	 * and removed and an isEmpty method is tested after every step
	 * 
	 * Test method for {@link at.fhhagenberg.sqe.exercise2.RingBuffer#isEmpty()}
	 * .
	 */
	@Test
	public final void testIsEmpty() {

		// 1. make sure that Ring buffer is initialized
		Assert.assertNotNull(
				"Ring Buffer - ringBufferInteger is not initialized",
				ringBufferInteger);

		// 2. Initially ring buffer should be empty
		Assert.assertTrue(ringBufferInteger.isEmpty());

		// 3.a lets add one element
		ringBufferInteger.enqueue(10);

		// 3.b now ring buffer should not be empty
		Assert.assertFalse(ringBufferInteger.isEmpty());

		// 3.c now remove the added element
		Integer elementRemoved = ringBufferInteger.dequeue();

		// 3.d now again ring buffer should be empty
		if (elementRemoved != null) {
			Assert.assertTrue(ringBufferInteger.isEmpty());
			elementRemoved = null;
		}

		// 4.a lets add two element
		ringBufferInteger.enqueue(10);
		ringBufferInteger.enqueue(20);

		// 4.b now ring buffer should not be empty
		Assert.assertFalse(ringBufferInteger.isEmpty());

		// 4.c lets remove only one element
		elementRemoved = ringBufferInteger.dequeue();

		// 4.d now ring buffer should not be empty, as we removed only one
		// element
		if (elementRemoved != null) {
			Assert.assertFalse(ringBufferInteger.isEmpty());
			elementRemoved = null;
		}

		// 4.e lets remove second element
		elementRemoved = ringBufferInteger.dequeue();

		// 4.f now ring buffer should be empty, as we removed both of them
		if (elementRemoved != null) {
			Assert.assertTrue(ringBufferInteger.isEmpty());
			elementRemoved = null;
		}
	}

	/**
	 * This methods test the size() method of Ring Buffer. Elements are added
	 * and removed from Ring Buffer and their size is checked after every step.
	 * 
	 * Test method for {@link at.fhhagenberg.sqe.exercise2.RingBuffer#size()}.
	 */
	@Test
	public final void testSize() {

		// 1. make sure that Ring buffer is initialized
		Assert.assertNotNull(
				"Ring Buffer - ringBufferString is not initialized",
				ringBufferString);

		// 2. Initially buffer is empty, so its size should be zero
		Assert.assertEquals("Initially Buffer should be empty", 0,
				ringBufferString.size());

		// 3.a Lets add one element to buffer
		ringBufferString.enqueue("A");

		// 3.b Now its size should be 1
		Assert.assertEquals(
				"After adding one element, size of buffer should be 1", 1,
				ringBufferString.size());

		// 3.c Lets add one more element to buffer
		ringBufferString.enqueue("B");

		// 3.d Now its size should be 2
		Assert.assertEquals(
				"After adding two element, size of buffer should be 2", 2,
				ringBufferString.size());

		// 3.e Lets remove one element
		ringBufferString.dequeue();

		// 3.f Now its size should be 1
		Assert.assertEquals(
				"Had two elements before - After removing one element, size should now be 1",
				1, ringBufferString.size());

		// 3.g Lets remove the last element
		ringBufferString.dequeue();

		// 3.h Now its size should be 0
		Assert.assertEquals(
				"After removing all elements, size should now be 0", 0,
				ringBufferString.size());

	}

	/**
	 * This methods test the enqueue() method of Ring Buffer. Elements are
	 * enqueued and dequeued from Ring Buffer and their size is checked after
	 * every step.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise2.RingBuffer#enqueue(java.lang.Object)}
	 * .
	 */
	@Test
	public final void testEnqueue() {

	}

	/**
	 * Test method for {@link at.fhhagenberg.sqe.exercise2.RingBuffer#dequeue()}
	 * .
	 */
	@Test
	public final void testDequeue() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise2.RingBuffer#iterator()}.
	 */
	@Test
	public final void testIterator() {
		fail("Not yet implemented"); // TODO
	}

}
