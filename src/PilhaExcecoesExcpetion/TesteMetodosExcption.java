package PilhaExcecoesExcpetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteMetodosExcption {

	public static void main(String[] args) {

		metodo1();

		System.out.println("Programa sera fechado: ");

	}

	public static void metodo1() {
		System.out.println("***Metodo inicio #1***");
		metodo2();
		System.out.println("***Metodo fim #1***");

	}

	public static void metodo2() {

		System.out.println("***Metodo inicio #2***");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Por gentileza informar nome de clientes: ? ");
			String[] vetor = sc.nextLine().split(" ");
			System.out.print("Qual possição dejesa: ? ");
			int posicao = sc.nextInt();
			System.out.println("Possição de registro ------> :" + vetor[posicao]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Valores passados são incorretos: ");
			e.printStackTrace();
			sc.nextLine();
		} catch (InputMismatchException a) {
			System.out.println("Valores passados são incorretos: ");
		}
		System.out.println("***Metodo fim #2***");

		sc.close();

	}

}
