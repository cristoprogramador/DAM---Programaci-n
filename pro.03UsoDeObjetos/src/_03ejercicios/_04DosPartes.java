package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

/**
 * (Dos partes) Crear una pizarra de tamaño aleatorio y dibujar un rectángulo ROJO que 
 * ocupe la parte superior (25% de la altura) y uno VERDE que ocupe la parte inferior 
 * (75% restante). 
 *
 * @author alumno
 *
 */
public class _04DosPartes {

	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		int ancho = p.getAnchura();
		int alto = p.getAltura();
		Rectangulo r1 = new Rectangulo(Figura.ROJO, 0, 0, ancho, (alto/100)*25);
		p.anyadir(r1);
		Rectangulo r2 = new Rectangulo(Figura.VERDE, 0, (alto/100)*25, ancho, (alto -((alto/100)*25)));
		p.anyadir(r2);	

	}

}
