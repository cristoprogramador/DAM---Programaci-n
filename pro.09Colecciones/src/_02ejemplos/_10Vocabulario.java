package _02ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _10Vocabulario {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Definir Map para almacenar palabras en castellano y 
		//su traducción a valenciano
		Map<String, String> tr = new HashMap<>();
		
		//Añadir (mujer, dona), (hombre, home), (coche, cotxe)
		tr.put("mujer", "dona");
		tr.put("hombre", "home");
		tr.put("coche", "cotxe");
		tr.put("cama", "llit");
		tr.put("mano", "ma");
		tr.put("bajo", "baix");
		tr.put("tiene", "te");
		tr.put("de la", "del");
		tr.put("la", "la");
		tr.put("de", "de");
		tr.put("maria", "maria");
		
		//Mostramos todas las palabras y su traducción
		Set<String> palabras = tr.keySet();
		
		for(String p: palabras) {
			String pv = tr.get(p);
			System.out.println(p + " : " + pv);
		}
		
		String in;
		do {	
		//Consultar la traducción de la palabra que introduzca el usuario
		System.out.print("Introduzca palabra en castellano: ");
		in = tec.nextLine();
		String r = tr.get(in);
		if (r == null)
			System.out.println("La palabra no está en el diccionario");
		else System.out.println(r);
		}while (in != "s");
	}

}
