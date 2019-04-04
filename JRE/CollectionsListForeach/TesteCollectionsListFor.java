package CollectionsListForeach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCollectionsListFor {
	public static void main(String[] args) {

		String aulas1 = "Collections Aulas 1 ";
		String aulas2 = "ArrayList Aulas 2 ";
		String aulas3 = "Foreach Aulas 3 ";

		List<String> aulaList = new ArrayList<>();

		aulaList.add(aulas1);
		aulaList.add(aulas2);
		aulaList.add(aulas3);

		System.out.println(aulaList);

		aulaList.remove(0);

		System.out.println(aulaList);

		for (String aula : aulaList) {
			System.out.println("AULAS: " + aula);
		}

		String primeiroAula = aulaList.get(0);
		System.out.println("A primeira aula é " + primeiroAula);

		for (int i = 0; i < aulaList.size(); i++) {
			System.out.println("aula: " + aulaList.get(i));
		}

		aulaList.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("->  " + aula);
		});

		aulaList.add("Aumentando nosso conhecimento");

		System.out.println(aulaList);

		Collections.sort(aulaList);

		System.out.println(aulaList);

	}

}
