package _03ejercicios._01Aulas;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Aula[] misAulas = {
						new  Aula (5,12,6),
						new  Aula (2,10,10),
						new  Aula (4,5,6),
						};
		//Si no declaramos en la clase Aula que incluye
		//compareTo, mediante implements Comparable,
		// dará error a la hora de ordenar
		Arrays.sort(misAulas);
		
		for (Aula a : misAulas) {
			System.out.println(a);
			System.out.println("----------");
		}
		

	}

}
