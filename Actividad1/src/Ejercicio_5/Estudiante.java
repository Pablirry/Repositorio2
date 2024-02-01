package Ejercicio_5;

public class Estudiante {
	
	private String nombre;
    private String apellidos;
    private int codigo;
    private int numSemestre;
    private double notaFinal;

    /**
     * Constructor con todos los atributos
     * @param nombre : String
     * @param apellidos : String
     * @param codigo : entero
     * @param numSemestre : entero
     * @param notaFinal : double
     */
    
    public Estudiante(String nombre, String apellidos, int codigo, int numSemestre, double notaFinal){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.numSemestre = numSemestre;
        this.notaFinal = notaFinal;
    }

    /**
     * Metodo get del atributo nombre
     * @return : String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set del atributo nombre
     * @param nombre : String
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get del atributo apellidos
     * @return : String
     */

    public String getApellidos() {
        return apellidos;
    }

    /**
     * Metodo set del atributo apellidos
     * @param apellidos : String
     */

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo get del atributo codigo
     * @return : entero
     */

    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo set del atributo codigo
     * @param codigo : entero
     */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo get del atributo numSemestre
     * @return : entero
     */

    public int getNumSemestre() {
        return numSemestre;
    }

    /**
     * Metodo set del atributo numSemestre
     * @param numSemestre : entero
     */

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    /**
     * Metodo get del atributo notaFinal
     * @return : double
     */

    public double getNotaFinal() {
        return notaFinal;
    }

    /**
     * Metodo set del atributo notaFinal
     * @param notaFinal : double
     */

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    /**
     * Metodo toString de la clase Estudiante
     */

    
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", codigo=" + codigo + ", numSemestre="
                + numSemestre + ", notaFinal=" + notaFinal + "]";
    }

    

}
