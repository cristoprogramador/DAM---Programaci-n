package _05ejerciciosBuclesSimples;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (CirculoMovimientoVertical) Crear una pizarra de dimensiones 300 x 200.
 * Dibujar un circulo de radio 20 en su extremo superior izquierdo. Utilizando
 * un bucle hacer que se desplace de 10 en 10 pixels hasta el extremo inferior
 * izquierdo.
 * 
 * @author Cristobal Salido
 *
 */
public class _15CirculoMovimientoVertical {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulo Movimiento Horizontal", 300, 200);
		Circulo c = new Circulo (20,20,20);
		p.anyadir(c);

		for (int cont = 30; cont <= 180; cont += 10 ){
			c.setPosy(cont);
			p.esperar(200);
			p.anyadir(c);
		}

	}

}
