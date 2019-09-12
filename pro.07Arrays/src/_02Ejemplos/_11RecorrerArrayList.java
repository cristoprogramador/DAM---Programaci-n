package _02Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;


public class _11RecorrerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(new Integer(25));
		numeros.add(new Integer(15));
		numeros.add(new Integer(7));
		numeros.add(new Integer(13));
		numeros.add(200);//Java hace la conversión automatica a Integer
		numeros.add(123);
		System.out.println(numeros);
		
		// Recorrido con indice y get
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		System.out.println("---------------------");
		
		//Recorrido con un bucle for-each
		for(Integer x: numeros) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//Utilizando Iterator
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
