package _02ejemplos;

public class _11ClaseMath {
	public static void main(String arg[]){
		
		double num1 = -2341.134;
		double num2 = Math.abs(num1); //Devuelve valor absoluto de num1 (Sin valor negativo)
		
		// Ejemplo clase
		System.out.println(num1); //Numero original
		System.out.println(num2); //Numero sin valor negativo ni signo correspondiente.
		
		System.out.println(Math.abs(num1) + 3 * 4);
		
		//Pruebas con Mat
		System.out.println("(Ceil) El numero inmediato superior de " + num1 + " es "+Math.ceil(num1));
		System.out.println("(floor) El numero inmediato inferior de " + num1 + " es "+Math.floor(num1));
		System.out.println("(roud) El numero redondeado de " + num1 + " es "+Math.round(num1));
		System.out.println("(abs) El numero absoluto de " + num1 + " es "+Math.abs(num1));
		System.out.println("(exp) El numero e elevado a 2 es "+Math.exp(2));
		System.out.println("(log) El logaritmo de " + Math.abs(num1) + " es "+Math.log(Math.abs(num1)));
		System.out.println("(max) El numero mayor entre 65484 y " + num1 + " es "+Math.max(65484,num1));
		System.out.println("(min) El numero menor entre 65484 y " + num1 + " es "+Math.min(65484,num1));
		System.out.println("(pow) "+Math.abs(num1)+"  elevado a 2 es "+Math.pow(Math.abs(num1),2));
		System.out.println("(random) numero aleatoreo entre 0.0 y 1.0 " + Math.random()); //nunca valdrá 1 [0,1[
		System.out.println("(sqrt) La raiz cuadrada de " + Math.abs(num1) + " es "+Math.sqrt(Math.abs(num1)));


	}

}
