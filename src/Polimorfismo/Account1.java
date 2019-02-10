package Polimorfismo;

public class Account1 {

	private Integer number;
	private String holder;
	protected Double balanceDouble;

	public Account1() {
	}

	public Account1(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balanceDouble = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balanceDouble;
	}

	public void withdraw(double amount) {
		balanceDouble -= amount + 5.0;
	}

	public void deposit(double amount) {
		balanceDouble += amount;
	}
	
	public String toString() {
		return "Numero da Conta: " 
	+ number 
	+ " Nome: " 
	+ holder 
	+  " Saldo: "
	+ balanceDouble ;
	
	}
}