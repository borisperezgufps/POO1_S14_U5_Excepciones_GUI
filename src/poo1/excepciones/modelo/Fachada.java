package poo1.excepciones.modelo;

public class Fachada {

	public void registrarUsuario(String nombre, String edad) throws Exception {
		
		if(nombre.length()>10)
			throw new Exception("El nombre de usuario es muy largo");
			// Como se lanza una excepción, entonces se debe agregar
			// la clausula throws 
		
		int edadInt = 0;
		
		try {		
			edadInt = Integer.parseInt(edad);
		}catch(Exception e) {
			throw new Exception("El valor de edad no es válido.");
		}
		// Pero ¿qué pasa si ingresaron mal la información 
		// de la edad?
		
		
		if(edadInt<18)
			throw new Exception("El usuario no puede ser menor de edad");
		
		Usuario usu = new Usuario();
		usu.setNombres(nombre);
		usu.setEdad(edadInt);
		
	}
	
}
