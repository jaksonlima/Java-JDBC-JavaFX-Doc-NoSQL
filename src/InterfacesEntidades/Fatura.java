package InterfacesEntidades;

public class Fatura {

	public Double FormAPagamento;
	public Double taxa;

	
	public Fatura() {
	}

	public Fatura(double basicPlayment, double taxa2) {
		this.FormAPagamento = basicPlayment;
		this.taxa = taxa2;
	}

	public void Fatura(double formaPagamento, double taxa) {
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
