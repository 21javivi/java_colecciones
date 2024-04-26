package Ejercicios;

import java.util.*;

public class Sorteo<T>{ // EJERCICIO_8_17
	// ATRIBUTOS
	HashSet<T> elementos;

	// CONSTRUCTORES
	public Sorteo() {
		elementos = new HashSet<>();
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	boolean add(T elemento) {
		if (elementos.add(elemento) == true) {
			return true;
		} else
			return false;
		// return elementos.add(elemento);
		// DEVUELVE LO MISMO QUE EL IF ANTERIOR
	}

	Set<T> premiados(int numPremiados) {
		Set<T> elementosPremiados = new HashSet<>();
		ArrayList<T> mezclados = new ArrayList<>(elementos);
		Collections.shuffle(mezclados);

		for (int i = 0; i < numPremiados; i++) {
			elementosPremiados.add(mezclados.get(i));
		}

		return elementosPremiados;
	}

	@Override
	public String toString() {
		return "Sorteo [elementos=" + elementos + "]";
	}
	
	
}
