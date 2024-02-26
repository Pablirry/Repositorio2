package Ejercicio_3D;

public abstract class Empleado {

    private String nombre;
	
	public Empleado() {
		nombre="XXX";
	}
	public Empleado(String nombre) {
		this.nombre=nombre;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public abstract void categoria();
}
