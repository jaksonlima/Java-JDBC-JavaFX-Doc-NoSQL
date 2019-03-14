package ConexãoBancoInserção;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import ConexãoBanco.BDConnection;

public class TesteKeyUltimoInsert  {
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
					+ "(?, ?, ?, ?, ?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Thiago T");
			st.setString(2, "Thiago.t@hotmail.com");
			st.setDate(3, new java.sql.Date(data.parse("19/08/1986").getTime()));
			st.setDouble(4, 5500.0);
			st.setInt(5, 1);
			
			int update = st.executeUpdate();
			
			if(update > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int idupdate = rs.getInt(1);
					System.out.println("Sucess Novo ID: " + idupdate);
				}
			}
			else {
				System.out.println("Não ouve alteração");
			}
			
			
		} catch (SQLException ee) {
			ee.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			BDConnection.closeStatement(st);
			BDConnection.closeConnection();
		}

	}

}