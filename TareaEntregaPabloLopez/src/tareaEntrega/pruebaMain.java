package tareaEntrega;

import java.util.Scanner;

public class pruebaMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Colegio colegio = new Colegio();
		colegio.cargaDatos();

		int opcion;

		// Switch para las opciones del menú

		do {
			opcion = menu();

			switch (opcion) {
				case 1:
					insertarPersona(colegio);
					break;
				case 2:
					listarColegio(colegio);
					break;
				case 3:
					borrarPersona(colegio);
					break;
				case 4:
					buscarPersona(colegio);
					break;
				case 5:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida. Introduce otra opcion: ");
			}
		} while (opcion != 5);

		sc.close();
	}

	private static void insertarPersona(Colegio colegio) {

		System.out.print("Introduce el NIF de la persona: ");
		String nif = sc.next();
		System.out.print("Introduce el nombre de la persona: ");
		String nombre = sc.next();
		System.out.print("Introduce los apellidos de la persona: ");
		String apellidos = sc.next();

		Direccion direccion = crearDireccion();

		System.out.println("¿La persona es un estudiante o un profesor? (E/P): ");
		char tipo = sc.next().charAt(0);

		if (tipo == 'E' || tipo == 'e') {
			Estudiante estudiante = new Estudiante(nif, nombre, apellidos, direccion);
			colegio.insertarPersona(estudiante);
		} else if (tipo == 'P' || tipo == 'p') {
			System.out.print("Introduce el despacho del profesor: ");
			String despacho = sc.next();
			Profesor profesor = new Profesor(despacho, nif, nombre, apellidos, direccion);
			colegio.insertarPersona(profesor);
		} else {
			System.out.println("Tipo de persona no válido.");
		}
	}

	private static Direccion crearDireccion() {
		System.out.print("Introduce la calle: ");
		String calle = sc.next();
		System.out.print("Introduce la ciudad: ");
		String ciudad = sc.next();
		System.out.print("Introduce el código postal: ");
		int cp = sc.nextInt();
		System.out.print("Introduce el país: ");
		String pais = sc.next();

		return new Direccion(calle, ciudad, cp, pais);
	}

	private static void listarColegio(Colegio colegio) {
		colegio.listarColegio();
	}

	private static void borrarPersona(Colegio colegio) {
		System.out.print("Introduce el NIF de la persona a borrar: ");
        String nif = sc.next();
        colegio.borrarPersona(nif);
	}

	private static void buscarPersona(Colegio colegio) {
		System.out.print("Introduce el NIF de la persona a buscar: ");
        String nif = sc.next();
        colegio.buscarPersona(nif);
	}

	/**
	 * 
	 * Metodo que muestra el menú de opciones para insertar, borrar, buscar o listar
	 * las personas del colegio
	 * 
	 * @return : entero
	 */

	public static int menu() {

		int opcion;

		System.out.println("----- Menú de Opciones -----");
		System.out.println("1. Insertar persona");
		System.out.println("2. Listar personas");
		System.out.println("3. Borrar persona");
		System.out.println("4. Buscar persona por NIF");
		System.out.println("5. Salir");
		System.out.print("Elige una opción (1-5): ");
		opcion = sc.nextInt();
		return opcion;
	}

}
