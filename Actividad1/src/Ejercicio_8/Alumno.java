package Ejercicio_8;

public class Alumno {
	
	// DNI, número de expediente, nombre, apellidos, domicilio, teléfono y e-mail
	
	private String DNI;
	private int n_expediente;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String telefono;
	private String email;

	public Alumno(String dNI, int n_expediente, String nombre, String apellidos, String domicilio, String telefono,
			String email) {
		DNI = dNI;
		this.n_expediente = n_expediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getN_expediente() {
		return n_expediente;
	}

	public void setN_expediente(int n_expediente) {
		this.n_expediente = n_expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno [DNI=" + DNI + ", n_expediente=" + n_expediente + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", domicilio=" + domicilio + ", telefono=" + telefono + ", email=" + email + "]";
	}

	

}
