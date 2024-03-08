package tareaEntrega;

public class Estudiante extends Persona {
	
	private int idEstudiante;
	private static int CONT_ESTUDIANTES = 0;
	
	/**
	 * Constructor con todos sus parametros
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 */
	
	public Estudiante(String nif, String nombre, String apellidos, Direccion dir) {
		super(nif, nombre, apellidos, dir);
		CONT_ESTUDIANTES++;
		this.idEstudiante = CONT_ESTUDIANTES;	
	}
	
	/**
	 * @return : entero
	 */
	public int getIdEstudiante() {
		return idEstudiante;
	}

	/**
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
	 * Metodo toString
	 */

	@Override
    public String toString() {
        return "Estudiante: " + getIdEstudiante() +
		"\nNIF: " + getNif() + 
		"\nNombre: " + getNombre() + " " + getApellidos() + 
		"\n" + direccion.toString();
    }

}
