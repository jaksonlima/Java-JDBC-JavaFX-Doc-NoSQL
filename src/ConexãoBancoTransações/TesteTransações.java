package ConexãoBancoTransações;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ConexãoBanco.BDConnection;
import ConexãoBancoExceptiion.BdException;

public class TesteTransações {
	public static void main(String[] args) {
		
		Connection conection = null;
		Statement st = null;
		
		try {
			conection = BDConnection.getConnection();
			
			conection.setAutoCommit(false);
			
			st = conection.createStatement();
			
			int atualiza = st.executeUpdate("UPDATE seller SET BaseSalary = 10000.0 WHERE DepartmentId = 4");
			
			int atualiza2 = st.executeUpdate("UPDATE seller SET BaseSalary = 10000.0 WHERE DepartmentId = 3");
			
			conection.commit();
			
			System.out.println("Sucess Commit Atualiz #1: " + atualiza);
			System.out.println("Sucess Commit Atualiz #2: " + atualiza2);

			
		} catch (SQLException e) {
			try {
				
				conection.rollback();
				throw new BdException("Transação revertida! Causado por: " + e.getMessage());
				
			} catch (SQLException e2) {
				
				throw new BdException("Erro ao tentar reverter! Causado por:" + e2.getMessage());
				
			}
		}
		finally {
			BDConnection.closeStatement(st);
			BDConnection.closeConnection();
		}
	}

}
