package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {
	public static void main(String[] args) {

		Map<Produto, Double> estoque = new HashMap<>();

		Produto p1 = new Produto("TV", 1.5000);
		Produto p2 = new Produto("Geladeira", 2.5000);
		Produto p3 = new Produto("Pia", 1.000);

		estoque.put(p1, 10000.0);
		estoque.put(p2, 20000.0);
		estoque.put(p3, 15000.0);

		Produto ps = new Produto("TV", 1.5000);

		System.out.println("Contains 'ps' key: " + estoque.containsKey(ps));

	}

}
