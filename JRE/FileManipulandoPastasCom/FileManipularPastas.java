package FileManipulandoPastasCom;

import java.io.File;
import java.util.Scanner;

public class FileManipularPastas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Caminho da pasta? ");
		String camiho = sc.nextLine();

		File arquivos = new File(camiho);

		File[] pastas = arquivos.listFiles(File::isDirectory);
		System.out.println("Patas: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}

		File[] arquivos2 = arquivos.listFiles(File::isFile);
		System.out.println("TXT");
		for (File arqtxt : arquivos2) {
			System.out.println(arqtxt);
		}

		boolean sucesso = new File(camiho + "\\jakson 15-41").mkdir();
		System.out.println("Diretoria criado com sucesso: " + sucesso);

		sc.close();

	}

}
