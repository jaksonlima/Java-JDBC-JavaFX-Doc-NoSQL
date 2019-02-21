package InterfacesTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import InterfacesEntidades.AluguerCarros;
import InterfacesEntidades.Veiculo;
import InterfacesServicos.ServicosLocacao;
import InterfacesServicos.TaxaBrasilServico;

public class TesteInterfaces {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy HH:ss");

		System.out.println("Data: ");
		System.out.print("Modelo de Carro:");
		String modelo = sc.nextLine();
		System.out.print("pegar (dd/HH/yyy hh:ss) ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Retorna (dd:HH:yyyy hh:ss) ");
		Date fim = sdf.parse(sc.nextLine());

		AluguerCarros ac = new AluguerCarros(inicio, fim, new Veiculo(modelo));

		System.out.println("Preço Por Hora: ");
		double ph = sc.nextDouble();
		System.out.println("Preço Por Dia: ");
		double pd = sc.nextDouble();

		ServicosLocacao rentalserver = new ServicosLocacao(ph, pd, new TaxaBrasilServico());

		rentalserver.faturaProcesso(ac);

		System.out.println("Fatura: ");
		System.out.println("Pagamento Básico: " + String.format("%.2f%", ac.getFatura().getFormAPagamento()));
		System.out.println("Taxa : " + String.format("%.2f%", ac.getFatura().getTaxa()));
		System.out.println("Total pagamento: " + String.format("%.2f%", ac.getFatura().getTotalpamento()));

		

		sc.close();
	}

}
