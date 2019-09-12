package _02ejemplos;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _02UsarConstructores {

	public static void main(String[] args) {
		Pizarra peq, grande, aleat;
		peq = new Pizarra("Pizarra pequeña", 200, 200);
		grande = new Pizarra("Pizarra grande", 1200, 800);
		aleat= new Pizarra();
		
		Circulo c1,c2,c3;
		c1 = new Circulo(0,600,400,200);//creamos un circulo color 0 en la posición x=600 y=400, de radio 20
		//colores del ciruclo del 0 al 3 rojo, amarillo, verde y azul
		c2 = new Circulo(100,60,20);//
		c3 = new Circulo(Figura.AMARILLO, 600, 400, 100);
		
		//Anyado los circulos a laa pizarras		
		grande.anyadir(c1);
		grande.anyadir(c3);
		peq.anyadir(c2);
		aleat.anyadir(c2);

	}

}
