package Ejercicio_7;

public class Usuarios {

    /*
     * nombre, apellidos, email, teléfono, dni y fecha de nacimiento
     */

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private String fechaNacimiento;

    /**
     * Constructor con todos los atributos
     * 
     * @param nombre          : String
     * @param apellidos       : String
     * @param email           : String
     * @param telefono        : String
     * @param dni             : String
     * @param fechaNacimiento : String
     */

    public Usuarios(String nombre, String apellidos, String email, String telefono, String dni,
            String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
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
     * Metodo set del atributo nombre
     * 
     * @param nombre : String
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get del atributo apellidos
     * 
     * @return : String
     */

    public String getApellidos() {
        return apellidos;
    }

    /**
     * Metodo set del atributo apellidos
     * 
     * @param apellidos : String
     */

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo get del atributo email
     * 
     * @return : String
     */

    public String getEmail() {
        return email;
    }

    /**
     * Metodo set del atributo email
     * 
     * @param email : String
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo get del atributo telefono
     * 
     * @return : String
     */

    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo set del atributo telefono
     * 
     * @param telefono : String
     */

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo get del atributo dni
     * 
     * @return : String
     */

    public String getDni() {
        return dni;
    }

    /**
     * Metodo set del atributo dni
     * 
     * @param dni : String
     */

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Metodo get del atributo fechaNacimiento
     * 
     * @return : String
     */

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo set del atributo fechaNacimiento
     * 
     * @param fechaNacimiento : String
     */

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo toString de la clase Usuarios
     */

    public String toString() {
        return "\n\tUsuarios [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono="
                + telefono
                + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
