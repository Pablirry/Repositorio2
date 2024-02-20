package Ejercicio_2;

public class cuentaCorriente extends Cuenta {

    protected float sobregiro;

    public cuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }

    /**
     * retira dinero de la cuenta actualizando su saldo. Se puede retirar dinero
     * superior al saldo. El dinero que se debe queda como sobregiro.
     * 
     * @param cantidad : float
     */

    public void retirar(float cantidad) {
        if (cantidad < saldo) {
            saldo = saldo-cantidad;
        } else {
            sobregiro= cantidad-saldo;
            saldo=0;
        }
        numeroRetiros++;
    }

    /**
     * Invoca al método heredado. Si hay sobregiro, la cantidad consignada reduce el
     * sobregiro.
     * 
     * @param cantidad : float
     */

    public void consignar(float cantidad) {

        if (sobregiro > 0) {
            if(sobregiro<=cantidad){
                saldo=cantidad-sobregiro;
                sobregiro=0;
            }else{
                sobregiro=sobregiro-cantidad;
            }
            numConsignaciones++;
        }else{
            super.consignar(cantidad);
        }
    }

    public void estractoMensual() {
        super.estractoMensual();
    }

    /**
     * muestra en pantalla el saldo de la cuenta, la comisión mensual, el número de
     * transacciones realizadas (suma de cantidad de consignaciones y retiros) y el
     * valor de sobregiro.
     */

    public void imprimir() {
        System.out.println("Saldo: " +saldo);
        System.out.println("Comisión mensual: " +comision);
        int nTransacciones = numConsignaciones+numeroRetiros;
        System.out.println("Número de transacciones: " +nTransacciones);
        System.out.println("Sobregiro: " +sobregiro);

    }

}
