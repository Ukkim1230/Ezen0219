package p0214.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB2 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String sql = "UPDATE USER_INFO";
			sql += " SET UI_NAME ='홍기리동'";
			sql += " WHERE UI_NAME='홍길동'";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("업데이트 O ");
			}else {
				System.out.println("X");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
