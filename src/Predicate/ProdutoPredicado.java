package Predicate;

import java.util.function.Predicate;

public class ProdutoPredicado implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		return p.getValor() <= 100.0;
	}

}
