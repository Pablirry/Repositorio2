package Ejercicio_3D;

public abstract class Empleado {

	protected String nombre;

	/**
	 * Contructor predeterminado
	 */

	public Empleado() {
		nombre = "XXX";
	}

	/**
	 * Contructor de la clase Empleado
	 * @param nombre : String
	 */

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return : String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * @param nombre : String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Muestra la categoria profesional
	 */

	public abstract void categoria();
}
