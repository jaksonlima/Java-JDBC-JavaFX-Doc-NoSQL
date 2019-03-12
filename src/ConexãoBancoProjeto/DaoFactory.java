package Conex�oBancoProjeto;

import Conex�oBanco.BDConnection;

public class DaoFactory {

	public static SellerBanco createSellerDao() {
		return new SellerBancoSQL(BDConnection.getConnection());
	}

}
