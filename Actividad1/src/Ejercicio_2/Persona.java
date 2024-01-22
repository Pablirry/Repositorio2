package Ejercicio_2;

import java.util.Random;

public class Persona {

    /*
     * Haz una clase llamada Persona que siga las siguientes condiciones:
     * • Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y
     * altura. No queremos que se accedan directamente a ellos. Piensa que
     * modificador de acceso es el más adecuado, también su tipo.
     * • Por defecto, todos los atributos menos el DNI serán valores por defecto
     * según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre
     * por defecto, usa una constante para ello.
     * Se implantaran varios constructores:
     * - Un constructor por defecto.
     * - Un constructor con el nombre, edad y sexo, el resto por defecto.
     * - Un constructor con todos los atributos como parámetro.
     * Los métodos que se implementaran son:
     * • calcularIMC(): calculara si la persona esta en su peso ideal (peso en
     * kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
     * función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
     * significa que esta por debajo de su peso ideal la función devuelve un 0 y si
     * devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
     * devuelve un 1.
     * • esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
     * • comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
     * no es correcto, sera H. No sera visible al exterior.
     * • toString(): devuelve toda la información del objeto.
     * • generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de
     * este su número su letra correspondiente. Este método sera invocado cuando se
     * construya el objeto. Puedes dividir el método para que te sea más fácil. No
     * será visible al exterior.
     * • Métodos set de cada parámetro, excepto de DNI.
     */

    // Atributos

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo; // H o M
    private double peso;
    private double altura;

    // Constante sexo por defecto
    private static final char SEXO_POR_DEFECTO = 'H';

    // Constructores

    public Persona() {
        this("", 0, SEXO_POR_DEFECTO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Metodos privados

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_POR_DEFECTO;

    }

    private String generaDNI() {
        Random rand = new Random();
        int numeroDNI = rand.nextInt(90000000) + 10000000;
        char letraDNI = calcularLetraDNI(numeroDNI);
        return Integer.toString(numeroDNI) + letraDNI;
    }

    private char calcularLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return letras.charAt(resto);
    }

    // Métodos públicos
    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                "\nEdad=" + edad +
                "\nDNI=" + DNI +
                "\nSexo=" + sexo +
                "\nPeso=" + peso + 
                "\nAltura=" + altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


}
