package Ejemplo1;

public class Alumno {
	// Atributos
	
	private String dni;
	private String nombre;
	private int edad;
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Alumno(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos(){
        System.out.println(this.dni+"-"+this.nombre+"-"+this.edad);
    }
	
	
	
	
	
	

    

}
