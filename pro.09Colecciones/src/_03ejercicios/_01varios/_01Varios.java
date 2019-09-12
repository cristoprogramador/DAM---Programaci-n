package _03ejercicios._01Varios;

import java.util.*;

/*
 * (clase Varios) Las colecciones vistas en el tema facilitan la realización de algunas tareas.
 * Resuelve los siguientes problemas apoyándote en List y/o Set. Reflexiona sobre cómo podría 
 * resolverse el mismo problema utilizando arrays. Deberías llegar a la conclusión de que con
 * array, su resolución es bastante más laboriosa. Realiza un método para cada uno de los 
 * siguientes enunciados:
 */
public class _01Varios {
	static Scanner tec = new Scanner(System.in);
	final static int NUM = 5;
	
	public static void main(String[] args) {
		//quitarDuplicados();
		//quitarDuplicados2();
		//union();
		interseccion();
		//diferencia();
	}
	/*
	 * - void quitarDuplicados (), el usuario introduce una secuencia de 5 numeros y el 
	 * programa muestra los números sin repetir los que ha introducido duplicados.
	 */
	public static void quitarDuplicados() {
		//Almacenamos los número en un Set, ya que estos no alamacenan
		//duplicados. Si utilizamos LinkedHashSet mantendremos el orden
		//de introducción.
		Set<Integer> s = new LinkedHashSet<>();
		System.out.println("Introduce " + NUM + " numeros: ");
		
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			s.add(n); //Lo añadimos al set
		}
		
		//Mostramos los numeros no duplicados
		for(Integer i: s) {
			System.out.println(i);
		}
		
	}
	
	/*
	 * Versión con arrays
	 */
	public static void quitarDuplicados2() {
		//Usando arrays sería más laborioso
		int[] numeros = new int[NUM];
		System.out.println("Introduce " + NUM + " numeros: ");
		
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			numeros[i] = n;
		}
		
		//Recorro el array mostrando los numeros que no ha
		for(int i = 0; i < numeros.length; i++) {
			boolean enc = false;
			for (int j= 0; j< i && !enc; j++) {
				if (numeros[i] == numeros [j]) {
					enc= true;
				}
			}
			if(!enc){
				System.out.println(numeros[i]);
			}
			
		}
		
	}	
	
	/*
	 * - void unión(), el usuario introduce dos secuencias de 5 números. El programa
	 * muestra la unión de ambas secuencias, es decir, todos los elementos introducidos,
	 * sin incluir los duplicados.
	 */
	public static void union() {
		Set<Integer> un = new TreeSet<>();
	
		System.out.println("Introduzca " + NUM + " numeros: ");
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			un.add(n); //Lo añadimos al set
		}
		System.out.println("Introduzca " + NUM + " numeros: ");
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			un.add(n); //Lo añadimos al set
		}
		System.out.println(un);	
					
	}
	
	/*
	 * - void intersección(): el usuario introduce dos secuencias de 5 numeros. El programa 
	 * muestra aquellos números que son comunes a las dos secuencias.
	 */
	public static void interseccion() {
		Set<Integer> un = new TreeSet<>();
		
		System.out.println("Introduzca " + NUM + " numeros: ");
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			un.add(n);//Lo añadimos al set
		}
		System.out.println("Introduzca " + NUM + " numeros: ");
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			if(un.contains(n)) {
				System.out.print(n + " ");
			}
		}	
		//Si guardasemos en dos colecciones con retainAll podrimos hacer la 
		//misma operación de la siguiente forma
//		un.retainAll(in);
//		System.out.println(un);

	}
	
	/*
	 * - void diferencia():el usuario introduce dos secuencias de 5 numeros. El programa 
	 * muestra los elementos de la primera secuencia que no están en la segunda
	 */
	public static void diferencia() {
		Set<Integer> un = new TreeSet<>();
		
		System.out.println("Introduzca " + NUM + " numeros: ");
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			un.add(n);//Lo añadimos al set
		}
		System.out.println("Introduzca " + NUM + " numeros: ");
		for(int i=0; i< NUM; i++) {
			int n = tec.nextInt();
			if(un.contains(n)) {
				un.remove(n);
			}
		}
		System.out.println(un);	
	}
	
}
