package Polimorfismo.List.Herança;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestePolimorfismoListHerança {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.print("Numero de funncionario ? -> ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionario #" + i + " dados obrigatorios! ");
			System.out.print("Funcionario Terceirizado (s/n)? ");
			Character ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorhoras = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Valor adicional: ");
				double adicionalvalor = sc.nextDouble();
				list.add(new TerceirizadoFuncionario(nome, horas, valorhoras, adicionalvalor));
			}
			if (ch == 'n') {
				list.add(new Funcionario(nome, horas, valorhoras));
			}

		}

		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionario emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.getValorhoras()));
		}

		sc.close();

	}

}
