package Ejercicio_3;

public class Estudiante extends Persona {

	private int idEstudiante;

	/**
	 * 
	 * @param idEstudiante : entero
	 * @param nif          : String
	 * @param nombre       : String
	 * @param apellidos    : String
	 * @param dir          : Direccion
	 */

	 public Estudiante(String nombre, String apellidos, String nIF, Direccion direccion, int idEstudiante) {
	        super(nombre, apellidos, nIF, direccion);
	        this.idEstudiante = idEstudiante;
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

	@Override
	public void identificate() {
		System.out.println("Id Estudiante: " + idEstudiante);
		System.out.println(this.toString());
		contVeces++;
	}

}
