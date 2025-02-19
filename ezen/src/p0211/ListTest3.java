package p0211;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		//1-45까지의 난수를 생성하여
		//strs의 size가 6이 될때까지 추가하면됩니다.
		//단 중복은 안됩니다.
		Random r = new Random();
		while(strs.size()<6) {
			String num = r.nextInt(45)+1 + "";
			if(strs.indexOf(num)==-1) {
				strs.add(num);
			}
		}
		System.out.println(strs);
	}
}
