package _03ejercicios;

import figuras.Circulo;
import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

/**
 *(CentrarFiguras) Crear una pizarra de tamaño aleatorio. Dibujar en el centro un 
 *cuadrado de lado 100 y  un circulo de radio 25. 
 * @author alumno
 *
 */
public class _05CentrarFiguras {

	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		int x =p.getAnchura()/2;
		int y =p.getAltura()/2;
		
		Rectangulo r = new Rectangulo(Figura.ROJO,x-50,y-50,100,100);
		Circulo c = new Circulo(Figura.AMARILLO,x,y,25);
		p.anyadir(r);
		p.anyadir(c);
	}

}
