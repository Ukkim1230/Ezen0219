package p0203;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		Random r = new Random();
		// 1부터 10까지의 난수 6개를 int배열변수에 저장 후
		// 반복문을 사용해서 출력해주세요.
		int[] nums = new int[6];
		
		for(int i=0;i<6;i++) {
			nums[i] = r.nextInt(10)+1;
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(nums[i]);
		}
	}
}
