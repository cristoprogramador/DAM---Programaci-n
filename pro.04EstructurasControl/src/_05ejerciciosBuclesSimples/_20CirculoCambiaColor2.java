package _05ejerciciosBuclesSimples;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (CirculoCambiaColor) Crear un pizarra con un círculo dentro de color
 * aleatorio. Mediante un bucle, hacer que cambie aleatoriamente de color hasta
 * que el círculo haya sido de los cuatro colores posibles.
 * 
 * @author Cristobal Salido
 *
 */
public class _20CirculoCambiaColor2 {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulo Movimiento Horizontal", 200, 200);
		Circulo c = new Circulo(100, 100, 50);
		p.anyadir(c);
		int color = c.getColor();
		boolean rojo = true, verde = true, azul = true, amarillo = true;
		boolean condicion = true;

		while (condicion) {
			color = (int) (Math.random() * 4);
			c.setColor(color);
			p.esperar(500);
			p.anyadir(c);
			System.out.println(color);
			if (color == 0)
				rojo = false;
			if (color == 1)
				amarillo = false;
			if (color == 2)
				verde = false;
			if (color == 3)
				azul = false;
			if (rojo == false && amarillo == false && verde == false && azul == false)
				condicion = false;
		}

	}

}
