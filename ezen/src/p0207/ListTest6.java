package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// list에 1부터 100까지의 난수를 10개 집어넣고
		// 출력해주세요.
		Random r = new Random();
		while(list.size()<10) {
			list.add(r.nextInt(100)+1 + "");
		}
		System.out.println(list);
	}
}
