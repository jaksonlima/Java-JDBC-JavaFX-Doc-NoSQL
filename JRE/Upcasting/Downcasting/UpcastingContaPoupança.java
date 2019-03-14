package Upcasting.Downcasting;

public class UpcastingContaPoupança extends Conta {

	private Double interestRate;

	public UpcastingContaPoupança(Integer nemero, String holder, Double balance, Double interestRate) {
		super(nemero, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		saldo += saldo * interestRate;
	}

}