package p0224;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {

	private static SqlSessionFactory ssf;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			ssf = ssfb.build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSSF() {
		return ssf;
	}
	public static void main(String[] args) {
		try (SqlSession session = ssf.openSession();) {
			List<Map<String, String>> foodInfos = session.selectList("p0224.FoodInfoMapper.selectFoodInfos");
			for (Map<String, String> foodInfo : foodInfos) {
				System.out.println(foodInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}