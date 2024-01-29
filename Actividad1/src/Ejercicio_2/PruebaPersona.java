package Ejercicio_2;

import java.util.Scanner;

public class PruebaPersona {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 1. Pide por teclado el nombre, la edad, sexo, peso y altura.
		 * 2. Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
		 * anteriores variables pedidas por teclado, el segundo objeto obtendrá todos
		 * los anteriores menos el peso y la altura y el último por defecto, para este
		 * último utiliza los métodos set para darle a los atributos un valor.
		 * 3. Para cada objeto, deberá comprobar si esta en su peso ideal, tiene
		 * sobrepeso o por debajo de su peso ideal con un mensaje.
		 * 4. Indicar para cada objeto si es mayor de edad.
		 * 5. Por último, mostrar la información de cada objeto.
		 */

		// Primer objeto (nombre,edad,sexo,peso,altura)
		System.out.println("Primera persona: ");
		System.out.print("Nombre: ");
		String nombre = sc.next();
		System.out.print("Edad: ");
		int edad = sc.nextInt();
		System.out.print("Sexo (H/M): ");
		char sexo = sc.next().charAt(0);
		System.out.print("Peso: ");
		int peso = sc.nextInt();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();
		p3.setNombre("Pedro");
		p3.setEdad(10);
		p3.setSexo('H');
		p3.setPeso(30);
		p3.setAltura(1.40);

		Persona v[] = new Persona[3];
		v[0] = p1;
		v[1] = p2;
		v[2] = p3;

		for (int i = 0; i < v.length; i++){
			System.out.println(v[i].toString());
			if(v[i].calcularIMC()==0) {
				System.out.println("Peso Ideal");
			}else if(v[i].calcularIMC()==1){
				System.out.println("Sobrepeso");
			}else{
				System.out.println("Por debajo del peso ideal");
			}
			if(v[i].esMayorDeEdad()==true) {
				System.out.println("Es mayor de edad");
			} else if(v[i].esMayorDeEdad()==false) System.out.println("No es mayor de edad");
		}

	}

}
