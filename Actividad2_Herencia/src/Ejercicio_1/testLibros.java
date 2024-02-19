package Ejercicio_1;

public class testLibros {

	public static void main(String[] args) {
		
		Libro Libro = new Libro("XXX", "XXX");

        LibroTexto LibroTexto = new LibroTexto("XXX", "XXX", 1);

        LibroTextoUO LibroTextoUO = new LibroTextoUO("XXX", "XXX", 1, "Universidad de Oviedo");

        System.out.println(Libro.toString());

        System.out.println(LibroTexto.toString());

        System.out.println(LibroTextoUO.toString());

	}

}
