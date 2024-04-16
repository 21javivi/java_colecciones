package Ejemplos;

import java.time.LocalDate;
import java.util.*;

public class Ejemplos {
	public static void main(String[] args) {
		List<Cliente> listaClientes = new ArrayList<>();

		Collection<Cliente> coleccionClie = listaClientes;

		Cliente cliente = new Cliente("12345678X", "Antonio", "2001-08-15");

		coleccionClie.add(cliente);

		coleccionClie.add(new Cliente("55555555Z", "Andres", "2005-05-23"));

		coleccionClie.add(new Cliente("66666666R", "Ana", "1998-01-12"));

		System.out.println(coleccionClie.size()); // DEVUELVE EL TAMAÑO DE LA COLECCION

		System.out.println(coleccionClie.isEmpty()); // DEVUELVE TRUE SI LA COLECCION ESTA VACIA O FALSE SI NO LO ESTA

		System.out.println(coleccionClie.contains(new Cliente("66666666R", "Ana", "1998-01-12"))); // DEVUELVE TRUE SI
																									// ENCUENTRA EL
																									// PARAMETRO QUE SE
																									// LE PASA O FALSE
																									// SI NO LO HACE

		Iterator<Cliente> iterator = coleccionClie.iterator(); // CREA UN OBJETOR ITERATOR DE CLIENTES

		/*for (; iterator.hasNext();) { // DEVUELVE TRUE SI HAY ALGO MAS A CONTINUACION O FALSE SI ERA EL ULTIMO

			Cliente p = iterator.next(); // IGUALA UN OBJETO AL SIGUIENTE OBJETO DEL ITINEADOR

			System.out.println(p); // DEVUELVE UN OBJETO

		}*/

		while (iterator.hasNext()) {
			Cliente q = iterator.next();
			if (q.fechaNacimiento.compareTo(LocalDate.of(2000, 1, 1)) < 0) {
				iterator.remove();
			}
		}
		System.out.println(coleccionClie);

	}
}
