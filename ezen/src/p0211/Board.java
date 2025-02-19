package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board {

	public static void main(String[] args) {		
		ArrayList<HashMap<String,String>> board = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			HashMap<String,String> row = new HashMap<>();
			row.put("name", "작성자" + i);
			row.put("title", "제목" + i);
			board.add(row);
		}
		
		System.out.println("번호 \t 제목 \t 작성자");
		for(int i=0;i<board.size();i++) {
			Map<String,String> row = board.get(i);
			System.out.println((i+1) + "\t" + row.get("title") + "\t" + row.get("name"));
		}
	}
}
