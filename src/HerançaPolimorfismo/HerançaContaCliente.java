package HerançaPolimorfismo;

public class HerançaContaCliente extends HerançaConta {

	private Double Limiteconta;

	public HerançaContaCliente() {
		super();
	}

	public HerançaContaCliente(Integer number, String holder, Double balance, Double temposaldo) {
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
