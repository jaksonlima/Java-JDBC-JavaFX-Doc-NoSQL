package ConexãoBancoProjeto;

import java.util.Date;

public class TesteProjectBanco {
	public static void main(String[] args) {

		SellerDAO selerDao = DaoFactory.createSellerDao();

		Seller seller = selerDao.FinalID(1);
		System.out.println(seller);

	}

}			
