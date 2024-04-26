package Ejercicios;

import java.util.*;

import Ejemplos.Cliente;

public class Ejercicio_8_17 {

	public static void main(String[] args) {
		Sorteo<Integer> primitiva = new Sorteo<>();
		for (int i = 0; i < 50; i++) {
			primitiva.add(i);
		}
		Collection<Integer> numerosPremiados = primitiva.premiados(6);
		System.out.println(numerosPremiados);

		Sorteo<Cliente> viajes = new Sorteo<>();
		Cliente cliente1 = new Cliente("12345678X", "Antonio", "2001-08-15");
		Cliente cliente2 = new Cliente("55555555Z", "Andres", "2005-05-23");
		Cliente cliente3 = new Cliente("66666666R", "Ana", "1998-01-12");
		viajes.add(cliente1);
		viajes.add(cliente2);
		viajes.add(cliente3);
		Set<Cliente> premiados=viajes.premiados(2);
		System.out.println(premiados);
	}

}
