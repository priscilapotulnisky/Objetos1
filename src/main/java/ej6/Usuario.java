package ej6;

import java.util.*;

public class Usuario {

	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario (String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void agregarConsumo (Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	public void eliminarConsumo (Consumo consumo) {
		this.consumos.remove(consumo);
	}
	
	public Consumo getUltimoConsumo() {
		return this.consumos.get(this.consumos.size() - 1);
	}
	
	
	
}
