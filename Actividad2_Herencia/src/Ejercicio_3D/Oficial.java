package Ejercicio_3D;

public class Oficial extends Operario {

	/**
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);

	}

	@Override
	public void categoria() {
		System.out.println(nombre + " --> Categoria: Oficial");

	}

}
