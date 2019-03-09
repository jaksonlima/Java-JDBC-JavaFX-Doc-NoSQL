package ConexãoBanco;

import java.sql.Connection;

public class TesteConnection {
	public static void main(String[] args) {

		Connection connection = DBConnection.getConnection();

		System.out.println(connection);

	}

}
