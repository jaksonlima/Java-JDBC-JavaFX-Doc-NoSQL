package ListArrayPolimorfismo;

public class TerceirizadoFuncionario extends Funcionario {
	
	private Double horasadicionais;
	
	public TerceirizadoFuncionario() {
		super();
	}

	public TerceirizadoFuncionario(String nome, Integer horas, Double valorhoras, Double horasadicionais) {
		super(nome, horas, valorhoras);
		this.horasadicionais = horasadicionais;
	}

	public Double getHorasadicionais() {
		return horasadicionais;
	}

	public void setHorasadicionais(Double horasadicionais) {
		this.horasadicionais = horasadicionais;
	}
	
	@Override
	public Double valorPorHora() {
		return super.valorPorHora() +  horasadicionais * 1.1;
	}

}
