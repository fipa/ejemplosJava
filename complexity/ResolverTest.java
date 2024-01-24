package complexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResolverTest {

	private boolean dummy;
	
	@Test
	void testFunciona() {
		assertEquals("No lo toques, No hay problema", Resolver.resolver(true, dummy, dummy, dummy, dummy));
	}
	
	@Test
	void testNoFuncionaLoHasTocado() {
		assertEquals("No hay problema", Resolver.resolver(false, true, dummy, true, true));
		assertEquals("Burro !! Ahora si hay problema", Resolver.resolver(false, true, dummy, true, false));
		assertEquals("Escondelo, No hay problema", Resolver.resolver(false, true, dummy, false, dummy));
	}

	@Test
	void testNoFuncionaNoLoHasTocado() {
		assertEquals("No hay problema", Resolver.resolver(false, false, true, dummy, true));
		assertEquals("Burro !! Ahora si hay problema", Resolver.resolver(false, false, true, dummy, false));
		assertEquals("Lanzalo, No hay problema", Resolver.resolver(false, false, false, dummy, dummy));
	}
	
}
