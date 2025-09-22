package ej6;

import java.time.LocalDate;

public class Factura {

	private LocalDate fecha;
	private double monto;
	private Usuario cliente;
	private Consumo ultimoConsumo;
	private CuadroTarifario cuadroTarifario;
	
	public Factura (Usuario cliente, CuadroTarifario cuadroTarifario) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.cuadroTarifario = cuadroTarifario;
		this.ultimoConsumo = this.cliente.getUltimoConsumo();
		this.monto = this.calcularMontoTotal();
	}
	
	public double calcularPrecio() {
		return this.cuadroTarifario.getPrecio() * this.ultimoConsumo.getEnergiaActiva();
	}
	
	public double calcularMontoTotal() {
		if(this.ultimoConsumo.hayBonificacion())
			return calcularPrecio() * 0.90;
		return calcularPrecio();
	}
	
}
