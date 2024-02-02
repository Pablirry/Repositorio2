package Ejercicio_7;

public class PruebaPistas {

	public static void main(String[] args) {
		
		Usuarios usuario1 = new Usuarios(null, null, null, null, null, null);
        usuario1.setNombre("Juan");
        usuario1.setApellidos("Perez");
        usuario1.setEmail("juan.perez@email.com");
        usuario1.setTelefono("123456789");
        usuario1.setDni("12345678A");
        usuario1.setFechaNacimiento("01/01/1990");

        Polideportivos polideportivo1 = new Polideportivos("Polideportivo A", "Calle A, 123", 1000, 1);

        Pistas pista1 = new Pistas(null, null, false, 0, null);
        pista1.setCodigo("001");
        pista1.setTipo("Tenis");
        pista1.setOperativa(true);
        pista1.setPrecio(15.0);
        pista1.setUltimaReserva("01/01/2024");

        polideportivo1.setPistas(new Pistas[]{pista1});

        Reserva reserva1 = new Reserva("01/01/2024", "02/01/2024", 15.0, 1);
        reserva1.setJugadores(new Usuarios[]{usuario1});

        // Imprimir la reserva usando toString
        System.out.println(reserva1.toString());
    }

	}


