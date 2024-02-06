package Ejercicio_7;

public class Reserva {
	
	private String fechaReserva;
	private String fechaEjecucion;
	private Pistas pista;
	private double precio;

	private Usuarios usuarios[];
	private int contUsuarios;


	/**
	 * 
	 * @param fechaReserva
	 * @param fechaEjecucion
	 * @param pista
	 */
	public Reserva(String fechaReserva, String fechaEjecucion, double precio, Pistas pista) {
		this.fechaReserva = fechaReserva;
		this.fechaEjecucion = fechaEjecucion;
		this.pista = pista.getPrecio();
		this.precio = pista.length;
		usuarios = new Usuarios[10];
		contUsuarios = 0;
	}

	
		
	

}
