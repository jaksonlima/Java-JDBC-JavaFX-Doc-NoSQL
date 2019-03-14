package Final;

public class Final {
	
	/*Classes e m�todos final
	 * �Palavra chave: final
	 * �Classe: evita que a classe seja herdada
	 * public final classSavingsAccount{
	 * �M�todo: evita que o m�todo sob seja sobreposto*/

//	public final classSavingsAccount() {
//		
//	}
	
	/*
	 * Exemplo -Classe final 
	 * Suponha que voc� queira evitar
	 *  que sejam criadas subclasses de 
	 *  SavingsAccount
	 *  public final classSavingsAccount{(...)*/
	
	
	/*
	 * Exemplo -m�todo final
	 * Suponha que voc� n�o queira que o m�todo Withdraw de
	 *  SavingsAccountse ja sobreposto
	 *  @Overridepublicfinal void withdraw(doubleamount) {balance -= amount;}
	 * */
	
	/*Pra qu�?
	 * �Seguran�a: dependendo das regras do neg�cio, �s vezes � desej�vel garantir que uma 
	 * classe n�o seja herdada,
	 * ou que um m�todo n�o seja sobreposto.
	 *�Geralmente conv�m acrescentar finalem m�todos sobrepostos,
	 *pois sobreposi��es m�ltiplas podem ser uma porta de entrada para inconsist�ncias
	 *�Performance: atributos de tipo de uma classe final s�o analisados
	 *de forma mais r�pida em tempo de execu��o.
	 *�Exemplo cl�ssico: String*/
	
	
}

