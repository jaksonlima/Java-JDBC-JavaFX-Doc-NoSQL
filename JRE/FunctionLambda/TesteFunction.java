package FunctionLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TesteFunction {
	public static void main(String[] args) {

		List<ProdutoFunction> list = new ArrayList<ProdutoFunction>();

		list.add(new ProdutoFunction("TV", 1000.0));
		list.add(new ProdutoFunction("Video", 500.0));
		list.add(new ProdutoFunction("Carta", 300.0));
		list.add(new ProdutoFunction("Game", 400.0));

		List<String> nome = list.stream().map(new FunctionInterface()).collect(Collectors.toList());

//		nome.forEach(System.out::println);

		List<String> nome2 = list.stream().map(ProdutoFunction::staticUpperCaseNamo).collect(Collectors.toList());

//		nome2.forEach(System.out::println);

		List<String> nome3 = list.stream().map(ProdutoFunction::UpperCaseNamo).collect(Collectors.toList());

//		nome3.forEach(System.out::println);

		Function<ProdutoFunction, String> function = p -> p.getNome().toUpperCase();

		List<String> nome4 = list.stream().map(function).collect(Collectors.toList());

//		nome4.forEach(System.out::println);

		List<String> nome5 = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());

		nome5.forEach(System.out::println);

	}

}
