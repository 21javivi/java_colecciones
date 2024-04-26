package Ejercicios;

import java.util.Comparator;

public class ComparaNombreIngreso implements Comparator<Academico> {

	@Override
	public int compare(Academico o1, Academico o2) {
		if (o1.nombre.compareTo(o2.nombre) > 0) {
			return 1;
		} else {
			if (o1.nombre.compareTo(o2.nombre) < 0) {
				return -1;
			} else {
				return o1.anyoIngreso - o2.anyoIngreso;
			}
		}

	}

}
