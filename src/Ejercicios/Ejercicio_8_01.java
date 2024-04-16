package Ejercicios;

import java.util.Arrays;

public class Ejercicio_8_01 {

	public static void main(String[] args) {

	}

	static <E> E[] insertar(E elemento, E tabla[]) {

		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = elemento;
		return tabla;

	}
}
