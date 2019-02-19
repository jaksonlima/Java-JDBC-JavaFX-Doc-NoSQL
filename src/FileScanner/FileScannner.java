package FileScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScannner {
	public static void main(String[] args) {

		File file = new File("C:\\codigo.java\\Projeto.2019\\jakson.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
