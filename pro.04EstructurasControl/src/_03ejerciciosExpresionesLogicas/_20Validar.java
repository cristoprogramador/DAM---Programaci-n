package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (Validar) 
 * Se desea implementar un programa que determine si dos datos x, y de entrada son v�lidos.
 * Un par de datos es v�lido si es uno de los que aparecen en la siguiente tabla:
 * 		x : a a a a a b b b b b
 * 		y : 1 3 5 7 9 2 4 6 8 10
 * Se pide implementar un programa que lea de teclado el valor de x y el valor de y, 
 * e indique por pantalla �VALIDOS� o �NO VALIDOS�. 
 * Se pide hacerlo de forma que no se utilice ninguna estructura condicional 
 * (if, switch,...), es decir, se calcular� una expresi�n booleana que determine si
 * x e y son v�lidos.
 * Se procurar� que la expresi�n booleana propuesta sea breve y concisa.
 * 
 * @author Cristobal Salido
 */
public class _20Validar {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca el dato X: ");
        char x = tec.next().charAt(0);
		System.out.println("Introduzca el dato Y: ");
		int y = tec.nextInt();

		boolean valido = (y >= 1 && y <= 10 && (x == 'a' && y%2 != 0 || x == 'b' && y%2 == 0));
        System.out.println(valido? "PAREJA VALIDA" : "PAREJA INVALIDA");
	}

}
