package _03ejercicios;

import java.util.*; //Se puede poner Scanner en lugar de * importando Scanner y todas las clases del paquete java.util

public class _01EntradaSalida {
	public static void main (String arg[]){
		Scanner tec = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce un número entero");
		a = tec.nextInt();
		System.out.println("Introduce otro número entero");
		b = tec.nextInt();
		System.out.println("Los números introducidos son " + a + " y " + b);
		}
	}
//•Ejecútalo para ver como se comporta el programa. 

//•¿Qué ocurre si cuando nos pide un número entero le damos un número real? 
	//Da error "Exception in thread "main" Error de ejecución (se hace una operación no valida)

//¿Y si le damos un carácter no numérico? 
	//Da el mismo error "Exception in thread "manin"

//•¿Qué ocurre si eliminamos la instrucción import java.util.*; 
	//Da error de excepción "Scaner cannot be resolved to a type" Error de compilación  o sintaxis no encuentra que es scanner