package ConexãoBancoAtualizarDdos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexãoBanco.BDConnection;

public class TesteAtualizarDados {
	public static void main(String[] args) {

		Connection conection = null;
		PreparedStatement st = null;

		try {

			conection = BDConnection.getConnection();
			st = conection.prepareStatement(
					"UPDATE seller " 
			       + "SET BaseSalary = BaseSalary +? " 
				   + "WHERE " 
				   + "DepartmentId = ?");
			
			st.setDouble(1, 500.0);
			st.setInt(2, 1);

			int update = st.executeUpdate();

			System.out.println("Sucess: " + update);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BDConnection.closeStatement(st);
			BDConnection.closeConnection();
		}
	}

}
