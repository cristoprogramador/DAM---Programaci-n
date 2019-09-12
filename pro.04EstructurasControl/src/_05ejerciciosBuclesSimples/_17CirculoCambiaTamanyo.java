package _05ejerciciosBuclesSimples;


import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (CirculoCambiaTama�o) Crear una pizarra de dimensiones 200 x 200. Dibujar un
 * circulo de radio 20 en su extremo superior izquierdo. Utilizando un bucle
 * hacer que aumente de tama�o de 10 en 10 pixels hasta ocupar toda la pantalla
 * 
 * @author Cristobal Salido
 *
 */
public class _17CirculoCambiaTamanyo {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulo Movimiento Horizontal", 200, 200);
		Circulo c = new Circulo(20, 20, 20);
		p.anyadir(c);

		for (int cont = 30; cont <= Math.hypot(190, 190) ; cont += 10) {
			c.setRadio(cont);
			p.esperar(200);
			p.anyadir(c);
		}
	}
}
