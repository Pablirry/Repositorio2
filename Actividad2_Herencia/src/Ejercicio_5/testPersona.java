package Ejercicio_5;

import java.util.ArrayList;

public class testPersona {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Direccion direccion1 = new Direccion();
        Direccion direccion2 = new Direccion("Calle 1", "Madrid", "28001", "España");

        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "12345678Z", direccion1, 1);
        Estudiante estudiante2 = new Estudiante("Pedro", "Gomez", "87654321Z", direccion1, 2);
        Estudiante estudiante3 = new Estudiante("Maria", "Jimenez", "987654321Z", direccion2, 3);

        Profesor profesor1 = new Profesor("Juan", "Perez", "12345678Z", direccion1, "123456789");
        Profesor profesor2 = new Profesor("Pedro", "Gomez", "87654321Z", direccion2, "987654321");
        Profesor profesor3 = new Profesor("Maria", "Jimenez", "987654321Z", direccion2, "567890123");

        listaPersonas.add(estudiante1);
        listaPersonas.add(estudiante2);
        listaPersonas.add(estudiante3);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);

        for (Persona persona : listaPersonas) {
            System.out.println(persona.toString());
            persona.identificate (); 
            System.out.println();
        }
    }
}
