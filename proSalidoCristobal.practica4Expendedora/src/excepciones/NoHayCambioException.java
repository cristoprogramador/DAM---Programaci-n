package excepciones;

public class NoHayCambioException extends Exception {
	public NoHayCambioException(){
		super();
	}
	public NoHayCambioException(String mensaje){
		super(mensaje);
	}
}
