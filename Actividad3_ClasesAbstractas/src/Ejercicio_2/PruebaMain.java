package Ejercicio_2;

public class PruebaMain {

	public static void main(String[] args) {
		
		Persona p = new Persona("Juan", "Perez", "12345678A");
		

		CuentaCorriente c = new CuentaCorriente(p, 999555555999l);
		System.out.println(c.toString());

		c.ingresar(100);
		c.retirar(200);
		c.actualizarSaldo();
		System.out.println(c.toString());

	}

}
