package Upcasting.Downcasting;

public class TesteUpcastingDowncasting {

	public static void main(String[] args) {

		Conta acc = new Conta(1001, "Alex", 0.0);
		UpcastingContaPoupança bacc = new UpcastingContaPoupança(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Conta acc1 = bacc;
		Conta acc2 = new UpcastingContaPoupança(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new UpcastingContaPoupança(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		DowncastingContaDeNegócios acc4 = (DowncastingContaDeNegócios) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof DowncastingContaDeNegócios) {
			DowncastingContaDeNegócios acc5 = (DowncastingContaDeNegócios) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof UpcastingContaPoupança) {
			UpcastingContaPoupança acc5 = (UpcastingContaPoupança) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}