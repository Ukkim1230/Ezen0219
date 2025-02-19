package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLCon2 {
	
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
			String sql = "insert into USER_INFO(UI_NAME, UI_ID, UI_PWD)"
					+"VALUES('홍길동','Hong','1234')";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("입력 성공!");
			}else {
				System.out.println("오류는 안났지만 입력이 안됐어요");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
