package _01pruebas;

public class _02Juego {

	public static void main(String[] args) {
		//Scanner tec = new Scanner(Systme.in);
		
		String texto = "a";
		
		while (true) {
			char ultimo = texto.charAt(texto.length()-1);
			ultimo++;
			texto = texto.substring(0, texto.length()-1)+ultimo;
			System.out.println(texto);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
