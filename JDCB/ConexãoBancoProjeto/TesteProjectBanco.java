package ConexãoBancoProjeto;

import java.util.Date;
import java.util.List;

public class TesteProjectBanco {
	public static void main(String[] args) {

		SellerBanco sellerBanco = DaoFactory.createSellerDao();

		System.out.println("\nTeste 1: FinalID");
		Seller seller = sellerBanco.FinalID(4);
		System.out.println(seller);

		System.out.println("\n=== Test 2: findByDepartment");
		Departament departament = new Departament(2, null);
		List<Seller> list = sellerBanco.findByDepartment(departament);
		for (Seller seler : list) {
			System.out.println(seler);
		}

		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerBanco.FinalAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

//		System.out.println("\n=== TEST 4: seller INSERT =====");
		Departament departament1 = new Departament(4, null);
		Seller sller = new Seller(null, "Thiago", "jk@gmail.com", new Date(), 1000.0, departament1);
//		sellerBanco.inserir(sller);
//		System.out.println("INSERT SUCESS! ID " + seller.getId());

		System.out.println("\n=== TEST 4: seller UPDATE =====");
		sller = sellerBanco.FinalID(1);
		sller.setNome("Jakson");
		sellerBanco.update(sller);
		System.out.println("UPDATE Sucess!");

	}

}
