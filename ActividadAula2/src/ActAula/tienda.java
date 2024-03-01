package ActAula;

public class tienda {

	public static void main(String[] args) {

		Electrodomestico[] e = new Electrodomestico[6];

		e[0] = new Lavavajillas(300, 20);
		e[1] = new Lavavajillas(400, 25);
		e[2] = new Monitor(250, 5);
		e[3] = new Monitor(350, 32);

		for (int i = 0; i < e.length; i++) {
			Electrodomestico electrodomestico = e[i];
			if (electrodomestico != null) {
				double precioFinal = electrodomestico.precioFinal();
				System.out.println(electrodomestico.toString() + "\n\tPrecio Final: " + precioFinal);
			}
		}
	}

}
