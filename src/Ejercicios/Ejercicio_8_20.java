package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio_8_20 {

	public static void main(String[] args) {
		Map<Character, Academico> rae = new TreeMap<>();
		Academico aca1 = new Academico("Ana", 2000);
		Academico aca4 = new Academico("Alfredo", 2007);
		Academico aca5 = new Academico("Alberto", 2012);
		Academico aca2 = new Academico("Aurora", 2005);
		Academico aca3 = new Academico("Adhara", 2001);

		Academico.nuevoAcademico(rae, aca1, 'r');
		Academico.nuevoAcademico(rae, aca2, 'h');
		Academico.nuevoAcademico(rae, aca3, 'A');
		Academico.nuevoAcademico(rae, aca4, 'l');
		Academico.nuevoAcademico(rae, aca5, 'R');
		System.out.println(rae);

		/*
		 * Collection<Academico> coleccionAcademicos = rae.values();
		 * ArrayList<Academico> listaAcademicos = new ArrayList<>(coleccionAcademicos);
		 * 
		 * // METODO CLASE COLLECTIONS Collections.sort(listaAcademicos);
		 * System.out.println(listaAcademicos);
		 * 
		 * // METODO INTERFAZ COLLECTION listaAcademicos.sort(new ComparaAnyoIngreso());
		 * System.out.println(listaAcademicos);
		 * 
		 * // METODO EQUIVALENTE DE LA CLASE COLLECTIONS
		 * Collections.sort(listaAcademicos, new ComparaAnyoIngreso());
		 * System.out.println(listaAcademicos);
		 * 
		 * // METODO INTERFAZ COLLECTION listaAcademicos.sort(new
		 * ComparaNombreIngreso()); System.out.println(listaAcademicos);
		 */

		Set<Map.Entry<Character, Academico>> conjuntoRae = rae.entrySet();
		ArrayList<Map.Entry<Character, Academico>> listaAcademicos = new ArrayList<>(conjuntoRae);
		listaAcademicos.sort(new ComparaNombreAcademico());
		System.out.println(listaAcademicos);

		listaAcademicos.sort(new ComparaSillasAcademicoInverso());
		System.out.println(listaAcademicos);

	}

}
