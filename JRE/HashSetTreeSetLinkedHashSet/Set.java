package HashSetTreeSetLinkedHashSet;

import java.util.LinkedHashSet;

public class Set {
	public static void main(String[] args) {

		// HashSet-mais rápido (operações O(1) em tabela hash) e não ordenado
		// TreeSet-mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
		// pelo compareTodo objeto (ou Comparator)
		// LinkedHashSet-velocidade intermediária e elementos na ordem em que são
		// adicionados

		java.util.Set<String> set = new LinkedHashSet<String>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		set.removeIf(x -> x.charAt(0) == 'Y');

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

	}

}
