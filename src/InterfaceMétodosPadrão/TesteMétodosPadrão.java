package InterfaceM�todosPadr�o;

import java.util.Locale;
import java.util.Scanner;

public class TesteM�todosPadr�o {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor em Empr�stimo: ");
		double valor = sc.nextDouble();
		System.out.print("Meses a pagar: ");
		int meses = sc.nextInt();

		TaxaServico br = new BrazilTaxaJurosServico(2.0);

		double payment = br.payment(valor, meses);

		System.out.print("pagamento ap�s: " + meses + " meses: ");
		System.out.print(String.format("%.2f", payment));

		sc.close();
	}

}
