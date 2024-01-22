package Ejemplo1;

public class PruebaAlumno {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("11111111K","pepe",15);
		String n=a1.getNombre();
		System.out.println("Nombre Alumno: " +n);
		a1.setNombre("Juan");
		n=a1.getNombre();
		System.out.println("Nombre Alumno: " +n);
		a1.toString();

		
	}

}
