package Ejercicio_1;

public class Novelas extends Libro {

    private TipoNovela Tipo;

    public Novelas(String titulo, String autor, TipoNovela tipo) {
        super(titulo, autor);
        Tipo = tipo;
    }

    public TipoNovela getTipo() {
        return Tipo;
    }

    public void setTipo(TipoNovela tipo) {
        Tipo = tipo;
    }

	@Override
	public String toString() {
		return "Novelas [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

    
    

}
