package _02ejemplos;

public class TestTiempoV2 {
	public static void main(String[] args) {
		//De la misma forma que podemos crear obketos de la clase String,
		//Circulo, Scanner, etc,... podemos crear objetos de la clase Tiempo
		
	
	TiempoV2 salida = new TiempoV2();
	TiempoV2 llegada = new TiempoV2();
	
	//Cada objeto tiene su hora, su minuto y segundo. Se accede a ellas
	//usando el punto (.)
	
	salida.hora = 20;
	salida.minuto = 30;
	salida.segundo = 0;
	
	llegada.hora = 22;
	llegada.minuto = 55;
	//Observa que los atributos numericos no inicializados valen 0,
	
	System.out.format("Salida: %02d:%02d:%02d\n", salida.hora, salida.minuto, salida.segundo);
	System.out.format("Llegada: %02d:%02d:%02d\n", llegada.hora, llegada.minuto, llegada.segundo);
	
	//Si imprimimos un objeto, en principio aparece informacion basura....añadiendo toString al obejo
	//llegada o salida obtenemos la info del objeto en string en vez de su zona de memoria.
	
	System.out.println(salida.toString());
	//Si utilizo un objeto como una cadena, java lo hace automaticamente sin toString().
	System.out.println(llegada.toString());
	System.out.println("Salida: " + salida + "- Llegada: " + llegada);
	
	//Nada impide dar a los atributos valores incorrectos
	TiempoV2 incorrecto = new TiempoV2();
	incorrecto.hora = 44;
	incorrecto.minuto = 1535;
	incorrecto.segundo = 288;
	System.out.println("Tiempo incorrecto: " + incorrecto);
	
	
	
	
	}

}
