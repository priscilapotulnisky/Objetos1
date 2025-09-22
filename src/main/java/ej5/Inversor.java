package ej5;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private List<Inversion> inversiones;
	
	public Inversor() {
		this.inversiones = new ArrayList<>();
	}

	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public void sacarInversion(Inversion inversion) {
		this.inversiones.remove(inversion);
	}
	
	public double calcularTotal() {
		return this.inversiones.stream().mapToDouble(x -> x.calcularCosto()).sum();
	}
}
