package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class leerDiccionario {
	
	String sp; 
	String n;
	@FXML
    //ListView diccionario;
	ArrayList<String> nombreArrayList = new ArrayList<String>();
	String dato;
	public leerDiccionario (String _dato) 
	{
		dato = _dato;
	}
	
	public String  leer () {
			String linea = null;
	        try {
	            FileReader fileReader = new FileReader("out/diccionario.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            while((linea = bufferedReader.readLine()) != null) {
	            	String[] parts = linea.split("(,)");
	            	String hd = parts[0];
	            	if(dato.equals(hd)) {
	            		return linea;
	            	}
	            		
	            		
//	            	nombreArrayList.add(linea);
	               // List<String> datos = Arrays.asList(linea.split(","));
	                //n = datos.get(0);
	              //  listViewData.add(datos.get(3).toString());
	            	
	            }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("No existe Diccionario...");
	            return "Error";
	        } catch (IOException e) {
	            System.out.println("Problema el Diccionario...");
	            return "Error";
	        }

	     //   diccionario.setItems(listViewData);
	       Iterator<String> nombreIterator = nombreArrayList.iterator();
	       while(nombreIterator.hasNext()){
        	String elemento = nombreIterator.next();
        	System.out.print(elemento+" / ");
	    }
		return "";

	}
	
}

