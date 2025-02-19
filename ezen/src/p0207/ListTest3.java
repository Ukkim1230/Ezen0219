package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i=1;i<=6;i++) {
			nums.add(r.nextInt(45)+1);
		}
		for(int i=0;i<=5;i++) {
			System.out.println("nums[" + i + "]=" + nums.get(i));
		}
		//nums의 1부터 45까지의 난수를 6개 추가해주시고
		//nums의 각 index에 어떤값이 있는지 출력해주세요.
		//ex) nums에 [1,20,31,45,55,7]이 저장되어 있다면
		//출력은 "nums[0]=1"
		// "nums[1]=20"
		// ...
		// "nums[5]=7" 이런식으로 출력되어야 합니다.
	}
}
