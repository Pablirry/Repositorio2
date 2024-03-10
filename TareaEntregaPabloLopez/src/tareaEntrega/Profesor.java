package tareaEntrega;

public class Profesor extends Persona {

	private String despacho;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param despacho  : String
	 * @param nif       : String
	 * @param nombre    : String
	 * @param apellidos : String
	 */

	public Profesor(String despacho, String nif, String nombre, String apellidos, Direccion dir) {
		super(nif, nombre, apellidos, dir);
		this.despacho = despacho;
	}

	/**
	 * Metodo get del atributo despacho
	 * 
	 * @return : String
	 */
	public String getDespacho() {
		return despacho;
	}

	/**
	 * Metodo set del atributo despacho
	 * 
	 * @param despacho : String
	 */
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	/**
	 * Metodo interfaz identificate
	 */

	@Override
	public void identificate() {
		System.out.println(this.toString());
	}

	/**
	 * Metodo toString de la clase profesor
	 */

	@Override
	public String toString() {
		return "Despacho: " + getDespacho() + "\nNIF: " + getNif() + "\nNombre: " + getNombre() + " " + getApellidos()
				+ "\n" + direccion.toString();
	}
}
