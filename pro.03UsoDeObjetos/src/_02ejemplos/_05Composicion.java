package _02ejemplos;

import figuras.Circulo;
import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _05Composicion {

	public static void main(String[] args) {
		//generamos pizarra 800*600
		Pizarra p = new Pizarra("Composicion",800,600);
		
		//generamos un circulo amarillo de radio 100 y lo posicionamos en el centro de la pizarra
		Circulo c = new Circulo(Figura.AMARILLO,400,300,100);
		p.anyadir(c);
		
		//Generamos un cuadrado rojo de ancho 100 y 200 de alto y lo posicionamos
		// a la izaquierda del ciruclo de manera tangencial x=400-100-100 y=300-100
		Rectangulo r1= new Rectangulo(Figura.ROJO,200,200,100,200);
		p.anyadir(r1);
		
		//Generamos un cuadrado rojo de ancho 100 y 200 de alto y lo posicionamos
		// a la derecha del ciruclo de manera tangencial x=400+100 y=300-100
		Rectangulo r2= new Rectangulo(Figura.ROJO,500,200,100,200);
		p.anyadir(r2);
		
		/*extra cambio de colores
		
		while (a != 1 & b != 0){
		a = (int) Math.random()*3 -1;
		b = (int) Math.random()*3 -1;
		p.esperar(1000);
		r1.setColor(b);
		r2.setColor(b);
		c.setColor(a);
		}*/
	}

}
