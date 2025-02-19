package p0207;

import java.util.ArrayList;

public class StringTest2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// list에 1부터 100까지의 값을 순서대로 추가해주세요.
		// 반복문을 사용해서 차례대로 출력해주세요.
		// 3이 있는 스트링은 짝으로 출력해주세요.
		for(int i=1;i<=100;i++) {
			list.add(i+""); //[1.... 100]
		}
		for(int i=0;i<list.size();i++) {
			String str = list.get(i); 
			if(str.contains("3")) {
				System.out.println("짝");
			}else {
				System.out.println(str);
			}
		}
	}
}
