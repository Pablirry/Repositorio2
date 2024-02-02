package Ejercicio_6;

public class Partido {

    private String resultado;
    private String campo;
    private String arbitro;
    private String incidencias;

    private Equipo local;
    private Equipo visitante;
    
    public Partido(String resultado, String campo, String arbitro, Equipo local, Equipo visitante) {
        this.resultado = resultado;
        this.campo = campo;
        this.arbitro = arbitro;
        this.local = local;
        this.visitante = visitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public String toString() {
        String texto = "Partido [resultado=" + resultado + ", campo=" + campo + ", arbitro=" + arbitro + ", incidencias="
                + incidencias + "]\n";
                
            texto += "LOCAL\n" + local.toString() +"\n";
            texto += "VISITANTE\n" + visitante.toString();

            return texto;
    }

    

}
