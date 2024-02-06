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
	 * @param fechaReserva : String
	 * @param fechaEjecucion : String
	 * @param pista : Pistas
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
	 * @param u : Usuarios
	 */

	public void añadirUsuario(Usuarios u) {
		if(contUsuarios<usuarios.length) {
			int pos = contUsuarios;
			usuarios[pos] = u;
			contUsuarios++;
		}
	}

	/**
	 * Metodo toString de la clase Reserva
	 */
	public String toString() {
		String texto = "Reserva [fechaReserva=" + fechaReserva + ", fechaEjecucion=" + fechaEjecucion + "\n\t" + pista.toString() + "]";

		for(int i = 0; i<contUsuarios; i++){
			Usuarios u = this.usuarios[i];
			texto += u.toString() + "\n";
		}
		return texto;
	}

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(String fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	public Pistas getPista() {
		return pista;
	}

	public void setPista(Pistas pista) {
		this.pista = pista;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Usuarios[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios[] usuarios) {
		this.usuarios = usuarios;
	}

	public int getContUsuarios() {
		return contUsuarios;
	}

	public void setContUsuarios(int contUsuarios) {
		this.contUsuarios = contUsuarios;
	}
	

}
