package InformaçõesDoCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class InformaçõesDoCaminhoDoArquivo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o caminho da pasta? ");
		String caminho = sc.nextLine();
		
		File arq = new File(caminho);
		
		System.out.println("Pastas: " + caminho);

		sc.close();
	}

}
