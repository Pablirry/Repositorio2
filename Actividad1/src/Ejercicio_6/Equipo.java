package Ejercicio_6;

public class Equipo {

    private String nombre;
    private String patrocinador;
    private String color1;
    private String color2;
    private String categoria;
    private int contParticipantes;
    private Participante[] Participantes;

    /**
     * Conrtuctor con todos los atributos
     * 
     * @param nombre       : String
     * @param patrocinador : String
     * @param color1       : String
     * @param color2       : String
     * @param categoria    : String
     */

    public Equipo(String nombre, String patrocinador, String color1, String color2, String categoria) {
        this.nombre = nombre;
        this.patrocinador = patrocinador;
        this.color1 = color1;
        this.color2 = color2;
        this.categoria = categoria;

        this.Participantes = new Participante[10];
        contParticipantes = 0;
    }

    /**
     * Metodo get del atributo nombre
     * 
     * @return : String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set del atributo nombre
     * 
     * @param nombre : String
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get del atributo patrocinador
     * 
     * @return : String
     */

    public String getPatrocinador() {
        return patrocinador;
    }

    /**
     * Metodo set del atributo patrocinador
     * 
     * @param patrocinador : String
     */

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    /**
     * Metodo get del atributo color1
     * 
     * @return : String
     */

    public String getColor1() {
        return color1;
    }

    /**
     * Metodo set del atributo color1
     * 
     * @param color1 : String
     */

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    /**
     * Metodo get del atributo color2
     * 
     * @return : String
     */

    public String getColor2() {
        return color2;
    }

    /**
     * Metodo set del atributo color2
     * 
     * @param color2 : String
     */

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    /**
     * Metodo get del atributo categoria
     * 
     * @return : String
     */

    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo set del atributo categoria
     * 
     * @param categoria : String
     */

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo toString de la clase Equipo
     */

    @Override
    public String toString() {
        String texto = "**************************************\n";
        texto += "Equipo [nombre=" + nombre + ", patrocinador=" + patrocinador + ", color1=" + color1 + ", color2="
                + color2 + ", categoria=" + categoria + ", participantes=" + contParticipantes + "]";

        for (int i = 0; i < contParticipantes; i++) {
            Participante p = Participantes[i];
            texto += "\n" + p.toString();
        }
        return texto;
    }

    /**
     * Metodo para añadir un participante al equipo
     * 
     * @param p : Participante
     */

    public void añadirParticipante(Participante p) {
        if (this.contParticipantes < Participantes.length) {
            Participantes[contParticipantes] = p;
            this.contParticipantes++;
        } else {
            System.out.println("No hay lugar para mas participantes");
        }
    }

}
