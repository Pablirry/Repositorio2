package Ejercicio_3;

public class testPersona {

	public static void main(String[] args) {
		
		Direccion direccion1 = new Direccion("Calle 1", "Madrid", "28001", "España");

        Estudiante e1 = new Estudiante("XXX", "XXX", "XXX", direccion1, 1);
        Estudiante e2 = new Estudiante("AAA", "AAA", "AAA", direccion1, 1);
        Estudiante e3 = new Estudiante("CCC", "CCC", "CCC", direccion1, 1);

        Profesor p1 = new Profesor(1, "Juan", "Perez", "12345678Z", direccion1);
        Profesor p2 = new Profesor(2, "Pedro", "Gomez", "87654321Z", direccion1);
        Profesor p3 = new Profesor(3, "Maria", "Jimenez", "987654321Z", direccion1);

        e1.identificate();
        System.out.println();
        e2.identificate();
        System.out.println();
        e3.identificate();
        System.out.println();
        p1.identificate();
        System.out.println();
        p2.identificate();
        System.out.println();
        p3.identificate();

        System.out.println(p3.getContVeces());

	}

}
