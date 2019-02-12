package ClassAbctraras;

public  class ContaDeNegócios extends Conta {

	private Double adicional;

	public ContaDeNegócios() {
	}

	public ContaDeNegócios(String nome, Integer numero, Double conta, Double adicional) {
		super(nome, numero, conta);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public void deposita(Double valor) {
		super.deposita(valor); valor += adicional;
	}

}
