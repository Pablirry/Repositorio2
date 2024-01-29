package Ejercicio_4;

public class Computador {

    /*
     * Los computadores de la tienda tienen los siguientes atributos:
     * • Marca del computador.
     * • Cantidad de memoria.
     * • Sistema operativo.
     * • Precio del computador.
     */

    String marca;
    int cantidadMemoria;
    String sistemaOperativo;
    String Procesador;
    double precio;

    public Computador(String marca, int cantidadMemoria,String Procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.Procesador = Procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computador [marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", sistemaOperativo="
                + sistemaOperativo + ", precio=" + precio + "]";
    }

}
