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
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class inicio {
	
	@FXML
    Button btn_buscar;
	@FXML
    Button btn_ingresar;
	
	public void buscar(ActionEvent actionEvent) throws IOException {
		Stage stage = (Stage) btn_buscar.getScene().getWindow();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("buscar.fxml"));
		Parent goBuscar = null; 
		goBuscar = fxmlLoader.load(); 
		Scene scene = new Scene(goBuscar);
        stage.setScene(scene);
        stage.show();
	}
	
	public void ingresar(ActionEvent actionEvent) throws IOException {
		Stage stage = (Stage) btn_ingresar.getScene().getWindow();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ingresar.fxml"));
		Parent goIngresar = null; 
		goIngresar = fxmlLoader.load(); 
		Scene scene = new Scene(goIngresar);
        stage.setScene(scene);
        stage.show();
	}
	
	
	
}
