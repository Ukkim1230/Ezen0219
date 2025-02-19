package p0207;

import java.util.ArrayList;

public class StringTest3 {

	public static void main(String[] args) {
		// list에 1부터 100까지의 값을 순서대로 추가해주세요.
		// 반복문을 사용해서 차례대로 출력해주세요.
		// 단 3이나 6이나 9가 있는 스트링은 짝으로 출력해주세요.
		ArrayList<String> list = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			list.add(i + "");
		}
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");
			System.out.println(str);
		}
	}
}

