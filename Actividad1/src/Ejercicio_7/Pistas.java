package Ejercicio_7;

public class Pistas {

    private int codigo;
    private tipoPista tipo;
    private boolean operativa;
    private double precio;
    private String fechaUltimaReserva;

    public Pistas(int codigo, tipoPista tipo, boolean operativa, double precio, String fechaUltimaReserva) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.operativa = operativa;
        this.precio = precio;
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public tipoPista getTipo() {
        return tipo;
    }

    public void setTipo(tipoPista tipo) {
        this.tipo = tipo;
    }

    public boolean isOperativa() {
        return operativa;
    }

    public void setOperativa(boolean operativa) {
        this.operativa = operativa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaUltimaReserva() {
        return fechaUltimaReserva;
    }

    public void setFechaUltimaReserva(String fechaUltimaReserva) {
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    @Override
    public String toString() {
        return "Pistas [codigo=" + codigo + ", tipo=" + tipo + ", operativa=" + operativa + ", precio=" + precio
                + ", fechaUltimaReserva=" + fechaUltimaReserva + "]";
    }

}
