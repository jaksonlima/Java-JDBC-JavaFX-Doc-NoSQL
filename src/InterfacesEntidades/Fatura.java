package InterfacesEntidades;

public class Fatura {

	public Double FormAPagamento;
	public Double taxa;

	public Fatura() {
	}

	public void Fatura(Double formaPagamento, Double taxa) {
		this.FormAPagamento = formaPagamento;
		this.taxa = taxa;
	}

	public Double getFormAPagamento() {
		return FormAPagamento;
	}

	public void setFormAPagamento(Double formAPagamento) {
		FormAPagamento = formAPagamento;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double totalpamento() {
		return getFormAPagamento() + getTaxa();	 
	}

}
