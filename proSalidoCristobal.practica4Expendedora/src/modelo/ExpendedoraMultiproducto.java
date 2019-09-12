package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import excepciones.AlcoholHorarioIlegal;
import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class ExpendedoraMultiproducto {
	
	// Cantidad de dinero introducido por el comprador para hacer frente a la
	// compra
	private double credito;

	// Cambio del que dispone la m�quina para devolver al comprador lo que le
	// sobra de la compra
	private double cambio;

	// Importe de las ventas realizadas
	private double importeVendido;

	// Producto que vende la expendedora.
	private Catalogo catalogo;
	
	// Calendario del sistema
	Calendar calendario = new GregorianCalendar();
	/**
	 * Crea una Expendedora con el cambio y producto indicados
	 * @param cambio Euros disponibles para devolver cambio
	 * @param producto El Producto que vende la m�quina
	 */
	public ExpendedoraMultiproducto(double cambio, Catalogo catalogo) {
		this.cambio = cambio;
		this.catalogo = catalogo;
		// El importe introducido por el comprador, inicialmente es cero.
		this.credito = 0;
		// El importe de las ventas realizadas, inicialmente es cero.
		this.importeVendido = 0;
	}

	public double getCredito() {
		return credito;
	}

	public int getStock(String codigo) {
		Producto p = Catalogo.bucarProducto(codigo);
		return p.getStock();
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public double getPrecio(String codigo) {
		Producto p = Catalogo.bucarProducto(codigo);
		return p.getPrecio();
	}

	public double getCambio() {
		return cambio;
	}

	public double getImporteVendido() {
		return importeVendido;
	}
	
	public Producto getProducto(String codigo) {
		Producto p = Catalogo.bucarProducto(codigo);
		return (Producto) p;
	}
	
	@Override
	public String toString() {
		return 	String.format(
				"Credito: %.2f euros " + 
				"\nCambio: %.2f euros " + 
				"\nVentas: %.2f euros" + 
				"\nProductos:\n%s",
				credito, cambio, importeVendido, catalogo.toString());
	}

	/**
	 * El comprador introduce dinero en la m�quina para comprar.
	 * El importe introducido se agrega al credito.
	 * @param importe Cantidad introducida por el comprador.
	 */
	public void introducirDinero(double importe) {
		this.credito += importe;
	}

	/**
	 * El comprador quiere que se le devuelva el dinero sin hacer la compra
	 */
	public void solicitarDevolucion() {
		credito = 0;
	}
	
	/**
	 * Se ordena la compra de una unidad del producto.
	 * @return el importe que hay que devolver al comprador (el dinero que le sobra)
	 * @throws NoHayCambioException si no hay cambio suficiente para devolverle
	 * @throws NoHayProductoException si el producto est� agotado
	 * @throws CreditoInsuficienteException si no ha introducido suficiente dinero para poder comprar
	 * @throws AlcoholHorarioIlegal 
	 */
	public double comprarProducto(String codigo) throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException, AlcoholHorarioIlegal {
		Producto p = Catalogo.bucarProducto(codigo);
		//Comprobamos si se puede hacer la venta
		double dineroADevolver = credito - p.getPrecio();
		if (p.getStock() == 0)
			throw new NoHayProductoException();
		else if (credito < p.getPrecio())
			throw new CreditoInsuficienteException();
		else if (dineroADevolver > cambio)
			throw new NoHayCambioException();
		else if (p.getAlcohol() != 0 && (calendario.get(Calendar.HOUR_OF_DAY) > 21 || calendario.get(Calendar.HOUR_OF_DAY) < 9))
			throw new AlcoholHorarioIlegal();
		else {
			//Realizamos la venta
			//El stock del producto comprado se reduce en 1 unidad
			p.setStock(p.getStock()-1);
			//El cr�dito pasa a ser cero
			credito = 0;
			//El importe de las ventas se incrementa en el precio de lo vendido
			importeVendido += p.getPrecio();
			//El cambio 
			cambio = cambio - dineroADevolver;
			
			return dineroADevolver;
		}
	}
	
	/**
	 * Agrega la cantidad indicada al producto deseado
	 * @param p Producto del cual se va a incrementar el stock
	 * @param cant numero de unidades a incrementar el stock del producto
	 */
	public void reponerArticulo(Producto p, int cant) {
		p.setStock(p.getStock()+cant);
	}
}
