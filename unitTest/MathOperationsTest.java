package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOperationsTest {

	private Integer[] numbers;
	
	@BeforeEach
	public void arrange() {
		this.numbers = new Integer[] {1,2};
	}
	
	
	@Test
	void testSum() {
		Integer resultado = MathOperations.sum(this.numbers);
		assertEquals(3, resultado);
	}

	@Test
	void testMax() {
		Integer resultado = MathOperations.max(this.numbers);
		assertEquals(2, resultado);
	}
	
}
