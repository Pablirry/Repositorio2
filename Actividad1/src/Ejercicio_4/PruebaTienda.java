package Ejercicio_4;

import java.util.Scanner;

public class PruebaTienda {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Tienda tienda = new Tienda("Tienda Cuántica", "Pepito Pérez", 123456, 5);
		Computador computador1 = new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
		Computador computador2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
		Computador computador3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);

		tienda.añadirComputador(computador1);
		tienda.añadirComputador(computador2);
		tienda.añadirComputador(computador3);

		String marca = sc.next();
		System.out.println(
				"El computador a buscar: " + marca + " se encuentra en la posición " + tienda.buscarComputador(marca));
		tienda.imprimir();
	}

}
