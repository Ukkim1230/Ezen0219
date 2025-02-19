package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap2 {
	static List<Map<String, String>> getList() {
		List<Map<String, String>> maps = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "1");
		map.put("TV", "2,301");
		map.put("Online", "378");
		map.put("Newspaper", "692");
		Map<String, String> map2 = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "2");
		map.put("TV", "445");
		map.put("Online", "393");
		map.put("Newspaper", "451");
		Map<String, String> map3 = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "3");
		map.put("TV", "172");
		map.put("Online", "459");
		map.put("Newspaper", "693");
		Map<String, String> map4 = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "4");
		map.put("TV", "1,808");
		map.put("Online", "108");
		map.put("Newspaper", "584");
		maps.add(map);
		maps.add(map2);
		maps.add(map3);
		maps.add(map4);
		return maps;
	}

	public static void main(String[] args) {
		List<Map<String, String>> maps = getList();
		for(Map<String, String> map : maps) {
			System.out.println(map);

		}
	}
}