package Ejercicio_9;

public class Oferta {

    private double descuento;
    private String fechaInicio;
    private String fechaFin;

    public Oferta(double descuento, String fechaInicio, String fechaFin) {
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Oferta [descuento=" + descuento + "%, fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }

    
    

}
