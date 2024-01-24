package Ejercicio_3;

import java.util.Random;

public class Password {

    /*
     * Haz una clase llamada Password que siga las siguientes condiciones:
     * Que tenga los atributos longitud y contraseña . Por defecto, la longitud
     * sera de 8.
     * Los constructores serán los siguiente:
     * o Un constructor por defecto.
     * o Un constructor con la longitud que nosotros le pasemos. Generara una
     * contraseña aleatoria con esa longitud.
     * Los métodos que implementa serán:
     * • esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte
     * debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
     * • generarPassword(): genera la contraseña del objeto con la longitud que
     * tenga.
     * • Método get para contraseña y longitud.
     * • Método set para longitud.
     */

    private int longitud;
    private String contraseña;

    /*
     * Constructores
     */

    /**
     * Constructor por defecto.
     */

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    /**
     * Constructor con un parametro.
     * 
     * @param longitud : entero
     */

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    /*
     * Metodos
     */

    /**
     * Devuelve si la contraseña es fuerte o no.
     * 
     * @return : booleano
     */

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isUpperCase(c)) {
                mayusculas++;
            }

        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    /**
     * Genera una contraseña aleatoria con la longitud que tenga.
     */

    public void generarPassword() {
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        this.contraseña = password.toString();
    }

    /*
     * Get y set
     */

    /**
     * Metodo get del atributo longitud
     * 
     * @return : entero
     */

    public int getLongitud() {
        return longitud;
    }

    /**
     * Metodo get del atributo contraseña
     * 
     * @return : String
     */

    public String getContraseña() {
        return contraseña;
    }

    /**
     * Metodo set del atributo longitud
     * 
     * @param longitud : entero
     */

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
