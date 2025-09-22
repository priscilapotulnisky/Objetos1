package ej9;

import java.util.*;

public class Farola {

	private boolean interruptor;
	private List<Farola> farolasVecinas;
	
	public Farola() {
		this.interruptor = false;
		this.farolasVecinas = new ArrayList<>();
	}
	
	public void agregarFarola(Farola farola) {
		this.farolasVecinas.add(farola);
	}
	
	public void pairWithNeighbor(Farola farola) {
		this.agregarFarola(farola);
		farola.agregarFarola(this);
	}
	
	public List<Farola> getNeighbors(){
		return new ArrayList<Farola>(this.farolasVecinas);
	}
	
	public void turnOn() {
		if(this.isOff()) {
			this.interruptor = true;
			this.farolasVecinas.forEach(x -> x.turnOn());
		}
			
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.interruptor = false;
			this.farolasVecinas.forEach(x -> x.turnOff());
		}
	}
	
	public boolean isOn() {
		return this.interruptor ? true : false;
	}
	
	public boolean isOff() {
		return this.interruptor ? false : true;
	}
	
	
}
