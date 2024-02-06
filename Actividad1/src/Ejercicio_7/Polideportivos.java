package Ejercicio_7;

public class Polideportivos {

    private String nombre;
    private String direccion;
    private int extension;
    private Pistas pistas[];

    /**
     * Constructor con todos los atributos
     * 
     * @param nombre    : String
     * @param direccion : String
     * @param extension : entero
     * @param numPistas : entero
     */

    public Polideportivos(String nombre, String direccion, int extension, int numPistas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.extension = extension;
        pistas = new Pistas[0];
    }

    /**
     * Metodo get del atributo nombre
     * 
     * @return : String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set del atributo nombre
     * 
     * @param nombre : String
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get del atributo direccion
     * 
     * @return : String
     */

    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo set del atributo direccion
     * 
     * @param direccion : String
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get del atributo extension
     * 
     * @return : entero
     */

    public int getExtension() {
        return extension;
    }

    /**
     * Metodo set del atributo extension
     * 
     * @param extension : entero
     */

    public void setExtension(int extension) {
        this.extension = extension;
    }

    /**
     * Metodo toString de la clase Polideportivos
     */

    public String toString() {
        String texto = "Polideportivo [nombre=" + nombre + ", direccion=" + direccion + ", extension=" + extension
                + "]\n";

        for (int i = 0; i < pistas.length; i++) {
            texto += "\t" + pistas[i].toString() + "\n";
        }
        return texto;
    }

    /**
     * Metodo para añadir una pista al polideportivo
     * 
     * @param codigo             : entero
     * @param tipo               : tipoPista
     * @param operativa          : boolean
     * @param precio             : double
     * @param fechaUltimaReserva : String
     */

    public void añadirPista(int codigo, tipoPista tipo, boolean operativa, double precio, String fechaUltimaReserva) {

        Pistas pNueva = new Pistas(codigo, tipo, operativa, precio, fechaUltimaReserva);

        int tam = pistas.length;
        int nuevoTam = pistas.length + 1;

        Pistas nuevoVector[] = new Pistas[nuevoTam];

        for (int i = 0; i < tam; i++) {
            nuevoVector[i] = pistas[i];
        }

        int posNuevo = nuevoTam - 1;
        nuevoVector[posNuevo] = pNueva;

        this.pistas = nuevoVector;
    }

    /**
     * Metodo para eliminar una pista del polideportivo
     * 
     * @param pos : entero
     */

    public void eliminarPista(int pos) {

        int tamNuevo = pistas.length - 1;

        Pistas nuevoV[] = new Pistas[tamNuevo];

        for (int i = 0; i < pos; i++) {
            nuevoV[i] = pistas[i];
        }

        for (int i = pos; i < tamNuevo; i++) {
            nuevoV[i] = pistas[i + 1];
        }

        this.pistas = nuevoV;
    }

    /**
     * Metodo get de la pista del polideportivo
     * 
     * @param pos : entero
     * @return : Pistas
     */

    public Pistas getPista(int pos) {
        if (pos <= 0 && pos < pistas.length) {
            return pistas[pos];
        } else {
            return null;

        }

    }

}
