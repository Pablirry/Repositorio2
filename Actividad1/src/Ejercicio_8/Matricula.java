package Ejercicio_8;

public class Matricula {

    private Alumno alumno;
    private Curso curso;
    private MatriculaAsignatura[] matriculasAsignaturas;

    public Matricula(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public MatriculaAsignatura[] getMatriculasAsignaturas() {
        return matriculasAsignaturas;
    }

    public void setMatriculasAsignaturas(MatriculaAsignatura[] matriculasAsignaturas) {
        this.matriculasAsignaturas = matriculasAsignaturas;
    }

    @Override
    public String toString() {
        return "Matricula [alumno=" + alumno.getNombre() + ", curso=" + curso.getNombre() + "]";
    }

}
