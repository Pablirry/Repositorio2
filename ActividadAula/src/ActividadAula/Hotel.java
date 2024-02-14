package ActividadAula;

import java.util.Scanner;

public class Hotel {

    static Scanner sc = new Scanner(System.in);

    private Habitacion[] habitaciones;

    /**
     * Constructor con todos los atributos
     * 
     * @param habitaciones : Habitacion[]
     */

    public Hotel(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * Metodo get del atributo habitaciones
     * 
     * @return : Habitacion[]
     */

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    /**
     * Metodo set del atributo habitaciones
     * 
     * @param habitaciones : Habitacion[]
     */

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * Metodo para añadir una habitacion
     * 
     * @param h : Habitacion
     */

    public void nuevaHabitacion(Habitacion h) {
        int posicionLibre = buscarPosLibre();
        if (posicionLibre != -1) {
            habitaciones[posicionLibre] = h;
            System.out.println("Nueva habitación añadida en la posición " + posicionLibre);
        } else {
            System.out.println("Error: No hay habitaciones disponibles.");
        }
    }

    /**
     * Metodo para borrar una habitacion por el id
     */

    public void borrarHabitacion(int id) {
        int posicion = buscarHabitacion(id);
        if (posicion != -1 && !habitaciones[posicion].isOcupado()) {
            System.out.println("Habitación con ID " + id + " eliminada.");
            habitaciones[posicion] = null;
        } else if (posicion == -1) {
            System.out.println("Error: No existe ninguna habitación con ese ID.");
        } else {
            System.out.println("Error: La habitación está reservada y no se puede eliminar.");
        }
    }

    /**
     * Metodo auxiliar para buscar la posicion de una habitacion disponible
     * 
     * @return : entero
     */

    private int buscarPosLibre() {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo para mostrar el estado actual del hotel
     */

    public void mostrarEstado() {
        System.out.println("Estado actual del hotel:");
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] != null) {
                System.out.println("Posición " + i + ": " + habitaciones[i]);
            }
        }
    }

    /**
     * Metodo para buscar una habitacion por el id
     * 
     * @param id : entero
     * @return : entero
     */

    private int buscarHabitacion(int id) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] != null && habitaciones[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo para mostrar las habitaciones del hotel
     */

    public void mostrarHabitaciones() {
        System.out.println("Habitaciones del hotel:");
        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println(habitaciones[i]);
        }
    }

    /**
     * Metodo para mostrar las habitaciones disponibles del hotel
     */

    public void mostrarHabitacionesDisponibles() {
        System.out.println("Habitaciones disponibles del hotel:");
        for (int i = 0; i < habitaciones.length; i++) {
            if (!habitaciones[i].isOcupado()) {
                System.out.println(habitaciones[i]);
            }
        }
    }

    /**
     * Metodo para mostrar el precio de una habitacion por el id
     * 
     * @param id : entero
     * @return : double
     */

    public double obtenerPrecio(int id) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i].getId() == id) {
                return habitaciones[i].getPrecio();
            }
        }
        return -1;
    }

    /**
     * Metodo para reservar una habitacion
     */

    public void reservarHabitacion() {

        System.out.print("Introduce el id de la habitacion a reservar: ");
        int id = sc.nextInt();

        int posicion = buscarHabitacion(id);

        if (posicion != -1) {
            Habitacion habitacion = habitaciones[posicion];
            if (!habitacion.isOcupado()) {
                habitacion.setOcupado(true);
                System.out.println("Se ha reservado la habitacion con id: " + id);
            } else {
                System.out.println("La habitación con id " + id + " está reservada.");
            }
        } else {
            System.out.println("No se encontró ninguna habitacion con ese id");
        }
    }

    /**
     * Metodo para mostrar las habitaciones reservadas
     */

    public void habitacionesReservadas() {
        System.out.println("Habitaciones reservadas:");
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i].isOcupado()) {
                System.out.println(habitaciones[i]);
            }
        }
    }
}
