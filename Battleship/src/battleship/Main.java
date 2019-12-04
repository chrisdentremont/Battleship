package battleship;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application implements Initializable{
	public String name;
	@FXML
	TextField nameText;
	
	@FXML
	Button saveButton;
	
	@FXML
	Text t;
	
	Stage window;
	
	@Override
	public void start(Stage s) throws IOException{
		window = s;
		//Parent root = FXMLLoader.load(getClass().getResource("BattleshipGrid.fxml"));
		Parent root2 = FXMLLoader.load(getClass().getResource("WelcomeBox.fxml"));
		
		window.setScene(new Scene(root2, 599, 400));
		window.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		saveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		launch(args);

	}

}
