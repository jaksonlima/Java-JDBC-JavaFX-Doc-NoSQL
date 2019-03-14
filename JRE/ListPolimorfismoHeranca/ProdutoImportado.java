package ListPolimorfismoHeranca;

public class ProdutoImportado extends Produto {

	private Double alfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double alfandega) {
		super(nome, preco);
		this.alfandega = alfandega;
	}

	public Double getAlfandega() {
		return alfandega;
	}

	public void setAlfandega(Double alfandega) {
		this.alfandega = alfandega;
	}

	public Double precoTotal() {
		return getPreco() + alfandega;
	}

	@Override
	public String EtiquetaPreco() {
		return getNome() + " $ " + String.format("%.2f", getPreco()) + " (Taxa alfandegária: $ "
				+ String.format("%.2f", alfandega) + ")";
	}

}
