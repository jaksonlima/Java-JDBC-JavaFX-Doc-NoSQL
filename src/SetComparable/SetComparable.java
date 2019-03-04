package SetComparable;

import java.util.Set;
import java.util.TreeSet;

public class SetComparable {
	public static void main(String[] args) {

		Set<Produto> set = new TreeSet<Produto>();

		set.add(new Produto("TV Samsung", 500.00));
		set.add(new Produto("Conversor digital", 250.00));
		set.add(new Produto("Geladeira", 1500.00));

		for (Produto produto : set) {
			System.out.println(produto);
		}


	}

}
