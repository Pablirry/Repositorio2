package Ejercicio_4;

public class ProductosRefrigerados extends Productos {

    private String codigoSupervision;
    private String fechaEnvasado;
    private float temperaturaRecomendada;
    private String paisOrigen;

    public ProductosRefrigerados(String fechaCaducidad, int nLote, String codigoSupervision, String fechaEnvasado,
            float temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, nLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "\tProducto Refrigerado [codigoSupervision=" + codigoSupervision
                + ", fechaEnvasado=" + fechaEnvasado
                + ", temperaturaRecomendada=" + temperaturaRecomendada + ", paisOrigen=" + paisOrigen + "]";
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("codigoSupervision" + codigoSupervision);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada);
        System.out.println("Pais de origen: " + paisOrigen);
    }

}
