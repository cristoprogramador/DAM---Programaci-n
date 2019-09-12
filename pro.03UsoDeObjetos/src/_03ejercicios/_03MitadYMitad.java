package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

/**
 * (MitadYMitad) Crear una pizarra de tamaño aleatorio y dibujar un rectángulo ROJO 
 * que ocupe la mitad izquierda y uno VERDE que ocupe la mitad derecha. 
 * @author alumno
 *
 */

public class _03MitadYMitad {

	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		Rectangulo r1 = new Rectangulo(Figura.ROJO,0,0,(p.getAnchura()/2),p.getAltura());		
		p.anyadir(r1);
		Rectangulo r2 = new Rectangulo(Figura.VERDE,(p.getAnchura()/2),0,(p.getAnchura()/2),p.getAltura());		
		p.anyadir(r2);

	}

}
