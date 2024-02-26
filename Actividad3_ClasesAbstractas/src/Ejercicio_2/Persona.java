package Ejercicio_2;

public class Persona {

	private String nombre;
	private String apellidos;
	private String NIF;

	public Persona(String nombre, String apellidos, String NIF) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.NIF = NIF;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

}
