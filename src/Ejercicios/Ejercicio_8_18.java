package Ejercicios;

import java.util.*;

public class Ejercicio_8_18 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> temperaturas = new ArrayList<>();

		while (n != 4) {
			System.out.println(
					"Introduce una opcion: \n 1.Nuevo Registro \n 2.Listar Registros \n 3.Mostrar Estadistica \n 4.Salir");

			n = sc.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Introducir el valor de la temperatura:");

				break;
			}
			case 2: {
				System.out.println(temperaturas);
				break;
			}
			case 3: {
				break;
			}
			}
		}

	}

}
