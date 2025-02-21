package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class FoodInfoRepository {

	public List<FoodInfoVO> selectFoodInfoList(FoodInfoVO foodInfo) {
		List<FoodInfoVO> foodInfoList = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if (foodInfo != null) {
			if (foodInfo.getFiName() != null) {
				sql += " AND FI_NAME LIKE CONCAT('%',?,'%')";
				params.add(foodInfo.getFiName());
			}
			if (foodInfo.getFiPrice() != 0) {
				sql += " AND FI_PRICE = ?";
				params.add(foodInfo.getFiPrice());
			}
		}
		System.out.println(sql);
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			if (foodInfo != null) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1,params.get(i));
				}
			}
//				if (foodInfo.getFiName() != null) {
//					ps.setString(1, foodInfo.getFiName());
//				}
//				if (foodInfo.getFiPrice() != 0) {
//					if (foodInfo.getFiName() != null) {
//						ps.setInt(2, foodInfo.getFiPrice());
//					} else {
//						ps.setInt(1, foodInfo.getFiPrice());
//					}
//				}
//			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FoodInfoVO food = new FoodInfoVO();
				food.setFiNum(rs.getInt("FI_NUM"));
				food.setFiName(rs.getString("FI_NAME"));
				food.setFiPrice(rs.getInt("FI_PRICE"));
				foodInfoList.add(food);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfoList;
	}
	public FoodInfoVO selectFoodInfo(int fiNum) {
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO WHERE FI_NUM=?";
		System.out.println(sql);
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, fiNum);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				FoodInfoVO food = new FoodInfoVO();
				food.setFiNum(rs.getInt("FI_NUM"));
				food.setFiName(rs.getString("FI_NAME"));
				food.setFiPrice(rs.getInt("FI_PRICE"));
				return food;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=?";
		try(Connection con =DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, fiNum);
			return ps.executeUpdate();				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int inserFoodInfo(FoodInfoVO foodInfo) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)"
				+ " VALUES(?,?)";
		try(Connection con =DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1,foodInfo.getFiName());
			ps.setInt(2, foodInfo.getFiPrice());
			return ps.executeUpdate();				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateFoodInfo(FoodInfoVO foodInfo) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME='간장치킨' WHERE FI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1,foodInfo.getFiName());
			ps.setInt(2, foodInfo.getFiPrice());
			ps.setInt(3,foodInfo.getFiNum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
		FoodInfoRepository fiRepo = new FoodInfoRepository();
		FoodInfoVO foodInfo = new FoodInfoVO();
		foodInfo.setFiName("김");
		foodInfo.setFiPrice(4500);
		List<FoodInfoVO> foodInfoList = fiRepo.selectFoodInfoList(foodInfo);
		for (FoodInfoVO food : foodInfoList) {
			System.out.println(foodInfo);
		}
//		foodInfo = fiRepo.selectFoodInfo(1);
//		System.out.println(foodInfo);
//		foodInfo = fiRepo.selectFoodInfo(300);
//		System.out.println(foodInfo);
//		int result = fiRepo.deleteFoodInfo(1);
//		System.out.println("삭제 개수 : " + result);
//		
//		foodInfo = new FoodInfoVO();
//		foodInfo.setFiName("쭈꾸미볶음");
//		foodInfo.setFiPrice(30000);
//		result = fiRepo.insertFoodInfo(foodInfo);
//		System.out.println("입력 개수 : " + result);
	}
}