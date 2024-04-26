package Ejemplos;

import java.util.*;

public class Ejemplos2 {

	public static void main(String[] args) {
		List<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(5);
		listaEnteros.add(-1);
		listaEnteros.add(6);
		listaEnteros.add(8);
		listaEnteros.add(5);
		listaEnteros.add(0);
		System.out.println(listaEnteros);
		System.out.println(listaEnteros.get(1));
		Integer eliminado = listaEnteros.set(1, 10);
		System.out.println(eliminado);
		System.out.println(listaEnteros);
		listaEnteros.add(3, 7);
		System.out.println(listaEnteros);
		ArrayList<Integer> otrosEnteros = new ArrayList<>();
		otrosEnteros.add(20);
		otrosEnteros.add(30);
		otrosEnteros.add(40);
		listaEnteros.addAll(2, otrosEnteros);
		System.out.println(listaEnteros);

		/*
		 * Collection<Integer> numero5 = new ArrayList<>(); // numero5.add(5); //
		 * listaEnteros.removeAll(numero5); // ELIMINA TODOS LOS ELEMENTOS QUE TENGAN EL
		 * VALOR QUE SE LE PASA
		 * 
		 * listaEnteros.remove(5); // ELIMINA EL ELMENTO QUE ESTE EN LA POSICION 5
		 * System.out.println(listaEnteros); listaEnteros.remove(Integer.valueOf(5)); //
		 * ELIMINA EL ELEMENTO QUE TENGA VALOR 5 System.out.println(listaEnteros);
		 */

		TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
		Cliente cliente = new Cliente("123456X", "Antonio", "2001-08-15");
		conjuntoClientes.add(cliente);
		conjuntoClientes.add(new Cliente("555555Z", "Andres", "2005-05-23"));
		conjuntoClientes.add(new Cliente("666666R", "Ana", "1998-01-12"));

	}

}
