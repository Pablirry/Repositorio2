package Ejercicio_4;

public class ProductosFrescos extends Productos {

    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos(String fechaCaducidad, int nLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, nLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "\tProducto Fresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
                + "]";
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Pais de origen: " + paisOrigen);
    }

}
