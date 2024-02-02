package Ejercicio_7;

public class Polideportivos {

    private String nombre;
    private String direccion;
    private int extension;
    private Pistas[] pistas;

    public Polideportivos(String nombre, String direccion, int extension, int numPistas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.extension = extension;
        this.pistas = new Pistas[numPistas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public Pistas[] getPistas() {
        return pistas;
    }

    public void setPistas(Pistas[] pistas) {
        this.pistas = pistas;
    }

    

    



}
