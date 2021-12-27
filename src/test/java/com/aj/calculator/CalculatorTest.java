package com.aj.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class CalculatorTest {
	
	private Calculator calculator = new Calculator();
	//Tests are below

	@Test
	void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
	
	@Test
	void testConstr() {
		Calculator c = new Calculator();
		assertNotNull(c);
	}

}
