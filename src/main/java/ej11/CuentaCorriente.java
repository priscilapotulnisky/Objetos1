package ej11;

public class CuentaCorriente extends Cuenta {

	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	public double getLimiteDescubierto() {
		return this.descubierto;
	}
	
	public void setLimiteDescubierto(double limite) {
		this.descubierto = limite;
	}
	
	public boolean puedeExtraer(double monto) {
		if((this.getSaldo() + this.descubierto) - this.descubierto > 0) 
			return true;
		return false;
	}
}
