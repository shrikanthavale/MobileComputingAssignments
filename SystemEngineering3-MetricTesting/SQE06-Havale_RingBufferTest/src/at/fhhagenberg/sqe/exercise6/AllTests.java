package at.fhhagenberg.sqe.exercise6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test Suite for executing test cases {@link EmptyRingBufferTest} and
 * {@link RingBufferTest} of Ring Buffer {@link RingBuffer}
 * 
 * @author Shrikant Havale - S1310455005 
 * Oct 23, 2014
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ EmptyRingBufferTest.class, RingBufferTest.class, RingBufferWhiteboxTest.class, RingBufferMutationTest.class })
public class AllTests {

}
