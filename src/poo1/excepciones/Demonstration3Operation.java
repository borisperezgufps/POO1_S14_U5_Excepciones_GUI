package poo1.excepciones;

public class Demonstration3Operation {

	public void divide(int a, int b) {
		
		try {
			b--;
			int c = a / b; 
		} catch (ArithmeticException ex) {
			// Log it now
			System.out.println("a= " + a + " b= " + b);// a=100,b=0 
			System.out.println("Caught an exception: " + ex.getMessage());
			// Now rethrow it
			throw ex;// rethrowing the exception
			
		}
	}
	
	/* Ojo con la declaración del método.
	 * Se está especificando que se lanzará una excepcion
	 */
	public void add(int a, int b) throws Exception{
		
		try {
			b--;
			
//			if(b<=0)
//				throw new Exception("No se puede realizar la división");
			
			int c = a / b; // some code
			
		} catch (Exception ex) {
			// Log it now
			System.out.println("Caught an exception: " + ex.getMessage());
			// Now rethrow it
			throw new Exception("Se realizó una división entre cero. Tenga cuidado con los valores ingresados");// rethrowing the exception
		}
	}

}
