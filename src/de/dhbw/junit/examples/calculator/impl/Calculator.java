package de.dhbw.junit.examples.calculator.impl;

import de.dhbw.junit.examples.calculator.exceptions.CalculatorNotEnabledException;
import de.dhbw.junit.examples.calculator.exceptions.DivideByZeroException;

/**
 * Created by CHeizmann on 26.04.16.
 *
 * Simple Calculator
 *
 * functions: enable, disable, add, subtract, multiply, divide
 * exceptions: CalculatorNotEnabledException, DivideByZeroException
 */

public class Calculator
{

	private Boolean isEnabled;

	public Calculator()
	{
		isEnabled = true;
	}

	public float add(float NumberA, float NumberB) throws CalculatorNotEnabledException
	{
		checkIfEnabled();

		return NumberA+NumberB;
	}

	public float subtract(float NumberA, float NumberB) throws CalculatorNotEnabledException
	{
		checkIfEnabled();

		return NumberA-NumberB;

	}

	public float multiply(float numberA, float numberB) throws CalculatorNotEnabledException
	{
		checkIfEnabled();

		return numberA*numberB;

	}

	public float divide(float numberA, float numberB) throws CalculatorNotEnabledException, DivideByZeroException
	{
		checkIfEnabled();

		if(numberB != 0)
		{
			return numberA/numberB;
		}
		else
		{
			throw new DivideByZeroException("Division by zero is not allowed");
		}
	}

	private void checkIfEnabled() throws CalculatorNotEnabledException
	{
		if(!isEnabled)
		{
			throw new CalculatorNotEnabledException("Calculator is not enabled");
		}
	}

	public Boolean getStatus()
	{
		return isEnabled;
	}

	public void enable()
	{
		if(!isEnabled)
		{
			isEnabled = true;
		}
	}

	public void disable()
	{
		if(isEnabled)
		{
			isEnabled = false;
		}
	}
}
