package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class newEventController implements Initializable {
	
	
	@FXML private TextField name;
	@FXML private TextField venue;
	@FXML private TextField fhead;
	@FXML private DatePicker edate;
	@FXML private ComboBox<String> shead;
	@FXML private VBox vboxPane;
	@FXML private FlowPane studentFlowPane;
	@FXML private TextField student1;
	@FXML private TextField student2;
	@FXML private TextField student3;
	@FXML private TextField student4;
	@FXML private TextField student5;
	
	private static int i=1;
	
	public void createHandler(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","root","");
			//Statement stmt=con.createStatement();
			String sql = "INSERT INTO event (event_name,event_venue,fhead,event_date,s_head)" +
			        "VALUES (?, ?, ?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, name.getText());
			preparedStatement.setString(2, venue.getText());
			preparedStatement.setString(3, fhead.getText());
			preparedStatement.setDate(4, Date.valueOf(edate.getValue()));
			preparedStatement.setInt(5, Integer.valueOf(shead.getValue()));
			int i=preparedStatement.executeUpdate();
			if(i>0){
				
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setTitle("Submit");
				alert.setHeaderText(null);
				alert.setContentText("Event Created");
				alert.showAndWait();
			}
			
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
	}
	public void resetHandler(){
		
		name.clear();
		venue.clear();
		fhead.clear();
		shead.getSelectionModel().select("No. Of Coordinators:");
	}
	
	public void selectNumber(){
		studentFlowPane.setVisible(true);
		studentFlowPane.setDisable(false);
		int i=Integer.valueOf(shead.getValue());
		student5.setDisable(true);
		student4.setDisable(true);
		student3.setDisable(true);
		student2.setDisable(true);
		student1.setDisable(true);
		switch(i){
			case 5:
				student5.setDisable(false);
			case 4:
				student4.setDisable(false);
			case 3:
				student3.setDisable(false);
			case 2:
				student2.setDisable(false);
			case 1:
				student1.setDisable(false);
		}
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
