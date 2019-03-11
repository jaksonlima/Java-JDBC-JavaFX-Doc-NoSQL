package Conex�oBancoProjeto;

import Conex�oBanco.BDConnection;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoJdbc(BDConnection.getConnection());
	}

}
