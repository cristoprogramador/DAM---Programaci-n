package _02ejemplos;

import figuras.Rectangulo;
import pizarra.Pizarra;

//Dibujar una pizarra y dentro un rectangulo, con las clases figuras
public class _04DibujarRectangulo {
	public static void main(String[] arg){
		//generamos la pizarra
		
		Pizarra p = new Pizarra ("Prueba Cuadrado",800,600);
		
		//generamos un rectangulo de 200*100 de color verde y lo colocamos en el centro de la pizarra
		
		//centro de la pizarra x=(800/2)-100 y=(600/2)-50
		Rectangulo r= new Rectangulo (2,300,250,200,100);
		p.anyadir(r);
		
	}

}
