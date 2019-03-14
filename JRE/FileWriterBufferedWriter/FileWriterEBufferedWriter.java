package FileWriterBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {
	public static void main(String[] args) {

		String[] linhas = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "C:\\codigo.java\\Projeto.2019\\jakson.txt";

		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(path));

			for (String line : linhas) {
				br.write(line);
				br.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}