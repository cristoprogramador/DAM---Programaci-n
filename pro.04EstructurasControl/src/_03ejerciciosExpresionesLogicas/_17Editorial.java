package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (Editorial) Una compa��a editorial dispone de 2 tipos de publicaciones: libros y revistas.
 * El precio de cada pedido depende del n�mero de elementos solicitados al cual se le aplica
 * un determinado descuento, que es diferente para libros y para revistas. 
 * La siguiente tabla muestra los descuentos a aplicar en funci�n del n�mero de unidades
 * y del tipo de producto:
 * 
 * 		Cantidad pedida 			Libros 					Revistas
 * Hasta 5 unidades				0 % de descuento		0 % de descuento
 * De 6 a 10 unidades			10 % de descuento		15 % de descuento
 * De 11 a 20 unidades			15 % de descuento		20 % de descuento
 * A partir de 20 unidades		20 % de descuento		25 % de descuento
 * 
 * Escribe un m�todo calcularCoste que, recibiendo el tipo de publicaci�n (String), 
 * que puede ser �libro� o �revista�, el precio individual (double) y el n�mero de unidades
 * solicitado (int), devuelva el coste del pedido (aplicando el descuento correspondiente).
 * 
 * Escribe el programa un programa en el que el usuario indique cantidad y precio de revistas
 *  y cantidad y precio de libros que incluye un pedido, y muestre el coste del pedido
 *  
 * @author Cristobal Salido
 *
 */
public class _17Editorial {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero de revistas: ");
		int numeroRevistas = tec.nextInt();
		System.out.println("Precio de las revistas: ");
		double precioRevistas = tec.nextDouble();
		System.out.println("Numero de libros: ");
		int numeroLibros = tec.nextInt();
		System.out.println("Precio de los libros: ");
		double precioLibros = tec.nextDouble();
		
		System.out.println("coste del pedido: " + 
							(calcularCoste("revista",precioRevistas,numeroRevistas) + 
							calcularCoste("libro", precioLibros,numeroLibros)) + 
							" euros");
	}
	
	//Metodo Calclula costes con descuentos
	public static double calcularCoste(String tipo, double precioUnidad, int unidades){
		double descuento = 0;
		
		if (tipo.compareTo("revista") == 0)
			if (unidades > 5 && unidades < 11) descuento = 0.15;
			else if (unidades > 10 && unidades < 21) descuento = 0.20;
			else if (unidades > 20) descuento = .25;
		if (tipo.compareTo("libro") == 0)
			if (unidades > 5 && unidades < 11) descuento = 0.1;
			else if (unidades > 10 && unidades < 21) descuento = 0.15;
			else if (unidades > 20) descuento = .2;
		
		return (unidades * precioUnidad) - ((unidades * precioUnidad) * descuento);
	}

}
