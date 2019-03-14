package InterfaceMétodosPadrão;

public class USTaxaJurosServico2 implements TaxaServico {

	private Double taxajuros;

	public USTaxaJurosServico2(Double taxajuros) {
		this.taxajuros = taxajuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxajuros;
	}

}
