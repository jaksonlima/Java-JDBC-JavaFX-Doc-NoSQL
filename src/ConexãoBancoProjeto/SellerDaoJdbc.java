package ConexãoBancoProjeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ConexãoBanco.BDConnection;
import ConexãoBancoExceptiion.BdException;

public class SellerDaoJdbc implements SellerDAO {

	private Connection conection;

	public SellerDaoJdbc(Connection conection) {
		this.conection = conection;
	}

	@Override
	public void inserir(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteID(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller FinalID(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conection.prepareStatement(

					"SELECT seller.*, department.name as DepNome" 
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id " 
					+ "WHERE seller.Id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Departament depart = new Departament();
				depart.setId(rs.getInt("DepartmentId"));
				depart.setNome(rs.getString("DepNome"));
				Seller seler = new Seller();
				seler.setId(rs.getInt("Id"));
				seler.setNome(rs.getString("Name"));
				seler.setEmail(rs.getString("Email"));
				seler.setBaseSalario(rs.getDouble("BaseSalary"));
				seler.setDataNasci(rs.getDate("BirthDate"));
				seler.setDepartament(depart);
				return seler;
			}
		} catch (SQLException e) {
			throw new BdException(e.getMessage());
		} finally {
			BDConnection.closeStatement(st);
			BDConnection.closeResultSet(rs);
		}
		return null;

	}

	@Override
	public List<Seller> FinalAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
