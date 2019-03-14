package Fun��esRecebemFun��esPar�metro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TesteRecebemFun��es {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<ProndutoFun��es> list = new ArrayList<ProndutoFun��es>();

		list.add(new ProndutoFun��es("TV", 500.0));
		list.add(new ProndutoFun��es("Mouse", 1.0));
		list.add(new ProndutoFun��es("Tablet", 1.0));
		list.add(new ProndutoFun��es("HD Case", 1.0));

		ProdutoServico ps = new ProdutoServico();

		double sum = ps.filtrovalor(list, p -> p.getNome().charAt(0) == 'T');

		System.out.println("valor " + String.format("%.2f", sum));

//		for (ProndutoFun��es prondutoFun��es : list) {
//			System.out.println(prondutoFun��es);
//		}

	}

}
