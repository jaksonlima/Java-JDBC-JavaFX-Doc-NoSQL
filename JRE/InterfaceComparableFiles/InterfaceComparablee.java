package InterfaceComparableFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InterfaceComparablee {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
//		String path = "C:\\codigo.java\\Projeto.2019\\jakson.txt";

		System.out.print("Caminho do Arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String funcionarioCSV = br.readLine();

			while (funcionarioCSV != null) {
				String[] fields = funcionarioCSV.split(",");
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcionarioCSV = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario funcionario : list) {
				System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Erros não esperado: " + e.getMessage());
		}

	}

}
