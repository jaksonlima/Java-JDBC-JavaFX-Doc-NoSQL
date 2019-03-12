package ConexãoBancoProjeto;

import ConexãoBanco.BDConnection;

public class DaoFactory {

	public static SellerBanco createSellerDao() {
		return new SellerBancoSQL(BDConnection.getConnection());
	}

}
