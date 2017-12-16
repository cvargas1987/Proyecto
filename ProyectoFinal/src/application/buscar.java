package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class buscar {
	
	@FXML
    Button btn_regresar;
	@FXML
    Button btn_buscar;
	@FXML
    TextField txtPalabra;
	String cadena = null; 

	 public void buscar(ActionEvent actionEvent) throws IOException {

	        String p = txtPalabra.getText();
	        leerDiccionario leerDiccionario = new leerDiccionario(p);
	        cadena = (leerDiccionario.leer());
	        System.out.println("retorna valor: " + cadena);
	        if (!cadena.equals("")) {
	        	String[] parts = cadena.split("(,)");
	        	String Palabra = parts[0]; 
	        	String Significado = parts[1]; 
	        	Alert alerta = new Alert(Alert.AlertType.INFORMATION); 
	            alerta.setTitle("Significado");
	            alerta.setContentText(Significado);
	            alerta.showAndWait();
				System.out.println(Palabra + ":" + Significado);
	       }else {
	    	   	Alert alerta = new Alert(Alert.AlertType.ERROR); 
	            alerta.setTitle("Significado");
	            alerta.setContentText("Este Significado No Existe");
	            alerta.showAndWait();
	       }
	 }
	public void regresar (ActionEvent actionEvent) throws IOException {
			
		Stage stage = (Stage) btn_regresar.getScene().getWindow();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inicio.fxml"));
		Parent root = null; 
		root= fxmlLoader.load(); 
		Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
		
	}
	
}
