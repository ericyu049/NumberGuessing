package Application;

import Controller.mainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(); 
		loader.setLocation(getClass().getResource("/Controller/controller.fxml")); 
		Pane root= (Pane)loader.load();
		mainController controller = loader.getController();
		controller.start(primaryStage);
		Scene scene = new Scene(root, 300,300); 
		primaryStage.setResizable(false);
		primaryStage.setScene(scene); 
	 	primaryStage.show(); 
	 	primaryStage.setTitle("Number Guessing");
	}
	public static void main (String [] args) {
		launch(args);
	}
}
