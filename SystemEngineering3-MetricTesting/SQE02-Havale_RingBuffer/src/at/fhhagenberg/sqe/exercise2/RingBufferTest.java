/**
 * 
 */
package at.fhhagenberg.sqe.exercise2;

import static org.junit.Assert.fail;

import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
	 * Ring Buffer Integer , for storing integer constants, used for testing
	 * isEmpty() method
	 */
	private RingBuffer<Integer> ringBufferEmpty;

	/**
	 * Ring Buffer Integer , for storing Integer constants, used for testing
	 * size() method
	 */
	private RingBuffer<Integer> ringBufferSize;

	/**
	 * Ring Buffer Integer , for storing integer, used for testing enqueue
	 * method
	 */
	private RingBuffer<Integer> ringBufferEnqueue;
	
	/**
	 * Ring Buffer Integer , for storing integer, used for testing enqueue
	 * method
	 */
	private RingBuffer<Integer> ringBufferDequeue;	


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
		ringBufferEmpty = new RingBuffer<>(3);
		ringBufferSize = new RingBuffer<>(3);
		ringBufferEnqueue = new RingBuffer<>(3);
		ringBufferDequeue = new RingBuffer<>(3);
	}

	/**
	 * Release the object initialized in setup method
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// release the memory
		ringBufferEmpty = null;
		ringBufferSize = null;
		ringBufferEnqueue = null;
		ringBufferDequeue = null;
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
				"Ring Buffer - ringBufferEmpty is not initialized",
				ringBufferEmpty);

		// 2. Initially ring buffer should be empty
		Assert.assertTrue(ringBufferEmpty.isEmpty());

		// 3.a lets add one element
		ringBufferEmpty.enqueue(10);

		// 3.b now ring buffer should not be empty
		Assert.assertFalse(ringBufferEmpty.isEmpty());

		// 3.c now remove the added element
		Integer elementRemoved = ringBufferEmpty.dequeue();

		// 3.d now again ring buffer should be empty
		if (elementRemoved != null) {
			Assert.assertTrue(ringBufferEmpty.isEmpty());
			elementRemoved = null;
		}

		// 4.a lets add two element
		ringBufferEmpty.enqueue(10);
		ringBufferEmpty.enqueue(20);

		// 4.b now ring buffer should not be empty
		Assert.assertFalse(ringBufferEmpty.isEmpty());

		// 4.c lets remove only one element
		elementRemoved = ringBufferEmpty.dequeue();

		// 4.d now ring buffer should not be empty, as we removed only one
		// element
		if (elementRemoved != null) {
			Assert.assertFalse(ringBufferEmpty.isEmpty());
		}

		// 4.e lets remove second element
		elementRemoved = ringBufferEmpty.dequeue();

		// 4.f now ring buffer should be empty, as we removed both of them
		if (elementRemoved != null) {
			Assert.assertTrue(ringBufferEmpty.isEmpty());
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
				"Ring Buffer - ringBufferInteger is not initialized",
				ringBufferSize);

		// 2. Initially buffer is empty, so its size should be zero
		Assert.assertEquals("Initially Buffer should be empty", 0,
				ringBufferSize.size());

		// 3.a Lets add one element to buffer
		ringBufferSize.enqueue(10);

		// 3.b Now its size should be 1
		Assert.assertEquals(
				"After adding one element, size of buffer should be 1", 1,
				ringBufferSize.size());

		// 3.c Lets add one more element to buffer
		ringBufferSize.enqueue(100);

		// 3.d Now its size should be 2
		Assert.assertEquals(
				"After adding two element, size of buffer should be 2", 2,
				ringBufferSize.size());

		// 3.e Lets remove one element
		ringBufferSize.dequeue();

		// 3.f Now its size should be 1
		Assert.assertEquals(
				"Had two elements before - After removing one element, size should now be 1",
				1, ringBufferSize.size());

		// 3.g Lets remove the last element
		ringBufferSize.dequeue();

		// 3.h Now its size should be 0
		Assert.assertEquals(
				"After removing all elements, size should now be 0", 0,
				ringBufferSize.size());

	}

	/**
	 * This methods test the enqueue() method of Ring Buffer. Elements are
	 * enqueued into queue and then they are checked using iterator if they are
	 * enqueued properly or not.
	 * 
	 * Test method for
	 * {@link at.fhhagenberg.sqe.exercise2.RingBuffer#enqueue(java.lang.Object)}
	 * .
	 */
	@Test
	public final void testEnqueue() {
		
		// local Iterator, used for testing if the value is actually enqueued or not
		Iterator<Integer> iterator = null;

		// 1.a lets enqueue one element to the buffer
		ringBufferEnqueue.enqueue(10);

		// 1.b test if this element is actually inserted in queue
		// get the iterator for this queue
		iterator = ringBufferEnqueue.iterator();
		
		// get the value inserted 
		Integer nextValue = iterator.next();
		
		// check for null
		if (nextValue != null) {
			Assert.assertEquals("Enqueued 10 at first position, But got " + nextValue.intValue(),
					10, nextValue.intValue());
		}
		
		// reset the local variables
		iterator = null;
		nextValue = null;
		
		// 1.c lets add one more element to the queue
		ringBufferEnqueue.enqueue(100);
		
		// 1.d test if this element is actually inserted in queue at second position
		// get the iterator for this queue
		iterator = ringBufferEnqueue.iterator();
		
		// get the first value inserted 
		nextValue = iterator.next();
		
		// get the second value
		nextValue = iterator.next();
		
		if (nextValue != null) {
			Assert.assertEquals("Enqueued 100, But got " + nextValue.intValue(),
					100, nextValue.intValue());
		}
		
		// reset the local variables
		iterator = null;
		nextValue = null;
		
	}

	/**
	 * This methods test the dequeue() method of Ring Buffer. Elements are
	 * dequeued from Ring Buffer and checked if they are obtained in proper order.
	 *  
	 * Test method for {@link at.fhhagenberg.sqe.exercise2.RingBuffer#dequeue()}
	 * .
	 */
	@Test
	public final void testDequeue() {
		
		//1.a lets add 1 element to the queue
		ringBufferDequeue.enqueue(100);
		
		//1.b lets dequeue this element to check if we get the same
		Integer value = ringBufferDequeue.dequeue();
		if(value != null){
			Assert.assertEquals("Enqueued 10 and After Dequeue got " + value.intValue(), 100, value.intValue());
		}
		
		// 2.a lets add 3 elements in particular order
		
		
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
