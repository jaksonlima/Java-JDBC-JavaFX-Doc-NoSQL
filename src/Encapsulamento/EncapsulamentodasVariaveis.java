package Encapsulamento;

public class EncapsulamentodasVariaveis {

	private String nome;
	private Double numero;
	private Integer idconta;
	private Long numeroCortão;
	
	
	
	/** Encapsulamento é quando voce faz metodos / contrutores para 
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

	public Long getNumeroCortão() {
		return numeroCortão;
	}

	public void setNumeroCortão(Long numeroCortão) {
		this.numeroCortão = numeroCortão;
	}

}
