package Ejercicio_5;

import java.util.Scanner;

public class PruebaCurso {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Curso_universitario c = new Curso_universitario();

		Estudiante estudiante1 = new Estudiante("Juan", "Perez", 123456, 1, 4.5);
		Estudiante estudiante2 = new Estudiante("Pedro", "Perez", 123457, 2, 3.5);
		Estudiante estudiante3 = new Estudiante("Maria", "Perez", 123458, 1, 2.5);
		Estudiante estudiante4 = new Estudiante("Jose", "Perez", 123459, 2, 5.5);
		Estudiante estudiante5 = new Estudiante("Juan", "Perez", 123460, 1, 4.5);
		Estudiante estudiante6 = new Estudiante("Pedro", "Perez", 123461, 2, 3.5);
		Estudiante estudiante7 = new Estudiante("Maria", "Perez", 123462, 1, 2.5);
		Estudiante estudiante8 = new Estudiante("Jose", "Perez", 123463, 2, 5.5);
		Estudiante estudiante9 = new Estudiante("Juan", "Perez", 123464, 1, 4.5);
		Estudiante estudiante10 = new Estudiante("Pedro", "Perez", 123465, 2, 3.5);
		
		c.agregarEstudiante(estudiante1);
		c.agregarEstudiante(estudiante2);
		c.agregarEstudiante(estudiante3);
		c.agregarEstudiante(estudiante4);
		c.agregarEstudiante(estudiante5);
		c.agregarEstudiante(estudiante6);
		c.agregarEstudiante(estudiante7);
		c.agregarEstudiante(estudiante8);
		c.agregarEstudiante(estudiante9);
		c.agregarEstudiante(estudiante10);

		System.out.println("Listado de estudiantes:");
		c.listarAlumnos();

		System.out.println("\nIntroduce el codigo del alumno a buscar: ");
		int codigo = sc.nextInt();

		c.buscarAlumno(codigo);
		

	}

}
