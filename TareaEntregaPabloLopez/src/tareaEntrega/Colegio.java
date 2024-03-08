package tareaEntrega;

public class Colegio {

    private Persona[] personas;
    private int contPersonas;

    /**
     * Constructor de la clase Colegio
     * 
     * @param capacidad
     */

    public Colegio(int capacidad) {

        this.personas = new Persona[capacidad];
        this.contPersonas = 0;
    }

    /**
     * Metodo get de la clase Colegio
     * 
     * @return : Persona[]
     */

    public Persona[] getPersonas() {
        return personas;
    }

    /**
     * Metodo set de la clase Colegio
     * 
     * @param personas : Persona[]
     */

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    /**
     * Metodo para insertar una persona al colegio
     * 
     * @param persona : Persona
     */

    public void insertarPersona(Persona persona) {
        if (contPersonas < personas.length) {
            personas[contPersonas] = persona;
            contPersonas++;
            System.out.println("Persona insertada");
            persona.identificate();
            System.out.println();
        } else {
            System.out.println("No se puede añadir más personas, la capacidad está llena.");
        }
    }

    /**
     * Metodo para listar las personas del colegio
     */

    public void listarColegio() {
        System.out.println("Listado de personas del colegio:");
        for (Persona persona : personas) {
            if (persona != null)
                System.out.println(persona.toString());
            System.out.println();
        }
        if (contPersonas == 0) {
            System.out.println("No hay personas asignadas al colegio.");
        }
    }

    /**
     * Metodo para borrar una persona del colegio
     * 
     * @param nif : String
     */

    public void borrarPersona(String nif) {

        for (int i = 0; i < contPersonas; i++) {
            if (personas[i] != null && personas[i].getNif().equals(nif)) {

                personas[i] = null;
                System.out.println("Persona con NIF " + nif + " eliminada correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ninguna persona con el NIF " + nif + ".");

    }

    /**
     * Metdo para buscar una persona por su NIF
     * 
     * @param nif : String
     */

    public void buscarPersona(String nif) {
        for (Persona persona : personas) {
            if (persona != null && persona.getNif().equals(nif)) {
                System.out.println("Persona encontrada: " + persona.toString());
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con el NIF " + nif + ".");
    }

}
