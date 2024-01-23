package Ejercicio_1;

public class PruebaCuenta {

    public static void main(String[] args) {

        // Crear una cuenta con titular
        Cuenta c1 = new Cuenta("Juan", 150.0);
        System.out.println(c1.toString());
        Cuenta c2 = new Cuenta("Pedro", 200.0);
        System.out.println(c2.toString());
        Cuenta c3 = new Cuenta("Paco");
        System.out.println(c3.toString());

        /*
         * PRUEBA CUENTA 1
         */

        c1.setCantidad(100.0);
        System.out.println("Nueva Cantidad: " + c1.toString());

        // c1 > cantidad 100
        c1.ingresar(100.0); // Cantidad: 300.0
        if (c1.getCantidad() == 200) {
            System.out.println("Método ingresar funciona correctamente");
        } else {
            System.out.println("Metodo ingresar no funciona correctamente");
        }
        System.out.println(c1.toString());

        // c1 => cantidad=200
        c1.retirar(300);
        // c1=> cantidad=200
        if (c1.getCantidad() == 0) {
            System.out.println("El metodo retirar funciona correctamente");
        } else {
            System.out.println("El metodo retirar no funciona correctamente");
        }
        System.out.println(c1.toString());

    }

}
