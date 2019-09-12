package _05ejerciciosBuclesSimples;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (CirculoMovimientoDiagonal) Crear una pizarra de dimensiones 200 x 200.
 * Dibujar un circulo de radio 20 en su extremo superior izquierdo. Utilizando
 * un bucle hacer que se desplace de 10 en 10 pixels hasta el extremo inferior
 * derecho.
 * 
 * @author alumno
 *
 */
public class _16CirculoMovimientoDiagonal {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulo Movimiento Horizontal", 200, 200);
		Circulo c = new Circulo (0,0,20);
		p.anyadir(c);

		for (int cont = 10; cont <= Math.hypot(200, 200); cont += 10 ){
			c.setPosy(cont);
			c.setPosx(cont);
			p.esperar(200);
			p.anyadir(c);
		}

	}

}
