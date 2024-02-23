package Ejercicio_5;

public class Persona implements Humano {

    // nombre, apellidos y NIF

    protected String nombre;
    protected String apellidos;
    protected String NIF;
    protected Direccion direccion;

    public Persona(String nombre, String apellidos, String nIF, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = nIF;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public void identificate() {
        System.out.println("Persona");
    }

    @Override
    public String toString() {
        return "Persona [nombre = " + nombre + ", apellidos = " + apellidos + ", NIF = " + NIF + ", direccion = " + direccion.toString()
                + "]";
    }
}
