package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", "33");
		map.put("address", "한양");
		map.put("job", "도적");
		System.out.println(map);
	}
}
