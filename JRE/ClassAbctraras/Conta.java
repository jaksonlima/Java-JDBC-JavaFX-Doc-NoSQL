package ClassAbctraras;

public abstract class Conta {

	private String nome;
	private Integer numero;
	private Double valor;

	public Conta() {
	}

	public Conta(String nome, Integer numero, Double conta) {
		this.nome = nome;
		this.numero = numero;
		this.valor = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getConta() {
		return valor;
	}
	
	public void deposita(Double valor) {
		this.valor = valor;
	}

}
