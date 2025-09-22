package ej4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {

	private LocalDate fecha;
	List<Producto> productos;
	
	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos= productos;
	}
	
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}




	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size() ;
	}
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(x -> x.getPrecio()).sum() ;
	}
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(x -> x.getPeso()).sum();
	}


	public double calcularTotal() {
		return this.productos.stream().mapToDouble(x -> x.getPrecio()).sum() + this.impuesto() ;
	}
	
	public double impuesto() {
		return this.calcularTotal() * 0.21;
	}

}
