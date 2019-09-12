package _03ejercicios;
/**
 * 19. Indica cuales serán los valores de las variables después de ejecutar cada
 * uno de los siguientes fragmentos de código. Resuelve el ejercicio sin
 * escribir los programas correspondientes y probarlos.
 * a) int a=3, b = 2;
 * a = b + b;
 * b = a + a;
 * 
 * b) int a=3,b=0;
 * b = b – 1;
 * a = a + b;
 * 
 * c) int a, b=5
 * b++;
 * ++b;
 * a= b+1;
 * 
 * d) int a = 5,b;
 * b = a++;
 * 
 * e) int a = 5,b;
 * b = ++a;
 * 
 * f) int a=2, b=3;
 * b+=a;
 * 
 * g) int a=2, b=3;
 * b-=a;
 * a=-b;
 * 
 * h) int a=2, b=3;
 * b%=a;
 * 
 * i) int a=2,b=3,c=4;
 * a = --b + c++;
 * b+=a;
 * 
 * @author Cristobal Salido
 */
public class _19ValoresVariables {

	public static void main(String[] args) {
		/**
		 * int g=5,h;
		 * System.out.println("g="+g+" h="+h);
		 * 
		 * No se ha inicializado la h y por tanto no funciona
		 * **/
	
		int a=3, b = 2;
		a = b + b;
		b = a + a;
		System.out.println("a) int a=3, b = 2;");
		System.out.println("   a = b + b;");
		System.out.println("   b = a + a;");
		System.out.println("a="+a+" b="+b);
		System.out.println();
		
		a=3;b=0;
		b = b - 1;
		a = a + b;
		System.out.println("b) int a=3,b=0;");
		System.out.println("   b = b – 1;");
		System.out.println("   a = a + b;");
		System.out.println("a="+a+" b="+b);
		System.out.println();

		a=5;b=5;
		b++;
		++b;
		a= b+1;
		System.out.println("c) int a, b=5");
		System.out.println("   b++;");
		System.out.println("   ++b;");
		System.out.println("   a= b+1;");
		System.out.println("a="+a+" b="+b);
		System.out.println();

		//a = 5,b;
		//b = a++;
		System.out.println("d) int a = 5,b;");
		System.out.println("   b = a++;");
		System.out.println("Error al no inicializarse b");
		System.out.println();

		//a = 5,b;
		//b = ++a;
		System.out.println("e) int a = 5,b;");
		System.out.println("   b = ++a;");
		System.out.println("Error al no inicializarse b");
		System.out.println();

		a=2;
		b=3;
		b+=a;
		System.out.println("f) int a=2, b=3;");
		System.out.println("   b+=a;");
		System.out.println("a="+a+" b="+b);
		System.out.println();

		a=2;
		b=3;
		b-=a;
		a=-b;
		System.out.println("g) int a=2, b=3;");
		System.out.println("   b-=a;");
		System.out.println("   a=-b;");
		System.out.println("a="+a+" b="+b);
		System.out.println();

		a=2;
		b=3;
		b%=a;
		System.out.println("h) int a=2, b=3;");
		System.out.println("   b%=a;");
		System.out.println("a="+a+" b="+b);
		System.out.println();

		a=2;
		b=3;
		int c=4;
		a = --b + c++;
		b+=a;
		System.out.println("i) int a=2,b=3,c=4;");
		System.out.println("   a = --b + c++;");
		System.out.println("   b+=a");
		System.out.println("a="+a+" b="+b+ " c="+c);

	}
	
}
