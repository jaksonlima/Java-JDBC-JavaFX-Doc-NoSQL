package ConexãoBancoDeleteDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexãoBanco.BDConnection;
import ConexãoBancoExceptiion.BdException;

public class TesteAtualizaDados {
	public static void main(String[] args) {
		Connection conection = null;
		PreparedStatement st = null;
		
		try {
			
			conection = BDConnection.getConnection();
			st = conection.prepareStatement(
					"DELETE FROM department "
					+"WHERE "
					+"Id = ? ");
			
			st.setInt(1, 6);
			
			int update = st.executeUpdate();
			System.out.println("Sucess: " + update);
			
		} catch (SQLException e) {
			throw new BdException(e.getMessage());
		}
		finally {
			BDConnection.closeStatement(st);
			BDConnection.closeConnection();
		}
		
	}

}
