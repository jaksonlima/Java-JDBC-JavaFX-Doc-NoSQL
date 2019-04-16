package Vetor;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < args.length; i++) {
			System.out.println(i);
		}

		String[] mes = new String[10];
		System.out.println(mes[1]);

		System.out.print("Nome completo: ");
		String[] vetor = sc.nextLine().split(" ");
		System.out.print("Qual possição: ");
		int posicao = sc.nextInt();
		System.out.println("Retorno da possição: " + vetor[posicao]);

		/***
		 * Assim fazemos um vetor e chamamos a possição 1 do vetor que tem 12 possiçoes
		 */

		sc.close();
	}

}
