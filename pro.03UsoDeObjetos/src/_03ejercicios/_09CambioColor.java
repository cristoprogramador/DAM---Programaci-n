package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

/**
 * (CamibioColor) Crear una pizarra de tamaño aleatorio. Dibujar un rectángulo que 
 * ocupe toda la pizarra. Cambiarlo sucesivamente de color (usar todos los colores que 
 * permite la clase). 
 * @author alumno
 *
 */

public class _09CambioColor {

	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		int ancho = p.getAnchura();
		int alto = p.getAltura();
		Rectangulo r = new Rectangulo(0,0,ancho,alto);
		p.anyadir(r);
		p.esperar(1000);
		r.setColor(Figura.AMARILLO);		
		p.esperar(1000);
		r.setColor(Figura.ROJO);
		p.esperar(1000);
		r.setColor(Figura.VERDE);
		p.esperar(1000);
		r.setColor(Figura.AZUL);

	}

}
