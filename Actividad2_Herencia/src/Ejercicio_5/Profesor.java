package Ejercicio_5;

public class Profesor extends Persona {

    private String despacho;

    public Profesor(String nombre, String apellidos, String nIF, Direccion direccion, String despacho) {
        super(nombre, apellidos, nIF, direccion);
        this.despacho = despacho;
    }

    public Profesor(String nombre, String apellidos, String nIF, Direccion direccion) {
        super(nombre, apellidos, nIF, direccion);
        this.despacho = "";
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public void identificate() {
        System.out.println("\tProfesor");
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tdespacho = " + despacho;
    }

}
