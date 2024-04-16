package Ejercicios;

import java.util.*;

public class Ejercicio_8_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contenedor<Integer> contenedorEnteros = new Contenedor<>(new Integer[0]);
		Integer numero = 0;
		do {
			System.out.println("Introduce un entero:");
			numero = sc.nextInt();
			if (numero >= 0) {
				contenedorEnteros.apilar(numero);
			}
		} while (numero != -1);

		Integer numeroDevuelto = contenedorEnteros.desapilar();
		if (numeroDevuelto != null) {
			System.out.println(numeroDevuelto);
		}
		while (numeroDevuelto != null) {
			numeroDevuelto = contenedorEnteros.desapilar();
			if (numeroDevuelto != null) {
				System.out.println(numeroDevuelto);
			}
		}
	}

}
