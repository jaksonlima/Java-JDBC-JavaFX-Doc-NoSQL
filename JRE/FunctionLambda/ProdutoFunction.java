package FunctionLambda;

public class ProdutoFunction {

	private String nome;
	private Double preco;

	public ProdutoFunction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProdutoFunction(String nome, Double preco) {
		super();
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
		return "ProdutoFunction [nome=" + nome + ", preco=" + preco + "]";
	}

	public static String staticUpperCaseNamo(ProdutoFunction p) {
		return p.getNome().toUpperCase();
	}

	public String UpperCaseNamo() {
		return this.nome.toUpperCase();
	}

}
