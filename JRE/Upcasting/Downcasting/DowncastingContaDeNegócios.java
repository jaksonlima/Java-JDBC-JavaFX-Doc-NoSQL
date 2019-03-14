package Upcasting.Downcasting;

public class DowncastingContaDeNeg�cios extends Conta {

	private Double loanLimit;

	public DowncastingContaDeNeg�cios(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			saldo += amount - 10.0;
		}
	}
}
