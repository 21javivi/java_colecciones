package Ejercicios;

import java.util.*;

class Contenedor<T> { // EJERCICIO_8_03 / EJERCICIO_8_04
	// ATRIBUTOS
	private T objetos[];

	// CONSTRUCOTRES
	public Contenedor(T objetos[]) {
		this.objetos = objetos;
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	@Override
	public String toString() {
		return "Contenedor [objetos=" + Arrays.toString(objetos) + "]";
	}

	// Insertar un elemento al final de la lista
	public void insertarAlFinal(T nuevo) {
		objetos = Arrays.copyOf(objetos, objetos.length + 1);
		objetos[objetos.length - 1] = nuevo;
	}

	// Insertar un elemento al principio de la lista
	public void insertarAlPrincipio(T nuevo) {
		T objetos2[] = Arrays.copyOf(objetos, objetos.length + 1);
		for (int i = 0; i < objetos.length; i++) {
			objetos2[i + 1] = objetos[i];
		}
		objetos2[0] = nuevo;
		objetos = objetos2;
	}

	public T extraerDelPrincipio() {
		T resultado = null;
		if (objetos.length > 0) {
			resultado = objetos[0];
			for (int i = 0; i < objetos.length - 1; i++) {
				objetos[i] = objetos[i + 1];
			}
			objetos = Arrays.copyOf(objetos, objetos.length - 1);
		}
		return resultado;
	}

	public T extraerDelFinal() {
		T resultado = null;
		if (objetos.length > 0) {
			resultado = objetos[objetos.length - 1];
			objetos = Arrays.copyOf(objetos, objetos.length - 1);
		}
		return resultado;
	}

	public void ordenar() {
		Arrays.sort(objetos);
	}

	public void apilar(T nuevo) {
		insertarAlFinal(nuevo);
	}

	public T desapilar() {
		return extraerDelFinal();
	}
}
