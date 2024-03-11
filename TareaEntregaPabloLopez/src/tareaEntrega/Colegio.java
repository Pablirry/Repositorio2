package tareaEntrega;

public class Colegio {

	private Persona[] personas;
	private int contPersonas;

	/**
	 * Constructor de la clase Colegio
	 */

	public Colegio() {

		personas = null;
		this.contPersonas = 0;
	}

	/**
	 * Metodo get de la clase Colegio
	 * 
	 * @return: Persona[]
	 */

	public Persona[] getPersonas() {
		return personas;
	}

	/**
	 * Metodo set de la clase Colegio
	 * 
	 * @param personas : Persona[]
	 */

	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}
	
	

	/**
	 * @return : entero
	 */
	public int getContPersonas() {
		return contPersonas;
	}

	/**
	 * @param contPersonas : entero
	 */
	public void setContPersonas(int contPersonas) {
		this.contPersonas = contPersonas;
	}

	/**
	 * Metodo para insertar una persona al colegio
	 * 
	 * @param persona : Persona
	 * @return 
	 */

	public boolean insertarPersona(Persona persona) {
		if (personas == null) {
			personas = new Persona[1];
			personas[0] = persona;
		} else {
			int nuevoTam = personas.length + 1;
			Persona vNuevo[] = new Persona[nuevoTam];
			for (int i = 0; i < personas.length; i++) {
				vNuevo[i] = personas[i];
			}
			int pos = nuevoTam - 1;
			vNuevo[pos] = persona;
			personas = vNuevo;
		}
		
		contPersonas++;
		return true;
		
	}

	/**
	 * Metodo para listar las personas del colegio
	 */

	public void listarColegio() {
		System.out.println("Listado de personas del colegio:");
		for (Persona persona : personas) {
			if (persona != null)
				System.out.println(persona.toString());
			System.out.println();
		}
		if (personas.length == 0) {
			System.out.println("No hay personas asignadas al colegio.");
		}
	}

	/**
	 * Metodo para borrar una persona del colegio
	 * 
	 * @param nif : String
	 */

	public void borrarPersona(String nif) {

		for (int i = 0; i < personas.length; i++) {
			if (personas[i] != null && personas[i].getNif().equals(nif)) {
				personas[i] = null;
				System.out.println("Persona con NIF " + nif + " eliminada correctamente.");
				return;
			}
		}

		System.out.println("No se encontró ninguna persona con el NIF " + nif + ".");

	}

	/**
	 * Metdo para buscar una persona por su NIF
	 * 
	 * @param nif : String
	 */

	public Persona buscarPersona(String nif) {
		for (Persona persona : personas) {
			if (persona != null && persona.getNif().equals(nif)) {
				return persona;
			}
		}
		return null;
	}

	/**
	 * Metodo para cargar los datos del colegio
	 */

	public void cargaDatos() {
		Direccion dir1 = new Direccion("calle 1", "Oviedo", "España");
		Direccion dir2 = new Direccion("calle 1", "Oviedo", 33001, "España");

		Estudiante estudiante = new Estudiante("55556789A", "Juan", "Gomez", dir1);
		Estudiante estudiante2 = new Estudiante("22222222A", "Juan", "Gomez", dir1);
		Estudiante estudiante3 = new Estudiante("123456789A", "Juan", "Gomez", dir2);
		Profesor profesor = new Profesor("987654321B", "22255664L", "Perez", "Lopez", dir1);
		Profesor profesor2 = new Profesor("987654321B", "84795244O", "Perez", "Lopez", dir2);

		// Puedes ajustar la capacidad del colegio según la cantidad de datos a cargar
		int capacidad = 5;
		this.personas = new Persona[capacidad];
		this.contPersonas = 0;

		insertarPersona(estudiante);
		insertarPersona(estudiante2);
		insertarPersona(estudiante3);
		insertarPersona(profesor);
		insertarPersona(profesor2);
	}

}
