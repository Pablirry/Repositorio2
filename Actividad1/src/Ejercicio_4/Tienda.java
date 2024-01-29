package Ejercicio_4;

public class Tienda {

    /*
     * Se requiere desarrollar un programa que modele una tienda de computadores.
     * La tienda posee los siguientes atributos:
     * • Nombre de la tienda.
     * • Propietario de la tienda.
     * • Identificador tributario de la tienda.
     * • Array de 5 computadores
     * La clase tienda debe tener determinados métodos que permitan añadir la
     * siguiente funcionalidad
     * • Agregar un computador a la tienda.
     * • Eliminar un computador de la tienda dada su marca.
     * • Buscar un computador en la tienda dada su marca.
     * • Listar la información de todos los computadores que tiene la tienda
     */

    String nombre;
    String propietario;
    int identificadorTributario;
    private Computador[] computadores;

    public Tienda(String nombre, String propietario, int identificadorTributario, int tamano) {

        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.computadores = new Computador[5];
    }

    public void añadirComputador(Computador computador) {

        int pos = buscarPosDisponible();
        if (pos == -1) {
            computadores[pos] = computador;
            System.out.println("Computador " + computador.marca + " añadido");
        } else {
            System.out.println("La tienda esta llena, no se puede añadir el computador");
        }

    }

    private int buscarPosDisponible() {

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarComputador(String marca) {

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null && computadores[i].marca.equals(marca)) {
                computadores[i] = null;
                System.out.println("Computador " + marca + " eliminado de la tienda.");
                return true;
            }
        }
        System.out.println("No se encontró un computador con la marca " + marca + " en la tienda.");
        return false;
    }

    public int buscarComputador(String marca) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null && computadores[i].marca.equals(marca)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimir() {
        System.out.println("Información de los computadores en la tienda:");
        for (Computador computador : computadores) {
            if (computador != null) {
                System.out.println("Marca: " + computador.marca + ", Memoria: " + computador.cantidadMemoria +
                        ", Sistema Operativo: " + computador.sistemaOperativo +
                        ", Precio: " + computador.precio + ", Características del Procesador: "
                        + computador.caracteristicasProcesador);
            }

        }
    }

}
