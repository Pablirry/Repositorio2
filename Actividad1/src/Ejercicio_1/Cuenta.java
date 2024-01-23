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

    /*
     * Atributos
     */

    private String titular;
    private double cantidad;

    /*
     * Constructores
     */

    /**
     * Constructor con un parámetro y la cantidad opcional
     * 
     * @param titular : String
     */

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    /**
     * Constructor con dos parámetros
     * 
     * @param titular  : String
     * @param cantidad : double
     */

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    /*
     * Métodos set y get
     */

    /**
     * Metodo get del atributo titular
     * @return : String
     */

    public String getTitular() {
        return titular;
    }

    /**
     * Metodo set del atributo titular
     * 
     * @param titular : String
     */

    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Metodo get del atributo cantidad
     * @return : double
     */

    public double getCantidad() {
        return cantidad;
    }

    /**
     * Metodo set del atributo cantidad
     * 
     * @param cantidad : double
     */

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo tuString de la clase cuenta
     */

    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    /*
     * Métodos especiales
     */

    /**
     * Método que permite ingresar una cantidad a la cuenta
     * 
     * @param cantidad : double
     */

    public void ingresar(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
    }

    /**
     * Método que permite retirar una cantidad de la cuenta
     * 
     * @param cantidad : double
     */

    public void retirar(double cantidadACuenta) {

        if (this.cantidad < cantidadACuenta) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidadACuenta;
        }
    }
}
