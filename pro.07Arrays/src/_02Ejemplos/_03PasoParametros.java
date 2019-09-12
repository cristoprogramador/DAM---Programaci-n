package _02Ejemplos;

public class _03PasoParametros {

	public static void main(String[] args) {
		int a;
		int[] b= new int[2];
		
		a = 1;
		b[0] = 1;
		b[1] = 1;
		
		System.out.println("Antes a = " + a);
		System.out.println("Antes b[0] = " + b[0]);
		System.out.println("Antes b[1] = " + b[1]);
		
		incrementar(a,b);
		System.out.println();
		//Comprovamos que el cambio de valor de un array en 
		//un metodo, afecta a los valores de array fuera del metodo
		//eso se debe a que se pasan los parametros por referencia
		//y en los tipos primitivos, por valor.
		System.out.println("Despues a = " + a);
		System.out.println("Despues b[0] = " + b[0]);
		System.out.println("Despues b[1] = " + b[1]);
	}
	
	public static void incrementar(int a, int[]x) {

		a = a + 1;
		x[0] = x[0] + 1;
		x[1] = x[1] + 1;
	
	}

}
