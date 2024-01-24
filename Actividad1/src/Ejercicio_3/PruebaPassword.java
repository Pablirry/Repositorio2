package Ejercicio_3;

import java.util.Scanner;

public class PruebaPassword {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * • Crea un array de Passwords con el tamaño que tu le indiques por teclado.
		 * • Crea un bucle que cree un objeto para cada posición del array.
		 * • Indica también por teclado la longitud de los Passwords (antes de bucle).
		 * • Crea otro array de booleanos donde se almacene si el password del array de
		 * Password es o no fuerte (usa el bucle anterior).
		 * • Al final, muestra la contraseña y si es o no fuerte (usa el bucle
		 * anterior). Usa este simple formato:
		 * o contraseña1 valor_booleano1
		 * o contraseña2 valor_bololeano2
		 */

		System.out.println("Introduce cuantas contraseñas quieres generar: ");
		int tamanoPass = sc.nextInt();
		sc.nextLine();

		System.out.println("Longitud de las contraseñas: ");
		int longPass = sc.nextInt();
		sc.nextLine();

		Password[] passwords = new Password[tamanoPass];

		boolean[] fuerte = new boolean[tamanoPass];

		for (int i = 0; i < tamanoPass; i++) {
			passwords[i] = new Password(longPass);
			fuerte[i] = passwords[i].esFuerte();
		}

		System.out.println("Contraseñas: ");
		for (int i = 0; i < tamanoPass; i++) {
			System.out.println(passwords[i].getContraseña() + " " + fuerte[i]);
		}

	}

}
