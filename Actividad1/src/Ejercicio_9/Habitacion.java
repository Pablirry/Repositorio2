package Ejercicio_9;

public class Habitacion {

    // tipo, precio, extensión y el número de clientes

    private String tipoHabitacion;
    private double precio;
    private int extension;
    private int n_clientes;
    private Empleado[] empleados;

    public Habitacion(String tipoHabitacion, double precio, int extension) {
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.extension = extension;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getN_clientes() {
        return n_clientes;
    }

    public void setN_clientes(int n_clientes) {
        this.n_clientes = n_clientes;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Habitacion [tipoHabitacion=" + tipoHabitacion + "]";
    }    

}
