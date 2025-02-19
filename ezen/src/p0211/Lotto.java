package p0211;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		// 1부터 45까지의 난수 6개를 lotto에 추가 합니다.
		// 단 중복을 제거합니다.
		// 추가한 후의 lotto의 값을 출력하면 됩니다.
		Random r = new Random();
		while(lotto.size()<6) {
			int rNum = r.nextInt(45)+1;
			if(lotto.indexOf(rNum)==-1) {
				lotto.add(rNum);
			}
		}
		System.out.println(lotto);
		
	}
}
