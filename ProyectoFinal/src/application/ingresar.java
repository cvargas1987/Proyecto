package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javafx.application.Platform;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ingresar {
	
	@FXML
    Button btn_Iregresar;
	@FXML
    Button btn_Iguardar;
	@FXML
    TextField txt_IPalabra;
	@FXML
    TextArea txt_ISignificado;
	String I_palabra = null;
	String I_significado = null;
	FileWriter fichero = null; 
	PrintWriter pw = null; 
	String separador = ",";

	 public void guardar(ActionEvent actionEvent) throws IOException {
		 try {
		 I_palabra = txt_IPalabra.getText();
		 }catch (Exception e) {
			 System.out.println(e);
		 }
		 try {
			 I_significado = txt_ISignificado.getText();
			 }catch (Exception e) {
				 System.out.println(e);
			 }
		 System.out.println(I_palabra + I_significado);
	       
		 
	    	if (!I_palabra.equals("")) {
	        	if (!I_significado.equals("")) {
	        		Alert alerta = new Alert(Alert.AlertType.INFORMATION); 
		            alerta.setTitle(" ");
		            alerta.setContentText("Guardado Correctamente");
		            alerta.showAndWait();
		            
		            try {
		    			fichero = new FileWriter ("out/diccionario.txt");
		    			pw = new PrintWriter(fichero); 
		    			
	    				String linea =(I_palabra + separador + I_significado+ separador); 
	    				pw.println(linea);
	    				fichero.close();
		    			} catch (Exception e) {
		    			e.printStackTrace();
		    			}
		            
	        	}else {
	        		Alert alerta = new Alert(Alert.AlertType.ERROR); 
		            alerta.setTitle("ERROR");
		            alerta.setContentText("Faltan Datos Requeridos, revisar...");
		            alerta.showAndWait();
	        	}
	        }else {
	        	Alert alerta = new Alert(Alert.AlertType.ERROR); 
	            alerta.setTitle("ERROR");
	            alerta.setContentText("Faltan Datos Requeridos, revisar...");
	            alerta.showAndWait();
	        }
	 }
	 
	public void regresar (ActionEvent actionEvent) throws IOException {
			
		Stage stage = (Stage) btn_Iregresar.getScene().getWindow();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inicio.fxml"));
		Parent root = null; 
		root= fxmlLoader.load(); 
		Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
		
	}
	
}
