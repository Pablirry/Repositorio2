package Ejercicio_1;

public class Circulo extends Figura {
	
	double radio;

	public Circulo(double radio) {
		this.radio=radio;
		
	}

	@Override
	public double area() {
		return Math.PI * (radio*radio);
	}

}
