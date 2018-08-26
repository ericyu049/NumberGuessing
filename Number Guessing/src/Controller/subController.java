package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class subController {
	@FXML Button higher;
	@FXML Button lower;
	@FXML Button yes;
	@FXML Text text;
	@FXML Button end;
	public boolean gotit = false;
	public int max = 1000;
	public int min = 1;
	public int mid = (max-min)/2 + min;
	int flag = 0;
	public void start (Stage stage) {
		stage.setOnShowing(new EventHandler<WindowEvent>(){
			@Override
			public void handle (WindowEvent event){
				text.setText("Is the number "+mid+"?");
			}
		});
	}
	public void function (ActionEvent e) throws IOException{
		Button bt = (Button)e.getSource();
		if (bt == lower) {
			flag = 0;
			changeText(flag);
		}
		else if (bt == higher) {
			flag = 1;
			changeText(flag);
		}
		else if (bt == yes){
			flag = 2;
			changeText(flag);
		}
		else if (bt == end) {
			 System.exit(0);
		}
	}
	public void changeText(int flag) {
		if (flag == 0) {
			max = mid;
			mid = (max-min)/2 + min;
			text.setText("Is the number "+mid+"?");
		}
		else if (flag == 1) {
			min = mid;
			mid = (max-min)/2 + min;
			text.setText("Is the number "+mid+"?");
		}
		else if (flag == 2) {
			text.setText("Nice.");
			higher.setDisable(true);
			lower.setDisable(true);
			end.setDisable(false);
		}
	}
}
