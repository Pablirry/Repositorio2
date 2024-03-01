package Ejercicio_3;

public abstract class Persona implements Humano {

	protected String nif;
	protected String nombre;
	protected String apellidos;
	protected Direccion dir;
	
	protected static int contVeces = 0;
	
	public int getContVeces() {
		return contVeces;
	}

	/**
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param dir
	 */
	public Persona(String nif, String nombre, String apellidos, Direccion dir) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dir = dir;
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
	 * @return : Direccion
	 */
	public Direccion getDir() {
		return dir;
	}

	/**
	 * @param dir : Direccion
	 */
	public void setDir(Direccion dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + "]" + "\n\t Direccion= "
				+ dir.toString();
	}

}
