package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {
	private static final String URL = "jdbc:mysql://localhost:3306/ezen";
	private static final String USER = "root";
	private static final String PASSWORD = "r1r2r3";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	public static void main(String[] args) {
		try {
			Connection con = getCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}