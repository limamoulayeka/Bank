package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			//main customer...
			//System.out.println("Customer On...");
			Parent root=FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

/*
 * 
 * BANK EST UN PROJET JAVAFX DE GESTION DE BANQUE
 * DEVELOPPE PAR LIMAMOU LAYE KA 
 * limamoulayeka7@gmail.com 
 * (+221) 78 - 137 - 66 - 46  
 * 
 * 
 * */

