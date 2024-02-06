package Ejercicio_7;

public class PruebaPistas {

    public static void main(String[] args) {

        Polideportivos poli = new Polideportivos("nombrePoli", "General Elorza", 25, 4);

        poli.añadirPista(1, tipoPista.FUTBOL, true, 100, "10/01/2024");
        poli.añadirPista(2, tipoPista.TENIS, true, 120, "01/02/2024");
        poli.añadirPista(3, tipoPista.PADEL, true, 150, "10/12/2023");
        poli.añadirPista(4, tipoPista.BALONCESTO, true, 110, "10/01/2024");

        System.out.println(poli.toString());

        Usuarios u1 = new Usuarios("u1", "ape", "u1@gmail.com", "XXX", "XXX", "10/10/2002");
        Usuarios u2 = new Usuarios("u2", "ape2", "u2@gmail.com", "XXX", "XXX", "10/09/2002");
        Usuarios u3 = new Usuarios("u3", "ape3", "u3@gmail.com", "XXX", "XXX", "08/12/2002");

        Pistas p0 = poli.getPista(0);
        Reserva r1 = new Reserva("XXX", "XXX", p0);
        r1.añadirUsuario(u1);
        r1.añadirUsuario(u2);
        r1.añadirUsuario(u3);
        System.out.println(r1.toString());

    }

}
