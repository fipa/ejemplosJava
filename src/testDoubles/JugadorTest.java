package testDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {

	private Jugador jugador;
	private DadoStub dadoStub;

	@BeforeEach
	public void setup() {
		jugador = new Jugador("Homero");
		dadoStub = DadoStub.getInstance();
	}
	
}
