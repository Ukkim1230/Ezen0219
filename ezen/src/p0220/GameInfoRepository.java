package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p0219.DBCon;

public class GameInfoRepository {
	public GameInfoVO selectGameInfo(int giNum) {
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO"
				+ " WHERE GI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1,giNum);
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
	public static void main(String[] args) {
		GameInfoRepository giRepo = new GameInfoRepository();
		GameInfoVO game = giRepo.selectGameInfo(1);
		System.out.println(game);
		
		game = new GameInfoVO();
		game.setGiName("삼");
		//game.setGiPrice(30000);
		game.setGiGenre("전략");
		game.setGiDesc("옛날");
		List<GameInfoVO> gameInfoList = giRepo.selectGameInfoList(game);
		for(GameInfoVO gameInfo : gameInfoList) {
			System.out.println(gameInfo);
		}
	}
	public List<GameInfoVO> selectGameInfoList(GameInfoVO gameInfo){
		List<GameInfoVO> gameInfoList = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE 1=1 ";
		if(gameInfo!=null) {
			if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
				sql += " AND GI_NAME LIKE CONCAT('%',?,'%')";
			}
			if(gameInfo.getGiPrice()!=0) {
				sql += " AND GI_PRICE=?";
			}
			if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
				sql += " AND GI_GENRE LIKE CONCAT('%',?,'%')";
			}
			if(gameInfo.getGiDesc()!=null && gameInfo.getGiDesc().length()!=0) {
				sql += " AND GI_DESC LIKE CONCAT('%',?,'%')";
			}
		}
		System.out.println(sql);
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){

			if(gameInfo!=null) {
				if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
					ps.setString(1, gameInfo.getGiName());
				}
				if(gameInfo.getGiPrice()!=0) {
					if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
						ps.setInt(2, gameInfo.getGiPrice());
					}else {
						ps.setInt(1, gameInfo.getGiPrice());
					}
				}
				if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
					if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
						if(gameInfo.getGiPrice()!=0) {
							ps.setString(3, gameInfo.getGiGenre());
						}else {
							ps.setString(2, gameInfo.getGiGenre());
						}
					}else {
						if(gameInfo.getGiPrice()!=0) {
							ps.setString(2, gameInfo.getGiGenre());
						}else {
							ps.setString(1, gameInfo.getGiGenre());
						}
					}
				}
				if(gameInfo.getGiDesc()!=null && gameInfo.getGiDesc().length()!=0) {
					if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
						if(gameInfo.getGiPrice()!=0) {
							if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
								ps.setString(4, gameInfo.getGiDesc());
							}else {
								ps.setString(3, gameInfo.getGiDesc());
							}
						}else {
							if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
								ps.setString(3, gameInfo.getGiDesc());
							}else {
								ps.setString(2, gameInfo.getGiDesc());
							}
						}
					}else {
						if(gameInfo.getGiPrice()!=0) {
							if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
								ps.setString(3, gameInfo.getGiDesc());
							}else {
								ps.setString(2, gameInfo.getGiDesc());
							}
						}else {
							if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
								ps.setString(2, gameInfo.getGiDesc());
							}else {
								ps.setString(1, gameInfo.getGiDesc());
							}
						}
					}
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
	
	public int insertGameInfo(GameInfoVO gameInfo) {
		return 0;
	}
	
	public int updateGameInfo(GameInfoVO gameInfo) {
		return 0;
	}
	
	public int deleteGameInfo(int giNum) {
		return 0;
	}
}