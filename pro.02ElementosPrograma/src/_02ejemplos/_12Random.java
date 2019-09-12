package _02ejemplos;

public class _12Random {
	public static void main(String arg[]){
		double r = Math.random(); //Le otorgamos un valor aleatorio entre 0 y 1 a r
		System.out.println("Entre [0 y 1[: " + r);//observar [0 y 1[ Indica que 1 no entra es de 0 a 0.999999...
		System.out.println("Entre [0 y 10[: " + (r * 10));
		System.out.println("Entre [0 y -10[: " + (r * -10));
		System.out.println("Entre [5 y 15[: " + (5 + r * 10));//Primero hace la multiplicación (r*10)+5
		//tener en cuenta: (ejemplo de error en operación)
		System.out.println("Entre [5 y 15[: " + 5 + r * 10);//Primero hace la suma y luego multiplica (5+r)*10

		//Como sacar un numero entero...
		//Devemos truncar, no redondear dado que al redondeo le restamos posibilidades a que salga un el primer y el ultimo numero
		
		System.out.println("Entre [0 y 10[: " + (int)(r * 10));
		//hacemos un casting que rechaza la parte decimal truncando el numero del resultado
		System.out.println("Entre [0 y 9]: " + (int)(r * 10));
		System.out.println("Entre [0 y 10]: " + (int)(r * 11));
		System.out.println("Entre [5 y 15]: " + (int)(5 + r * 11));
		System.out.println("Entre [-2 y 5]: " + (int)(-2 + r * 8));//mal planteado nunca llega a -2
		System.out.println("Entre [-2 y 5]: " + (-2 + (int)(r * 8)));
		/*	r*8 nos da un numero entre 0 y 7 con decimales que devemos quitar para que
		al restar menos dos tendremos numeros entre -2 y 5, puesto que ejm.
		
		0.01 - 2 = -1.99 truncando seria -1 Sin embargo
		0.01 truncando es 0 luego 0-2 es -2
		
		// Multiplicamos el alaeatorio por la diferencia entre los numeros 
		 * (uno mas si queremos que comprenda toda la diferencia)
		// Truncamos el resultado quedandonos con la pare entera
		// Sumamos al resultado el numero mas pequeño del que partimos.*/

		System.out.println("Entre [-5 y -15]: " + (-5 + (int)(r * -11)));
		//r*-11 nos dará un numro entre 0 y -10 al sumar -5 tendremos un rango entre -5 y -15

	}

}
