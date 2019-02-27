package InterfaceMétodosPadrão;

import java.security.InvalidParameterException;

public interface TaxaServico {

	double getTaxaJuros();

	default double payment(double valor, int mes) {
		if (mes < 1) {
			throw new InvalidParameterException("meses devem ser maiores que zero: ");
		}
		return valor * Math.pow(1.0 + getTaxaJuros() / 100.0, mes);
	}

}
