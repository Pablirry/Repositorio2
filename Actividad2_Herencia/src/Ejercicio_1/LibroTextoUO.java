package Ejercicio_1;

public class LibroTextoUO extends LibroTexto {

    private String facultad;

    public LibroTextoUO(String titulo, String autor, int curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUO [facultad=" + facultad + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", curso=" + curso + "]";
    }

    

}
