package _02Ejemplos;

public class _04Recorrido {

	public static void main(String[] args) {
		int[] edad = {3,5,2,9,20,33,12,65,2};
		
		//Calcular media de edad;
		int suma = 0;
		for (int i = 0; i < edad.length; i++) {
			// para el recorrido de un array se usa por norma i
			// por las componentes de un vector en matematicas i,j,k..
			suma = suma + edad[i];		
		}
		
		double media = (double)suma / edad.length;
		System.out.println("Media: " + media);
	}

}
