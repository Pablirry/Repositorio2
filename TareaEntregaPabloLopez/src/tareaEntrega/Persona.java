package tareaEntrega;

public abstract class Persona implements Humano {

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
	 * @return : String
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif : String
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return : String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre : String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return : String
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos : String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * interfaz identificate
	 */

	@Override
	public void identificate() {
		System.out.println("NIF: " + nif);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
		System.out.println(direccion.toString());
	}
	
}
