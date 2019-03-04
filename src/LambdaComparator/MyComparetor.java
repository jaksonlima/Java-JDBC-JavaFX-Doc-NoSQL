package LambdaComparator;

import java.util.Comparator;

public class MyComparetor implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase());
	}

}
