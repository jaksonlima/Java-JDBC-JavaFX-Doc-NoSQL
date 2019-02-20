package InterfacesServicos;

public class ServicosLocacao {

	private Double precohora;
	private double precodia;

	private TaxaBrasilServico taxaBrasilServico;

	public ServicosLocacao(Double precohora, double precodia, TaxaBrasilServico taxaBrasilServico) {
		this.precohora = precohora;
		this.precodia = precodia;
		this.taxaBrasilServico = taxaBrasilServico;
	}

	public void faturaProcesso() {
		
	}
}
