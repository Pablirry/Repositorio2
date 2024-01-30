package Ejercicio_3;

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

    /**
     * Contructor por defecto.
     */

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    /**
     * Contructor con el parametro longitud
     * 
     * @param longitud : entero
     */

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    /**
     * Genera una contraseña aleatoria con la longitud que tenga.
     */

    private void generarPassword() {
        this.contraseña = "";
        for (int i = 1; i <= longitud; i++) {
            int tipo = (int) (Math.random() * 3);
            if (tipo == 0) {
                int valor = (int) (Math.random() * 10);
                contraseña += valor;
            }
            if (tipo == 1) {
                int valor = (int) (Math.random() * 26);
                char letraMay = (char) ('A' + valor);
                contraseña += letraMay;
            }
            if (tipo == 2) {
                int valor = (int) (Math.random() * 26);
                char letraMin = (char) ('a' + valor);
                contraseña += letraMin;
            }
        }
    }

    /**
     * Metodo get de la longitud
     * 
     * @return : entero
     */

    public int getLongitud() {
        return longitud;
    }

    /**
     * Metodo get de la contraseña
     * 
     * @return : String
     */

    public String getContraseña() {
        return contraseña;
    }

    /**
     * Metodo set para el atributo longitud
     * 
     * @param longitud : entero
     */

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Metodo toString de la clase Password
     */
    public String toString() {
        return "Contraseña {longitud=" + longitud + ", contraseña= "+ contraseña + "}";
    }

    /**
     * devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
     * @return : boolean
     */

    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < this.longitud; i++) {
            char car= this.contraseña.charAt(i);
            if(Character.isDigit(car)==true){
                numeros++;
            }
            if(Character.isUpperCase(car)==true){
                mayusculas++;
            }
            if(Character.isLowerCase(car)==true){
                minusculas++;
            }
        }

        if(numeros<=5) return false;
        if(mayusculas<=2) return false;
        if(minusculas<=1) return false;

        return true;
}

}
