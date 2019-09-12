package _02ejemplos;

public class _02SalidaElemental {
public static void main(String args[]){
		//Testo con saltos de linea
		System.out.println("Hola");
		System.out.println(", que tal");
		
		//Salto de linea
		System.out.println();
		
		//Texto sin saltos de linea
		System.out.print("Hola");
		System.out.print(", que tal");
		
		//Podemos sacar por pantalla numeros
		System.out.println(10);
		System.out.println("10");//Java muestra los numeros independientemente 
								//de que se pongna entrecomillados o no.
		
		//Podemos sacar por pantalla resusltados de operaciones
		System.out.println(10+20);
		System.out.println(50*7);
		
		//Podemos sacar por pantalla combinación de texto y número
		System.out.println("Tengo 20 años");
		System.out.println("Tengo "+ 20 + " años");//El + concatena el texto y el numero
		System.out.println("300 por 0.27 es igual a "+ (300 * 0.27));
		//Permite concatenar un texto y una operación ofreciendo el resultado
	}
}
