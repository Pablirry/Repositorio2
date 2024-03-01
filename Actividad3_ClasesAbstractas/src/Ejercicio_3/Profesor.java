package Ejercicio_3;

public class Profesor extends Persona {

	private int despacho;

	public Profesor(int despacho, String nif, String nombre, String apellidos, Direccion dir) {
		super(nif, nombre, apellidos, dir);
		this.despacho = despacho;
	}

	/**
	 * @return : entero
	 */
	public int getDespacho() {
		return despacho;
	}

	/**
	 * @param despacho : entero
	 */
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	@Override
	public void identificate() {
		System.out.println("Despacho: " + despacho);
		System.out.println(this.toString());
		contVeces++;

	}

}
