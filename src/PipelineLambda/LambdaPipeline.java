package PipelineLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPipeline {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5);

		System.out.println(Arrays.toString(list.toArray()));

		int soma = list.stream().reduce(0, (x, y) -> x + y);

		System.out.println("Valor: " + soma);

		List<Integer> list3 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(list3.toArray()));

	}

}
