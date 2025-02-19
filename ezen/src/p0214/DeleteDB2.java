package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB2 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3";
		
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM USER_INFO";
			sql += " WHERE UI_NAME='김길동'";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("딜리트 O");
			}else {
				System.out.println("딜리트 X");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
