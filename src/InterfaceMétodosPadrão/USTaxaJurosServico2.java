package InterfaceMétodosPadrão;

import java.security.InvalidParameterException;

public class USTaxaJurosServico2 implements TaxaServico {

	private Double taxajuros;

	public USTaxaJurosServico2() {
	}

	public USTaxaJurosServico2(Double taxajuros) {
		this.taxajuros = taxajuros;
	}

	@Override
	public double payment(double valor, int mes) {
		if (mes < 1) {
			throw new InvalidParameterException("meses devem ser maiores que zero: ");
		}
		return valor * Math.pow(1.0 + this.taxajuros / 100.0, mes);
	}

	@Override
	public double getTaxaJuros() {
		return taxajuros;
	}

}
