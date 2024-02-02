package Ejercicio_7;

public class Reserva {

    private String fechaReserva;
    private String fechaUso;
    private double precio;
    private Usuarios[] jugadores;

    public Reserva(String fechaReserva, String fechaUso, double precio, int numJugadores) {
        this.fechaReserva = fechaReserva;
        this.fechaUso = fechaUso;
        this.precio = precio;
        this.jugadores = new Usuarios[numJugadores];
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaUso() {
        return fechaUso;
    }

    public void setFechaUso(String fechaUso) {
        this.fechaUso = fechaUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Usuarios[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Usuarios[] jugadores) {
        this.jugadores = jugadores;
    }

    public String toString() {
        String result = "Reserva:" +
                        "\nFecha de Reserva: " + fechaReserva +
                        "\nFecha de Uso: " + fechaUso +
                        "\nPrecio: " + precio +
                        "\nJugadores:\n";

        for (Usuarios jugador : jugadores) {
            if (jugador != null) {
                result += "Jugador:\n" + jugador.añadirUsuario() + "\n";
            }
        }

        return result;
        }

}
