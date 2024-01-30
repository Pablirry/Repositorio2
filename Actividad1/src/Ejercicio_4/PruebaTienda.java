package Ejercicio_4;

import java.util.Scanner;

public class PruebaTienda {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Tienda tienda = new Tienda("Tienda Cuántica", "Pepito Pérez", 123456, 5);

        Computador computador1 = new Computador("ACER", 50, "Intel iCore 7", "Windows", 18500000);
        Computador computador2 = new Computador("TOSHIBA", 80, "Intel iCore 5", "Windows", 15500000);
        Computador computador3 = new Computador("MAC", 100, "Intel iCore 7", "Mac", 2500000);

        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);

        System.out.println("Introduce la marca a buscar: ");
        String marca = sc.next().toUpperCase();

        System.out.println("El computador a buscar: " + marca + " se encuentra en la posición " +  tienda.buscar(marca));
        

        tienda.imprimir(); 

        tienda.eliminar(marca);
        System.out.println("*****************************************");
        tienda.imprimir();

	}

}
