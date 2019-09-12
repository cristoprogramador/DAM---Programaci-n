package _01granTeatre;
/**
 * Tenemos un arraylist Arraylist<Evento> con todos los eventos que se han programado en un año
 * Mostrar por pantalla cuantas veces se ha repetico cada evento
 * No podemos añadir ni getrers ni setters
 * 
 * Usaremos un map para contar las veces que se ha repetido cada evento junto al evento.
 */
//ESTRUCTURAS HASH, HAN DE INCORPORAR METODO HASCODE Y ECUALS
//ESTRUCTURAS TREE, HAN DE INCORPORAR METODO COMPARABLES
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestEventos {

	public static void main(String[] args) {
		ArrayList<Evento> e = new ArrayList<>();
		Map<Evento, Integer> ev = new HashMap<>();
		
		e.add(
		new ObraTeatro("La Casa de la pradera", "12/08/2018", "20:00", 15, "Joan Sala", "Ana De Armas, Raul Cimas"));
		e.add(new ObraTeatro("La Casa de la pradera", "12/08/2018", "20:00", 15, "Joan Sala", "Ana De Armas, Raul Cimas"));
		e.add(new ObraTeatro("La Casa del arbol", "12/08/2018", "20:00", 15, "Joan Sala", "Ana De Armas, Raul Cimas"));
		e.add(new ObraTeatro("El pecador la pradera", "12/08/2018", "20:00", 15, "Joan Sala", "Ana De Armas, Raul Cimas"));
		e.add(new ObraTeatro("La Casa del pecador de la pradera", "12/08/2018", "20:00", 15, "Joan Sala", "Ana De Armas, Raul Cimas"));
				
		e.add(new ProduccionLocal("La lucha de un pueblo", "12/08/2018", "20:00", "Asociación Sahara libre"));
		e.add(new ProduccionLocal("Un pueblo en lucha", "12/08/2018", "20:00", "Asociación Sahara libre"));
		e.add(new ProduccionLocal("La lucha sigue", "12/08/2018", "20:00", "Asociación Sahara libre"));
		e.add(new ProduccionLocal("La lucha de un publo", "12/08/2018", "20:00", "Asociación Sahara libre"));

		e.add(new Exposicion("Niños del Sahara", "12/08/2018", "20:00", 1, "30/08/2018"));
		e.add(new Exposicion("Niñas del Sahara", "12/08/2018", "20:00", 1, "30/08/2018"));
		e.add(new Exposicion("Niños del Sahara", "12/08/2018", "20:00", 1, "30/08/2018"));
		e.add(new Exposicion("Niños del Sahara", "12/08/2018", "20:00", 1, "30/08/2018"));
	
		

		for (Evento t : e) {
			//Comprobamos cuantas veces ha aparecido el evento
			Integer cont = ev.get(t);
			if (cont == null) {
				// No había aparecido aún
				ev.put(t, 1);
			}
			//Anyadimos una mas
			else ev.put(t, cont+1);
		}
		// PARA RECORRER UN MAP UTILIZAMOS UN SET
		//Mostrar las veces que ha aparecido cada evento
		Set<Evento> eventos = ev.keySet();
		for (Evento es: eventos) {
			System.out.println(es);
			System.out.println("VECES: " + ev.get(es));
			System.out.println("---------------------");
		}
		
	}

}
