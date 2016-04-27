package de.dhbw.junit.examples.prime.impl;

/**
 * Created by CHeizmann on 26.04.16.
 */
public class PrimeChecker
{

	public boolean isPrime(int number)
	{

		boolean isPrime = true;

		//Cases 2 and 3
		if(number == 2 || number == 3)
		{
			return isPrime;
		}

		//Case if number is greater than 3
		if(number > 3)
		{
			for (int i=2; i < number; i++)
			{
				// if number has a positive divisor
				if(number % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		else //number is lower than 2
		{
			isPrime = false;
		}

		return isPrime;
	}
}
