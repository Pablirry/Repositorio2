package Ejercicio_9;

public class Empleado {

    // nombre, apellidos, horario y cargo

    private String nombre;
    private String apellidos;
    private String horario;
    private String cargo;

    public Empleado(String nombre, String apellidos, String horario, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horario = horario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", horario=" + horario + ", cargo=" + cargo
                + "]";
    }

    
    


}
