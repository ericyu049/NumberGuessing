package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainController {
	public static Stage currentPage;
	@FXML Button ready;
	public void start(Stage PrimaryStage) {
		currentPage = PrimaryStage;
	}
	public void function(ActionEvent e) throws IOException{
		Button bt = (Button)e.getSource();
		if (bt == ready) {
			Stage subPage = new Stage();		
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("/Controller/controller2.fxml"));
			Pane root= (Pane)loader.load();
			subController controller = loader.getController();
			controller.start(subPage);
			Scene scene = new Scene(root, 300,300);
			subPage.setScene(scene);
			subPage.show();
			subPage.setTitle("Number Guessing");
			currentPage.close();	
		}
	}
}
