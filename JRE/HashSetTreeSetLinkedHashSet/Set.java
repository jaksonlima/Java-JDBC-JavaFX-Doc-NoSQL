package HashSetTreeSetLinkedHashSet;

import java.util.LinkedHashSet;

public class Set {
	public static void main(String[] args) {

		// HashSet-mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
		// TreeSet-mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado
		// pelo compareTodo objeto (ou Comparator)
		// LinkedHashSet-velocidade intermedi�ria e elementos na ordem em que s�o
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
