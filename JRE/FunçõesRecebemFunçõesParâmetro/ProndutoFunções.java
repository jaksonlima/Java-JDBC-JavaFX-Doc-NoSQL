package Fun��esRecebemFun��esPar�metro;

public class ProndutoFun��es {

	private String nome;
	private Double preco;

	public ProndutoFun��es() {
	}

	public ProndutoFun��es(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return this.nome + ", " + String.format("%.2f", this.preco);
	}

}
