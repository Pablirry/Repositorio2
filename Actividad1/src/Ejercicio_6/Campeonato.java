package Ejercicio_6;

public class Campeonato {

    private Partido partidos[];
    private int numPartidos;

    /**
     * constructor de la clase Campeonato
     */

    public Campeonato() {
        partidos = new Partido[10];
        numPartidos = 0;
    }

    /**
     * Metodo para añadir un partido al campeonato
     * 
     * @param resultado : String
     * @param campo     : String
     * @param arbitro   : String
     * @param local     : Equipo
     * @param visitante : Equipo
     */

    public void añadirPartido(String resultado, String campo, String arbitro, Equipo local, Equipo visitante) {
        if (numPartidos < partidos.length) {
            Partido nuevo = new Partido(resultado, campo, arbitro, local, visitante);
            int pos = numPartidos;
            partidos[pos] = nuevo;
            numPartidos++;
        }

    }

}
