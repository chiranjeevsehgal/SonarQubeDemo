package com.trivium.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * This is the unit test code for the calculator.
 */
class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, 3);
		assertEquals(2, result);
	}
	
	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(6, 3);
		assertEquals(2, result);
	}
	
	@Test
	void testMul() {
		Calculator calculator = new Calculator();
		int result = calculator.mul(5, 3);
		assertEquals(17, result);
	}
}
