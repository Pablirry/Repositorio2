package Ejercicio1_Interfaces;

public class Prueba {

	public static void main(String[] args) {
		Tienda tienda = new Tienda();

		cargarProductos(tienda);

		System.out.println(tienda.listarProductos());
		nuevaVenta(tienda);
		System.out.println(tienda.listarVentas());

	}

	private static void nuevaVenta(Tienda tienda) {
		Factura nueva = new Factura();
		Cliente c = new Cliente("Pablo Lopez", "679541418");
		nueva.insertarCliente(c);
		Producto p = tienda.buscarRef("ref1");
		if (p != null) {
			nueva.insertarDetalle(p, 100);
		}
		p = tienda.buscarRef("ref3");
		if (p != null) {
			nueva.insertarDetalle(p, 10);
		}

		tienda.insertarVenta(nueva);

	}

	private static void cargarProductos(Tienda tienda) {
		Producto p1 = new Producto("ref1", "nombre1", 100);
		tienda.insertarProducto(p1);
		Producto p2 = new Producto("ref2", "nombre2", 200);
		tienda.insertarProducto(p2);
		ProductoGrande p3 = new ProductoGrande("ref3", "prod3", 120, 10);
		tienda.insertarProducto(p3);
		ProductoGrande p4 = new ProductoGrande("ref4", "prod4", 150, 15);
		tienda.insertarProducto(p4);
		ProductoGrande p5 = new ProductoGrande("ref5", "prod5", 180, 20);
		tienda.insertarProducto(p5);

	}

}
