package Predicate;

public class Produto {

	private String nome;
	private Double valor;

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public static boolean staticProdutoPredicado(Produto p) {
		return p.getValor() <= 100.0;
	}

	public boolean ProdutoPredicado() {
		return this.valor <= 100.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "PredicateProduto [nome=" + nome + ", valor=" + valor + "]";
	}

}
