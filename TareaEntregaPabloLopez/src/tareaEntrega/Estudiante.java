package tareaEntrega;

public class Estudiante extends Persona {

	private int idEstudiante;
	private static int CONT_ESTUDIANTES = 0;

	/**
	 * Constructor con todos sus parametros
	 * 
	 * @param nif       : String
	 * @param nombre    : String
	 * @param apellidos : String
	 */

	public Estudiante(String nif, String nombre, String apellidos, Direccion dir) {
		super(nif, nombre, apellidos, dir);
		CONT_ESTUDIANTES++;
		this.idEstudiante = CONT_ESTUDIANTES;
	}

	/**
	 * Metodo get del atributo idEstudiante
	 * 
	 * @return : entero
	 */

	public int getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * Metodo set del atributo idEstudiante
	 * @param idEstudiante : entero
	 */
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/**
	 * Metodo interfaz identificate
	 */

	@Override
	public void identificate() {
		System.out.println(this.toString());
	}

	/**
	 * Metodo toString de la clase estudiante
	 */

	@Override
	public String toString() {
		return "Estudiante: " + getIdEstudiante() + "\nNIF: " + getNif() + "\nNombre: " + getNombre() + " "
				+ getApellidos() + "\n" + direccion.toString();
	}

}
