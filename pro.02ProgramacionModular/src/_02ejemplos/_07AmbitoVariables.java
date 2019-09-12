package _02ejemplos;

public class _07AmbitoVariables {

	public static void main(String[] args) {
		int a, b, suma;
		a = 10;
		b = 20;
		suma = sumar();//Forma incorrecta
		suma = sumar(a,b);//Forma correcta
	}
	
	public static int sumar (){
		//La instrucción da error porque a y b son locales al metodo main
		//No son accesibles desde el metodo sumar;
		int suma = a + b;
		return suma;
	}
	
	//Forma correcta de que dos metods se comuniquen información
	//(pasando la información como parámetro)
	public static int sumar(int x, int y){
		int suma = x + y;
		return suma;
	}

}
