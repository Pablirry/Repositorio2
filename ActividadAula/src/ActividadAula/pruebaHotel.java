package ActividadAula;

import java.util.Scanner;

public class pruebaHotel {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Hotel hotel = new Hotel(new Habitacion[10]);

        hotel.nuevaHabitacion(new Habitacion(1, 1, tipoHabitacion.SIMPLE, 100.00, false, true));
        hotel.nuevaHabitacion(new Habitacion(2, 2, tipoHabitacion.DOBLE, 150.00, false, true));
        hotel.nuevaHabitacion(new Habitacion(3, 3, tipoHabitacion.MATRIMONIAL, 200.00, false, false));
        hotel.nuevaHabitacion(new Habitacion(4, 4, tipoHabitacion.ESPECIAL, 300.00, false, true));
        hotel.nuevaHabitacion(new Habitacion(5, 5, tipoHabitacion.SIMPLE, 100.00, true, true));
        hotel.nuevaHabitacion(new Habitacion(6, 6, tipoHabitacion.DOBLE, 150.00, false, false));
        hotel.nuevaHabitacion(new Habitacion(7, 7, tipoHabitacion.MATRIMONIAL, 200.00, false, true));
        hotel.nuevaHabitacion(new Habitacion(8, 8, tipoHabitacion.ESPECIAL, 300.00, true, true));
        hotel.nuevaHabitacion(new Habitacion(9, 9, tipoHabitacion.SIMPLE, 100.00, false, false));
        hotel.nuevaHabitacion(new Habitacion(10, 10, tipoHabitacion.DOBLE, 150.00, false, true));

        hotel.mostrarHabitaciones();

        hotel.borrarHabitacion(5);

        hotel.mostrarHabitacionesDisponibles();

        System.out.println("Introduce id de la habitacion: ");
        int id = sc.nextInt();
        hotel.obtenerPrecio(id);

        hotel.reservarHabitacion();

        hotel.habitacionesReservadas();

        hotel.mostrarEstado();

    }

}
