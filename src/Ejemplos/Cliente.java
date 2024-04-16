package Ejemplos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente> {
	String dni;
	String nombre;
	LocalDate fechaNacimiento;

	Cliente(String dni, String nombre, String fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
	}

	int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public boolean equals(Object ob) {
		return dni.equals(((Cliente) ob).dni);
	}

	@Override
	public int compareTo(Cliente otro) {
		return dni.compareTo(otro.dni);
	}

	@Override
	public String toString() {
		return "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad() + "\n";
	}
}