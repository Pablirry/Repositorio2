package ActAula;

public abstract class Electrodomestico {

	private static final char CE_POR_DEFECTO = 'F';
	private static final double PRECIO_POR_DEFECTO = 100;
	private static final double PESO_POR_DEFECTO = 5;

	private double precioBase;
	private Colores color;
	private char consumoEnergetico;
	private double peso;

	/**
	 * Constructor por defecto
	 */

	public Electrodomestico() {

		this.precioBase = PRECIO_POR_DEFECTO;
		this.color = Colores.Blanco;
		this.consumoEnergetico = CE_POR_DEFECTO;
		this.peso = PESO_POR_DEFECTO;
	}

	/**
	 * Constructor con precio y peso
	 * 
	 * @param precioBase : double
	 * @param peso       : double
	 */

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = Colores.Blanco;
		this.consumoEnergetico = CE_POR_DEFECTO;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the color
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * @return the consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Metodo para comprobar que el consumo energetico es valido
	 * 
	 * @param letra : char
	 * @return : boolean
	 */

	private boolean comprobarConsumoEnergetico(char letra) {
		return letra >= 'A' && letra <= 'F';
	}

	/**
	 * Metodo set de consumo energetico
	 * 
	 * @param letra : char
	 */

	public void setConsumoEnergetico(char letra) {

		if (comprobarConsumoEnergetico(letra)) {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = CE_POR_DEFECTO;
		}
	}

	/**
	 * Metodo que calcula un precio dependiendo del consumo energetico y su peso
	 * 
	 * @return : double
	 */

	public double precioFinal() {
		double precioFinal = precioBase;

		switch (consumoEnergetico) {
			case 'A':
				precioFinal += 100;
				break;
			case 'B':
				precioFinal += 80;
				break;
			case 'C':
				precioFinal += 60;
				break;
			case 'D':
				precioFinal += 40;
				break;
			case 'E':
				precioFinal += 40;
				break;
			case 'F':
				precioFinal += 40;
				break;
			default:
				System.out.println("Consumo energético no válido");
		}

		if (peso >= 0 && peso <= 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;
	}

	/**
	 * Metodo sobrecargado toStringz
	 */

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase +
				", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico +
				", peso=" + peso + "]";
	}

}
