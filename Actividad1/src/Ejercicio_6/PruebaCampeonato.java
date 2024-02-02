package Ejercicio_6;

public class PruebaCampeonato {

	/*
	 * Se quiere diseñar aplicación para gestionar todos los datos de un campeonato
	 * de fútbol sala que se organiza este año en la ciudad. Aquellos que quieran
	 * participar deberán formar un equipo (nombre, patrocinador, color de la 1ª
	 * camiseta, color de la 2ª camiseta, categoría, . . .) e inscribirse en el
	 * campeonato. A medida que transcurran los partidos se irán almacenando los
	 * resultados de éstos, así como qué equipos lo jugaron, en qué campo se jugó,
	 * quién lo arbitró y alguna incidencia que pudiera haber ocurrido (en caso de
	 * que no ocurran incidencias no se anotará nada. Además, los participantes
	 * deberán rellenar una ficha de suscripción con algunos datos personales
	 * (nombre, apellidos, edad, dirección, teléfono, . . .)
	 */

	public static void main(String[] args) {

		Participante p1 = new Participante("p1", "ape", 20, "dir", "XXX");
		Participante p2 = new Participante("p2", "ape", 20, "dir", "XXX");
		Participante p3 = new Participante("p3", "ape", 20, "dir", "XXX");
		Participante p4 = new Participante("p4", "ape", 20, "dir", "XXX");
		Participante p5 = new Participante("p5", "ape", 20, "dir", "XXX");
		Participante p6 = new Participante("p6", "ape", 20, "dir", "XXX");


		Equipo e = new Equipo("nom1", "pat", "azul", "rojo", "primera");

		e.añadirParticipante(p1);
		e.añadirParticipante(p2);
		e.añadirParticipante(p3);

		

		Equipo e2 = new Equipo("nom2", "pat", "azul", "rojo", "primera");

		e2.añadirParticipante(p4);
		e2.añadirParticipante(p5);
		e2.añadirParticipante(p6);

		Partido p = new Partido("1-0", "camp1", "Pablo", e, e2);

		System.out.println(p.toString());


	}

}
