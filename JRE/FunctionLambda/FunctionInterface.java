package FunctionLambda;

import java.util.function.Function;

public class FunctionInterface implements Function<ProdutoFunction, String> {

	@Override
	public String apply(ProdutoFunction p) {
		// TODO Auto-generated method stub
		return p.getNome().toUpperCase();
	}

}
