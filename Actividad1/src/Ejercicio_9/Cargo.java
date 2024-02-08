package Ejercicio_9;

public class Cargo {

    private String fechaHora;
    private double precio;

    // Constructor
    public Cargo(String fechaHora, double precio) {
        this.fechaHora = fechaHora;
        this.precio = precio;
    }

    // Getters y setters
    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString
    public String toString() {
        return "Cobro: [fechaHora: " + fechaHora + ", Precio: " + precio+ "]";
    }

}
