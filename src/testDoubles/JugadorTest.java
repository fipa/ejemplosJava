package testDoubles;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class JugadorTest {

	private Jugador jugador;

	@BeforeEach
	public void setup() {
		jugador = new Jugador("Homero");
	}
	
	@Test
	void unJugadorAlLanzarElDadoSumaElPuntajeObtenido() {
		
	}
	
	@Test
	void unJugadorNoPuedeAdquirirUnAccesorioSiNoTieneElPuntajeNecesario() {
		
	}
	
}
