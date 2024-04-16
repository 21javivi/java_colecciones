package Ejemplos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio> {
	// ATRIBUTOS
	int id;
	String nombre;
	LocalDate fechaNacimiento;

	// CONSTRUCTORES
	public Socio(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
	}

	// METODOS DE LA CLASE
	int edad() {
		int edad = 0;
		edad = (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
		return edad;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad()=" + edad() + "]";
	}

	@Override
	public int compareTo(Socio o) {
		return nombre.compareTo(o.nombre);
	}

}
