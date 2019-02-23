package Interface;

public class BrazilTaxService implements TaxService{

	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		} else {
			return amount * 0.15;
		}
	}

	public Integer brasil(int valor) {
		if (valor >= 100) {
			return valor * 2;
		} else {
			return valor * 15;
		}

	}
}