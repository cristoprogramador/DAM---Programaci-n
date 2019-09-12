package _05ejerciciosBuclesSimples;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (CirculoCentradoCambiaTamanyo) Crear una pizarra de dimensiones 200 x 200.
 * Dibujar un circulo de radio 20 el centro de la pizarra. Utilizando un bucle
 * hacer que aumente de tamanyo de 10 en 10 pixels hasta ocupar toda la pantalla.
 * Mantener el circulo siempre centrado.
 * 
 * @author Cristobal Salido
 *
 */
public class _18CirculoCentradoCambiaTamanyo {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulo Movimiento Horizontal", 200, 200);
		Circulo c = new Circulo(100, 100, 20);
		p.anyadir(c);

		for (int cont = 30; cont <= Math.hypot(110, 110); cont += 10) {
			c.setRadio(cont);
			p.esperar(200);
			p.anyadir(c);
		}

	}

}
