package Ejercicio1_Interfaces;

public class Tienda {

	private Producto productos[];
	private int contProductos;
	private Factura facturas[];
	private int contFacturas;

	/**
	 * @param productos
	 * @param contProductos
	 */
	public Tienda() {
		super();
		productos = new Producto[10];
		contProductos = 0;
		facturas = new Factura[10];
		contFacturas = 0;
	}

	public void insertarProducto(Producto p) {
		if (contProductos < productos.length) {
			productos[contProductos] = p;
			contProductos++;
		} else {
			System.out.println("Error no hay sitio");
		}
	}

	public String listarProductos() {
		String texto = "";
		for (int i = 0; i < contProductos; i++) {
			texto += productos[i].toString() + "\n";
		}
		return texto;
	}

	public Producto buscarRef(String refParam) {
		for (int i = 0; i < contProductos; i++) {
			if (productos[i].ref.compareTo(refParam) == 0) {
				return productos[i];
			}
		}
		return null;
	}

	public void insertarVenta(Factura nueva) {
		if (contFacturas < facturas.length) {
			facturas[contFacturas] = nueva;
			contFacturas++;
		}
	}

	public String listarVentas() {
		String texto = "";
		for (int i = 0; i < contFacturas; i++) {
			texto += facturas[i].toString() + "\n";
		}
		return texto;
	}

}
