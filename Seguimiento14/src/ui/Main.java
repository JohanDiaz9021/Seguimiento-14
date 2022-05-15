package ui;

import java.awt.Label;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
	private Seguimiento14Controladora seguimiento14;

    @FXML
    private Label carga;

    public Main() throws ClassNotFoundException, IOException {

           seguimiento14 = new Seguimiento14Controladora();

    }

    public static void main(String [] args) {
        launch(args);


    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome.fxml"));

		fxmlLoader.setController(seguimiento14);
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Seguimiento 14");
		primaryStage.show();
		seguimiento14.loadMenu();

    	/*
    	FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("White.fxml"));
		fxmlLoader1.setController(tiendaMonarcaGUI);
		Parent root2= fxmlLoader1.load();
		Scene scene=  new Scene (root2);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Restaurant");
		primaryStage.show();
		tiendaMonarcaGUI.inicializedMain();
		*/
		}





}
