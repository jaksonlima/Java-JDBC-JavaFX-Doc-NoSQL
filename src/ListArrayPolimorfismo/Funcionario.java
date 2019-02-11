package ListArrayPolimorfismo;

public class Funcionario {

	private String nome;
	private Integer horas;
	private Double valorhoras;

	public Funcionario(String nome, Integer horas, Double valorhoras) {
		this.nome = nome;
		this.horas = horas;
		this.valorhoras = valorhoras;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorhoras() {
		return valorhoras;
	}

	public void setValorhoras(Double valorhoras) {
		this.valorhoras = valorhoras;
	}
	
	public Double valorPorHora() {
		return horas * valorhoras;
	}

}
