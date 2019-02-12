package ListPolimorfismoHeranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteListPolimorfismoHeranca {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> list = new ArrayList<>();

		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i + " data:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Produto(name, price));
			} else if (type == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new ProdutoUsado(name, price, date));
			} else {
				System.out.print("Taxa alfandegária: ");
				double customsFee = sc.nextDouble();
				list.add(new ProdutoImportado(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");
		for (Produto prod : list) {
			System.out.println(prod.getPreco());
		}

		sc.close();
	}

}
