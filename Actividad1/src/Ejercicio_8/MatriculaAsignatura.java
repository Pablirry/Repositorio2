package Ejercicio_8;

public class MatriculaAsignatura {

    private Matricula matricula;
    private Asignatura asignatura;
    private double[] notas;
    private String[] observaciones;
    private Alumno companeroPracticas;

    public MatriculaAsignatura(double[] notas) {
        this.notas = notas;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String[] getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String[] observaciones) {
        this.observaciones = observaciones;
    }

    public Alumno getCompaneroPracticas() {
        return companeroPracticas;
    }

    public void setCompaneroPracticas(Alumno companeroPracticas) {
        this.companeroPracticas = companeroPracticas;
    }

    @Override
    public String toString() {
        return "MatriculaAsignatura [matricula=" + matricula + ", asignatura=" + asignatura.getNombre() + "]";
    }    

}
