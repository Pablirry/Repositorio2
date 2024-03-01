package Ejercicio_5;

public class testPersona {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Calle 1", "Madrid", "28001", "España");

        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "12345678Z", direccion1, 1);
        Estudiante estudiante2 = new Estudiante("Pedro", "Gomez", "87654321Z", direccion1, 2);
        Estudiante estudiante3 = new Estudiante("Maria", "Jimenez", "987654321Z", direccion1, 3);

        Profesor profesor1 = new Profesor("Juan", "Perez", "12345678Z", direccion1, "1");
        Profesor profesor2 = new Profesor("Pedro", "Gomez", "87654321Z", direccion1, "2");
        Profesor profesor3 = new Profesor("Maria", "Jimenez", "987654321Z", direccion1, "3");

        estudiante1.identificate();
        System.out.println();
        estudiante2.identificate();
        System.out.println();
        estudiante3.identificate();
        System.out.println();
        profesor1.identificate();
        System.out.println();
        profesor2.identificate();
        System.out.println();
        profesor3.identificate();
    }
}
