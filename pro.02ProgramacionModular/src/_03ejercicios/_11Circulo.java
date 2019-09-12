package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _11Circulo {

	public static void main(String[] args) 
	{  
        Scanner tec= new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce radio: ");
        double radio =tec.nextDouble();
        double longitud =longitudCircunferencia(radio);
        System.out.println("Longitud de la circunferencia: "+longitud);
        System.out.println("Area del circulo: "+areaCirculo(radio));
        System.out.println("Volumen de la esfera: "+volumenEsfera(radio));
    }
    /**
     * Calcula la longitud de una circunferencia dado su radio
     * @param radio El radio de la circunferencia
     * @return La longitud de la circunferencia
     */
    public static double longitudCircunferencia(double radio)
    {
        double longitud=2*Math.PI*radio;
        return longitud;   
    }
    /**
     * Calcula el area de un circulo dado su radio
     * @param r El radio del circulos
     * @return Devuelve el area del círculo
     */
    public static double areaCirculo(double r)
    {
        double resultado = Math.PI*r*r;
        return resultado;
    }
    
    public static double volumenEsfera(double r)
    {
        return (4/3.0)*Math.PI*Math.pow(r,3);
		// TODO Auto-generated method stub

	}

}
