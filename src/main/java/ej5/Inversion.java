package ej5;

public abstract class Inversion {

	private double valor;
	
	public Inversion(double valor) {
		this.valor = valor;
	}
	
	public double calcularCosto() {
		return this.valor;
	}
}
