package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {
	
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
		String sql = "DELETE FROM FOOD_INFO";
		sql += " WHERE FI_NAME='치즈김밥'";
		int result = stmt.executeUpdate(sql);
		if(result>=1) {
			System.out.println("딜리트 성공!");
		}else {
			System.out.println("딜리트가 되지 않았습니다.");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
