package _03ejercicios;
/**
 * (RadioAleatorio) Crear una pizarra de tamaño aleatorio. Dibujar en la esquina superior 
 * izquierda un círculo de radio aleatorio (entre 50 y 200) 
 * @author alumno
 *
 */
import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _07RadioAleatorio {

	public static void main(String[] args) {			
			Pizarra p = new Pizarra();			
			int r = (int)(Math.random()*201+50);
			//circulo tangencial a las esquinas
			Circulo c = new Circulo(Figura.ROJO,r,r,r);
			p.anyadir(c);
			
			//circulo con el centro en la esquina
			Circulo c2 = new Circulo(Figura.AMARILLO, 0,0,r);
			p.anyadir(c2);

	}

}
