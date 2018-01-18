package com.github.CI_Tests.unitTest.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}


	@Test
	public void testSub() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.sub(2, 2);
		// Then
		if (result != 0) {   // if 2 - 2 != 0
			Assert.fail();
		}
	}


	@Test
	public void testTimes() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.times(2, 2);
		// Then
		if (result != 4) {   // if 2 * 2 != 4
			Assert.fail();
		}
	}


	@Test
	public void testDiv() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.div(2, 2);
		// Then
		if (result != 1) {   // if 2 / 2 != 1
			Assert.fail();
		}
	}

	/**
	*	A vous de développer la suite !
	*/

}
