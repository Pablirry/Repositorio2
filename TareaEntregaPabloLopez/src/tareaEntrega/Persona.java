package tareaEntrega;

public abstract class Persona {

	protected String nif;
	protected String nombre;
	protected String apellidos;
	protected Direccion direccion;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nif       : String
	 * @param nombre    : String
	 * @param apellidos : String
	 */

	public Persona(String nif, String nombre, String apellidos, Direccion direccion) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	/**
	 * Metodo get del atributo nif
	 * 
	 * @return : String
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Metodo set del atributo nif
	 * 
	 * @param nif : String
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Metodo get del atributo nombre
	 * 
	 * @return : String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * 
	 * @param nombre : String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo apellidos
	 * 
	 * @return : String
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set del atributo apellidos
	 * 
	 * @param apellidos : String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
