package Ejercicio_8;

public class Curso {

    private int codigo;
    private String nombre;
    private String aula;
    private String horario;
    private Asignatura[] asignaturas;

    public Curso(int codigo, String nombre, String aula, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.aula = aula;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        String texto = "Curso [codigo=" + codigo + ", nombre=" + nombre + ", aula=" + aula + ", horario=" + horario
                + "]\n";

        if (asignaturas != null && asignaturas.length > 0) {

            texto += "Asignaturas:\n";
            for (int i = 0; i < asignaturas.length; i++) {
                texto += "\t" + asignaturas[i].getNombre() + "\n";
            }
        } else {
            texto += "\tSin asignaturas";
        }

        return texto;

    }

}
