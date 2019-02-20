package InterfacesServicos;

public class TaxaBrasilServico {

	public double taxa(double montante) {
		if (montante <= 100) {
			return montante * 0.2;
		} else {
			return montante * 0.15;
		}
	}

}
