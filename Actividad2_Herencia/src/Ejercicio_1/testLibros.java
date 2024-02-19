package Ejercicio_1;

public class testLibros {

	public static void main(String[] args) {
		
		Libro L1 = new Libro("Libro1", "XXX");
        L1.setPrecio(200);
        
        System.out.println(L1.toString());
        System.out.println("Precio con 12%: " +L1.precioConIva(12));

        LibroTexto Lt1= new LibroTexto("LTexto1", "XXX", 4);
        Lt1.setPrecio(200);
        System.out.println("Precio con 12%: " +Lt1.precioConIva(12));

        LibroTextoUO Lt1UO = new LibroTextoUO("LTexto1UO", "XXX", 4, "Facultad de Informatica");
        Lt1UO.setPrecio(200);
        System.out.println("Precio con 12%: " +Lt1UO.precioConIva(12));


	}

}
