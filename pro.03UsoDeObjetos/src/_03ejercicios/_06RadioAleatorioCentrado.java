package _03ejercicios;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (RadioAleatorioCentrado) Crear una pizarra de tamaño aleatorio. Dibujar en centro de 
 * la pizarra un círculo de radio aleatorio (entre 50 y 200 pixels de radio)
 * @author alumno
 *
 */
public class _06RadioAleatorioCentrado {

	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		int x = p.getAnchura()/2;
		int y = p.getAltura()/2;
		int r =(int) (Math.random()*201+50);
				
		Circulo c = new Circulo(x,y,r);
		
		p.anyadir(c);

	}

}
