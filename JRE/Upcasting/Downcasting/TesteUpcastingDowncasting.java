package Upcasting.Downcasting;

public class TesteUpcastingDowncasting {

	public static void main(String[] args) {

		Conta acc = new Conta(1001, "Alex", 0.0);
		UpcastingContaPoupan�a bacc = new UpcastingContaPoupan�a(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Conta acc1 = bacc;
		Conta acc2 = new UpcastingContaPoupan�a(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new UpcastingContaPoupan�a(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		DowncastingContaDeNeg�cios acc4 = (DowncastingContaDeNeg�cios) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof DowncastingContaDeNeg�cios) {
			DowncastingContaDeNeg�cios acc5 = (DowncastingContaDeNeg�cios) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof UpcastingContaPoupan�a) {
			UpcastingContaPoupan�a acc5 = (UpcastingContaPoupan�a) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}