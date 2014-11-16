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
 * This Class tests the different states of {@link RingBuffer}  Iterator like, Iterator_Initialzed,
 * Next_Element, Error state for transitions like hasNext() , remove(), next() and iterator().
 * 
 * @author Shrikant Havale - S1310455005 Nov 15, 2014
 * Nov 16, 2014
 * 
 */
public class RingBufferIteratorStatesTest {
	
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
	 * Test method for {@link at.fhhagenberg.sqe.exercise7.RingBuffer#iterator()}.
	 */
	@Test
	public final void testIteratorStates() {
		
		Iterator<Integer> ringBufferIterator = null;
		
		//1. ring buffer in EMPTY State, no element added
		
		
		// 1.a Ring buffer Iterator in initialized state 
		ringBufferIterator = ringBuffer.iterator();
		Assert.assertNotNull("Ring Buffer in Initialzed State is NULL ", ringBufferIterator);
		
		// 1.b Ring buffer empty, so iterator next should throw error
		expectedException.expect(NoSuchElementException.class);
		ringBufferIterator.next();

		// 1.c Ring buffer empty, remove always throws error
		expectedException.expect(UnsupportedOperationException.class);
		ringBufferIterator.remove();

		
		//2. ring buffer in FILLED State, two element added
		ringBuffer.enqueue(1);
		ringBuffer.enqueue(2);
		
		// 2.a Ring buffer Iterator in initialized state 
		ringBufferIterator = ringBuffer.iterator();
		Assert.assertNotNull("Ring Buffer in Initialzed State is NULL ", ringBufferIterator);
		
		// 2.b Ring buffer Filled State, so iterator next should not throw error
		Integer returnValue =  ringBufferIterator.next();
		Assert.assertEquals(1, returnValue.intValue());

		// 2.c Ring buffer Filled State, remove always throws error
		expectedException.expect(UnsupportedOperationException.class);
		ringBufferIterator.remove();
		
		// 2.d Ring buffer Filled State, next will throw error if all elements are read
		ringBufferIterator.next();
		expectedException.expect(NoSuchElementException.class);
		ringBufferIterator.next();

		
		//3. ring buffer in FULL State, one more element added
		ringBuffer.enqueue(3);
		
		// 3.a Ring buffer Iterator in initialized state 
		ringBufferIterator = ringBuffer.iterator();
		Assert.assertNotNull("Ring Buffer in Initialzed State is NULL ", ringBufferIterator);
		
		// 3.b Ring buffer FULL State, so iterator next should not throw error
		returnValue =  ringBufferIterator.next();
		Assert.assertEquals(1, returnValue.intValue());

		// 3.c Ring buffer FULL State, so from next element again should give next element state
		returnValue =  ringBufferIterator.next();
		Assert.assertEquals(2, returnValue.intValue());

		// 3.c Ring buffer Filled State, remove always throws error
		expectedException.expect(UnsupportedOperationException.class);
		ringBufferIterator.remove();
		
		// 3.d Ring buffer Full State, next will throw error if all elements are read
		ringBufferIterator.next();
		expectedException.expect(NoSuchElementException.class);
		ringBufferIterator.next();

	}

}
