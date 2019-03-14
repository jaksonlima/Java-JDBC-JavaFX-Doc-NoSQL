package ClassAbctraras;

public class ContaPoupanca extends Conta {

	private Double valorhoras;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nome, Integer numero, Double conta, Double valorhoras) {
		super(nome, numero, conta);
		this.valorhoras = valorhoras;
	}

	public Double getValorhoras() {
		return valorhoras;
	}

	public void setValorhoras(Double valorhoras) {
		this.valorhoras = valorhoras;
	}
	
	@Override
	public void deposita(Double valor) {
		super.deposita(valor);  valor += valorhoras;
	}
}
