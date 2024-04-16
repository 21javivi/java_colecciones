package Ejemplos;

class Contenedor<T> { //ORIGINAL
	// ATRIBUTOS
	private T objeto;

	// CONSTRUCOTRES
	public Contenedor() {

	}
	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	void guardar(T nuevo) {
		objeto = nuevo;
	}

	T extraer() {
		T resultado = objeto;
		objeto = null;
		return resultado;
	}
}
