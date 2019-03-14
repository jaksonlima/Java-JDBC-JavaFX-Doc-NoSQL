package FunçõesRecebemFunçõesParâmetro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TesteRecebemFunções {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<ProndutoFunções> list = new ArrayList<ProndutoFunções>();

		list.add(new ProndutoFunções("TV", 500.0));
		list.add(new ProndutoFunções("Mouse", 1.0));
		list.add(new ProndutoFunções("Tablet", 1.0));
		list.add(new ProndutoFunções("HD Case", 1.0));

		ProdutoServico ps = new ProdutoServico();

		double sum = ps.filtrovalor(list, p -> p.getNome().charAt(0) == 'T');

		System.out.println("valor " + String.format("%.2f", sum));

//		for (ProndutoFunções prondutoFunções : list) {
//			System.out.println(prondutoFunções);
//		}

	}

}
