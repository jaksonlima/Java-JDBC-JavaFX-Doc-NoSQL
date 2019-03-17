package ConexãoBanco;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import ConexãoBancoExceptiion.BdException;

public class BDConnection {

	private static Connection connect = null;

	public static Connection getConnection() {
		if (connect == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				connect = DriverManager.getConnection(url, props);

			} catch (SQLException e) {
				throw new BdException(e.getMessage());
			}
		}
		return connect;
	}

	public static void closeConnection() {
		if (connect != null) {
			try {
				connect.close();
			} catch (SQLException e) {
				throw new BdException(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("localhost.Banco")) {
			Properties pros = new Properties();
			pros.load(fs);
			return pros;
		} catch (IOException e) {
			throw new BdException(e.getMessage());
		}
	}

	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new BdException(e.getMessage());
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new BdException(e.getMessage());
			}
		}
	}
}
