package Ejercicio1_Interfaces;

public class Producto {

	protected String ref;
	protected String nombre;
	protected double precio;

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param ref    : String
	 * @param nombre : String
	 * @param precio : double
	 */

	public Producto(String ref, String nombre, double precio) {
		super();
		this.ref = ref;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [ref=" + ref + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	/**
	 * Método para calcular precio con iva
	 * 
	 * @param porcentaje : entero
	 * @return : double
	 */

	public double precioConIva(int porcentaje) {
		return (precio + (precio * porcentaje / 100));
	}

	/**
	 * 
	 * @param porcentaje
	 * @return
	 */

	public double precioConDto(int porcentaje) {
		return (precio - (precio * porcentaje / 100));
	}

}
