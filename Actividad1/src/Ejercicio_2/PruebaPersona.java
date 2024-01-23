package Ejercicio_2;

import java.util.Scanner;

public class PruebaPersona {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 1. Pide por teclado el nombre, la edad, sexo, peso y altura.
		 * 2. Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
		 * anteriores variables pedidas por teclado, el segundo objeto obtendrá todos
		 * los anteriores menos el peso y la altura y el último por defecto, para este
		 * último utiliza los métodos set para darle a los atributos un valor.
		 * 3. Para cada objeto, deberá comprobar si esta en su peso ideal, tiene
		 * sobrepeso o por debajo de su peso ideal con un mensaje.
		 * 4. Indicar para cada objeto si es mayor de edad.
		 * 5. Por último, mostrar la información de cada objeto.
		 */

		// Primer objeto
		System.out.println("Primera persona: ");
		System.out.print("Nombre: ");
		String nombre1 = sc.nextLine();
		System.out.print("Edad: ");
		int edad1 = sc.nextInt();
		System.out.print("Sexo (H/M): ");
		char sexo1 = sc.next().charAt(0);
		System.out.print("Peso: ");
		double peso1 = sc.nextDouble();
		System.out.print("Altura: ");
		double altura1 = sc.nextDouble();

		Persona p1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);

		// Segundo objeto
		sc.nextLine();
		System.out.println("Segunda persona sin peso y altura: ");
		System.out.print("Nombre: ");
		String nombre2 = sc.nextLine();
		System.out.print("Edad: ");
		int edad2 = sc.nextInt();
		System.out.print("Sexo (H/M): ");
		char sexo2 = sc.next().charAt(0);

		Persona p2 = new Persona(nombre2, edad2, sexo2);

		// Tercer objeto
		sc.nextLine();
		System.out.println("Tercera persona (Por defecto)");
		Persona p3 = new Persona();
		p3.setNombre("Pedro");
		p3.setEdad(20);

		// Información de los objetos

		System.out.println("Información de los objetos:");
		System.out.println("Persona 1: \n " + p1.toString());
		comprobarPesoIdeal(p1);
		comprobarMayorEdad(p1);

		System.out.println("Persona 2: \n " + p2.toString());
		comprobarPesoIdeal(p2);
		comprobarMayorEdad(p2);

		System.out.println("Persona 3: \n " + p3.toString());
		comprobarPesoIdeal(p3);
		comprobarMayorEdad(p3);

	}

	/**
	 * Comprueba si la persona está en su peso ideal, tiene sobrepeso o por debajo
	 * 
	 * @param p : objeto persona
	 */

	public static void comprobarPesoIdeal(Persona p) {
		int resultadoIMC = p.calcularIMC();
		if (resultadoIMC == -1) {
			System.out.println(p.getNombre() + " está por debajo de su peso ideal.");
		} else if (resultadoIMC == 0) {
			System.out.println(p.getNombre() + " está en su peso ideal.");
		} else {
			System.out.println(p.getNombre() + " tiene sobrepeso.");
		}

	}

	/**
	 * Comprueba si la persona es mayor de edad
	 * 
	 * @param p : objeto persona
	 */

	private static void comprobarMayorEdad(Persona p) {
		if (p.esMayorDeEdad()) {
			System.out.println(p.getNombre() + " es mayor de edad.");
		} else {
			System.out.println(p.getNombre() + " no es mayor de edad.");
		}
	}

}
