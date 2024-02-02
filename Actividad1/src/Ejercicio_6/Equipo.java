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
     * @param nombre
     * @param patrocinador
     * @param color1
     * @param color2
     * @param categoria
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

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

    public void añadirParticipante(Participante p) {
        if (contParticipantes < 10) {
            Participantes[contParticipantes] = p;
            contParticipantes++;
        } else {
            System.out.println("No hay lugar para mas participantes");
        }
    }

}
