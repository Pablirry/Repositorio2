package Ejercicio_4;

import java.util.Scanner;

public class PruebaTienda {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Tienda tienda = new Tienda("Tienda Cuántica", "Pepito Pérez", 123456, 5);

        Computador computador1 = new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        Computador computador2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        Computador computador3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);

        tienda.agregarComputador(computador1);
        tienda.agregarComputador(computador2);
        tienda.agregarComputador(computador3);

        System.out.println("Ingrese la marca del computador a buscar:");
        String marca = sc.next();

        int posicion = tienda.buscar(marca);
        if (posicion != -1) {
            System.out.println("El computador a buscar: " + marca + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("No se encontró un computador con la marca proporcionada en la tienda.");
        }

        tienda.imprimir();
	}

}
