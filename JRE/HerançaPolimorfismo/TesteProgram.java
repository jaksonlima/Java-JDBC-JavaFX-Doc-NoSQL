package HerançaPolimorfismo;

public class TesteProgram {
	public static void main(String[] args) {

		HerançaContaCliente conta = new HerançaContaCliente();
		
		conta.depositaSaldo(100.0);
		
		System.out.println(conta.getSaldo());

	}

}
