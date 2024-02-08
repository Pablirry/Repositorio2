package Ejercicio_9;

public class PruebaHotel {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Pablo", "Lopez", "XXX", "P@gmail.com", "10/10/2002");

		Habitacion h1 = new Habitacion("Habitación 1", 100, 2);

		System.out.println(c1.toString());

		System.out.println(h1.toString());

		Empleado e1 = new Empleado ("Juan", "Perez", "20:00", "Limpiador");

		System.out.println(e1.toString());

		Reserva r1 = new Reserva("10/10/2020", "10/10/2021");
		r1.setHabitaciones(new Habitacion[] { h1 });
		r1.setCargos(new Cargo[] { new Cargo("10/10/2020", 100) });

		Oferta o1 = new Oferta(20, "10/10/2020", "10/10/2021");

		System.out.println(o1.toString());
		
		System.out.println(r1.toString());

		c1.realizarReserva(r1);
		System.out.println(r1.toString());



	}

}
