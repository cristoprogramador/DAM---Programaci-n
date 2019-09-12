package _02ejemplos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
/*
 * ArrayList
 * -Lista que internamente usa un array para almacenar los elementos
 * 
 * ArrayList<Integuer> l = new ArrayList<>() --- l:[][][][] n:0
 * l.add(7) ------------------------------------ l:[7][][][] n:1
 * l.add(20) ----------------------------------- l:[7][20][][] n:2
 * l.add(9) ------------------------------------ l:[7][20][9][] n:3
 * l.add(1) ------------------------------------ l:[7][20][9][1] n:4
 * Al añadir un elemento mas, dobla la capacidad del array y añade el elemento
 * a continuación.
 * l.add(5) ------------------------------------ l:[7][20][9][1][5][][][] n:5
 * 
 * Si queremos añadir en la posición 0 el elemento 8, ArrayList haria:
 * Copia a partir del la posión 0 todos los elementos a la derecha
 * una vez libre la posición 0 añade el 8 en dicha posición
 * l.add(0,8) ------------------------------------ l:[8][7][20][9][1][5][][] n:6
 * al igual que al borrar, si es al principio, supone eliminar el elemento y correr
 * a la izquierda el resto
 * l.add(0,8) ------------------------------------ l:[7][20][9][1][5][][][] n:6
 * Esto supone un costo en tiempo de ejecución muy elevado.
 */

/*
 * LinkedList (Lista enlazada)
 * Los elementos no se almacenan en un array si no de la siguiente manera:
 * 
 * Con elementos independientes relacionados unos con otros.
 * formado por una serie de objetos que contienen el dato a almacenar 
 * y cual es el elemento siguiente
 * 
 * LinkedList ---> [2]->[7]->[3]->[4]
 * 
 * 
 */
public class _04InsertarPrincipioListaVsFinal {

	public static void main(String[] args) {
		LinkedList<Integer> principio = new LinkedList<>();
		LinkedList<Integer> fin = new LinkedList<>();
		
		//lINKEDLIST tiene un coste similar al insertar al final
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			fin.add(i);
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo añadiendo elementos al final");
		System.out.println(t2-t1);
		
		//El coste tambien es similar a añadir al principio
		t1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			principio.add(0, i);
		}
		
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo añanadiendo elementos al principio");
		System.out.println(t2-t1);
		
		System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
	}

}
