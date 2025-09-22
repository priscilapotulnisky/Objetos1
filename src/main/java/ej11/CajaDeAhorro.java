package ej11;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super();
	}
	
	public boolean puedeExtraer(double monto) {
		double adicional = monto * 0.2;
		if(this.getSaldo() - (monto - adicional) >= 0)
			return true;
		return false;
	}
	
	
}
