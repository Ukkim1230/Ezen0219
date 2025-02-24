package p0224;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class FoodRepository {

	public List<Map<String, String>> selectFoodInfos(Map<String, String> foodInfo) {
		try (SqlSession session = MybatisConfig.getSSF().openSession();) {
			return session.selectList("p0224.FoodInfoMapper.selectFoodInfos", foodInfo);
		}
	}

	public Map<String, String> selectFoodInfo(int fiNum) {
		try(SqlSession session = MybatisConfig.getSSF().openSession();) {
			return session.selectOne("p0224.FoodInfoMapper.selectFoodInfo", fiNum);
		}
	}

	public static void main(String[] args) {
		FoodRepository foodRepo = new FoodRepository();
		Map<String, String> param = new HashMap<>();
		param.put("fiName", "밥");
		param.put("fiPrice", "3500");
		List<Map<String, String>> foodInfos = foodRepo.selectFoodInfos(param);
		for (Map<String, String> foodInfo : foodInfos) {
			System.out.println(foodInfo);
		}
		Map<String, String> foodInfo = foodRepo.selectFoodInfo(2);
		System.out.println(foodInfo);
	}
}
