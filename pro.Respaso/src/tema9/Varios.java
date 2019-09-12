package tema9;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Varios {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		//quitarDuplicados();
		//union();
		//interseccion();
		diferencia();
	}
	
	
	static void quitarDuplicados() {
		Set<Integer> n = new LinkedHashSet<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			n.add(tec.nextInt());
		}
		System.out.println(n);
	}
	
	static void union() {
		Set<Integer> n = new LinkedHashSet<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			n.add(tec.nextInt());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			n.add(tec.nextInt());
		}
		System.out.println(n);
	}
	
	static void interseccion() {
		Set<Integer> n = new LinkedHashSet<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			n.add(tec.nextInt());
		}
		
		List<Integer> inter = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			int num = tec.nextInt();
			if (n.contains(num))
				inter.add(num);
		}
		System.out.println(inter);
	}
	
	static void diferencia() {
		Set<Integer> n = new LinkedHashSet<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			n.add(tec.nextInt());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un numero: ");
			int num = tec.nextInt();
			if (n.contains(num))
				n.remove(num);
		}
		System.out.println(n);
	}
}
