package Vetor;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] mes = new String[12];
		System.out.println(mes[1]);
		
		String[] vetor = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vetor[posicao]);
		
		/***
		Assim fazemos um vetor e chamamos a possição 1 do vetor que tem 12 possiçoes 
		*/
		
		sc.close();
	}

}
