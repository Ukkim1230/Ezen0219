package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class GameInfoRepository {

	public List<GameInfoVO> selectGameInfoList(GameInfoVO gameInfo){
		List<GameInfoVO> gameInfoList = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if(gameInfo!=null) {
			if(gameInfo.getGiName()!=null){
			sql += " AND GI_NAME LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiName());
		}
		if(gameInfo.getGiPrice()!=0) {
			sql += " AND GI_PRICE = ?";
			params.add(gameInfo.getGiPrice());
		}
		if(gameInfo.getGiGenre()!=null) {
			sql += " AND GI_GENRE LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiGenre());
		}
		if(gameInfo.getGiDesc()!=null) {
			sql += " AND GI_DESC LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiDesc());
		}
	}
		System.out.println(sql);
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			if(gameInfo !=null) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1,params.get(i));
				}
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				GameInfoVO game = new GameInfoVO();
				game.setGiNum(rs.getInt("GI_NUM"));
				game.setGiName(rs.getString("GI_NAME"));
				game.setGiPrice(rs.getInt("GI_PRICE"));
				game.setGiGenre(rs.getString("GI_GENRE"));
				game.setGiDesc(rs.getString("GI_DESC"));
				gameInfoList.add(game);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gameInfoList;
	}
	public GameInfoVO selectGameInfo(int giNum) {
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE GI_NUM=?";
		System.out.println(sql);
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, giNum);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				GameInfoVO game = new GameInfoVO();
				game.setGiNum(rs.getInt("GI_NUM"));
				game.setGiName(rs.getString("GI_NAME"));
				game.setGiPrice(rs.getInt("GI_PRICE"));
				game.setGiGenre(rs.getString("GI_GENRE"));
				game.setGiDesc(rs.getString("GI_DESC"));
				return game;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int deleteGameInfo(int giNum) {
		String sql = "DELETE FORM GAME_INFO WHERE GI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, giNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int insertGaemInfo(GameInfoVO gameInfo) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)"
				+ " VALUES(?,?,?,?)";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, gameInfo.getGiName());
			ps.setInt(2,gameInfo.getGiPrice());
			ps.setString(3,gameInfo.getGiGenre());
			ps.setString(4, gameInfo.getGiDesc());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateGameInfo(GameInfoVO gameInfo) {
		String sql = "UPDATE GAME_INFO SET GI_NAME='배틀그라운드'WHERE GI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, gameInfo.getGiName());
			ps.setInt(2,gameInfo.getGiPrice());
			ps.setString(3,gameInfo.getGiGenre());
			ps.setString(4, gameInfo.getGiDesc());
			ps.setInt(5, gameInfo.getGiNum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
