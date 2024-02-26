package Ejercicio_1;

public class Cuadrado extends Figura {
	
	int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado*lado;
	}

}
