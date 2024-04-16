package Ejercicios;

import java.util.Arrays;

public class Ejercicio_8_03 {

	public static void main(String[] args) {

		Contenedor<Integer> contenedorEnteros = new Contenedor<>(new Integer[0]);
		System.out.println(contenedorEnteros);
		contenedorEnteros.insertarAlFinal(5);
		contenedorEnteros.insertarAlFinal(8);
		contenedorEnteros.insertarAlFinal(4);
		contenedorEnteros.insertarAlPrincipio(14);
		contenedorEnteros.ordenar();
		System.out.println(contenedorEnteros);
		System.out.println(contenedorEnteros.extraerDelPrincipio());
		System.out.println(contenedorEnteros.extraerDelFinal());
		System.out.println(contenedorEnteros);
	}

}
