package ActAula;

public class Monitor extends Electrodomestico {

	private static final int DIM_POR_DEFECTO = 30;

	private int dim;

	/**
	 * Contructor con todos los parametros
	 * @param precioBase : double
	 * @param color : Colores
	 * @param consumoEnergetico : char
	 * @param peso : double
	 * @param dim : entero
	 */

	public Monitor(double precioBase, Colores color, char consumoEnergetico, double peso, int dim) {
		super(precioBase, color, consumoEnergetico, peso);
		this.dim = dim;
	}

	/**
	 * Contructor por defecto
	 */

	public Monitor() {
		super();
		this.dim = DIM_POR_DEFECTO;
	}

	/**
	 * Constructor con el precio y el oeso
	 * 
	 * @param precioBase : double
	 * @param peso       : double
	 */

	public Monitor(double precioBase, double peso) {
		super(precioBase, peso);
		this.dim = DIM_POR_DEFECTO;
	}

	/**
	 * Metodo get del atributo dimension
	 * @return : entero
	 */

	public int getDim() {
		return dim;
	}
	
	/**
	 * Metodo que calcula el precio final del monitor
	 */

	public double precioFinal() {

		double precioFinal = super.precioFinal();
		if (dim > 30) {
			precioFinal += 50;
		}

		return precioFinal;
	}
	
	/**
	 * Metodo toString de la clase monitor
	 */

	@Override
	public String toString() {
		return super.toString() + "\n\tMonitor [dim=" + dim + "]";
	}

}
