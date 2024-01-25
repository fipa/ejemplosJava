package testDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DadoImplTest {

	@Test
	void testDebeRetornarSiempreLaMismaInstancia() {
		DadoImpl d1 = DadoImpl.getInstance();
		DadoImpl d2 = DadoImpl.getInstance();
		
		assertSame(d1, d2);
	}
	
	@Test
	void testDebeRetornarUnNumeroEntre_1_y_6() {
		DadoImpl d = DadoImpl.getInstance();
		int numero = d.lanzar();
		assertTrue(numero >= 1 && numero <= 6);
	}

}
