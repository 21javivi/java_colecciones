package Ejercicios;

import java.util.Comparator;

public class ComparaAnyoIngreso implements Comparator<Academico> {

	@Override
	public int compare(Academico o1, Academico o2) {
		return o1.anyoIngreso - o2.anyoIngreso;
	}

}
