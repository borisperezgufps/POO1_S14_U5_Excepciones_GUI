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
		int b = 0;
		int result;
		
		try {
			
			Demonstration2 d2 = null;
			
			d2.calcular();
			
			result = a / b;
			
			System.out.println("So, the result of a/b is : " + result);
		
		} catch (Exception ex) {
		
			System.out.println("Encountered an exception: " + ex.getMessage());
			System.out.println("Here is the stack trace:");
			
			ex.printStackTrace();
		
		} finally {
			
			System.out.println("I am in finally. You cannot skip me!");
			
		}
		
		System.out.println("Esto acabó");
	}
	
	public void calcular() {
		
	}
	
	/*
	
	esNumero("12f5");

	public boolean esNumero(String numero){
	    int cont = 0;
	    boolean esNumero = false;
	    for(int i=0;i<numero.length;i++){
	        char letra = numero.charAt(i);
	        if(letra=='0' || letra=='1' || letra=='2'...){
	            cont++;
	        }
	    }
	    if(cont==numero.length)
	        esNumero = true;
	
	    return esNumero;
	
	}
	
	public boolean esNumero(String numero){

	    boolean esNumero = false;
	
	    try{
	        int numeroInt = Integer.parseInt(numero);
	        esNumero = true;
	    }catch(Exception ex){
	        System.out.println("Ingresó un valor no válido");
	    }
	
	    return esNumero;
	
	}
	
	*/
	
}

