package poo1.excepciones;

public class Demonstration3 {

	public static void main(String[] args) {

		Demonstration3 dem = new Demonstration3();
		dem.invocacion1();
//		dem.invocacion2();
//		dem.invocacion3();
//		dem.invocacion4();
		
		// Vuelve a la presentación
	}

	public void invocacion1() {
		System.out.println("***Demonstration-3.Rethrowing an exception.***");
		int a = 100, b = 1;

		Demonstration3Operation op = new Demonstration3Operation();		
		try {
			
			op.divide(a, b);
			
		}catch(Exception e) {
			System.out.println("La capturé en Demonstration3");
		}
		
		System.out.println("Dividiendo invocacion 1");
	}

	public void invocacion2() {
		System.out.println("***Demonstration-6.Rethrowing an exception.***");
		int a = 100, b = 1;
		try {
			Demonstration3Operation op = new Demonstration3Operation();
			op.divide(a, b);
		} catch (Exception ex) {
			System.out.println("Recaught the exception inside main() method.");
			System.out.println("a= " + a + " b= " + b);// a=100,b=1
			System.out.println("Here is the stackTrace :");
			ex.printStackTrace();
		}
	}
	


	public void invocacion3() {
		System.out.println("***Demonstration-6.Rethrowing an exception.***");
		int a = 100, b = 1;
		try {
			
			Demonstration3Operation op = new Demonstration3Operation();
			op.add(a, b); // Genera error de compilación, ¿por qué?
			
		} catch (Exception ex) {
			System.out.println("Recaught the exception inside main() method: "+ex.getMessage());
			System.out.println("a= " + a + " b= " + b);// a=100,b=1
			System.out.println("Here is the stackTrace :");
			ex.printStackTrace();
		}
	}
	
	public void invocacion4() {
		System.out.println("***Demonstration-6.Rethrowing an exception.***");
		int a = 100, b = 1;
		try {
			Demonstration3Operation op = new Demonstration3Operation();
			op.divide(a, b);
			op.add(a, b); 
		} catch (Exception ex) {
			System.out.println("Recaught the exception inside main() method.");
			System.out.println("a= " + a + " b= " + b);// a=100,b=1
			System.out.println("Here is the stackTrace :");
			ex.printStackTrace();
		}
	}

}
