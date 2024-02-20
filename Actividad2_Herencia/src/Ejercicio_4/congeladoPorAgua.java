package Ejercicio_4;

public class congeladoPorAgua extends productosCongelados {

    private float salinidadAgua;

    public congeladoPorAgua(String fechaCaducidad, int nLote, String fechaEnvasado, String paisOrigen,
            float temperaturaRecomendada, float salinidadAgua) {
        super(fechaCaducidad, nLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public float getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(float salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tcongeladoPorAgua [salinidadAgua=" + salinidadAgua + "]";
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salinidad de agua: " + salinidadAgua);
    }

}
