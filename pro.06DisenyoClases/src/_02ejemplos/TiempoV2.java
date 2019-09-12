package _02ejemplos;

public class TiempoV2 {
	
	//Atributos: Son como variables que almacena el objeto.
	//Cada objeto tiene sus propios valores en los atributos.
	//Se definen fuera de los metodos.
	int hora;
	int minuto;
	int segundo;
	
	//Metodo toString
	public String toString() {   //No se pone static...actua en el objeto, no es estatico
								
		//return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d", hora) + ":" + 
				String.format("02d", minuto) + ":" + 
				String.format("02d", segundo);
		//devuelve con un formato
	}

}
