package excepciones;

public class NoHayProductoException extends Exception {
	public NoHayProductoException(){
		super();
	}
	public NoHayProductoException(String mensaje){
		super(mensaje);
	}
}
