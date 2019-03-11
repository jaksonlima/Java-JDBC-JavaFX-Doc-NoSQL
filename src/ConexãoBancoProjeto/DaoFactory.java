package ConexãoBancoProjeto;

import ConexãoBanco.BDConnection;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoJdbc(BDConnection.getConnection());
	}

}
