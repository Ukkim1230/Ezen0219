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

public class FoodInfoCRUD {

	public int insertFoodInfo(String fiName, String fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES('%s','%s')";
		sql = String.format(sql, fiName, fiPrice);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int insertUserInfo2(String fiName, String fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES(?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, fiName);
			ps.setString(2, fiPrice);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateFoodInfo(int fiNum, String fiName, String fiPrice) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME='순대'WHERE FI_NUM=%d";
		sql = String.format(sql,fiNum, fiName, fiPrice);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=" + fiNum;
		sql = String.format(sql, fiNum);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectFoodInfos(){
		List<Map<String,String>> foodInfos = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
		try(Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();){
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> foodInfo = new HashMap<>();
				foodInfo.put("FI_NUM", rs.getString("FI_NUM"));
				foodInfo.put("FI_NAME", rs.getString("FI_NAME"));
				foodInfo.put("FI_PRICE", rs.getString("FI_PRICE"));
				foodInfos.add(foodInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfos;
		
		}
	
	public List<Map<String,String>> selectFoodInfos2(String type, String str){
		List<Map<String,String>> foodInfos = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
		if("1".equals(type)) {
			sql += " WHERE FI_NAME LIKE CONCAT('%',?,'%')";
		}else if("2".equals(type)) {
			sql += " WHERE FI_PRICE LIKE CONCAT('%',?,'%')";
		}
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> foodInfo = new HashMap<>();
				foodInfo.put("FI_NUM", rs.getString("FI_NUM"));
				foodInfo.put("FI_NAME", rs.getString("FI_NAME"));
				foodInfo.put("FI_PRICE", rs.getString("FI_PRICE"));
				foodInfos.add(foodInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfos;
	}
	public static void main(String[] args) {
		FoodInfoCRUD cuic = new FoodInfoCRUD();
		List<Map<String,String>> foodInfos = cuic.selectFoodInfos2("1","만두");
		for(Map<String,String> foodInfo : foodInfos) {
			System.out.println(foodInfo);
		}
	}
}
