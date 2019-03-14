package Upcasting.Downcasting;

public class Conta {

	private Integer numero;
	private String nome;
	protected Double saldo;

	public Conta(Integer nemero, String holder, Double balance) {
		this.numero = nemero;
		this.nome = holder;
		this.saldo = balance;
	}

	public void setNumero(Integer numeroConta) {
		this.numero = numeroConta;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void sacaSaldo(double amount) {
		saldo -= amount;
	}

	public void deposita(double amount) {
		saldo += amount;
	}

}
