package Ejercicio_7;

public class Pistas {

    private String codigo;
    private String tipo;
    private boolean operativa;
    private double precio;
    private String ultimaReserva;
    
    public Pistas(String codigo, String tipo, boolean operativa, double precio, String ultimaReserva) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.operativa = operativa;
        this.precio = precio;
        this.ultimaReserva = ultimaReserva;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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

    public String getUltimaReserva() {
        return ultimaReserva;
    }

    public void setUltimaReserva(String ultimaReserva) {
        this.ultimaReserva = ultimaReserva;
    }

    public String toString() {
        return "Pistas [codigo=" + codigo + ", tipo=" + tipo + ", operativa=" + operativa + ", precio=" + precio
                + ", ultimaReserva=" + ultimaReserva + "]";
    }

    

}
