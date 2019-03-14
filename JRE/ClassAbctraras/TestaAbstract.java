package ClassAbctraras;

import java.util.ArrayList;
import java.util.List;

public class TestaAbstract {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();

		lista.add(new ContaDeNeg�cios("j", null, 100.0, null));
		lista.add(new ContaDeNeg�cios("a", null, 100.0, null));
		lista.add(new ContaDeNeg�cios("k", null, 300.0, null));
		lista.add(new ContaPoupanca("s", null, 100.0, null));
		lista.add(new ContaPoupanca("o", null, 100.0, null));
		lista.add(new ContaPoupanca("n", null, 300.0, null));

		double sum = 0.0;

		for (Conta acc : lista) {
			sum += acc.getConta();
		}
		System.out.printf("Valor total: %.2f%n", sum);

		for (Conta acc1 : lista) {
			acc1.deposita(10.0);
		}
		for (Conta acc : lista) {
			System.out.printf("valor com acr�scimo: %d: %.2f%n", acc.getNome(), acc.getConta());
		}

		/***
		 * OBSTRACT � QUANDO VOCE COLOCA NA FRENTE DO METODO DA CLASS A PALA(ABSTRATC)
		 * ASSIM VOCE N�O PODE INSTACIAR ELA COM O NEW CONTA(); PORQUE AGORA TEM O
		 * (ABSTRATC) EXEMPLO --> public abstract class Conta --> N�O PODEMOS MAS FAZER
		 * ***NEW CONTA();*** {
		 */
//		Conta cc1 = new Conta("jakson", 1515, 1000.1);
//		Conta cc2 = new ContaDeNeg�cios("Wilson", 1516, 1001.1, 200.0);
//		Conta cc3 = new ContaPoupanca("Bonfim", 1517, 1002.1, 150.0);

	}

}
