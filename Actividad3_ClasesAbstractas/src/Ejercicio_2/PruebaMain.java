package Ejercicio_2;

public class PruebaMain {

	public static void main(String[] args) {
		
		Persona p = new Persona("Juan", "Perez", "12345678A");
		

		CuentaAhorro ca = new CuentaAhorro(p, 1111, 2.5, 400);
		System.out.println(ca.toString());
		ca.ingresar(1000);
		System.out.println("Ingresamos 1000");
		System.out.println(ca.toString());
		ca.retirar(100);
		System.out.println("Retiramos 100");
		System.out.println(ca.toString());
		ca.retirar(500);
		System.out.println("Retiramos 500");
		System.out.println(ca.toString());

	}

}
