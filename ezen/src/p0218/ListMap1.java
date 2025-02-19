package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap1 {

	static List<Map<String, String>> getUserInfo() {

		Map<String, String> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", "22");
		map.put("id", "hong");
		Map<String, String> map2 = new HashMap<>();
		map.put("name", "임꺽정");
		map.put("age", "33");
		map.put("id", "lim");
		Map<String, String> map3 = new HashMap<>();
		map.put("name", "유관순");
		map.put("age", "16");
		map.put("id", "yu");
		List<Map<String, String>> maps = new ArrayList<>();
		maps.add(map);
		maps.add(map2);
		maps.add(map3);
		return maps;
	}

	public static void main(String[] args) {
		List<Map<String, String>> users = getUserInfo();
		for (int i = 0; i < users.size(); i++) {
			Map<String, String> user = users.get(i);
			System.out.println("이름 : " + user.get("name"));
			System.out.println(",아이디 : " + user.get("id"));
			System.out.println(",나이 : " + user.get("age"));
		}
		// 향상된 포문 for(Map<String,String> user:users) 
	}

}