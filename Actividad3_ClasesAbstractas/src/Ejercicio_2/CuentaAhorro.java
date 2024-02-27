package Ejercicio_2;

public class CuentaAhorro extends Cuenta {

	private double interes;
	private double saldoMinimo;

	public CuentaAhorro(Persona cliente, long numeroCuenta, double interes, double saldoMinimo) {
		super(cliente, numeroCuenta);
		this.interes = interes;
		this.saldoMinimo = saldoMinimo;

	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= saldoMinimo) {
			System.out.println("No se puede retirar la cantidad solicitada. La cantidad a retirar no debe ser menor al saldo mínimo.");
		} else {
			saldo = saldo - cantidad;
		}

	}

	@Override
	public void actualizarSaldo() {
		double cantidad = saldo * interes / 100;
		saldo = saldo + cantidad;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + ", saldoMinimo=" + saldoMinimo +
				", numeroCuenta=" + numeroCuenta +
				", saldo=" + saldo + ", cliente=" + cliente + "]";
	}

}
