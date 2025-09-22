package ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Presupuesto {
	String cliente;
	LocalDate fecha;
	List<Item> items; 
	
	public Presupuesto(String cliente, LocalDate fecha) {
		
		this.cliente= cliente;
		this.fecha= LocalDate.now();
		this.items = new ArrayList<>();
		
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		
		return this.items.stream().mapToDouble(x -> x.costo()).sum();
	}
}
