package _02ejemplos._01Medicos;

public class CastingimplicitoExplicito {
	public static void main(String[] args) {
		Medico m1;
		Cirujano c1 = new Cirujano();
		
		//Cambio de tipo IMPLICITO: Guardo en una variable
		//de la parte superior de la jerarquía, un objeto
		//de la parte nferior de la jerarquia
		m1= c1;
		
		//Cambio de tipo EXPLICITO: Guardo en una variable
		//de la parte inferior jerarquica, un objeto de la 
		//parte superior jerarquica.
		Cirujano c2;
		c2 = c1; //Mismo tipo: Correcto
//		c2 = m1; //Tipos incompatibles: Incorrecto
		c2 = (Cirujano) m1; //Casting EXPLICITO: Correcto.
		
}

}
