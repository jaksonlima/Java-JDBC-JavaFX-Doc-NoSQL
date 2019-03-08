package StreamFileArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TesteStream {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Caminho de arquivo: ");
		String caminho = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			List<ProdutoStream> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(" , ");
				list.add(new ProdutoStream(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			double media = list.stream().map(p -> p.getValor()).reduce(0.0, (x, y) -> x + y) / list.size();

			System.out.println("Media Valor: " + String.format("%.2f", media));

			Comparator<String> comparador = (s1 , s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
			
			List<String> nomes = list.stream()
					.filter(p -> p.getValor() < media)
					.map(p -> p.getNome())
					.sorted(comparador.reversed())
					.collect(Collectors.toList());
			
			nomes.forEach(System.out::println);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
