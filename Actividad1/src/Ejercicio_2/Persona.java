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
    private int peso;
    private double altura;

    /*
     * Constante sexo por defecto
     */
    private static final char SEXO_POR_DEFECTO = 'H';

    /*
     * Constructores
     */

    /**
     * Constructor de la clase Persona
     */

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0.0;
    }

    /**
     * Contructor con tres parametros
     * 
     * @param nombre : String
     * @param edad   : entero
     * @param sexo   : caracter
     */

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad=edad;
        generaDNI();
        if(comprobarSexo(sexo)==true){
            this.sexo=sexo;
        }else{
            this.sexo=SEXO_POR_DEFECTO;
        }
        this.altura=0.0;
        this.peso=0;
    }

    /**
     * Constructor con todos los parametros
     * 
     * @param nombre : String
     * @param edad   : entero
     * @param sexo   : caracter
     * @param peso   : double
     * @param altura : double
     */

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        if (comprobarSexo(sexo) == true) {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_POR_DEFECTO;
        }
        this.peso = peso;
        this.altura = altura;
    }

    /*
     * Metodos privados
     */

    /**
     * Comprueba que el sexo introducido es correcto.
     * 
     * @param sexo : caracter
     * @return : caracter
     */

    private boolean comprobarSexo(char letra) {
        if (letra=='H' || letra=='h'){
            return true;
        }
        if (letra=='M' || letra=='m'){
            return true;
        }
        return false;

    }

    /**
     * Genera un numero de 8 cifras aleatorio
     * 
     * @return : String
     */

    private String generaDNI() {
        Random rand = new Random();
        int numeroDNI = rand.nextInt(90000000) + 10000000;
        char letraDNI = calcularLetraDNI(numeroDNI);
        return String.valueOf(numeroDNI) + letraDNI;
    }


    /**
     * Calcula la letra del DNI
     * 
     * @param dni : entero
     * @return : caracter
     */

    private char calcularLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return letras.charAt(resto);
    }

    /*
     * Métodos públicos
     */

    /**
     * calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)),
     * si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si
     * devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo
     * de su peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25
     * significa que tiene sobrepeso, la función devuelve un 1.
     * 
     * @return : entero
     */
    
    public int calcularIMC() {
        double imc = peso / (altura*altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Indica si es mayor de edad
     * 
     * @return : boolean
     */

    public boolean esMayorDeEdad() {
        if(edad>18){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Metodo toString de la clase Persona
     */

    public String toString() {
        return "nombre=" + nombre +
                "\nEdad=" + edad +
                "\nDNI=" + DNI +
                "\nSexo=" + sexo +
                "\nPeso=" + peso +
                "\nAltura=" + altura;
    }

    /**
     * Metodo set del atributo nombre
     * 
     * @param nombre : String
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo set del atributo edad
     * 
     * @param edad : entero
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo set del atributo sexo
     * 
     * @param sexo : caracter
     */

    public void setSexo(char sexo) {
        if(comprobarSexo(sexo)==true){
            this.sexo=sexo;
        }else{
            this.sexo=SEXO_POR_DEFECTO;
        }
    }

    /**
     * Metodo set del atributo peso
     * 
     * @param peso : double
     */

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Metodo set del atributo altura
     * 
     * @param altura : double
     */

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metodo get del atributo nombre
     * 
     * @return : String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo get del atributo edad
     * 
     * @return : entero
     */

    public int getEdad() {
        return edad;
    }

    /**
     * Metodo get del atributo sexo
     * 
     * @return : caracter
     */

    public char getSexo() {
        return sexo;
    }

    /**
     * Metodo get del atributo peso
     * 
     * @return : double
     */

    public double getPeso() {
        return peso;
    }

    /**
     * Metodo get del atributo altura
     * 
     * @return : double
     */

    public double getAltura() {
        return altura;
    }

    /**
     * Metodo get del atributo DNI
     * 
     * @return : String
     */

    public String getDNI() {
        return DNI;
    }

}
