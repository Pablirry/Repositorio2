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
    Computador[] inventario;

    public Tienda(String nombre, String propietario, int identificadorTributario, int tamanoInventario) {

        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.inventario = new Computador[tamanoInventario];
    }

    public void agregarComputador(Computador c) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = c;
                System.out.println("Computador agregado a la tienda");
                return;
            }
        }

        System.out.println("No hay espacio en el inventario");
    }

    public void eliminarComputador(String marca) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].getMarca().equals(marca)) {
                inventario[i] = null;
                System.out.println("Computador eliminado de la tienda.");
                return;
            }
        }

        System.out.println("No se encontró un computador con la marca proporcionada");
    }

    public int buscar(String marca) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].marca.equals(marca)) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra la marca en el inventario.
    }

    public void imprimir() {

        System.out.println("Ordenadores de la tienda");
        for(Computador c : inventario) {
            if(c!= null)
            System.out.println(c);
        }

    }
}