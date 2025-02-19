package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoCRUD {

	public int insertUserInfo(String uiName, String uiId, String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD) VALUES('%s','%s','%s')";
		sql = String.format(sql, uiName, uiId, uiPwd);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int insertUserInfo2(String uiName, String uiId, String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD) VALUES(?,?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, uiName);
			ps.setString(2, uiId);
			ps.setString(3, uiPwd);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateUserInfo(int uiNum, String uiName, String uiId, String uiPwd) {
		String sql = "UPDATE USER_INFO SET UI_NAME='홍홍길동'WHERE UI_NUM=%d";
		sql = String.format(sql, uiName, uiId, uiPwd, uiNum);
		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteUserInfo(int uiNum) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NUM=" + uiNum;
		sql = String.format(sql, uiNum);
		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Map<String, String>> selectUserInfos(String type, String str) {
		List<Map<String, String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
		// "1" => UI_NAME, "2" => UI_ID, "3" => UI_PWD
		if ("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE '%" + str + "%'";
		} else if ("2".equals(type)) {
			sql += " WHERE UI_ID LIKE '%" + str + "%'";
		} else if ("3".equals(type)) {
			sql += " WHERE UI_PWD LIKE '%" + str + "%'";
		}
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfos.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}

	public List<Map<String, String>> selectUserInfos2(String type, String str) {
		List<Map<String, String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
		if ("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE CONCAT('%',?,'%')";
		} else if ("2".equals(type)) {
			sql += " WHERE UI_ID LIKE CONCAT ('%',?,'%')";
		} else if ("3".equals(type)) {
			sql += " WHERE UI_PWD LIKE CONCAT ('%',?,'%')";
		}//'?' 는 String ? ''없이 ?만 집어 넣어야 바인딩
		try (Connection con = DBCon.getCon(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1,str);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfos.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}

	public static void main(String[] args) {
		UserInfoCRUD cuic = new UserInfoCRUD();
		List<Map<String, String>> userInfos = cuic.selectUserInfos2("1", "김");
		for (Map<String, String> userInfo : userInfos)
			System.out.println(userInfo);
	}
}