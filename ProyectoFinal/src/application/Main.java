package application;
	
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
private static BorderPane mainLayout;

public void start(Stage primaryStage) throws Exception{
	
		
	
	
	    Parent root = FXMLLoader.load(getClass().getResource("inicio.fxml"));
        primaryStage.setTitle("Enciclopedia");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
