package se.iths;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Before;
import org.hamcrest.Matcher;
import org.junit.After;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.matchers.JUnitMatchers.*;

import java.awt.List;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;

public class Snabb1 {
	static int i = 0;
	protected Labb1 Snabb1;

	@Before
	public void start() {
		Snabb1 = new Labb1();
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test (timeout = 10000)
	public void testQuote(){
		boolean boo1 = false;
		boolean boo2 = false;
		boolean boo3 = false;
		boolean boo4 = false;
		boolean boo5 = false;
		boolean boo6 = false;
		boolean boo7 = false;
		boolean boo8 = false;
		
		for(int i=1; i<100; i++){
			String result = Snabb1.quote();
			System.out.print(result);
			if (result.equals("We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein")){
				boo1 = true;
				}
			if (result.equals("A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare")){
				boo2 = true;
				}
			if (result.equals("You must be the change you wish to see in the world. - Mahatma Gandhi")){
				boo3 = true;
				}
			if (result.equals("In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.")){
				boo4 = true;
				}
			if (result.equals("Choose a job you love, and you will never have to work a day in your life. - Confucius")){
				boo5 = true;
				}
			if (result.equals("To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde")){
				boo6 = true;
				}
			if (result.equals("Without music, life would be a mistake. - Friedrich Nietzsche")){
				boo7 = true;
				}
			if (result.equals("I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams")){
				boo8 = true;
				}
		}
		assertTrue("No Einstein here", boo1);
		assertTrue("Shakespear was here", boo2);
		assertTrue("Ghandi is dead", boo3);
		assertTrue("Luther King", boo4);
		assertTrue("Confucius", boo5);
		assertTrue("Oscar Wilde", boo6);
		assertTrue("Nietzsche a good read", boo7);
		assertTrue("Douglas Adams", boo8);
	}

	/** useless..
	 * int random = labb1.hashCode(); int high = 8; int low = 0; assertTrue("Too
	 * high", high >= random); assertTrue("Too low", low <= random);
	 * 
	 * 
	 * }
	 **/

	@Test
	public void testReverseString() {
		assertEquals("cba", Snabb1.reverse("abc"));
	}

	@Test
	public void testAdd() {
		int result = Snabb1.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void testDivide() {
		int result = Snabb1.divide(100, 5);
		assertEquals(20, result);
	}

	@Test
	public void testMultiply() {
		int result = Snabb1.multiply(10, 2);
		assertEquals(20, result);
	}

	@Test
	public void testSubtract() {
		int result = Snabb1.subtract(10, 1);
		assertEquals(9, result);
	}
	
	@Test
	public void testCallCounter() {
	int expected = i;
	assertNotEquals(1, expected);
	assertEquals(0, expected);
	System.out.print(i);
	}
	//Testar endast svar från callCounter()
	
	/**	@After 
	public void after() {
		int expectedCounter = 0;
		expectedCounter++;
		expectedCounter++;
		expectedCounter++;
		expectedCounter++;
		expectedCounter++;
		expectedCounter++;
		expectedCounter++;
		System.out.print(expectedCounter);
	}**/ 
	
	// @AfterClass



}
