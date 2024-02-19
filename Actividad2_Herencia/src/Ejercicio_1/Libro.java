package Ejercicio_1;

public class Libro {

    protected String titulo;
    protected String autor;
    protected double precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }

    public double precioConIva(double iva){

        return precio+precio*(iva/100);
    }

    

}
