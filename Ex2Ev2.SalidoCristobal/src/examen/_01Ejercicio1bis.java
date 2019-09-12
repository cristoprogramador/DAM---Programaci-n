package examen;

public class _01Ejercicio1bis {
	public static void main(String[] args) {
		double[] medias= 	 {8,7,3,9,4,2,9,8,7,4};
		String[] nombres = 	 {"Miguel","Luis","Pablo","Ana","Amanda","Rosa","Marco","Javi",	"Blas",	"Reme"};
		String[] excluidos = {"Miguel","Pablo","Marco"};
		
		String mejor = "";
		double mejorNota = -1;
		for (int i = 0; i < medias.length; i++) {
			if(medias[i] > mejorNota) {
				//Comprobamos si esta en los excluidos
				boolean enc = false;
				for (int j = 0; j < excluidos.length && !enc; j++) {
					if(nombres[i].equals(excluidos[j])){
						enc = true;
					}
				}
				if (!enc) {
					mejorNota = medias[i];
					mejor = nombres[i];
				}
			}
		}
		System.out.println("El premio es para " + mejor + " con nota " + mejorNota);
	}
}

