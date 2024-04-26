package Ejemplos;

import java.util.*;

public class Ejemplos3 {

	public static void main(String[] args) {
		/*Map<String, Double> mapa = new HashMap<>();

		mapa.put("Ana", 1.65);
		mapa.put("Alfredo", 1.80);
		mapa.put("Aurora", 1.70);
		System.out.println(mapa.put("Antonio", 1.75));
		System.out.println(mapa.put("Aurora", 1.72));
		// System.out.println(mapa); // NO SE ORDENA
		// System.out.println(mapa.get("Ana"));
		// System.out.println(mapa.containsKey("Ana"));
		// System.out.println(mapa.containsValue(1.65));
		Set<String> claves = mapa.keySet();
		System.out.println(claves);
		Collection<Double> estaturas = mapa.values();
		System.out.println(estaturas);
		Set<Map.Entry<String, Double>> entradas = mapa.entrySet();
		System.out.println(entradas);
		// claves.remove("Aurora");
		mapa.put("Alvaro", 1.90);
		mapa.put("Aurora", 1.70);
		mapa.put("Adara", 1.75);
		System.out.println(mapa);
		Iterator<Map.Entry<String, Double>> it;
		for (it = entradas.iterator(); it.hasNext();) {
			Map.Entry<String, Double> entrada = it.next();
			if(entrada.getValue()>1.81) {
				it.remove();
			}
		}
		System.out.println(mapa);*/
		
		/*TreeMap<String, Double> treeMapa = new TreeMap<>();
		treeMapa.put("Ana", 1.65);
		treeMapa.put("Alfredo", 1.80);
		treeMapa.put("Aurora", 1.70);
		treeMapa.put("Antonio", 1.75);
		System.out.println(treeMapa); // SE ORDENA POR ORDEN ESTABLECIDO POR LA CADENA
		*/
		
		LinkedHashMap <String, Double> lhMapa = new LinkedHashMap <>();
		lhMapa.put("Ana", 1.65);
		lhMapa.put("Alfredo", 1.80);
		lhMapa.put("Aurora", 1.70);
		lhMapa.put("Antonio", 1.75);
		System.out.println(lhMapa); // SE ORDENAN EN ORDEN DE INSERCION

	}

}
