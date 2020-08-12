package com.zensar.math.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zensar.math.Calculator;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void init()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void testAddition()
	{
		 
	assertEquals(10, calculator.add(3, 7));	
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivision()
	{
		assertEquals(5, calculator.divide(10, 2));
	}
	
	@After
	public void destroy()
	{
		calculator = null;
	}

}
