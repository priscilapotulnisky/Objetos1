package ej6;

public class Consumo {
	
	private double energiaActiva;
	private double energiaReactiva;
	
	public Consumo (double energiaActiva, double energiaReactiva) {
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva;
	}

	public double getEnergiaActiva() {
		return energiaActiva;
	}

	public double getEnergiaReactiva() {
		return energiaReactiva;
	}
	
	public double calcularFpe() {
		double energiaAparente = Math.sqrt(Math.pow(energiaActiva, 2) + Math.pow(energiaReactiva, 2));
		if(energiaAparente == 0)
			return 0;
		return energiaActiva / energiaAparente;
	}
	
	public boolean hayBonificacion() { 
		return calcularFpe() >= 0.8;
	}
	
	
	 
}