package ConexãoBancoProjeto;

import java.util.Date;
import java.util.Scanner;

public class TesteProjectBanco {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SellerBanco selerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1: Vendedor FindById ===");
		System.out.println();

		System.out.print("Voce deseja obter dados de cliente s/n ? ");
		String sn = sc.nextLine();

		if (sn.equals("n")) {
			System.out.println();
			System.out.println("Obrigado volte sempre! ");
		} else {
			System.out.println();
			System.out.print("Computers: 1 Electronics 2 Fashion 3 Books 4 = ");
			int id = sc.nextInt();
			Seller seller = selerDao.FinalID(id);
			System.out.println(seller);
		}

		sc.close();
	}

}
