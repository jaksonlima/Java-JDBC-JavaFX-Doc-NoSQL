package GenericsSetMap;

import java.util.ArrayList;
import java.util.List;

public class PrintServico<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T valor) {
		list.add(valor);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalAccessError("List n�o existe ");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));

		}

		System.out.print("]");
	}

}
