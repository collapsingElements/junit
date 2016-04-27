package de.dhbw.junit.examples.calculator.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import de.dhbw.junit.examples.calculator.exceptions.CalculatorNotEnabledException;
import de.dhbw.junit.examples.calculator.exceptions.DivideByZeroException;
import de.dhbw.junit.examples.calculator.impl.Calculator;
import de.dhbw.junit.examples.calculator.testcategories.ExceptionTest;
import de.dhbw.junit.examples.calculator.testcategories.OperationTest;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by CHeizmann on 26.04.16.
 */
public class CalculatorTests
{
	private Calculator calc;

	@Before
	public void setUp()
	{
		calc = new Calculator();
	}

	@Category(OperationTest.class)
	@Test
	public void addNumbers() throws CalculatorNotEnabledException
	{
		assertEquals(8.0f, calc.add(2,6));
	}


	@Category(OperationTest.class)
	@Test
	public void subNumbers() throws CalculatorNotEnabledException
	{
		assertEquals(4.0f, calc.subtract(6,2));
	}


	@Category(OperationTest.class)
	@Test
	public void divideNumbers() throws CalculatorNotEnabledException, DivideByZeroException
	{
		assertEquals(6.0f, calc.divide(36,6));
	}

	@Category(OperationTest.class)
	@Test
	public void multiplyNumbers() throws CalculatorNotEnabledException
	{
		assertEquals(35.0f, calc.multiply(7, 5));
	}

	@Category(ExceptionTest.class)
	@Test(expected = CalculatorNotEnabledException.class)
	public void calculatorNotEnabledException() throws CalculatorNotEnabledException
	{
		calc.disable();
		calc.add(3, 5);
	}

	@Category(ExceptionTest.class)
	@Test(expected = DivideByZeroException.class)
	public void divisionByZeroException() throws CalculatorNotEnabledException, DivideByZeroException
	{
		calc.divide(3,0);
	}

	@After
	public void tearDown()
	{
		calc = null;
	}
}
