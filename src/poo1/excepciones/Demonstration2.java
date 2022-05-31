package poo1.excepciones;

public class Demonstration2 {
	
	/*
	 * Pero luego de ejecutar esto, qué pasa si quiero procesar la excepcion, 
	 * pero además, quiero relanzarla para que llegue hasta la GUI?
	 */
	
	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring Exceptions- Demonstration1 is modified.***");
		
		int a = 100; 
		int b = 2;
		int result;
		
//		b -= 2;// b = 0
		
		try {
			
			result = a / b;
			
			System.out.println(" So, the result of a/b is : " + result);
		
		} catch (Exception ex) {
		
			System.out.println("Encountered an exception: " + ex.getMessage());
			System.out.println("Here is the stack trace:");
			
			ex.printStackTrace();
		
		} finally {
			
			System.out.println("I am in finally. You cannot skip me!");
			
		}
	}
}

