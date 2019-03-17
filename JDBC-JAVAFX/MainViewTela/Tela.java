package MainViewTela;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tela extends Application {

	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			String FXML = "/MainViewTela/MainView.fxml";
			FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML));
			Parent scrollpane = loader.load();
//			ScrollPane scrollpane = loader.load();
			mainScene = new Scene(scrollpane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
