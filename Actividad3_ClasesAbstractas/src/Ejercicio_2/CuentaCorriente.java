package Ejercicio_2;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(Persona cliente, long numeroCuenta) {
		super(cliente, numeroCuenta);
		
	}

	@Override
	public void retirar(double cantidad) {
		if(cantidad<=saldo) {
			saldo=saldo-cantidad;
		}

	}

	@Override
	public void actualizarSaldo() {
		double interes = saldo*0.015;
		saldo=saldo+interes;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + 
				", saldo=" + saldo + "]\n" +
				"\t cliente=" + cliente;
	}
	
	

}
