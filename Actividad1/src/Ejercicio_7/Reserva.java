package Ejercicio_7;

public class Reserva {

	private String fechaReserva;
	private String fechaEjecucion;
	private Pistas pista;
	private double precio;

	private Usuarios usuarios[];
	private int contUsuarios;

	/**
	 * Constructos con tres atributos
	 * 
	 * @param fechaReserva   : String
	 * @param fechaEjecucion : String
	 * @param pista          : Pistas
	 */
	public Reserva(String fechaReserva, String fechaEjecucion, Pistas pista) {
		this.fechaReserva = fechaReserva;
		this.fechaEjecucion = fechaEjecucion;
		this.pista = pista;
		this.precio = pista.getPrecio();
		usuarios = new Usuarios[10];
		contUsuarios = 0;
	}

	/**
	 * Metodo para añadir un usuario
	 * 
	 * @param u : Usuarios
	 */

	public void añadirUsuario(Usuarios u) {
		if (contUsuarios < usuarios.length) {
			int pos = contUsuarios;
			usuarios[pos] = u;
			contUsuarios++;
		}
	}

	/**
	 * Metodo toString de la clase Reserva
	 */

	public String toString() {
		String texto = "Reserva [fechaReserva=" + fechaReserva + ", fechaEjecucion=" + fechaEjecucion + "\n\t"
				+ pista.toString() + "]";

		for (int i = 0; i < contUsuarios; i++) {
			Usuarios u = this.usuarios[i];
			texto += u.toString() + "\n";
		}
		return texto;
	}

	/**
	 * Metodo get del atributo fechaReserva
	 * 
	 * @return : String
	 */

	public String getFechaReserva() {
		return fechaReserva;
	}

	/**
	 * Metodo set del atributo fechaReserva
	 * 
	 * @param fechaReserva : String
	 */

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	/**
	 * Metodo get del atributo fechaEjecucion
	 * 
	 * @return : String
	 */

	public String getFechaEjecucion() {
		return fechaEjecucion;
	}

	/**
	 * Metodo set del atributo fechaEjecucion
	 * 
	 * @param fechaEjecucion : String
	 */

	public void setFechaEjecucion(String fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	/**
	 * Metodo get del atributo pista
	 * 
	 * @return : Pistas
	 */

	public Pistas getPista() {
		return pista;
	}

	/**
	 * Metodo set del atributo pista
	 * 
	 * @param pista : Pistas
	 */

	public void setPista(Pistas pista) {
		this.pista = pista;
	}

	/**
	 * Metodo get del atributo precio
	 * 
	 * @return : double
	 */

	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo set del atributo precio
	 * 
	 * @param precio : double
	 */

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo get del atributo usuarios
	 * 
	 * @return : Usuarios[]
	 */

	public Usuarios[] getUsuarios() {
		return usuarios;
	}

	/**
	 * Metodo set del atributo usuarios
	 * 
	 * @param usuarios : Usuarios[]
	 */

	public void setUsuarios(Usuarios[] usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * Metodo get del atributo contUsuarios
	 * 
	 * @return : entero
	 */

	public int getContUsuarios() {
		return contUsuarios;
	}

	/**
	 * Metodo set del atributo contUsuarios
	 * 
	 * @param contUsuarios : entero
	 */

	public void setContUsuarios(int contUsuarios) {
		this.contUsuarios = contUsuarios;
	}

}
