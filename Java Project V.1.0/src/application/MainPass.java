package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


/***
 * 
 * @author MarioMartinDev
 * @version 1.1
 *
 */

public class MainPass extends Application {
	@Override
	public void start(Stage ventana) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("viewPass.fxml"));
			Scene scene = new Scene(root);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ventana.setScene(scene);
			
			
			ventana.setTitle("Password Generator v1.0");
			ventana.setResizable(false);
			
			Image icon = new Image(getClass().getResourceAsStream("/recursos/icoPassword.png"));
			ventana.getIcons().add(icon);
			
			
			ventana.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
