package Ejercicio_1;

public class PruebaBanco {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Juan", 100.0);
		Cuenta c2 = new Cuenta("Pedro", 200.0);
		Cuenta c3 = new Cuenta("Pepe", 300.0);
		Cuenta c4 = new Cuenta("Lola", 400.0);

		Banco banco = new Banco();
		banco.addCuenta(c1, 0);
		banco.addCuenta(c2, 1);
		banco.addCuenta(c3,2);
		banco.addCuenta(c4, 3);

		banco.mostrarCuentas();

	}

}
