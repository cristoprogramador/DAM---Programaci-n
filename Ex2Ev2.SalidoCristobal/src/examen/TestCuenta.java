package examen;

public class TestCuenta {
	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("miguel","ies.com",true);
		System.out.println(c1);	

		Cuenta c2 = new Cuenta("pablo","ies.com", false);
		System.out.println(c2);	

		
		//Cambio de contrase�a: Probar distintas opciones
		try{
			c1.setPassword("miguel", "miguel12345", "miguel12345");
			System.out.println(c1);
			
			c2.setPassword("pablo", "miguel1", "miguel1");
			System.out.println(c2);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}
