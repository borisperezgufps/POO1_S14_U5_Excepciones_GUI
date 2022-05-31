package poo1.excepciones;

public class Demonstration7 {

	private int c;

	public void divide(int a, int b) throws Exception {
		try {
			b--;
			c = a / b; // some code
		} catch (Exception ex) {
			// Log it now
			System.out.println("a= " + a + " b= " + b);// a=100,b=0
			System.out.println("Caught an exception: " + ex.getMessage());
			// Now rethrow it
			throw ex; // rethrowing the exception
		}
	}
	
	/*
	 * Se puede ver por qué es importante registrar algunos detalles 
	 * adicionales antes de volver a lanzar una excepción. Tan pronto 
	 * como encontró la excepción, la registró, y a partir de ese 
	 * registro se descubrió que el divisor (b) se convirtió en 0 
	 * en el método divide(). Si no se usa el bloque try-catch dentro 
	 * del método divide() y no se registran los valores de a y b 
	 * inmediatamente, entonces se depende del bloque catch dentro del 
	 * método main() solamente. En un caso como este, cuando vea las 
	 * declaraciones finales de registro, se puede preguntarse por qué 
	 * ve esta excepción incluso si el valor de b es 1.
	 */

	public static void main(String[] args) {
		System.out.println("***Demonstration-6.Rethrowing an exception.***");
		int a = 100, b = 1;
		try {
			Demonstration7 d7 = new Demonstration7();
			d7.divide(a, b);
		} catch (Exception ex) {
			System.out.println("Recaught the exception inside main() method.");
			System.out.println("a= " + a + " b= " + b);// a=100,b=1
			System.out.println("Here is the stackTrace :");
			ex.printStackTrace();
		}
		
		/*
		 * Ahora, si se quita el try-catch, el compilador lanzará un error. 
		 * Vea Demostration7
		 */
	}
	
}
