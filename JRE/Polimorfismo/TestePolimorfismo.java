package Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {

		Account1 a = new Account1(10, "jakson", 1000.0);
		
		Account1 b = new SavingsAccount(0101, "Bruna Silva", 1000.0, 0.0);


		a.withdraw(50.0);
		b.withdraw(50.0);
		
		System.out.println(a.getBalance());
		System.out.println();
		System.out.print(b.toString());
		
		/** Polimorfismo � quando uma Conta Pou�a era os valores da Conta e assim voce pode chamar a conta 
		 * que � a super e instaciar o Conta Pou�a com seus valores como exemplo a abaixo 
		 * Account1 b = new SavingsAccount(0101, "Bruna Silva", 1000.0, 0.0);*/

	}

}
