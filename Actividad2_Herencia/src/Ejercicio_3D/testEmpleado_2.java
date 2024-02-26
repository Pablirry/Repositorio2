package Ejercicio_3D;

public class testEmpleado_2 {

    public static void main(String[] args) {

        // error no se peuden crear objetos de una clase abstracta
        // Empleado e1=new Empleado("paco");

        Empleado v[] = new Empleado[5];
        v[0] = new Directivo("Direc1");
        v[1] = new Oficial("Ofi1");
        v[2] = new Tecnico("Tec1");
        v[3] = new Directivo("Direc2");
        v[4] = new Oficial("Ofi2");

        // v[1]=new Tecnico("juan");
        // v[2]=new Oficial("jose");
        // v[3]=new Directivo("paco2");
        // v[4]=new Tecnico("juan2");

        for (int i = 0; i < v.length; i++) {
            v[i].categoria();
            // tratar a todos como empleados
            // down cast
        }

        // upcast o casting
        v[0] = new Directivo("Direc1");
        Directivo d1 = (Directivo) v[0];
        d1.mostrarDatos();
        /* no genera error de compilacion pero si genera excepcion = ruptura traumatica del sistema
         * Oficial of1 = (Oficial) v[0];
         * of1.categoria();
        */

    }

}
