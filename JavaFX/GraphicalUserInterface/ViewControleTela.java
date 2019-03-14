package GraphicalUserInterface;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import Alerta.Alerta;
import Restrições.Restricoes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewControleTela implements Initializable {

	@FXML
	private Label RotuloResult;

	@FXML
	private TextField textoNumero1;
	@FXML
	private TextField textoNumero2;

	@FXML
	private Button botao;
	@FXML
	private Button sobre;
	@FXML
	private Button sair;
	@FXML
	private Button soma;

	@FXML
	public void onBotaoAcao() {
		System.out.println("Seja bem vindo");

	}

	@FXML
	public void onBotaoSobre() {
		Alerta.Alerta("Application", null, "Seu sistema esta na ultima versão", AlertType.INFORMATION);
	}

	@FXML
	public void onBotaoSoma() {
		try {
			Locale.setDefault(Locale.US);
			double numero1 = Double.parseDouble(textoNumero1.getText());
			double numero2 = Double.parseDouble(textoNumero2.getText());
			double soma = numero1 + numero2;
			RotuloResult.setText(String.format("%.2f", soma));

		} catch (NumberFormatException e) {
			Alerta.Alerta("Erro", null, e.getMessage(), AlertType.ERROR);
		}

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Restricoes.setCampoTextoDouble(textoNumero1);
		Restricoes.setCampoTextoDouble(textoNumero2);
		Restricoes.setComprimentoMáximoCampoTexto(textoNumero1, 12);
		Restricoes.setComprimentoMáximoCampoTexto(textoNumero2, 12);

	}

}
