package poo1.excepciones;

public class Demonstration2 {
	
	/*
	 * Preguntas a considerar:
	 * a) Se puede incluir un if, evitando usar un try-catch... entonces ¿para qué el try-catch?
	 * b) Qué pasa si quiero procesar la excepcion, es decir, mostrar un mensaje particular? 
	 * c) Cómo se hace para que la exception llegue hasta la GUI?
	 */
	
	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring Exceptions- Demonstration1 is modified.***");
		
		int a = 100; 
		int b = 2;
		int result;
		
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

