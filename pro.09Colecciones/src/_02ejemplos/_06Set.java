package _02ejemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _06Set {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		System.out.println(s.add(1));//true
		System.out.println(s.add(1));//false
		System.out.println(s.add(2));//true
		System.out.println(s.add(2));//false
		System.out.println(s.add(3));//true
		//Devolverán verdadero o falso según si la inserción
		//ha hecho cambiar la lista o no
		
		System.out.println(s);
		//La salida serán los numeros sin duplicados
/*
 * TreeSet internamente es como una estructura de arbol
 * Partiendo del primer elemento, coloca a la izquierda y abajo los menores
 * y a la derecha y abajo los mayores según el numero comparado por el nivel.
 * La busqueda tendrá como maximo tantos pasos como niveles tenga el arbol de datos
 * 
 * HashSet y LinkedHashSet están basados en tablas Hash
 * Las tablas Hash realizan un calculo sobre el elemento a insertar
 * obteniendo un numero que nos indicará la posición donde se ha de colocar
 * por eso al realizar una busqueda, indicando el elemento, da directamente la posición
 * del elemento dentro de la tabla/array, Por eso el orden en un HasSet es impredecible
 * y las busquedas muchisimo mas rapidas.
 * 
 */

//		Set<String> nombres = new TreeSet<>();//Ordenado por el compareTo
		Set<String> nombres = new HashSet<>();//Orden impredecible
//		Set<String> nombres = new LinkedHashSet<>();//Orden por introducción
		nombres.add("Angel");
		nombres.add("Pablo");
		nombres.add("Rosa");
		nombres.add("Ana");
		nombres.add("Lucia");
		System.out.println(nombres);
		//No hay métodos para acceder a los elementos por su posición
		//nombres.get(1);
		//nombres.indexOf("Angel");
	}

}
