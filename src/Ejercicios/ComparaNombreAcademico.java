package Ejercicios;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparaNombreAcademico implements Comparator<Map.Entry<Character, Academico>> {

	@Override
	public int compare(Entry<Character, Academico> o1, Entry<Character, Academico> o2) {
		return o1.getValue().nombre.compareTo(o2.getValue().nombre);
	}

}
