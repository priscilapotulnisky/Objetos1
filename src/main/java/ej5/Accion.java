package ej5;

public class Accion extends Inversion {
	
	private String nombre;
	private int cantidad;

	public Accion(double valor) {
		super(valor);
		
	}

	
	public double calcularCosto() {
		return super.calcularCosto() * this.cantidad;
	}
}
