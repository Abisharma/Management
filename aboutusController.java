package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class aboutusController implements Initializable{
	
	@FXML private ImageView image1;
	@FXML private ImageView image2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Circle c=new Circle(200);
		c.setClip(image1);
		//image1.setClip(c);
		
	}
	
	

}
