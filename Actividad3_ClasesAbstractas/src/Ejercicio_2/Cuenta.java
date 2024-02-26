package Ejercicio_2;

public abstract class Cuenta {

	protected long numeroCuenta;
	protected double saldo;
	protected Persona cliente;

	public Cuenta(Persona cliente, long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.saldo = 0;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public void ingresar(double cantidad){
		saldo = saldo+cantidad;
	}

	public abstract void retirar(double cantidad);

	public abstract void actualizarSaldo();

}
