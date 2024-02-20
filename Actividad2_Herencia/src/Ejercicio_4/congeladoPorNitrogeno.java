package Ejercicio_4;

public class congeladoPorNitrogeno extends productosCongelados {

    private String metodoCongelacion;
    private int tiempoExposicion;

    public congeladoPorNitrogeno(String fechaCaducidad, int nLote, String fechaEnvasado, String paisOrigen,
            float temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, nLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tcongelado por Nitrogeno [metodoCongelacion=" + metodoCongelacion
                + ", tiempoExposicion="
                + tiempoExposicion + "]";
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Metodo de congelacion: " + metodoCongelacion);
        System.out.println("Tiempo de exposicion: " + tiempoExposicion);
    }

}
