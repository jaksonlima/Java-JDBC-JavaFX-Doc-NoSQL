package ConexãoBancoProjeto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ConexãoBanco.BDConnection;
import ConexãoBancoExceptiion.BdException;

public class SellerBancoSQL implements SellerBanco {

	private Connection conection;

	public SellerBancoSQL(Connection conection) {
		this.conection = conection;
	}

	@Override
	public void inserir(Seller obj) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conection.prepareStatement("INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) " + "VALUES " + "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getNome());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getDataNasci().getTime()));
			st.setDouble(4, obj.getBaseSalario());
			st.setInt(5, obj.getDepartament().getId());

			int update = st.executeUpdate();

			if (update > 0) {
				rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
			} else {
				throw new BdException("Erro inesperado nem uma linha foi afetada");
			}

		} catch (SQLException e) {
			throw new BdException("Erro");
		} finally {
			BDConnection.closeStatement(st);
			BDConnection.closeResultSet(rs);
		}

	}

	@Override
	public void update(Seller obj) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conection.prepareStatement(

					"UPDATE seller " + "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
							+ "WHERE Id = ?");

			st.setString(1, obj.getNome());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getDataNasci().getTime()));
			st.setDouble(4, obj.getBaseSalario());
			st.setInt(5, obj.getDepartament().getId());
			st.setInt(6, obj.getId());

			st.executeUpdate();

		} catch (SQLException e) {
			throw new BdException("Erro atualização não existente");
		} finally {
			BDConnection.closeStatement(st);
			BDConnection.closeResultSet(rs);
		}

	}

	@Override
	public void deleteID(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conection.prepareStatement("DELETE FROM seller " + "WHERE Id = ?");

			st.setInt(1, id);

			int update = st.executeUpdate();

			if (update == 0) {
				System.out.println("\n Erro Cliente não existe!");
			} else {
				System.out.println("\n Delete Sucess! ");

			}

		} catch (SQLException e) {
			throw new BdException(e.getMessage());
		} finally {
			BDConnection.closeResultSet(rs);
			BDConnection.closeStatement(st);
		}

	}

	@Override
	public Seller FinalID(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conection.prepareStatement(
					"SELECT seller.*, department.Name as DepNome " + "FROM seller INNER JOIN department "
							+ "ON seller.DepartmentId = department.Id " + "WHERE seller.Id = ?");

			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Departament depart = instantiateDapartment(rs);
				Seller seler = instantiateSeller(rs, depart);
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

	private Seller instantiateSeller(ResultSet rs, Departament depart) throws SQLException {
		Seller seler = new Seller();
		seler.setId(rs.getInt("Id"));
		seler.setNome(rs.getString("Name"));
		seler.setEmail(rs.getString("Email"));
		seler.setDataNasci(rs.getDate("BirthDate"));
		seler.setBaseSalario(rs.getDouble("BaseSalary"));
		seler.setDepartament(depart);
		return seler;
	}

	private Departament instantiateDapartment(ResultSet rs) throws SQLException {
		Departament depart = new Departament();
		depart.setId(rs.getInt("DepartmentId"));
		depart.setNome(rs.getString("DepNome"));
		return depart;
	}

	@Override
	public List<Seller> FinalAll() {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conection.prepareStatement(
					"SELECT seller.*, department.name as DepNome " + "FROM seller INNER JOIN department "
							+ "ON seller.DepartmentId = department.Id " + "ORDER BY Name");

			rs = st.executeQuery();

			List<Seller> list = new ArrayList<Seller>();

			Map<Integer, Departament> map = new HashMap<>();

			while (rs.next()) {
				Departament dep = map.get(rs.getInt("DepartmentId"));

				if (dep == null) {
					dep = instantiateDapartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}
				Seller seller = instantiateSeller(rs, dep);
				list.add(seller);
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BDConnection.closeStatement(st);
			BDConnection.closeResultSet(rs);
		}
		return null;
	}

	@Override
	public List<Seller> findByDepartment(Departament department) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conection.prepareStatement(
					"SELECT seller.*, department.name as DepNome FROM seller " + "INNER JOIN department "
							+ "ON seller.DepartmentId = department.Id " + "WHERE DepartmentId = ? " + "ORDER BY Name");

			st.setInt(1, department.getId());

			rs = st.executeQuery();

			List<Seller> list = new ArrayList<Seller>();

			Map<Integer, Departament> map = new HashMap<>();

			while (rs.next()) {
				Departament dep = map.get(rs.getInt("DepartmentId"));

				if (dep == null) {
					dep = instantiateDapartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}
				Seller seller = instantiateSeller(rs, dep);
				list.add(seller);
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BDConnection.closeStatement(st);
			BDConnection.closeResultSet(rs);
		}
		return null;
	}

}