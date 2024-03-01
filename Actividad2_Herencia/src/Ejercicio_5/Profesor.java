package Ejercicio_5;

public class Profesor extends Persona implements Humano {

	private String despacho;

	public Profesor(String nombre, String apellidos, String nIF, Direccion direccion, String despacho) {
		super(nombre, apellidos, nIF, direccion);
		this.despacho = despacho;
	}

	public Profesor(String nombre, String apellidos, String nIF, Direccion direccion) {
		super(nombre, apellidos, nIF, direccion);
		this.despacho = "";
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	@Override
	public void identificate() {
		System.out.println("Profesor: " + despacho);
		System.out.println(this.toString());
	}

}
