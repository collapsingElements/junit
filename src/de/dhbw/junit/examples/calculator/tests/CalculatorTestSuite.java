package de.dhbw.junit.examples.calculator.tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.dhbw.junit.examples.calculator.testcategories.ExceptionTest;
import de.dhbw.junit.examples.calculator.testcategories.OperationTest;

/**
 * Created by CHeizmann on 26.04.16.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory({ExceptionTest.class, OperationTest.class})
@Suite.SuiteClasses(CalculatorTests.class)
public class CalculatorTestSuite
{
	public CalculatorTestSuite() {}
}
