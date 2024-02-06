package Ejercicio_7;

public class Pistas {

    private int codigo;
    private tipoPista tipo;
    private boolean operativa;
    private double precio;
    private String fechaUltimaReserva;

    /**
     * Constructor con todos los atributos
     * 
     * @param codigo             : entero
     * @param tipo               : tipoPista
     * @param operativa          : boolean
     * @param precio             : double
     * @param fechaUltimaReserva : String
     */

    public Pistas(int codigo, tipoPista tipo, boolean operativa, double precio, String fechaUltimaReserva) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.operativa = operativa;
        this.precio = precio;
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    /**
     * Metodo get del atributo codigo
     * 
     * @return : entero
     */

    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo set del atributo codigo
     * 
     * @param codigo : entero
     */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo get del atributo tipo
     * 
     * @return : tipoPista
     */

    public tipoPista getTipo() {
        return tipo;
    }

    /**
     * Metodo set del atributo tipo
     * 
     * @param tipo : tipoPista
     */

    public void setTipo(tipoPista tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo get del atributo operativa
     * 
     * @return : boolean
     */

    public boolean isOperativa() {
        return operativa;
    }

    /**
     * Metodo set del atributo operativa
     * 
     * @param operativa : boolean
     */

    public void setOperativa(boolean operativa) {
        this.operativa = operativa;
    }

    /**
     * Metodo get del atributo precio
     * 
     * @return : double
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo set del atributo precio
     * 
     * @param precio : double
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo get del atributo fechaUltimaReserva
     * 
     * @return : String
     */

    public String getFechaUltimaReserva() {
        return fechaUltimaReserva;
    }

    /**
     * Metodo set del atributo fechaUltimaReserva
     * 
     * @param fechaUltimaReserva : String
     */

    public void setFechaUltimaReserva(String fechaUltimaReserva) {
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    /**
     * Metodo toString de la clase Pistas
     */

    public String toString() {
        return "Pistas [codigo=" + codigo + ", tipo=" + tipo + ", operativa=" + operativa + ", precio=" + precio
                + ", fechaUltimaReserva=" + fechaUltimaReserva + "]";
    }

}
