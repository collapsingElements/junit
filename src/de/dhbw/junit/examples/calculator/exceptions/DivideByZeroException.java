package de.dhbw.junit.examples.calculator.exceptions;

/**
 * Created by CHeizmann on 26.04.16.
 */
public class DivideByZeroException extends Exception
{
	public DivideByZeroException()
	{
		super();
	}

	public DivideByZeroException(String message)
	{
		super(message);
	}

	public DivideByZeroException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public DivideByZeroException(Throwable cause)
	{
		super(cause);
	}
}
