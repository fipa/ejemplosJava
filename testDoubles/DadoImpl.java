package testDoubles;

import java.util.Random;

public class DadoImpl implements Dado {

	private static DadoImpl instance;
	
	public static DadoImpl getInstance() {
		if (instance == null) {
			instance = new DadoImpl();
		}
		
		return instance;
	}
	
	protected DadoImpl() {
		
	}
	
	public int lanzar() {
		return new Random().nextInt(6) + 1; // valor random, ¿cómo lo testeamos?
	}
}
