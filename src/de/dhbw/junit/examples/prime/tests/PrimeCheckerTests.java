package de.dhbw.junit.examples.prime.tests;

import org.junit.Before;
import org.junit.Test;

import de.dhbw.junit.examples.prime.impl.PrimeChecker;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by CHeizmann on 26.04.16.
 */
public class PrimeCheckerTests
{
	PrimeChecker primeChecker;

	@Before
	public void setUp()
	{
		primeChecker = new PrimeChecker();
	}


	@Test
	public void testTwoIsPrime()
	{
		assertTrue(primeChecker.isPrime(2));
	}

	@Test
	public void testThreeIsPrime()
	{
		assertTrue(primeChecker.isPrime(3));
	}

	@Test
	public void testFourIsPrime()
	{
		assertFalse(primeChecker.isPrime(4));
	}

	@Test
	public void testElevenIsPrime()
	{
		assertTrue(primeChecker.isPrime(11));
	}

	@Test
	public void testFiftyIsPrime()
	{
		assertFalse(primeChecker.isPrime(50));
	}

	@Test
	public void testThirtyOneIsPrime()
	{
		assertTrue(primeChecker.isPrime(31));
	}

	@Test
	public void testMinusOneIsPrime()
	{
		assertFalse(primeChecker.isPrime(-1));
	}



	//more tests
}
