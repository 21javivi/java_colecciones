package Ejercicios;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparaSillasAcademicoInverso implements Comparator<Map.Entry<Character, Academico>> {

	@Override
	public int compare(Entry<Character, Academico> o1, Entry<Character, Academico> o2) {
		return o2.getKey().compareTo(o1.getKey());
	}

}
