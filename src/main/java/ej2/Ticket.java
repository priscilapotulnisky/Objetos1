package ej2;

import java.time.LocalDate;

public class Ticket {

	private LocalDate fecha;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	public Ticket(int cantidadTotal, double precioTotal, double pesoTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadTotal;
		this.precioTotal = precioTotal + this.impuesto(); //hay que sumarle este impuesto??????
		this.pesoTotal = pesoTotal;
	}
	
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}




	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}




	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}




	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}




	public double getPrecioTotal() {
		return precioTotal;
	}




	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}




	public double getPesoTotal() {
		return pesoTotal;
	}




	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}




	public double impuesto() {
		return this.precioTotal * 0.21;
	}

}
