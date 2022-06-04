package poo1.excepciones;

import javax.swing.JOptionPane;

public class DemoArreglo {

	public static void main(String[] args){
		DemoArreglo da = new DemoArreglo();
		da.ejecucion();
	}
	
	public void ejecucion(){
		String[] nombres = {"Andres", "Katerina", "Jarlin", "Boris"};
		String[] apellidos = null;
		
		try {
			imprimirValorPosicion2(nombres, 4);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
				
	}
	
	public void convertirEntero(String valor) throws Exception {
		try {
			int valorEntero = Integer.parseInt(valor);
			
		}catch(Exception e) {
			throw new Exception("Error convirtiendo el texto");
		}
	}
	
	public String imprimirValorPosicion2(String[] nombres, 
			int indice) throws Exception{
		
		String valor = "";
		try {
			valor = nombres[indice];
			System.out.println(valor);
		}catch(Exception e) {
			throw new Exception("Se accedió a posición no válida.");
		}
		
		convertirEntero(valor);
				
		return valor;
	}
	
	public void imprimirValorPosicion(String[] nombres, int indice) {
		String valor = "";
		try {
			valor = nombres[indice];
			int valorEntero = Integer.parseInt(valor);
			System.out.println(valor);
		}catch(NullPointerException e) {
			System.err.println("Se está accediendo a un arreglo nulo");
		}catch(IndexOutOfBoundsException ei){
			System.err.println("Está intentando acceder a "
					+ "una posición no válida. Pos = "+indice+
					" en un arreglo tamaño = "+nombres.length);
		}catch(Exception e) {
			System.err.println("Se generó un error inesperado. "
					+ "Valor = "+valor);
		}
	}
	
	
	
}
