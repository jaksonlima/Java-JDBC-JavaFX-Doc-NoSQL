package GenericsSetMap;

import java.util.Scanner;

public class TesteGenericsSetMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintServico<String> ps = new PrintServico<>();

		System.out.print("Digite os valores: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			String valor = sc.next();
			ps.addValue(valor);
		}

		ps.print();
		String x = ps.first();
		System.out.println();
		System.out.println("primeiro: " + x);

		sc.close();
	}

}
