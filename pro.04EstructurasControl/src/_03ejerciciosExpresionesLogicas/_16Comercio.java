package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Comercio) Un comercio aplica un descuento del 8% por compras superiores a 40 euros. 
 * El descuento maximo sera de 12 euros. 
 * 
 * Escribir un programa que solicite al usuario el importe de la
 * compra y muestre un mensaje similar al siguiente:
 * 
 * Importe de la compra 100 e
 * Porcentaje de descuento aplicado: 8%
 * Descuento aplicado: 8 e
 * Cantidad a pagar: 92 e
 * 
 * @author Cristobal Salido
 *
 */
public class _16Comercio {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Importe de la compra: ");
		double importe = tec.nextDouble();
		double descuento = 0;
		int porcentaje = 0;
		
		if (importe > 40){
			porcentaje = 8;
			descuento = importe/100 * porcentaje;
		}
		if (descuento > 12)descuento = 12;
		
		System.out.format("Importe de la comprea %.2f euros%n", importe);
		System.out.println("Porcentaje de descuento: " + porcentaje + "%");
		System.out.format("Descuento aplicado: %.2f euros%n", descuento);
		System.out.format("cantidad a pagar: %.2f euros", importe - descuento);
			
	}

}
