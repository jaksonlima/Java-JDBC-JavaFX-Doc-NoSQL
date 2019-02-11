package Polimorfismo.List.Herança;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListAdd {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Funcionario> lista = new ArrayList<Funcionario>();

		lista.add(new TerceirizadoFuncionario());
		lista.add(new Funcionario());
		
		Funcionario t = new TerceirizadoFuncionario();
		Funcionario f = new Funcionario();
		
		lista.add(t);
		lista.add(f);

	}

}
