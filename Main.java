package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	 
	BorderPane root;
	public static Stage window;
	private static Main instance;
	public Main(){
		instance=this;
	}
	
	public static Main getInstance(){
		return instance;
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		window=primaryStage;
		try {
		
		root =FXMLLoader.load(getClass().getResource("Admin-Fx.fxml"));
		
		
		primaryStage.setScene(new Scene(root,800,500));
		primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
