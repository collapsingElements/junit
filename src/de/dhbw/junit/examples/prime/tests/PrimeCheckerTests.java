package de.dhbw.junit.examples.prime.tests;

import org.junit.Before;
import org.junit.Test;

import de.dhbw.junit.examples.prime.impl.PrimeChecker;

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
	public void yourFirstTest()
	{
		//first test...
	}

	@Test
	public void yourSecondTest()
	{
		//second test...
	}


	//more tests
}
