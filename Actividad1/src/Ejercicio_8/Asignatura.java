package Ejercicio_8;

public class Asignatura {
    
    private String nombre;
    private int numHoras;
    private Profesor profesor;

    public Asignatura(String nombre, int numHoras, Profesor profesor) {
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.profesor = profesor;
    }

    public Asignatura(String nombre, int numHoras) {
        this.nombre = nombre;
        this.numHoras = numHoras;
    }

    @Override
    public String toString() {
        String texto = "Asignatura [nombre=" + nombre + ", numHoras=" + numHoras + "]\n";

        if(profesor!= null) {
            texto += "\t" + profesor.getNombre() + "\n";
    }else{
        texto += "\tSin profesor";
        }

        return texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
