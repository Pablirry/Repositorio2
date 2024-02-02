package Ejercicio_4;

public class Tienda{

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

    private String nombre;
    private String propietario;
    private int identificadorTributario;
    Computador[] v;
    private int numeroComputadores;

    /**
     * Constructor con todos los atributos
     * 
     * @param nombre
     * @param propietario
     * @param identificadorTributario
     * @param tam
     */

    public Tienda(String nombre, String propietario, int identificadorTributario, int tam) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        v = new Computador[tam];
        this.numeroComputadores = 0;
    }

    /**
     * Comprueba que el vector esta lleno
     * 
     * @return : boolean
     */

    public boolean tiendaLlena() {
        if (numeroComputadores == v.length) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Comprueba que el vector esta vacio
     * 
     * @return : boolean
     */

    public boolean tiendaVacia() {

        if (this.numeroComputadores == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Añade un computador a la tienda
     * 
     * @param c : Computador
     */

    public void añadir(Computador c) {
        if (this.tiendaLlena() == false) {
            int posVacia = this.numeroComputadores;
            v[posVacia] = c;
            this.numeroComputadores++;
        } else {
            System.out.println("Error: La tienda esta llena");
        }
    }

    /**
     * Imprime la información del vector
     */

    public void imprimir() {

        String texto = "Tienda [nombre=" + nombre + ", propietario=" + propietario + ", identificadorTributario="
                + identificadorTributario + ", numeroComputadores=" + numeroComputadores + "]";

        for (int i = 0; i < this.numeroComputadores; i++) {
            Computador c = v[i];
            texto += "\t" + c.toString();
        }

        System.out.println(texto);

    }

    /**
     * Busca un computador en la tienda dada su marca
     * @param marca : String
     * @return : entero
     */

    public int buscar(String marca) {

        for (int i = 0; i < this.numeroComputadores; i++) {
            Computador c = v[i];
            if (c.getMarca().compareTo(marca) == 0) {
                return i;
            }

        }

        return -1;
    }

    /**
     * Metodo que elimina un computador de la tienda dada su marca
     * @param marca : String
     */

    public void eliminar (String marca){
        int pos = buscar(marca);
        if(pos!=-1){
            for(int i=pos;i<this.numeroComputadores-1;i++){
                v[i]=v[i+1];
            }
            this.numeroComputadores--;
        }
    }
}
