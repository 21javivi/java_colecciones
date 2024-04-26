package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio_8_19 {

	public static void main(String[] args) {
		TreeMap<String, Integer> stock = new TreeMap<>();

		int n = 0;
		Scanner sc = new Scanner(System.in);

		while (n != 5) {
			System.out.println("Introduce una opcion: \n 1.Nuevo Producto "
					+ "\n 2.Eliminar Producto \n 3.Actualizar Stock" + " \n 4.Mostrar Stock \n 5.Salir ");

			n = sc.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Introducir la clave del producto:");
				String clave = sc.next();
				if (!stock.containsKey(clave)) {
					System.out.println("Introducir el stock del producto:");
					Integer cantidad = sc.nextInt();
					stock.put(clave, cantidad);
				} else {
					System.out.println("El producto ya existe");
				}
				break;
			}
			case 2: {
				System.out.println("Introducir la clave del producto:");
				String clave = sc.next();
				if (stock.containsKey(clave)) {
					stock.remove(clave);
				} else {
					System.out.println("El producto no existe");
				}
				break;
			}
			case 3: {
				System.out.println("Introducir la clave del producto:");
				String clave = sc.next();
				if (stock.containsKey(clave)) {
					System.out.println("Introducir el stock del producto");
					Integer valor = sc.nextInt();
					stock.put(clave, valor);
				} else {
					System.out.println("El producto no existe");
				}
				break;
			}
			case 4: {
				System.out.println(stock);
			}
			}// SWITCH
		} // WHILE
	}// MAIN

}// CLASE
