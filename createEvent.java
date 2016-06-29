package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;

public class createEvent implements Initializable{
	
	@FXML private GridPane centerGrid;
	
	
	public void createEv(){
		System.out.println("Handler has Been called ");
		System.out.println(centerGrid.getId());
		try{
			Parent root=FXMLLoader.load(getClass().getResource("newEvent.fxml"));
			centerGrid.add(root, 0, 0,2,3);
			centerGrid.autosize();
		}
		catch(Exception e){
			
		}
	}

	public void aboutUs(){
		try{
			Parent root=FXMLLoader.load(getClass().getResource("aboutus.fxml"));
			centerGrid.add(root, 0, 0);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void profile(){
		System.out.println("Profile Menu Selected");
		
	}
	
	public void closeMenu(){
		Main.window.close();
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}


}
