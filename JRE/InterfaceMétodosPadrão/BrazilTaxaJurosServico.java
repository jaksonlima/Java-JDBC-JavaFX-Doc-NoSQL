package InterfaceM�todosPadr�o;

public class BrazilTaxaJurosServico implements TaxaServico {

	private Double taxajuros;

	public BrazilTaxaJurosServico(Double taxajuros) {
		this.taxajuros = taxajuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxajuros;
	}

}
