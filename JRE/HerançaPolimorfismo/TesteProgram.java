package Heran�aPolimorfismo;

public class TesteProgram {
	public static void main(String[] args) {

		Heran�aContaCliente conta = new Heran�aContaCliente();
		
		conta.depositaSaldo(100.0);
		
		System.out.println(conta.getSaldo());

	}

}
