package MetodosAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteMetodosAbstratc {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> lista = new ArrayList<>();

		System.out.print("Entre com um numero de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i);
			System.out.print("Oque voce deja cria Retangulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Qual Cor deseja (PRETO, AZUL, VERMELHO)? ");
			Color cor = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Digite a largura: ");
				double largura = sc.nextDouble();
				System.out.print("Digite a altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
				System.out.println("********* Valor atribuido como Retangulo *********");
				System.out.println();
			}
			if (ch == 'c') {
				System.out.print("Digite o raio: ");
				double raios = sc.nextDouble();
				lista.add(new Circulo(cor, raios));
				System.out.println("********* Valor atribuido como Circulo *********");
			}

		}
		System.out.println();
		System.out.println("Formas de areas: ");
		System.out.println();
		for (Forma forma : lista) {
			System.out.println(String.format("%.2f%n", forma.area()));
		}
		sc.close();
	}

}

/**
 *
 * Oque voce deja cria Retangulo ou Circulo (r/c)? r Qual Cor deseja (PRETO,
 * AZUL, VERMELHO)? azul 
 * Digite a largura:
 *  4.0 Digite a altura: 5.0 
 * 
 * Valor atribuido como Retangulo
 *
 * Forma #2 Oque voce deja cria Retangulo ou Circulo (r/c)? c Qual Cor deseja
 * (PRETO, AZUL, VERMELHO)? azul 
 * Digite o raio: 3.0 
 * 
 * Valor atribuido como Circulo
 * 
 *
 * Formas de areas:
 *
 * 20.00
 *
 * 28.27
 * 
 */
