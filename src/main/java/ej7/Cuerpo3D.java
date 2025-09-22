package ej7;

public class Cuerpo3D {

	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		
	}

	public Cuerpo3D(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.getAltura();
	}
}
