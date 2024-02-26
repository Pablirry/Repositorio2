package Ejercicio_3D;

/**
 * 
 */
public class Directivo extends Empleado {

	/**
	 * 
	 */
	public Directivo() {

	}

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);

	}

	public void mostrarDatos(){
		System.out.println(nombre + " --> Directivo");
	}

	@Override
	public void categoria() {
		System.out.println(nombre + " --> Categoria : Directivo");

	}

}
