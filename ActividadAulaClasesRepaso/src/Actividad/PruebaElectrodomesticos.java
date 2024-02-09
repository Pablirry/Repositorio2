package Actividad;

public class PruebaElectrodomesticos {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();
        

        Electrodomesticos e1 = new Electrodomesticos("1", "Nevera", "DELL", 200.25, true);
        Electrodomesticos e2 = new Electrodomesticos("E001", "Lavadora", "Samsung", 499.99, true);
        Electrodomesticos e3 = new Electrodomesticos("E002", "Nevera", "LG", 799.99, false);
        Electrodomesticos e4 = new Electrodomesticos("E003", "Televisor", "Sony", 899.99, true);

        tienda.nuevoElectrodomestico(e1);
        tienda.nuevoElectrodomestico(e2);3
        tienda.nuevoElectrodomestico(e3);
        tienda.nuevoElectrodomestico(e4);

        tienda.listarElectrodomesticos();

        tienda.borrarElectrodomestico("E002");

        tienda.listarElectrodomesticos();

        tienda.obtenerPrecioElectrodomestico("E003");
    }

}
