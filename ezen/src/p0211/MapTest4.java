package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest4 {

	public static void main(String[] args) {
		ArrayList<Map<String,Integer>> list = new ArrayList<>();
		HashMap<String,Integer> map;
		for(int i=1;i<=2;i++) {
			map = new HashMap<>();
			map.put("번호", i);
			list.add(map);
		}
		System.out.println(list.get(0));//{번호=1}, null   , {번호=2}, null
		System.out.println(list.get(1));//{번호=2}, {번호=2}, {번호=2}, null
	}
}
