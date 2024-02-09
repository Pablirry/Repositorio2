package Actividad;

public class Tienda {

    private Electrodomesticos[] electrodomesticos;
    private int nElectrodomesticos;

    public Tienda() {
        this.electrodomesticos = new Electrodomesticos[10];
        this.nElectrodomesticos = 0;
    }

    public void nuevoElectrodomestico(Electrodomesticos e) {
        if (nElectrodomesticos < electrodomesticos.length) {
            electrodomesticos[nElectrodomesticos] = e;
            nElectrodomesticos++;
            System.out.println("Electrodomestico agregado");
        } else {
            System.out.println("La tienda esta llena");
        }
    }

    public void borrarElectrodomestico(String id) {
        int indice = buscarIndice(id);
        if (indice != -1 && !electrodomesticos[indice].isEnStock()) {
            for (int i = indice; i < nElectrodomesticos - 1; i++) {
                electrodomesticos[i] = electrodomesticos[i + 1];
            }
            nElectrodomesticos--;
            System.out.println("Electrodomestico eliminado");
        } else if (indice == -1) {
            System.out.println("No existe ningún electrodoméstico con ese identificador.");
        } else {
            System.out.println("No se puede eliminar un electrodoméstico con stock.");
        }
    }

    public void listarElectrodomesticos() {
        for (int i = 0; i < nElectrodomesticos; i++) {
            System.out.println(electrodomesticos[i]);
        }
    }

    public void listarElectrodomesticosEnStock() {
        for (int i = 0; i < nElectrodomesticos; i++) {
            if (electrodomesticos[i].isEnStock()) {
                System.out.println(electrodomesticos[i]);
            }
        }
    }

    public void obtenerPrecioElectrodomestico(String id) {
        int indice = buscarIndice(id);
        if (indice != -1) {
            System.out.println(electrodomesticos[indice].getPrecio());
        } else {
            System.out.println("No existe ningún electrodoméstico con ese identificador.");
        }
    }

    public int buscarIndice(String id) {

        for (int i = 0; i < nElectrodomesticos; i++) {
            if (electrodomesticos[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
