package Ejercicio_1;

public class testLibros {

	public static void main(String[] args) {
		
		Libro L1 = new Libro("Libro1", "XXX");
        L1.setPrecio(200);
        
        System.out.println(L1.toString());
        System.out.println("Precio con 12%: " +L1.precioConIva(12));
        System.out.println("************************************************");

        LibroTexto Lt1= new LibroTexto("LTexto1", "XXX", 4);
        Lt1.setPrecio(200);
        System.out.println(Lt1.toString());
        System.out.println("Precio con 15%: " +Lt1.precioConIva(15));
        System.out.println("************************************************");

        LibroTextoUO Lt1UO = new LibroTextoUO("LTexto1UO", "XXX", 4, "Facultad de Informatica");
        Lt1UO.setPrecio(200);
        System.out.println(Lt1UO.toString());
        System.out.println("Precio con 10%: " +Lt1UO.precioConIva(10));
        System.out.println("************************************************");


        Novelas N1 = new Novelas("N1", "XXX", TipoNovela.AVENTURAS);
        System.out.println(N1.toString());

	}

}
