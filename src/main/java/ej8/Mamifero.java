package ej8;

import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre) {
		this.identificador = nombre;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero mamifero) {
		this.padre = mamifero;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero mamifero) {
		this.madre = mamifero;
	}
	
	public Mamifero getAbueloMaterno() {
	    return (this.madre != null) ? this.madre.getPadre() : null;
	}

	public Mamifero getAbuelaMaterna() {
	    return (this.madre != null) ? this.madre.getMadre() : null;
	}

	public Mamifero getAbueloPaterno() {
	    return (this.padre != null) ? this.padre.getPadre() : null;
	}

	public Mamifero getAbuelaPaterna() {
	    return (this.padre != null) ? this.padre.getMadre() : null;
	}

	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		return ((this.padre == mamifero) 
				|| (this.madre == mamifero) 
				|| this.padre != null && this.padre.tieneComoAncestroA(mamifero) 
				|| (this.madre != null && this.madre.tieneComoAncestroA(mamifero))) ? true: false ;
	}
	
}
