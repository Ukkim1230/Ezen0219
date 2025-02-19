package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		// nums에 1부터 100까지의 난수를 총 10개 추가해주세요(중복 가능)
		// 반복문을 사용해서 출력을 해주는데
		// 해당 값에 3이나 6이나 9이라는 숫자가 있다면 짝을 출력해주세요.
		Random r = new Random();
		while(nums.size()<10) {
			nums.add(r.nextInt(100)+1);
		}
//		for(int i=1;i<=10;i++) {
//			nums.add(r.nextInt(100)+1);
//		}
		
		for(int i=0;i<nums.size();i++) {
			int num = nums.get(i);
			// 3 , 6, 9
			// 13, 16, 19
			// 23, 26, 29
			num = num % 10;
			
		}
	}
}
