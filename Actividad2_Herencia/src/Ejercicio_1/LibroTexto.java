package Ejercicio_1;

public class LibroTexto extends Libro {

    protected int curso;

    public LibroTexto(String titulo, String autor, int curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibroTexto [curso=" + curso + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }
}

