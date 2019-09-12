package ejerciciosExamen;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [] numeros = {10,20,25,20,10,5,5,-1,1};
		System.out.println(contarElementos(numeros));
	}
	
	public static int contarElementos(int v[]) {
		int res = 0;
		
		for (int i = 0; i < v.length; i++) {
			int sumatorio = 0;

			for (int j = i+1; j < v.length; j++) {
				sumatorio += v[j];
			}
			if (sumatorio == v[i])res++;
		}
		return res;
	}

}
