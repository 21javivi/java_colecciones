package Ejercicios;

import java.util.Arrays;

public class Ejercicio_8_02 {

	public static void main(String[] args) {
		Integer[] pares = { 13, 539, 37, 99 };
		Integer[] impares = { 450, 162, 396 };
		System.out.println(Arrays.toString(insertarAlFinal(pares, impares)));
	}

	public static <E> E[] insertarAlFinal(E[] tabla1, E[] tabla2) {

		E tabla3[] = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
		System.arraycopy(tabla2, 0, tabla3, tabla1.length, tabla2.length);
		return tabla3;
	}
}
