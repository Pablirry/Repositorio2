package Ejercicio_8;

public class PruebaSecretaria {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("12345678A", 12345678, "Pepe", "García", "Calle Falsa 123", "66666666",
				"pepe@gmail.com");
		System.out.println(a1.toString());

		Alumno a2 = new Alumno("36346578A", 22434434, "Pedro", "García", "Calle Falsa 3", "777777777",
				"pedro@gmail.com");
		System.out.println(a2.toString());

		a1.añadirCompanero(a2);
		a2.añadirCompanero(a1);

		System.out.println("Después de añadir compañero:");
		System.out.println(a1.toString());

		Profesor p1 = new Profesor("prof1", "ape1", "null", "null");
		Profesor p2 = new Profesor("prof2", "ape2", "null", "null");
		Profesor p3 = new Profesor("prof3", "ape3", "null", "null");

		Asignatura as1 = new Asignatura("Asignatura 1", 120);
		as1.setProfesor(p1);
		System.out.println(as1.toString());
		Asignatura as2 = new Asignatura("Asignatura 2", 230, p2);
		System.out.println(as2.toString());
		Asignatura as3 = new Asignatura("Asignatura 3", 210, p3);
		System.out.println(as3.toString());
		Asignatura as4 = new Asignatura("Asignatura 2", 230, p2);
		System.out.println(as2.toString());
		Asignatura as5 = new Asignatura("Asignatura 3", 210, p3);
		System.out.println(as3.toString());

		Curso c1 = new Curso(2, "Desarrolladores", "primero", "20:00");
		c1.setAsignaturas(new Asignatura[] { as1, as2, as3 });
		System.out.println(c1.toString());
		Curso c2 = new Curso(3, "Administradores", "segundo", "18:00");
		c2.setAsignaturas(new Asignatura[] { as4, as5 });
		System.out.println(c2.toString());

		Matricula m1 = new Matricula(a1, c1);

		System.out.println(m1.toString());

	}

}
