package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {

	private static final String URL = "jdbc:mysql://localhost:3306/ezen";
	private static final String USER = "root";
	private static final String PWD = "r1r2r3";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	static {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int insertGameInfo(String giName, String giPrice, String giGenre, String giDesc) {
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)";
			sql += "VALUES('" + giName + "','" + giPrice + "','" + giGenre + "','" + giDesc + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int deleteGameInfo(int giNum) {
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=" + giNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

	public static int updateGameInfo(String giName, String giPrice, String giGenre, String giDesc) {
		try {
			Statement stmt = con.createStatement();
			String sql = "UPDATE GAME_INFO SET GI_PRICE='30000'WHERE GI_PRICE='0'";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static List<Map<String, String>> selectGameInfo() {
		List<Map<String, String>> games = new ArrayList<>();
		Statement stmt;
		try {
			stmt = con.createStatement();
			String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> game = new HashMap<>();
				game.put("GI_NUM", rs.getString("GI_NUM"));
				game.put("GI_NAME", rs.getString("GI_NAME"));
				game.put("GI_PRICE", rs.getString("GI_PRICE"));
				game.put("GI_GENRE", rs.getString("GI_GENRE"));
				game.put("GI_DESC", rs.getString("GI_DESC"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return games;
	}

	public static void main(String[] args) {
		int result = insertGameInfo("배틀그라운드", "0", "슈팅", "꿀잼");
		System.out.println("입력한 개수 : " + result);
		result = deleteGameInfo(1);
		System.out.println("삭제한 개수 : " + result);
		result = updateGameInfo("배틀그라운드", "0", "슈팅", "꿀잼");
		System.out.println("업데이트된 개수 : " + result);
		List<Map<String, String>> games = selectGameInfo();
		for (Map<String, String> game : games) {
			System.out.print("번호 : " + game.get("GI_NUM"));
			System.out.print(",이름 : " + game.get("GI_NAME"));
			System.out.print(",가격 : " + game.get("GI_PRICE"));
			System.out.print(",장르 : " + game.get("GI_GENRE"));
			System.out.println(",설명 : " + game.get("GI_DESC"));
		}
	}
}