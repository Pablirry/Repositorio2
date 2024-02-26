package Ejercicio_3;

public class Tecnico extends Operario {

    /**
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	public String datos() {
		return super.datos()+" -> Tecnico";
	}

}
