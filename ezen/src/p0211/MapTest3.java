package p0211;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<>();
		map1.put("이름", "김응룡");
		map1.put("나이", "35");
		map1.put("주소", "광주");
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("이름", "선동렬");
		map2.put("나이", "29");
		map2.put("주소", "부산");
		HashMap<String,String> map3 = new HashMap<>();
		map3.put("이름", "이적");
		map3.put("나이", "40");
		map3.put("주소", "서울");
		HashMap<String,String> map4 = new HashMap<>();
		map4.put("이름", "김동률");
		map4.put("나이", "7");
		map4.put("주소", "서울");
		ArrayList<HashMap<String,String>> maps = new ArrayList<>();
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);
		maps.add(map4);
		System.out.println(maps);
	}
}
