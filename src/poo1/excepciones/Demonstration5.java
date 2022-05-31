package poo1.excepciones;

public class Demonstration5 {

	public static void main(String[] args) {
		System.out.println("***Demonstration5.The use of 'throw' keyword***\n");
		DemoClass demo = new DemoClass();
		try {
			demo.thowingException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
