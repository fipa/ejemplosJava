package testDoubles;

public class DadoStub implements Dado {

	private static DadoStub instance;
	private int valorEsperado;
	
	public static DadoStub getInstance() {
		if (instance == null) {
			instance = new DadoStub();
		}
		return instance;
	}
	
	private DadoStub() {
		super();
	}
	
	public void setValorEsperado(int numero) {
		this.valorEsperado = numero;
	}
	
	public int lanzar() {
		return this.valorEsperado;
	}
	
}
