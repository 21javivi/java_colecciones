package Ejercicios;

import java.util.Map;

public class Academico implements Comparable<Academico> {
	// ATRIBUTOS
	String nombre;
	int anyoIngreso;

	// CONSTRUCTORES
	public Academico(String nombre, int anyoIngreso) {
		this.nombre = nombre;
		this.anyoIngreso = anyoIngreso;
	}

	public Academico() {
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoIngreso() {
		return anyoIngreso;
	}

	public void setAnyoIngreso(int anyoIngreso) {
		this.anyoIngreso = anyoIngreso;
	}

	// METODOS DE LA CLASE
	@Override
	public String toString() {
		return "Academico [nombre=" + nombre + ", anyoIngreso=" + anyoIngreso + "]";
	}

	@Override
	public int compareTo(Academico o) {
		return this.nombre.compareTo(o.nombre);
	}

	static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
		boolean resultado = false;
		if (Character.isLetter(letra) == true) {
			if (!academia.containsKey(letra)) {
				academia.put(letra, nuevo);
				resultado = true;
			} else {
				System.out.println("El sillon esta ocupado");
			}
		}

		return resultado;
	}

}
