package ConexãoBancoInserção;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import ConexãoBanco.DBConnection;

public class TestInserirDados {
	public static void main(String[] args) {

		SimpleDateFormat data = new SimpleDateFormat("dd/HH/yyyy");
		Connection connection = null;
		PreparedStatement st = null;
		
		try {
			connection = DBConnection.getConnection();
			st = connection.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?, ?, ?, ?, ?)"
					);
			
			st.setString(1, "Carlos P");
			st.setString(2, "calos.p@gmail.com");
			st.setDate(3, new java.sql.Date(data.parse("21/09/2018").getTime()));
			st.setDouble(4, 1200.0);
			st.setInt(5, 2);
			
			int update = st.executeUpdate();
			
			System.out.println("Sucess: " + update);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeStatement(st);
			DBConnection.closeConnection();
		}

	}

}
