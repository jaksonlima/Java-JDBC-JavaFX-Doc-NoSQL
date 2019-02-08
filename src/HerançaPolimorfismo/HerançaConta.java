package Heran�aPolimorfismo;

public class Heran�aConta {

	private Integer numero;
	private String nome;
	protected Double saldo;

	public Heran�aConta() {
	}

	public Heran�aConta(Integer number, String holder, Double balance) {
		this.numero = number;
		this.nome = holder;
		this.saldo = balance;
	}

	public Integer getNumber() {
		return numero;
	}

	public void setNumber(Integer number) {
		this.numero = number;
	}

	public String getHolder() {
		return nome;
	}

	public void setHolder(String holder) {
		this.nome = holder;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saqueSaldo(Double saldo) {
		this.saldo -= saldo;
	}

	public void depositaSaldo(Double saldo) {
		this.saldo = saldo - 5 ; 
	}

}
