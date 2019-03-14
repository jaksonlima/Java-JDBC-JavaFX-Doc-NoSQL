package SetArquivoFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetTeste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Caminho da pasta: ");
		String pasta = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {

			Set<LogEntre> set = new HashSet<>();

			String linha = br.readLine();
			while (linha != null) {

				String[] pastas = linha.split(" ");
				String usernamo = pastas[0];
				Date momento = Date.from(Instant.parse(pastas[1]));

				set.add(new LogEntre(usernamo, momento));

				linha = br.readLine();
			}
			System.out.println("Total de usuarios: " + set.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
