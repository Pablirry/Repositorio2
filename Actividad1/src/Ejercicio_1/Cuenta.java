package Ejercicio_1;

public class Cuenta {

    /*
     * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y
     * cantidad (puede tener decimales). El titular será obligatorio y la cantidad
     * es opcional. Crea dos constructores que cumpla lo anterior.
     * Crea sus métodos constructor, get, set y toString.
     * Tendrá dos métodos especiales:
     * • ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la
     * cantidad introducida es negativa, no se hará nada.
     * • retirar(double cantidad): se retira una cantidad a la cuenta, si restando
     * la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta
     * pasa a ser 0.
     */

    // Atributos
    private String titular;
    private double cantidad;

    // Constructores
    // Contructor con cantidad opcional
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Contructor con cantidad titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos get y set

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    // Métodos especiales
    // Método para ingresar una cantidad
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se ha ingresado la cantidad de " + cantidad + " euros a la cuenta de " + titular);
            ;
        } else {
            System.out.println("La cantidad debe ser mayor que cero");
        }
    }

    public void retirar(double cantidad) {
        double saldoDespues = this.cantidad - cantidad;
        if (cantidad > 0) {
            if (saldoDespues >= 0) {
                this.cantidad -= cantidad;
                System.out.println("Se ha retirado la cantidad de " + cantidad + " euros a la cuenta de " + titular);
            } else {
                System.out.println("La cantidad retirada supera el saldo actuañ");
                this.cantidad = 0;
            }
        }else{
            System.out.println("La cantidad debe ser mayor que cero");
        }
    }
}
