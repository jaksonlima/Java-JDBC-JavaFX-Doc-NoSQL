package InterfaceMétodosPadrão;

import java.util.Locale;
import java.util.Scanner;

public class TesteMétodosPadrão {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor em Empréstimo: ");
		double valor = sc.nextDouble();
		System.out.print("Meses a pagar: ");
		int meses = sc.nextInt();

		TaxaServico br = new BrazilTaxaJurosServico(2.0);

		double payment = br.payment(valor, meses);

		System.out.print("pagamento após: " + meses + " meses: ");
		System.out.print(String.format("%.2f", payment));

		sc.close();
	}

}
