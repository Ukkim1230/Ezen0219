package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap4 {
	
	public static void main(String[] args) {
		String[] columns = {"UI_NUM", "UI_NAME", "UI_ID", "UI_PWD"};
		String[] datas = {
				"4,성룡,SUNG,1234"
				,"5,홍길동,hong,r1r2r3"
				,"6,홍길동,hong,r1r2r3"
				,"7,홍길동,hong,r1r2r3"
				,"8,홍길동,hong,r1r2r3"
		};
		List<Map<String,String>> users = new ArrayList<>();
		for(String data : datas) {
			String[] userData = data.split(",");
			Map<String,String> user = new HashMap<>();
			for(int i=0;i<columns.length;i++) {
				user.put(columns[i], userData[i]);
			}
			users.add(user);
		}
		for(Map<String,String> user: users) {
			System.out.println(user);
		}
	}

}
