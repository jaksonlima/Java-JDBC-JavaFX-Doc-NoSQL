package Encapsulamento;

public class EncapsulamentodasVariaveis {

	private String nome;
	private Double numero;
	private Integer idconta;
	private Long numeroCort�o;
	
	
	
	/** Encapsulamento � quando voce faz metodos / contrutores para 
	 * guardar os valores dentro das variaveis nunca deixar um metodo de acesso livre
	 * assim protejedo os dados sempre efetuar os GETS e SETS para que seja guardado os valores */
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Integer getIdconta() {
		return idconta;
	}

	public void setIdconta(Integer idconta) {
		this.idconta = idconta;
	}

	public Long getNumeroCort�o() {
		return numeroCort�o;
	}

	public void setNumeroCort�o(Long numeroCort�o) {
		this.numeroCort�o = numeroCort�o;
	}

}
