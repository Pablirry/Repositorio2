package Ejemplo1;

public class PruebaAlumno {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("11111111K","pepe",15);
		String n1=a1.getNombre();
		System.out.println("Nombre Alumno: " +n1);
		a1.setNombre("Juan");
		n1=a1.getNombre();
		System.out.println("Nombre Alumno: " +n1);

		Alumno a2 = new Alumno("11111111L","pedro",18);
		String n2 = a2.getNombre();
		System.out.println("Nombre Alumno: " +n2);
		a2.setNombre("Luis");
		n2 = a2.getNombre();
		System.out.println("Nombre Alumno: " +n2);
		

		
	}

}
