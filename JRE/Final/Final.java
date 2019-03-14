package Final;

public class Final {
	
	/*Classes e métodos final
	 * •Palavra chave: final
	 * •Classe: evita que a classe seja herdada
	 * public final classSavingsAccount{
	 * •Método: evita que o método sob seja sobreposto*/

//	public final classSavingsAccount() {
//		
//	}
	
	/*
	 * Exemplo -Classe final 
	 * Suponha que você queira evitar
	 *  que sejam criadas subclasses de 
	 *  SavingsAccount
	 *  public final classSavingsAccount{(...)*/
	
	
	/*
	 * Exemplo -método final
	 * Suponha que você não queira que o método Withdraw de
	 *  SavingsAccountse ja sobreposto
	 *  @Overridepublicfinal void withdraw(doubleamount) {balance -= amount;}
	 * */
	
	/*Pra quê?
	 * •Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma 
	 * classe não seja herdada,
	 * ou que um método não seja sobreposto.
	 *•Geralmente convém acrescentar finalem métodos sobrepostos,
	 *pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências
	 *•Performance: atributos de tipo de uma classe final são analisados
	 *de forma mais rápida em tempo de execução.
	 *•Exemplo clássico: String*/
	
	
}

