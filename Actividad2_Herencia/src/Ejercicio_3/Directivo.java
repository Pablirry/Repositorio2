package Ejercicio_3;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    public String datos() {
        return super.datos() + " --> Directivo";
    }

    
}
