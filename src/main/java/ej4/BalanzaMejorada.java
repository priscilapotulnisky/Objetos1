package ej4;

import java.util.*;


public class BalanzaMejorada {
	
	List<Producto> productos;
	
	public BalanzaMejorada() {
		this.ponerEnCero();
	}
	

	public void ponerEnCero() {
		this.productos.removeAll(this.productos);
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
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
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.productos);
		return t;
	}

}
