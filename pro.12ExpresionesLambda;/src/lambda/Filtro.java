package lambda;

@FunctionalInterface//un interface funcional solo tiene un metodo (como Comparable)
public interface Filtro <T>{
	//T de tipo <> y o de objeto
	boolean aceptado(T o);
}
