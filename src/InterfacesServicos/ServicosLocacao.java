package InterfacesServicos;

import java.util.Date;

import InterfacesEntidades.AluguerCarros;
import InterfacesEntidades.Fatura;

public class ServicosLocacao {

	private Double precohora;
	private Double precodia;

	private TaxaBrasilServico taxaBrasilServico;

	public ServicosLocacao(Double precohora, double precodia, TaxaBrasilServico taxaBrasilServico) {
		this.precohora = precohora;
		this.precodia = precodia;
		this.taxaBrasilServico = taxaBrasilServico;
	}

	public void faturaProcesso(AluguerCarros aluguerCarros) {
		long t1 = aluguerCarros.getInicio().getTime();
		long t2 = aluguerCarros.getFim().getTime();
		double hrs = (double) (t1 - t2) / 100 / 60 / 60;
		double basicPlayment;
		if (hrs <= 12.0) {
			basicPlayment = Math.ceil(hrs) * precodia;
		} else {
			basicPlayment = Math.ceil(hrs / 24) * precodia;
		}

		double taxa = taxaBrasilServico.taxa(basicPlayment);

		aluguerCarros.setFatura(new Fatura(basicPlayment, taxa));

	}
}
