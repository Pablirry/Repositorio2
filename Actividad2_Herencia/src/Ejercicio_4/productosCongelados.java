package Ejercicio_4;

public class productosCongelados extends Productos {

    protected String fechaEnvasado;
    protected String paisOrigen;
    protected float temperaturaRecomendada;

    public productosCongelados(String fechaCaducidad, int nLote, String fechaEnvasado, String paisOrigen,
            float temperaturaRecomendada) {
        super(fechaCaducidad, nLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
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

    public float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return "producto Congelado [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
                + ", temperaturaRecomendada=" + temperaturaRecomendada + "]";
    }

    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Pais de origen: " + paisOrigen);
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada);

    }
}
