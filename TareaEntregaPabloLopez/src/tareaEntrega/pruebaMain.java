package tareaEntrega;

import java.util.Scanner;

public class pruebaMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Direccion dir1 = new Direccion("calle 1", "Oviedo", "España");
		Direccion dir2 = new Direccion("calle 1", "Oviedo", 33001, "España");

		Estudiante estudiante = new Estudiante("55556789A", "Juan", "Gomez", dir1);
		Estudiante estudiante2 = new Estudiante("22222222A", "Juan", "Gomez", dir1);
		Estudiante estudiante3 = new Estudiante("123456789A", "Juan", "Gomez", dir2);
		Profesor profesor = new Profesor("987654321B", "22255664L", "Perez", "lopez", dir1);
		Profesor profesor2 = new Profesor("987654321B", "84795244O", "Perez", "lopez", dir2);

		Colegio colegio = new Colegio(4);

		int opcion;

		// Switch para las opciones del menú

		do {
			opcion = menu();

			switch (opcion) {
			case 1:
				colegio.insertarPersona(estudiante);
				colegio.insertarPersona(estudiante2);
				colegio.insertarPersona(estudiante3);
				colegio.insertarPersona(profesor);
				colegio.insertarPersona(profesor2);
				break;
			case 2:
				colegio.listarColegio();
				break;
			case 3:
				System.out.print("Introduce el NIF de la persona a borrar: ");
				String nif = sc.next();
				colegio.borrarPersona(nif);
				break;
			case 4:
				System.out.print("Introduce el NIF de la persona a buscar: ");
				nif = sc.next();
				colegio.buscarPersona(nif);
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
