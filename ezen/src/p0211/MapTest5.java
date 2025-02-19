package p0211;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest5 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> list = new ArrayList<>();
		HashMap<String,String> map = new HashMap<>();
		map.put("1", "1");
		list.add(map);
		map = new HashMap<>();
		map.put("1", "2");
		list.add(map);

		System.out.println(list.get(0));//{1=1}
		System.out.println(list.get(1));//{1=2}
	}
}
