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
	
	@Test
	public void testNuevoJugador() {
		assertEquals("Homero", jugador.getNombre());
		assertEquals(0, jugador.getPuntaje());
		assertEquals(0,  jugador.getAccesorios().size());
	}
	
	@Test
	public void testJugadorAcumulaPuntajeAlTirarElDado() {
		dadoStub.setValorEsperado(3);
		jugador.lanzarDado(dadoStub);
		assertEquals(3, jugador.getPuntaje());
		dadoStub.setValorEsperado(6);
		jugador.lanzarDado(dadoStub);
		assertEquals(9, jugador.getPuntaje());
	}
	
	@Test
	public void testPuntajeDelJugadorSeDebeRestarDespueDeAdquirirUnAccesorio() {
		dadoStub.setValorEsperado(3);
		jugador.lanzarDado(dadoStub);
		Accesorio a1 = new Accesorio("Lentes", 2);
		assertTrue(jugador.adquirir(a1));
		assertEquals(1,  jugador.getPuntaje());
		assertSame(a1, jugador.getAccesorios().get(0));
	}

	@Test
	public void testJugadorPuedeComprarAccesorioSoloCuandoLeAlcanzaElPuntaje() {
		dadoStub.setValorEsperado(3);
		jugador.lanzarDado(dadoStub);
		Accesorio a1 = new Accesorio("Lentes", 10);
		assertFalse(jugador.adquirir(a1));
		assertEquals(3,  jugador.getPuntaje());
		assertEquals(0,  jugador.getAccesorios().size());		
	}

}
