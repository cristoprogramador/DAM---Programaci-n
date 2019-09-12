package examen;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
	final static int N = 2;
	final static int REGALOS = 3;
	final static double PRESUPUESTO = 100;
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		double precio, precioAcumulado;
		int comprasOk = 0;
		int cont = 0;
		//Acemos un bucle do para realizar la operación al menos una vez
		do {
			//Inicializamos el acumulador de precio a 0 en cada ciclo
			precioAcumulado = 0;
			//Añadimos mas uno al contador de ciclo
			cont++;	
			//Indicamos el numero de compra
			System.out.println("Compra " + cont + ": ");
			//Generamos un bucle for que se repetirá el numero de regalos
			for (int cont2 = 0; cont2 < REGALOS; cont2++){
				//Preguntamos precio de los regalos
				System.out.print("Precio regalo " + (cont2+1) + ": ");
				precio = tec.nextDouble();
				//Acumulamos el precio de los regalos
				precioAcumulado += precio;
			}
			//Si el precio acumulado de la compra es igual o menor al presuspuesto
			if (precioAcumulado <= PRESUPUESTO) {
				//indicamos el que compra es correcta junto al precio total de la misma
				System.out.format("- COMPRA CORRECTA: %.1f\n",precioAcumulado);		
				//Sumanos uno al contador de compras correctas
				comprasOk++;
			}
			//Si el precio es mayor al presupuesto
			else
				//indicamos que el presupuesto se ha excedido
				System.out.format("- PRESUPUESTO EXCEDIDO: %.1f\n",precioAcumulado);
		
		}//El bucle se realizara mientras que el numero de compras correctas no sea el indicado en N
		while (comprasOk < N);
	}
		
}
