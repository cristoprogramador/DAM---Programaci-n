package _02ejemplos;

public class TestTiempoV1 {
	public static void main(String[] args) {
		//De la misma forma que podemos crear obketos de la clase String,
		//Circulo, Scanner, etc,... podemos crear objetos de la clase Tiempo
		
	
	TiempoV1 salida = new TiempoV1();
	TiempoV1 llegada = new TiempoV1();
	
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
	
	//Si imprimimos un objeto, en principio aparece informacion basura
	System.out.println(salida);
	System.out.println(llegada);
	
	
	
	
	}

}
