package Ejercicio_3;
public class Empleado {

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
	
	
	public String datos() {
		return "Empleado "+nombre;
	}	
}
