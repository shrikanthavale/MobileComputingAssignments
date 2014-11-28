/**
 * 
 */
package com.test.sqe;

import java.util.StringTokenizer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shrikant Havale Nov 20, 2014
 * 
 */
public class StringTokenizerTest {

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

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testStringTokenizer() {
		StringTokenizer tokenizer = new StringTokenizer("shrikant:havale");

		// here number of tokens are 1
		Assert.assertEquals(1, tokenizer.countTokens());
		Assert.assertEquals(true, tokenizer.hasMoreElements());
		Assert.assertEquals(true, tokenizer.hasMoreTokens());
		Assert.assertEquals("shrikant:havale", (String) tokenizer.nextToken());

		tokenizer = new StringTokenizer("shrikant:havale");
		Assert.assertEquals("shrikant", (String) tokenizer.nextToken(":"));
		Assert.assertEquals("havale", (String) tokenizer.nextElement());
		Assert.assertEquals(false, tokenizer.hasMoreTokens());

		tokenizer = new StringTokenizer("shrikant;havale");

		// here number of tokens are 1
		Assert.assertEquals(1, tokenizer.countTokens());
		Assert.assertEquals(true, tokenizer.hasMoreElements());
		Assert.assertEquals(true, tokenizer.hasMoreTokens());
		Assert.assertEquals("shrikant;havale", (String) tokenizer.nextToken());

		tokenizer = new StringTokenizer("shrikant;havale");
		Assert.assertEquals("shrikant", (String) tokenizer.nextToken(";"));
		Assert.assertEquals("havale", (String) tokenizer.nextElement());
		Assert.assertEquals(false, tokenizer.hasMoreTokens());
		
	}

}
