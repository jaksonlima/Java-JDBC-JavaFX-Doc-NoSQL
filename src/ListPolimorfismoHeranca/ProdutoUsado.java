package ListPolimorfismoHeranca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date DataFabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		DataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return DataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		DataFabricacao = dataFabricacao;
	}

	@Override
	public String EtiquetaPreco() {
		return getPreco() + " (usado) $ " + String.format("%.2f", getPreco()) + " (Manufacture date: " + sdf.format(DataFabricacao) + ")";
	}

}
