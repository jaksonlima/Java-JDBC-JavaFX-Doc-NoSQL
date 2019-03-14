package GraphicalUserInterface;

import java.awt.Button;

import javafx.fxml.FXML;

public class ViewControle {

	@FXML
	private Button botao;

	@FXML
	public void onBotaoAcao() {
		System.out.println("Seja bem vindo");
	}

}
