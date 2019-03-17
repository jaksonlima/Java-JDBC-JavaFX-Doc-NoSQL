package MainViewTela;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import AlertaMainView.Alerta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewTela implements Initializable {

	@FXML
	private MenuItem menuitemVendedor;

	@FXML
	private MenuItem menuItemDepartamento;

	@FXML
	private MenuItem sobre;

	@FXML
	public void onMenuItemVendedorAcao() {
		System.out.println("Vendedor Sucess  " + menuitemVendedor);
	}

	@FXML
	public void onMenuItemDepartamentoAcao() {
		System.out.println("Departemento Sucess " + menuItemDepartamento);
	}

	@FXML
	public void onMenuItemSobreAcao() {
		loadView("/MainViewTela/Sobre.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

	private synchronized void loadView(String absolutNome) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutNome));
			VBox newVBox = loader.load();

			Scene mainScene = Tela.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

		} catch (IOException e) {
			Alerta.AcaoAlerta("Error IOException", "Error load", e.getMessage(), AlertType.ERROR);
			e.printStackTrace();
		}

	}
}
