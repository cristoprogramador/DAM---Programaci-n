package _02ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Común a todas las direcciones
public class _01Colecciones {

	public static void main(String[] args) {
		//ArrayList es un tipo de coleccion
		Collection<Integer> listaPares = new ArrayList<>();
		Collection<Integer> listaImpares = new ArrayList<>();
	
		//Anyadir
		listaPares.add(8); //Añade el "8" (devuelve true o false)
		listaPares.add(2);
		listaPares.add(10);
		System.out.println(listaPares);
		
		listaImpares.add(1);
		listaImpares.add(13);
		listaImpares.add(9);
		System.out.println(listaImpares);
		
						/*		
						//al definir como collection no podemos usar el metodo 
						//add que si que tiene el arraylist
						listapares.add(10,2);
						*/		
		
		//Eliminar
		listaImpares.remove(1); //Elimina el "1" (devuelve true o false)
		System.out.println(listaImpares);
		
		//Operaciones masivas
		Collection <Integer> todos = new ArrayList<>();
		todos.addAll(listaPares);
		todos.addAll(listaImpares);
		System.out.println(todos);
		
		todos.removeAll(listaPares);
		todos.retainAll(listaPares);
		System.out.println(todos);
		
		//Operaciones con arrays
		Object[] arrayPares1;
		Integer[] arrayPares2 = new Integer[0];
		arrayPares1 = listaPares.toArray(); //toArray devuelbe un array de objetos

//		arrayPares2 = listapares.toArray(); //No podemos guardar objetos en un array de integer
		//Solución:
		
		// podemos hacer un casting, pero aunque compila no ejecuta bien,
		// por lo cual lo descartamos
//		arrayPares2 = (Integer[])listaPares.toArray();
		
		// así que la solución correcta es
		// decirle de que tipo tiene que ser el array que devuelve
		arrayPares2 = listaPares.toArray(arrayPares2);
		
		
		//Recorrido con Iterator
		System.out.println("Recorrido con iterator");
		Iterator<Integer> it = listaPares.iterator();
		while(it.hasNext()) {
			Integer p = it.next();
			System.out.println(p);
		}
	

	}
	
	

}
