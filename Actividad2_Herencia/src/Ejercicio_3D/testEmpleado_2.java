package Ejercicio_3D;

public class testEmpleado_2 {

    public static void main(String[] args) {

        // error no se peuden crear objetos de una clase abstracta
        // Empleado e1=new Empleado("paco");


        Empleado v[] = new Empleado[5];
        v[0] = new Directivo("paco");
        v[1] = new Operario("Paco") {
            public void categoria() {
                System.out.println("Paco--> categoria operario");
            }
        };
        v[2] = new Operario("Juan") {
            public void categoria() {
                System.out.println("Juan --> categoria operario");
            }
        };

        v[1].categoria();
        v[2].categoria();

        // v[1]=new Tecnico("juan");
        // v[2]=new Oficial("jose");
        // v[3]=new Directivo("paco2");
        // v[4]=new Tecnico("juan2");

        /*
         * for (int i = 0; i < v.length; i++) {
         * v[i].categoria();
         * }
         */

    }

}
