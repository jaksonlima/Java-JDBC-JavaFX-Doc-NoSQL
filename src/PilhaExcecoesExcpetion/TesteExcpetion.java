package PilhaExcecoesExcpetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcpetion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Por gentileza informar nome de clientes: ? ");
			String[] vetor = sc.nextLine().split(" ");
			System.out.print("Qual possi��o dejesa: ? ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Valores passados s�o incorretos: ");
		} catch (InputMismatchException a) {
			System.out.println("Valores passados s�o incorretos: ");
		}
		System.out.println("Programa precisa ser fechado: ");

		sc.close();

	}
}
