package Fun��esRecebemFun��esPar�metro;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoServico {

	public double filtrovalor(List<ProndutoFun��es> list, Predicate<ProndutoFun��es> criat) {
		double sum = 0.0;

		for (ProndutoFun��es p : list) {
			if (criat.test(p));
			sum += p.getPreco();
		}
		return sum;
	}

}
