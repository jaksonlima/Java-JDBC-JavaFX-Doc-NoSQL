package ListArrayPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListAddPolimorfismo {

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
		
		/**PARA TER UMA LISTA VOCE PRECISA CHAMAR ELA COM (LIST - ARRAYLIST)  E ASSIM PASSAR O NOME DA 
		 * CLASS QUE VOCE PRECISA DE MAS DE 2 FUNCIONARIO ASSIM VOCE CHAMAR O LISTA.ADD(E PASSA O CONSTRUTOR)
		 * DA CLASS QUE DESEJA*/

	}

}
