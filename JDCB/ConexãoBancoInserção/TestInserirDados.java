package ConexãoBancoInserção;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import ConexãoBanco.BDConnection;

public class TestInserirDados {
	public static void main(String[] args) {

		SimpleDateFormat data = new SimpleDateFormat("dd/HH/yyyy");
		Connection connection = null;
		PreparedStatement st = null;
		
		try {
			connection = BDConnection.getConnection();
			st = connection.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?, ?, ?, ?, ?)"
					);
			
			st.setString(1, "Bruna v");
			st.setString(2, "bruna.v@gmail.com");
			st.setDate(3, new java.sql.Date(data.parse("11/01/2001").getTime()));
			st.setDouble(4, 12000.0);
			st.setInt(5, 2);
			
			int update = st.executeUpdate();
			
			System.out.println("Sucess: " + update);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			BDConnection.closeStatement(st);
			BDConnection.closeConnection();
		}

	}

}
