package Ejercicios;

import java.util.*;

public class Ejercicio_8_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		Collection<Integer> coleccion = lista;

		Integer numero = 0;
		do {
			System.out.println("Introduce un entero:");
			numero = sc.nextInt();
			if (numero >= 0) {
				coleccion.add(numero);
			}
		} while (numero != -1);

		System.out.println(coleccion);
		
		for (Integer integer : coleccion) {
			if (integer % 2 == 0) {
				System.out.println(integer);
			}
		}

		for (Iterator iterator = coleccion.iterator(); iterator.hasNext();) {
			if ((Integer) iterator.next() % 3 == 0) {
				iterator.remove();
			}
		}
		System.out.println(coleccion);

	}
}
