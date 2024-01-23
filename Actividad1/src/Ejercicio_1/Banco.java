package Ejercicio_1;

public class Banco {

    /*
     * Crear clase banco
     * Cuentas[4]
     * addCuenta(cuenta, pos)
     * mostrarCuentas
     */

    private Cuenta v[];

    /*
     * Contructores
     */

    /**
     * Contructor de la clase banco, dimensiona el vector a 4 posiciones
     */

    public Banco() {
        v = new Cuenta[4];
    }

    /**
     * Insertar en la posicion pos un nuevo objeto de tipo cuenta
     * 
     * @param c   : objeto cuenta
     * @param pos : entero
     */

    public void addCuenta(Cuenta c, int pos) {
        if (pos >= 0 && pos < v.length) {
            v[pos] = c;

        } else {
            System.out.println("Error en la posicion");
        }

    }

    /**
     * Muestra por pantalla el contenido del vector v
     */

    public void mostrarCuentas() {
        for (int i = 0; i < v.length; i++) {
            Cuenta c = v[i];
            System.out.println(c.toString());
        }

    }

}
