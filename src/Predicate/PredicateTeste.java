package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeste {
	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.0));
		list.add(new Produto("Geladeira", 1000.0));
		list.add(new Produto("Mesa", 500.0));
		list.add(new Produto("HD", 100.0));

//		list.removeIf(p -> p.getValor() <= 100);

//		list.removeIf(new ProdutoPredicado());

//		list.removeIf(Produto::staticProdutoPredicado);

//		list.removeIf(Produto::ProdutoPredicado);

		double min = 100.0;

		Predicate<Produto> produto1 = p -> p.getValor() <= min;

//		list.removeIf(produto1);

		Predicate<Produto> produto2 = p -> p.getValor() <= 100.0;

//		list.removeIf(produto2);

//		list.removeIf(p -> p.getValor() <= min);

		list.removeIf(p -> p.getValor() <= 100.0);

		for (Produto p : list) {
			System.out.println(p);
		}
	}

}
