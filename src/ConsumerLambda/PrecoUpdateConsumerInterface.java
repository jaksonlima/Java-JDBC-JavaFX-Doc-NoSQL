package ConsumerLambda;

import java.util.function.Consumer;

public class PrecoUpdateConsumerInterface implements Consumer<ProdutoConsumer> {

	@Override
	public void accept(ProdutoConsumer p) {
		// TODO Auto-generated method stub
		p.setPreco(p.getPreco() * 1.1);

	}
 
}
