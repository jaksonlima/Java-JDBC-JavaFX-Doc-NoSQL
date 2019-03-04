package LambdaComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestComparartor {
	public static void main(String[] args) {

		List<Produto> list = new ArrayList<Produto>();

		list.add(new Produto("TV", 1000.0));
		list.add(new Produto("Ventilador", 500.0));
		list.add(new Produto("Teclado", 200.00));

		Comparator<Produto> comp = new Comparator<Produto>() { // Comparetor com new
			@Override
			public int compare(Produto p1, Produto p2) {
				return p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase());
			}
		};

		Comparator<Produto> comp2 = (p1, p2) -> p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase()); // lambda
																													// Comparetor

		list.sort((p1, p2) -> p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase()));

		for (Produto produto : list) {
			System.out.println(produto);
		}

	}

}
