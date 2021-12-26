package com.aj.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	@Test
	void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
