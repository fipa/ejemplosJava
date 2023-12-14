package testDoubles;

public class Accesorio {

	private String nombre;
	private int valor;
	
	public Accesorio(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
