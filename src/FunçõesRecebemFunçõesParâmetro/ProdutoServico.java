package FunçõesRecebemFunçõesParâmetro;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoServico {

	public double filtrovalor(List<ProndutoFunções> list, Predicate<ProndutoFunções> criat) {
		double sum = 0.0;

		for (ProndutoFunções p : list) {
			if (criat.test(p));
			sum += p.getPreco();
		}
		return sum;
	}

}
