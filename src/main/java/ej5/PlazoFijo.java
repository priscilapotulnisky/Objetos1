package ej5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion {

	private LocalDate fecha;
	private double interes;
	
	public PlazoFijo(double valor, double interes ) {
		
		super(valor);
		this.fecha = LocalDate.now();
		this.interes = interes;
	}

	public double calcularCosto() {
		long dias = ChronoUnit.DAYS.between(fecha, LocalDate.now());
		return super.calcularCosto() + ((this.interes * super.calcularCosto() / 100) * dias ) ;
	}
	
}
