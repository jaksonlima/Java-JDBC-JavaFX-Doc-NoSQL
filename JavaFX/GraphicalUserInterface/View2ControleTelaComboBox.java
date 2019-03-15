package GraphicalUserInterface;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Pessoas.Pessoa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class View2ControleTelaComboBox implements Initializable {

	@FXML
	private ComboBox<Pessoa> ComboBoxPessoa;

	@FXML
	private Button botaoTodos;

	private ObservableList<Pessoa> obslista;

	@FXML
	public void onBotaoTodos() {
		for (Pessoa pessoa : ComboBoxPessoa.getItems()) {
			System.out.println(pessoa);
		}

	}

	@FXML
	public void onComboBoxAction() {
		Pessoa pessoa = ComboBoxPessoa.getSelectionModel().getSelectedItem();
		System.out.println(pessoa);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Pessoa> list = new ArrayList<Pessoa>();
		list.add(new Pessoa(1, "jaksonn", "jakson@gmail"));
		list.add(new Pessoa(2, "bruna", "bruna@gmail"));
		list.add(new Pessoa(3, "dani", "dani@gmail"));

		obslista = FXCollections.observableArrayList(list);
		ComboBoxPessoa.setItems(obslista);

		Callback<ListView<Pessoa>, ListCell<Pessoa>> factory = lv -> new ListCell<Pessoa>() {
			@Override
			protected void updateItem(Pessoa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};
		ComboBoxPessoa.setCellFactory(factory);
		ComboBoxPessoa.setButtonCell(factory.call(null));

	}

}
