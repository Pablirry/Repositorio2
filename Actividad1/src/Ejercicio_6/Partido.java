package Ejercicio_6;

public class Partido {

    private String resultado;
    private String campo;
    private String arbitro;
    private String incidencias;

    private Equipo local;
    private Equipo visitante;

    /**
     * Contructor de la clase Partido con sus atributos
     * @param resultado : String
     * @param campo : String
     * @param arbitro : String
     * @param local : Equipo
     * @param visitante : Equipo
     */
    
    public Partido(String resultado, String campo, String arbitro, Equipo local, Equipo visitante) {
        this.resultado = resultado;
        this.campo = campo;
        this.arbitro = arbitro;
        this.local = local;
        this.visitante = visitante;
    }

    /**
     * Metodo get del atributo resultado
     * @return : String
     */

    public String getResultado() {
        return resultado;
    }

    /**
     * Metodo set del atributo resultado
     * @param resultado : String
     */

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * Metodo get del atributo campo
     * @return : String
     */

    public String getCampo() {
        return campo;
    }

    /**
     * Metodo set del atributo campo
     * @param campo : String
     */

    public void setCampo(String campo) {
        this.campo = campo;
    }

    /**
     * Metodo get del atributo arbitro
     * @return : String
     */

    public String getArbitro() {
        return arbitro;
    }

    /**
     * Metodo set del atributo arbitro
     * @param arbitro : String
     */

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    /**
     * Metodo get del atributo incidencias
     * @return : String
     */

    public String getIncidencias() {
        return incidencias;
    }

    /**
     * Metodo set del atributo incidencias
     * @param incidencias : String
     */

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    /**
     * Metodo get del atributo local
     * @return : Equipo
     */

    public Equipo getLocal() {
        return local;
    }

    /**
     * Metodo set del atributo local
     * @param local : Equipo
     */

    public void setLocal(Equipo local) {
        this.local = local;
    }

    /**
     * Metodo get del atributo visitante
     * @return : Equipo
     */

    public Equipo getVisitante() {
        return visitante;
    }

    /**
     * Metodo set del atributo visitante
     * @param visitante : Equipo
     */

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    /**
     * Metodo toString de la clase partido
     */

    public String toString() {
        String texto = "Partido [resultado=" + resultado + ", campo=" + campo + ", arbitro=" + arbitro + ", incidencias="
                + incidencias + "]\n";
                
            texto += "LOCAL\n" + local.toString() +"\n";
            texto += "VISITANTE\n" + visitante.toString();

            return texto;
    }

    

}
