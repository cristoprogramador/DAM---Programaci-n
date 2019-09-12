package _03ejercicios._07TraductorSimple;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TraductorSimple {
	public static void main(String[] args) {
		try {
			Scanner f = new Scanner(new File("palabras.txt"));
			Map<String, String> diccionario = new HashMap<>();
			//Recoremos
			while (f.hasNext()) {
				String castellano = f.next(); //palabra en castellano
				String ingles = f.next(); //palabra en ingles
				diccionario.put(castellano, ingles);
				//System.out.println(castellano + " - " + ingles);
			}
			System.out.println(diccionario);
			
			f.close();  //Cerramos el fichero
			
			Scanner tec = new Scanner(System.in);
			System.out.println("introduce frase en castellano");
			String frase = tec.nextLine();
			StringTokenizer st = new StringTokenizer(frase);
			
			String traduction = "";
			
			//Traducir frase al ingles
			while (st.hasMoreTokens()) {
				// con contains busca dos veces, es mas eficiente guardar
				// la palabra en españo llamar y guardar su traduccción en ingles
				// y comprobar si es null o no, guardando la que corresponda
				String palabra = st.nextToken();
				if (diccionario.containsKey(palabra)) {
				traduction += diccionario.get(palabra) + " ";
				}
				else traduction += palabra + " ";
			}
			
			//Mostrar frase en ingles
			System.out.println(traduction);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puedo abrir el fichero");
		}
	}
}
