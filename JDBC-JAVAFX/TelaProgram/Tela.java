package TelaProgram;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tela extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			String FXML = "/TelaProgram/MainView.fxml";
			FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML));
			Parent parent = loader.load();
			Scene mainScene = new Scene(parent);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
