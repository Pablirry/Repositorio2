package Ejercicio_3D;

public class Tecnico extends Operario {

	/**
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public void categoria() {
		System.out.println(nombre + " --> Categoria : Tecnico");

	}

}
