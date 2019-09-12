package _03ejercicios._09ofertasHotel;

public class Oferta {
	private String vendedor;
	private Hotel hotel;
	private double precio; //precio de habitacion por noche
	
	public Oferta (String v, Hotel h, double p) {
		vendedor = v;
		hotel = h;
		precio = p;
	}

	public String getVendedor() {
		return vendedor;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
	return hotel.toString() + " - " + vendedor + " - " + precio;
	}
}
