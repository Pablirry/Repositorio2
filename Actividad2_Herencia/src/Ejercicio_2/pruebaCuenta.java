package Ejercicio_2;

public class pruebaCuenta {

    public static void main(String[] args) {

        Cuenta c1= new Cuenta(1000, 12);
        c1.setComision(3);
        System.out.println("Despues de aplicar interes");
        System.out.println(c1.toString());
        c1.estractoMensual();
        System.out.println("Despues de aplicar estracto mensual");
        System.out.println(c1.toString());
        

    }

}
