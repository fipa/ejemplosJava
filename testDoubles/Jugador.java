package testDoubles;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private int puntaje;
	private ArrayList<Accesorio> accesorios;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntaje = 0;
		this.accesorios = new ArrayList<Accesorio>();
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public int getPuntaje() {
		return this.puntaje;
	}

	public void lanzarDado(Dado dado) {
		this.puntaje+= dado.lanzar();
	}
	
	public boolean adquirir(Accesorio a1) {
		if (this.puntaje >= a1.getValor()) {
			this.accesorios.add(a1);
			this.puntaje-= a1.getValor();
			return true;
		}
		return false;
		
	}

	public ArrayList<Accesorio> getAccesorios() {
		return this.accesorios;
	}
}
