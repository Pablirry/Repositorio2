package Ejercicio_2;

public class cuentaAhorro extends Cuenta {

    protected boolean estaActiva;

    public cuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            estaActiva = false;
        } else {
            estaActiva = true;
        }
    }

    /**
     * Consignar: se puede consignar dinero si la cuenta está activa. Debe invocar
     * al método heredado.
     * 
     * @param cantidad : float
     */

    public void consignar(float cantidad) {
        if (estaActiva == true) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta no esta activa");
            ;
        }
    }

    /**
     * Retirar: es posible retirar dinero si la cuenta está activa. Debe invocar al
     * método heredado.
     * 
     * @param cantidad : float
     */

    public void retirar(float cantidad) {
        if (estaActiva == true) {
            super.retirar(cantidad);
            if (saldo < 10000) {
                estaActiva = false;
            }
        }
    }

    /**
     * Extracto mensual: si el número de retiros es mayor que 4, por cada retiro
     * adicional, se cobra $1000 como comisión mensual. Al generar el extracto, se
     * determina si la cuenta está activa o no con el saldo.
     */

    public void estractoMensual() {
        super.estractoMensual();
        if (numeroRetiros > 4) {
            saldo = saldo - 1000;
        }

        if (saldo < 10000) {
            estaActiva = false;
        }
    }

    /**
     * muestra en pantalla el saldo de la cuenta, la comisión mensual y el número de transacciones realizadas (suma de cantidad de consignaciones y retiros).
     */

    public void imprimir(){

        System.out.println("Saldo: "+saldo);
        System.out.println("Comision: "+comision);
        int nTransacciones = this.numConsignaciones+this.numeroRetiros;
        System.out.println("Numero de transacciones: "+ nTransacciones);

    }

}
