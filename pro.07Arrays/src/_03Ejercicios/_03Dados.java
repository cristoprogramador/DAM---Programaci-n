package _03Ejercicios;

public class _03Dados {

	public static void main(String[] args) {
		final int LANZAMIENTOS = 100000;
		final int FRECUENCIA = 1000;
		
		
		int[] veces = new int[7];
		
		for (int cont = 1; cont <= LANZAMIENTOS; cont++) {
			// Lanzamos dado
			int dado = (int)(Math.random() * 6) + 1;
			// Incrementamos contador correspondiente
			if(cont % FRECUENCIA == 0) {
				System.out.println("Lanzamiento " + cont);
				for (int i = 1; i < veces.length; i++) {
					System.out.println( " " + i + ": " + (double)veces[i]/cont * 100);
				}
				
			}
			
			veces[dado]++;
			
			
		}
		
		
		
		
	}

}
