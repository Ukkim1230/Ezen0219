package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {
	static List<Map<String, String>> getUserInfo() {
		List<Map<String,String>> maps = new ArrayList<>();
		Map<String,String> map = new HashMap<>();
		map.put("UI_NUM", "1");
		map.put("UI_NAME", "홍길동");
		map.put("UI_ID","hong");
		map.put("UI_PWD","1234");
		maps.add(map);
		Map<String,String> map2 = new HashMap<>();
		map.put("UI_NUM", "2");
		map.put("UI_NAME", "김길동");
		map.put("UI_ID","kim");
		map.put("UI_PWD","1234");
		maps.add(map2);
		Map<String,String> map3 = new HashMap<>();
		map.put("UI_NUM", "3");
		map.put("UI_NAME", "이길동");
		map.put("UI_ID","lee");
		map.put("UI_PWD","1234");
		maps.add(map3);
		Map<String,String> map4 = new HashMap<>();
		map.put("UI_NUM", "4");
		map.put("UI_NAME", "홍길동");
		map.put("UI_ID","hong");
		map.put("UI_PWD","1234");
		maps.add(map4);
		Map<String,String> map5 = new HashMap<>();
		map.put("UI_NUM", "5");
		map.put("UI_NAME", "김길동");
		map.put("UI_ID","kim");
		map.put("UI_PWD","1234");
		maps.add(map5);
		return maps;
	}
	public static void main(String[] args) {
		List<Map<String, String>> users = getUserInfo();
		for(Map<String,String> user:users) {
			System.out.println(user);
		}
	}
}
