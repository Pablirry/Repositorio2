package Actividad;

public class Electrodomesticos {

    private String id;
    private String nombre;
    private String fabricante;
    private double precio;
    private boolean enStock;

    public Electrodomesticos(String id, String nombre, String fabricante, double precio, boolean enStock) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
        this.enStock = enStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEnStock() {
        return enStock;
    }

    public void setEnStock(boolean enStock) {
        this.enStock = enStock;
    }

    @Override
    public String toString() {
        return "\tElectrodomestico [id=" + id + ", nombre=" + nombre + ", fabricante=" + fabricante + ", precio="
                + precio + ", enStock=" + enStock + "]";
    }  

}
