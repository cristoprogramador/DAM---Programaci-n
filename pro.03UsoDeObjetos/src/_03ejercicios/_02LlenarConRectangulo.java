package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

/**
 * Crear una pizarra de tamaño aleatorio y dibujar en ella un 
 * rectángulo que la ocupe por completo.  
 * @author Cristobal Salido
 *
 */
public class _02LlenarConRectangulo {

	public static void main(String[] args) {
		//Usando el metodo aleatorio de Pizarra
		//Generamos la pizarra aleatoria
		Pizarra p =new Pizarra ();
		
		//Generamos un cuadrado con el ancho y alto de la pizarra
		//leeremos ancho y alto de la pizarra generada

		Rectangulo r = new Rectangulo(Figura.AZUL,0, 0,p.getAnchura(),p.getAltura());
		p.anyadir(r);
		
		//*********************************************//
		//  NO FUNCIONAN BIEN JUNTOS. POR SEPARADO SI  //
		//*********************************************//
		/*
	
		//Con nombre como en la foto del ejercicio
		//generamos numeros aleatorios para x e y
		int x2= (int) (Math.random()*800);
		int y2= (int) (Math.random()*800);
		
		
		//generamos pizarra
		Pizarra p2= new Pizarra("Llenar con rectangulo", x2, y2);
		Rectangulo r2 = new Rectangulo (Figura.AZUL, 0, 0, x2, y2);
		
		p2.anyadir(r2);

		*/
	}

}
