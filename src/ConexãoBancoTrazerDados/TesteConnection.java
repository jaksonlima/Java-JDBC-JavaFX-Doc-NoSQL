package ConexãoBancoTrazerDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ConexãoBanco.DBConnection;

public class TesteConnection {
	public static void main(String[] args) {

		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			connection = DBConnection.getConnection();

			st = connection.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
			}

			System.out.println();

			rs = st.executeQuery("select * from seller");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(st);
			DBConnection.closeResultSet(rs);
			DBConnection.closeConnection();
		}
	}

}
