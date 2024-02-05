package Ejercicio_7;

public class PruebaPistas {

	public static void main(String[] args) {

        Polideportivos poli = new Polideportivos("nombrePoli", "General Elorza", 25, 4);

        Polideportivos poli2 = new Polideportivos("nombrePoli2", "General Zubillaga", 40, 9);

        poli.añadirPista(125689, tipoPista.TENIS,true, 10, "10/11/2024");
        poli.añadirPista(125478, tipoPista.FUTBOL, true, 30, "12/12/2024");

        poli2.añadirPista(125689, tipoPista.TENIS,true, 10, "10/11/2024");
        poli2.añadirPista(405698, tipoPista.BALONCESTO, true, 20, "18/11/2024");

        System.out.println("Polideportivo 1:\n" + poli.toString());

        System.out.println("Polideportivo 2:\n" + poli2.toString());
		
		
    }

	}


