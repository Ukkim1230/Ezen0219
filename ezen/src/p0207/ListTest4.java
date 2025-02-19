package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {

	public static void main(String[] args) {

		//nums의 1부터 10까지의 난수를 10개 추가해주시고
		//nums의 각 index에 어떤값이 있는지 출력해주세요.
		//ex) nums에 [1,20,31,45,55,7]이 저장되어 있다면
		//출력은 "nums[0]=1"
		// "nums[1]=20"
		// ...
		// "nums[5]=7" 이런식으로 출력되어야 합니다.
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i=1;i<=10;i++) {
			int rNum = r.nextInt(10)+1;//1-10
			if(nums.indexOf(rNum) != -1) {
				i--;
				continue;
			}
			nums.add(rNum);
		}
		while(nums.size()<10) {
			int rNum = r.nextInt(10)+1;//1-10
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println("nums[" + i + "]=" + nums.get(i));
		}
		
	}
}
