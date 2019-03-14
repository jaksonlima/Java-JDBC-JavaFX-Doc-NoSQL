package HashCodeEquals;

public class TesteEqualsHashCode {
	public static void main(String[] args) {

		ClienteEqualsHashCode c1 = new ClienteEqualsHashCode("jakson", "jakson@gmail.com");
		ClienteEqualsHashCode c2 = new ClienteEqualsHashCode("jakson", "jakson@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println();
		System.out.println(c2.hashCode());
		System.out.println();

		System.out.println(c1.equals(c2));
		System.out.println();
		System.out.println(c1 == c2);

		String s1 = "jakson"; // Quando voce somente passa da forma niteral sem criar o objeto (NEW) ele
								// retorno TRUE
		String s2 = "jakson";

		System.out.println();
		System.out.println(s1 == s2);

		String s3 = new String ("jakson"); // Se for colocado como um objeto (NEW STRING) ele vai retornar False
		
		String s4 = new String ("jakson");

		System.out.println();
		System.out.println(s3 == s4);

	}

}
