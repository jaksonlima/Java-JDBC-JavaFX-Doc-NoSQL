package Polimorfismo;

public class SavingsAccount extends Account1 {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balanceDouble += balanceDouble * interestRate;
	}

	@Override
	public void withdraw(double amount) {
		balanceDouble -= amount;
	}
}