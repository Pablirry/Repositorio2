package ActAula;

public class Lavavajillas extends Electrodomestico {

	private static final int CARGA_POR_DEFECTO = 8;

	private int carga;

	/**
	 * Contructor por defecto
	 */

	public Lavavajillas() {
		super();
		this.carga = CARGA_POR_DEFECTO;
	}

	/**
	 * Constructor con el precio y el peso
	 * 
	 * @param precioBase : double
	 * @param peso       : double
	 */

	public Lavavajillas(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_POR_DEFECTO;
	}

	/**
	 * @return : entero
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo que calcula el precio final de los lavavajillas
	 */

	@Override
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		if (carga > 10) {
			precioFinal += 50;
		}

		return precioFinal;
	}

	/**
	 * Metodo toString de la clase lavavajillas
	 */

	@Override
	public String toString() {
		return super.toString() + "\n\tLavavajillas [carga=" + carga + "]";
	}

}
