package poo1.excepciones;

public class DemoClass {
	
	public void thowingException() {		
		System.out.println("I always throw a NullPointerException");
		throw new NullPointerException("Forcefully throwing a NullPointerException");
		// System.out.println("I'll never print this line");
	}
}
