package Heran�aPolimorfismo;

public class Heran�aContaCliente extends Heran�aConta {

	private Double Limiteconta;

	public Heran�aContaCliente() {
		super();
	}

	public Heran�aContaCliente(Integer number, String holder, Double balance, Double temposaldo) {
		super(number, holder, balance);
		this.Limiteconta = temposaldo;
	}

	public Double getTemposaldo() {
		return Limiteconta;
	}

	public void setTemposaldo(Double temposaldo) {
		this.Limiteconta = temposaldo;
	}

	public void emprestimo(Double temposaldo) {
		if (this.Limiteconta <= temposaldo) {
			depositaSaldo(temposaldo);
		}

	}

}
