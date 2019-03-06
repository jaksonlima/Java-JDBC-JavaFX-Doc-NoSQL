package ConsumerLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class TesteConsumer {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<ProdutoConsumer> list = new ArrayList<>();

		list.add(new ProdutoConsumer("TV", 500.0));
		list.add(new ProdutoConsumer("Panela", 400.0));
		list.add(new ProdutoConsumer("Quadro", 300.0));
		list.add(new ProdutoConsumer("Messa", 200.0));

//		list.forEach(new PrecoUpdateConsumerInterface());

//		list.forEach(ProdutoConsumer::precoUpdateStatic);

//		list.forEach(ProdutoConsumer::precoUpadate);

		double preco = 1.1;

		Consumer<ProdutoConsumer> cons = p -> {
			p.setPreco(p.getPreco() * 1.1);
			p.setPreco(p.getPreco() * preco);
		};

//		list.forEach(cons);

		Consumer<ProdutoConsumer> cons2 = p -> p.setPreco(p.getPreco() * 1.1);

//		list.forEach(cons2);

		list.forEach(p -> p.setPreco(p.getPreco() * 1.1));

		list.forEach(System.out::println);

	}

}
