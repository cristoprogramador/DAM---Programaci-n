package _01pruebas;

public class _01PuebasEnPapel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		System.out.println("Comenzamos");
		if (x>= 20)
		if (x>50) System.out.println("Muy grande");
		else {
		if (x%2 != 0) System.out.println("Impar");
		}
		else if(x<=20) System.out.println("Peque�o");
		System.out.println("Terminamos");
		
		int platos = 1;
		switch (platos) {
		case 1: System.out.println("\nPrimer plato");
		case 2: System.out.println ("\nSegundo plato");
		case 3: System.out.println ("\nBebida");
		System.out.println ("\nPostre");
		break;
		//default: printf("\nCafe");
		}
		
		double total = 3000;
		double desc = 0.0;
		if (total >= 500)
		if (total<=2000) desc = 30.0;
		else desc = 50.0;
		total = total * (desc / 100.0);
		System.out.println(total);
		
		

	}

}
