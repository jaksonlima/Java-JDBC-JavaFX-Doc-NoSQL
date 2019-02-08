package HerançaPolimorfismo;

public class HerançaJuros extends HerançaConta {

	private Double juros;

	public HerançaJuros() {
		super();
	}

	public HerançaJuros(Integer number, String holder, Double balance, Double juros) {
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
