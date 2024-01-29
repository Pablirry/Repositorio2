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
    String caracteristicasProcesador;
    String sistemaOperativo;
    double precio;

    public Computador(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.caracteristicasProcesador = caracteristicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

}
