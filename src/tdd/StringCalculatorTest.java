package tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testStringVacio() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	void test_1() {
		assertEquals(1,  StringCalculator.add("1"));
	}

	@Test
	void test_1_2() {
		assertEquals(3,  StringCalculator.add("1,2"));
	}
	
	@Test
	void test_1_2_3_4() {
		assertEquals(10, StringCalculator.add("1,2,3,4"));
	}
	
	@Test
	void test_1_2_3_conSaltoDeLinea() {
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}

	@Test
	void testDistintoDelimitador() {
		assertEquals(6,  StringCalculator.add("//;\n1;2;3"));
	}

}
