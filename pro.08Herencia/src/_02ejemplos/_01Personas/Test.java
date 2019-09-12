package _02ejemplos._01Personas;

public class Test {

	public static void main(String[] args) {
		//usa el toString de la clase Persona
		Persona p = new Persona ("3247364k","José gonzález");
		System.out.println(p);
		System.out.println("--------------");
		//usa el toString de la clase Alumno
		Alumno a = new Alumno ("3474747m","Roberto Alcazar", 354775);
		System.out.println(a);
		
		//Prueba de metodo de pasar a mayusculas
		System.out.println("====================");
		pasarAMayusculas(p);
		System.out.println(p);
		//las sub clases tambien pueden utilizar los metodos
		//de las superclases
		pasarAMayusculas(a);
		System.out.println(a);
		
		//los metodos referentes a modificaciones concretas
		//de las subclases no pueden utilizarse con las superclases
		System.out.println("Dia de matricualación: " + diaDeMatriculacion(a));
//		System.out.println("Dia de matricualación: " + diaDeMatriculacion(p));
		//Persona no tiene atributo numExpediente

		
	}
	
	//Metodo para pasar a mayusculas
	public static void pasarAMayusculas(Persona p) {
		p.setNif(p.getNif().toUpperCase());
		p.setNombre(p.getNombre().toUpperCase());
	}
	
	public static int diaDeMatriculacion(Alumno a) {
		return a.getNumExpediente() % 7 + 1;
	}

}
