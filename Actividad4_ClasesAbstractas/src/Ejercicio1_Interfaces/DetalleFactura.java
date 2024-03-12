package Ejercicio1_Interfaces;

public class DetalleFactura {

	private Producto p;
	private int cantidad;

	/**
	 * @param p
	 * @param cantidad
	 */

	public DetalleFactura(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleFactura [p=" + p.ref + ", cantidad=" + cantidad + "]";
	}

	public double precioTotal() {
		return p.precio * cantidad;
	}

	public double precioTotalConIva(int porcentaje) {
		return p.precioConIva(porcentaje) * cantidad;
	}

}
