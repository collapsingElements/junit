package de.dhbw.junit.examples.calculator.exceptions;

/**
 * Created by CHeizmann on 26.04.16.
 */
public class CalculatorNotEnabledException extends Exception
{
	public CalculatorNotEnabledException()
	{
		super();
	}

	public CalculatorNotEnabledException(String message)
	{
		super(message);
	}

	public CalculatorNotEnabledException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public CalculatorNotEnabledException(Throwable cause)
	{
		super(cause);
	}
}
