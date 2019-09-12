package _02ejemplos;

public class TestTiempoV3 {
	public static void main(String[] args) {
		//De la misma forma que podemos crear obketos de la clase String,
		//Circulo, Scanner, etc,... podemos crear objetos de la clase Tiempo
		
	
	TiempoV3 salida = new TiempoV3();
	TiempoV3 llegada = new TiempoV3();
	
	//Cada objeto tiene su hora, su minuto y segundo. Se accede a ellas
	//usando el punto (.)
	
	
	//salida.hora = 2;
	
	salida.setHora(2);
	salida.setMinuto(30);
	salida.setSegundo(0);
	
	llegada.setHora(22);
	llegada.setMinuto(55);
	//Observa que los atributos numericos no inicializados valen 0,
	
	System.out.format("Salida: %02d:%02d:%02d\n", salida.getHora(), salida.getMinuto(), salida.getSegundo());
	System.out.format("Llegada: %02d:%02d:%02d\n", llegada.getHora(), llegada.getMinuto(), llegada.getSegundo());
	
	//Si imprimimos un objeto, en principio aparece informacion basura....añadiendo toString al obejo
	//llegada o salida obtenemos la info del objeto en string en vez de su zona de memoria.
	
	System.out.println(salida.toString());
	//Si utilizo un objeto como una cadena, java lo hace automaticamente sin toString().
	System.out.println(llegada.toString());
	System.out.println("Salida: " + salida + "- Llegada: " + llegada);
	
	//Nada impide dar a los atributos valores incorrectos
	TiempoV3 incorrecto = new TiempoV3();
	incorrecto.setHora(23);
	incorrecto.setMinuto(59);
	incorrecto.setSegundo(59);
	System.out.println("Tiempo incorrecto: " + incorrecto);
	
	
	
	
	}

}
