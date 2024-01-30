package Ejercicio_4;

public class Computador {

    /*
     * Los computadores de la tienda tienen los siguientes atributos:
     * • Marca del computador.
     * • Cantidad de memoria.
     * • Sistema operativo.
     * • Precio del computador.
     */

    private String marca;
    private int cantidadMemoria;
    private String caracteristicasProcesador;
    private String sistemaOperativo;
    private double precio;

    /**
     * Constructor con todos los parametros.
     * 
     * @param marca                     : String
     * @param cantidadMemoria           : entero
     * @param caracteristicasProcesador : String
     * @param sistemaOperativo          : String
     * @param precio                    : double
     */

    public Computador(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo,
            double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.caracteristicasProcesador = caracteristicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    /**
     * Metodo get del atributo marca.
     * 
     * @return : String
     */

    public String getMarca() {
        return marca;
    }

    /**
     * Metodo set del atributo marca.
     * 
     * @param marca : String
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo get del atributo cantidadMemoria.
     * 
     * @return : entero
     */

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    /**
     * Metodo set del atributo cantidadMemoria.
     * 
     * @param cantidadMemoria : entero
     */

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    /**
     * Metodo get del atributo caracteristicasProcesador.
     * 
     * @return : String
     */

    public String getCaracteristicasProcesador() {
        return caracteristicasProcesador;
    }

    /**
     * Metodo set del atributo caracteristicasProcesador.
     * 
     * @param caracteristicasProcesador : String
     */

    public void setCaracteristicasProcesador(String caracteristicasProcesador) {
        this.caracteristicasProcesador = caracteristicasProcesador;
    }

    /**
     * Metodo get del atributo sistemaOperativo.
     * 
     * @return : String
     */

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * Metodo set del atributo sistemaOperativo.
     * 
     * @param sistemaOperativo : String
     */

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * Metodo get del atributo precio.
     * 
     * @return : real
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo set del atributo precio.
     * 
     * @param precio : real
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo toString de la clase Computador.
     */

    public String toString() {
        return "\n"+"\t" + "- Computador [marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", caracteristicasProcesador="
                + caracteristicasProcesador + ", sistemaOperativo=" + sistemaOperativo + ", precio=" + precio + "]";
    }

}
