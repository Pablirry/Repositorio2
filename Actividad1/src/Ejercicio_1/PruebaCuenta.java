package Ejercicio_1;

public class PruebaCuenta {

	public static void main(String[] args) {
        
		// Crear una cuenta con titular
        Cuenta cuenta1 = new Cuenta("Juan");

        // Imprimir información de la cuenta
        System.out.println("Información de la cuenta 1:");
        System.out.println(cuenta1.toString());

        // Ingresar dinero a la cuenta
        cuenta1.ingresar(1000.0);

        // Imprimir información de la cuenta después de ingresar dinero
        System.out.println("Información de la cuenta 1 después de ingresar dinero:");
        System.out.println(cuenta1.toString());

        // Retirar dinero de la cuenta
        cuenta1.retirar(500.0);

        // Imprimir información de la cuenta después de retirar dinero
        System.out.println("Información de la cuenta 1 después de retirar dinero:");
        System.out.println(cuenta1.toString());

        // Intentar retirar una cantidad mayor que el saldo actual
        cuenta1.retirar(2000.0);

        // Imprimir información de la cuenta después de intentar retirar una cantidad mayor que el saldo actual
        System.out.println("Información de la cuenta 1 después de intentar retirar una cantidad mayor que el saldo actual:");
        System.out.println(cuenta1.toString());

	}

}
