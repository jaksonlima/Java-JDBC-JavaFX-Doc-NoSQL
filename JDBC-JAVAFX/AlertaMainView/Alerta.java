package AlertaMainView;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerta {

	public static void AcaoAlerta(String title, String header, String content, AlertType type) {
		Alert alerta = new Alert(type);
		alerta.setTitle(title);
		alerta.setHeaderText(header);
		alerta.setContentText(content);
		alerta.show();
	}

}
