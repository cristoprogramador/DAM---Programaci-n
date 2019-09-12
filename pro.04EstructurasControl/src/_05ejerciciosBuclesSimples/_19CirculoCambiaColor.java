package _05ejerciciosBuclesSimples;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (CirculoCambiaColor) Crear un pizarra con un círculo dentro de color
 * aleatorio. Mediante un bucle, hacer que cambie aleatoriamente de color hasta
 * que su color sea rojo.
 * 
 * @author Cristobal Salido
 *
 */
public class _19CirculoCambiaColor {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulo Movimiento Horizontal", 200, 200);
		Circulo c = new Circulo(100, 100, 50);
		p.anyadir(c);
		int color = c.getColor();
		
		while (color != 0) {
			color = (int)(Math.random()*4);
			System.out.println(color);
			c.setColor(color);
			p.esperar(500);
			p.anyadir(c);
		}

	}

}
