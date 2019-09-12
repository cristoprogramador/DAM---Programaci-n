package _03ejercicios._09ofertasHotel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rastreator {

	public static void main(String[] args) {
		Hotel h1 = new Hotel("11111111A", "Excelsior", 5);
		Hotel h2 = new Hotel("22222222B", "Hilton", 5);
		Hotel h3 = new Hotel("33333333C", "Hotel Gomez", 2);
		Hotel h4 = new Hotel("44444444D", "NH Gran Via", 4);

		Oferta[] ofertas = {
				new Oferta ("Halcon", h1, 300),
				new Oferta ("Halcon", h2, 350),
				new Oferta ("Halcon", h3, 200),
				new Oferta ("El C.Ingles", h2, 200),
				new Oferta ("El C.Ingles", h3, 200),				
				new Oferta ("El C.Ingles", h4, 200),
				new Oferta ("Booking", h1, 250),
				new Oferta ("Booking", h2, 250),
				new Oferta ("Booking", h3, 50),
				new Oferta ("Booking", h4, 250),
		};
		//averiguar la mejor oferta de cada hotel
		//mostrar los datos del hotel y de la foreta
		
		/*
		 *SOLUCIÓN JAVI
		 */
		Map<Hotel, Oferta> mejoresOfertas = new HashMap<>();
		for(int i = 0; i < ofertas.length; i++) {
			Hotel h = ofertas[i].getHotel();
			//Comprobamos si el hotrl de la oferta está en el map
			//y con que precio está
			Oferta o = mejoresOfertas.get(h);
			if (o== null) {
				//Es la primera vez que aparece el hotel. Insertamos el
				// hotel y la oferta
				mejoresOfertas.put(h, ofertas[i]);			
			}else {
				//Ya había una oferta del hotel. Comprobamos que oferta es 
				//mejor, la nueva o la que habia guardada. Si es mejor la neva
				//actualizamos el map
				if (ofertas [i].getPrecio() < o.getPrecio()) {
					//Hemos encontrado una oferta mejor
					mejoresOfertas.put(h, ofertas[i]);
				}
			}			
		}
		//Recorremos las mejores ofertas y mostramos la información
		Set<Hotel> hoteles = mejoresOfertas.keySet();
		for (Hotel h:hoteles) {
			Oferta o = mejoresOfertas.get(h);
			System.out.println(h.toString() + 
					" - " + o.getVendedor() + 
					" - " + o.getPrecio());
		}		
		//Otra forma de recorrer(EN ESTE EJERCICIO) //
		System.out.println("-------------------------------------");
		Collection<Oferta> of = mejoresOfertas.values();
		for(Oferta o: of) {
			System.out.println(o);
		}
		/**/
		
		
		/*
		 * Mi solución FALLA
		 */
		Map<Hotel, Double> best = new HashMap<>();
		Double precio;
		
		for(Oferta o: ofertas) {
			
			if (best.containsKey(o)) {
				precio = best.get(o);
				if (o.getPrecio() < precio) {
					precio = o.getPrecio();
				}
				
				best.put(o.getHotel(), precio);
			}
			else 
			best.put(o.getHotel(), o.getPrecio());
		}
	
		for(Hotel hot: best.keySet()) {
			System.out.println(hot.toString() + " " + best.get(hot));
		}
		/**/
		
	}

}
