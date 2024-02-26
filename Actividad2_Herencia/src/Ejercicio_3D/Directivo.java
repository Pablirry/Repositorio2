package Ejercicio_3D;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public void categoria() {
		
		System.out.println("Categoria Directivo "+getNombre());
	}
}

