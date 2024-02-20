package Ejercicio_4;

public class Productos {

    protected String fechaCaducidad;
    protected int nLote;

    public Productos(String fechaCaducidad, int nLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.nLote = nLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getnLote() {
        return nLote;
    }

    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    @Override
    public String toString() {
        return "Producto [fechaCaducidad=" + fechaCaducidad + ", nLote=" + nLote + "]";
    }

    public void mostrarInformacion() {
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Número de Lote: " + nLote);
    }

}
