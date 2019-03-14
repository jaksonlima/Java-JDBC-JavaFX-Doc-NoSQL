package Heran�aPolimorfismo;

public class Heran�aJuros extends Heran�aConta {

	private Double juros;

	public Heran�aJuros() {
		super();
	}

	public Heran�aJuros(Integer number, String holder, Double balance, Double juros) {
		super(number, holder, balance);
		this.juros = juros;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public void updateSaldo() {
		saldo += saldo * juros;
	}

}
