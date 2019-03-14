package PilhaExceptionFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PilhaExceptionFinally {

	public static void main(String[] args) {

		File file = new File("C:\\codigo.java\\Projeto.2019\\jakson.txt");
		Scanner sc = null;

		try {

			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Erro caminho do arquivo não encontrado: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println();
			System.out.println("Bloco finalizado");

		}
	}

}
