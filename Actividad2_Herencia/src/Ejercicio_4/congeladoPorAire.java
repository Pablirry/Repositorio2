package Ejercicio_4;

public class congeladoPorAire extends productosCongelados {

    private float nitrogeno;
    private float oxigeno;
    private float dioxidoCarbono;
    private float vaporAgua;

    public congeladoPorAire(String fechaCaducidad, int nLote, String fechaEnvasado, String paisOrigen,
            float temperaturaRecomendada, float nitrogeno, float oxigeno, float dioxidoCarbono, float vaporAgua) {
        super(fechaCaducidad, nLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    public float getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(float nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public float getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(float oxigeno) {
        this.oxigeno = oxigeno;
    }

    public float getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(float dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public float getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(float vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tcongelado por Aire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno
                + ", dioxidoCarbono="
                + dioxidoCarbono + ", vaporAgua=" + vaporAgua + "]";
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Nitrogeno: " + nitrogeno);
        System.out.println("Oxigeno: " + oxigeno);
        System.out.println("Dioxido de carbono: " + dioxidoCarbono);
        System.out.println("Vapor de agua: " + vaporAgua);
    }

}
