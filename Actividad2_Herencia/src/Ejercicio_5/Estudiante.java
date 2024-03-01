package Ejercicio_5;

public class Estudiante extends Persona implements Humano {

    private int idEstudiante;

    public Estudiante(String nombre, String apellidos, String nIF, Direccion direccion, int idEstudiante) {
        super(nombre, apellidos, nIF, direccion);
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(String nombre, String apellidos, String nIF, Direccion direccion) {
        super(nombre, apellidos, nIF, direccion);
        this.idEstudiante = 0;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public void identificate() {
        System.out.println("Estudiante: " + idEstudiante);
        System.out.println(this.toString());
    }

}
