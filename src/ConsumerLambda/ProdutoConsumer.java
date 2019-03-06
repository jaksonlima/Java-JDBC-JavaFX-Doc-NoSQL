package ConsumerLambda;

public class ProdutoConsumer {

	private String nome;
	private Double preco;

	public ProdutoConsumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProdutoConsumer(String nome, Double preco) {
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
		return "ProdutoConsumer [nome=" + nome + ", preco=" + preco + "]";
	}

	public static void precoUpdateStatic(ProdutoConsumer p) {
		p.setPreco(p.getPreco() * 1.1);
	}

	public void precoUpadate() {
		this.preco = preco * 1.1;
	}
}
