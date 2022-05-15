package ui;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import threads.Clock;

public class Seguimiento14Controladora {
	Clock clock;

	
    @FXML
    private TextField num;


    @FXML
    void obtenerNumero(ActionEvent event) {
    	clock.stop();
    	int num1 = Integer.parseInt(num.getText());
    	clock = new Clock(clockLabel, num1);
    	clock.start();
    }

    
	
	   @FXML
	    private BorderPane pane;
	  @FXML
	    private Label clockLabel;
	  
	  public void loadMenu() throws IOException {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
			fxmlLoader.setController(this);
			Parent login = fxmlLoader.load();
			clock = new Clock(clockLabel, 5);
			clock.start();
			pane.setCenter(login);
			
		}
}
