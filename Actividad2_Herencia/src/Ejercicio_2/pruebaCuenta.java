package Ejercicio_2;

public class pruebaCuenta {

    public static void main(String[] args) {

        cuentaAhorro ca = new cuentaAhorro(30300, 0);
        ca.estractoMensual();
        ca.imprimir();
        ca.retirar(1000);
        ca.retirar(1000);
        ca.retirar(1000);
        ca.retirar(1000);
        ca.retirar(1000);
        ca.retirar(1000);
        ca.estractoMensual();
        System.out.println("Despues de retirar 6 veces 1000");
        ca.imprimir();
        System.out.println("****************************************************************");
        cuentaCorriente cc = new cuentaCorriente(1000, 12);
        cc.imprimir();
        cc.retirar(400); // saldo 600
        cc.imprimir();
        cc.retirar(900); // sobregiro 300
        cc.consignar(100);
        cc.consignar(500);
        cc.imprimir();
        

    }

}
