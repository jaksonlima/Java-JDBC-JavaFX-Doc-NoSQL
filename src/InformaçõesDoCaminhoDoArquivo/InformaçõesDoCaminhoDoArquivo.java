package InformaçõesDoCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class InformaçõesDoCaminhoDoArquivo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o caminho da pasta: ");
		String caminho = sc.nextLine();

		File pasta = new File(caminho);

		System.out.println("Pastas: " + pasta.getName());
		System.out.println("Pastas Parametro: " + pasta.getParent());
		System.out.println("Pastas Parametro e Arquivo: " + pasta.getPath());



		sc.close();
	}

}
