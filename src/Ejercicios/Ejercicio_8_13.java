package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_8_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listaEnteros = new ArrayList<>();
		Integer numero = 0;
		do {
			System.out.println("Introduce un entero:");
			numero = sc.nextInt();
			if (numero >= 0) {
				listaEnteros.add(numero);
			}
		} while (numero >= 0);

		/*for (Integer integer : listaEnteros) {
			if (integer % 2 == 0) {
				System.out.println(integer*100);
			}
		}*/
		
		System.out.println(listaEnteros);
		
		for (int i=0; i<listaEnteros.size(); i++) {
			if (listaEnteros.get(i)%2==0) {
				System.out.println(i);
				System.out.println(listaEnteros.get(i)*100);
			}
		}
		
		System.out.println(listaEnteros);
	}
}
