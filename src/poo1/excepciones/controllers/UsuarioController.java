package poo1.excepciones.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import poo1.excepciones.modelo.Fachada;

public class UsuarioController {
	
	@FXML private TextField txtNombres;
	@FXML private TextField txtEdad;
	
	private Fachada fac;
	
	public UsuarioController() {
		fac = new Fachada();
	}
	
	public void handleRegistrarBtn(ActionEvent ev) {
		String nombres = txtNombres.getText();
		String edad = txtEdad.getText();
		
		try {
			fac.registrarUsuario(nombres, edad); 
			Alert al = new Alert(AlertType.INFORMATION);
			al.setContentText("El usuario se registró exitosamente.");
			al.show();
			// Este método lanza una excepción, y por eso
			// debe incluirse en bloque try-catch
		}catch(Exception e) {
			Alert al = new Alert(AlertType.ERROR);
			al.setContentText(e.getMessage());
			al.show();
		}
	}
	
}
