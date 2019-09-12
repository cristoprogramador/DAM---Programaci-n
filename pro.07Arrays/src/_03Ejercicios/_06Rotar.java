package _03Ejercicios;

import java.util.ArrayList;

/**
 * 6. (Rotaciones) Rotar una posición a la derecha los elementos de un array
 * consiste en mover cada elemento del array una posición a la derecha. El
 * último elemento pasa a la posición 0 del array. Por ejemplo si rotamos a la
 * derecha el array {1,2,3,4} obtendríamos {4,1,2,3}. • Diseñar un método public
 * static void rotarDerecha(int v[]), que dado un array de enteros rote sus
 * elementos un posición a la derecha. • En el método main crearemos e
 * inicializaremos un array y rotaremos sus elementos tantas veces como
 * elementos tenga el array (mostrando cada vez su contenido), de forma que al
 * final el array quedará en su estado original. Por ejemplo, si inicialmente el
 * array contiene {7,3,4,2}, el programa mostrará Rotación 1: 2 7 3 4 Rotación
 * 2: 4 2 7 3 Rotación 3: 3 4 2 7 Rotación 4: 7 3 4 2 • Diseña también un método
 * para rotar a la izquierda y pruébalo de la misma forma.
 * 
 * @author alumno
 *
 */
public class _06Rotar {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(4);
		numeros.add(7);
		numeros.add(2);
		numeros.add(9);
		System.out.println(numeros);
		// Rotar hasta que vuelva a la posición original
		for (int i = 0; i < numeros.size(); i++) {
			rotarLista(numeros);
		}
	}

	public static void rotarLista(ArrayList<Integer> lista) {
		lista.add(0, (lista.get(lista.size() - 1)));
		lista.remove(lista.size() - 1);
		System.out.println(lista);
	}

}
