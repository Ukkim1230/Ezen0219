package p0206;

import java.util.Scanner;

public class StringTest8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1부터 45까지의 6개의 숫자를 ,를 기준으로 입력해주세요 : ");
		String str = s.nextLine();
		
		System.out.println("니가 쓴 숫자들 : " + str);
		

		String[] strs = str.split(",");//{1,2,3,4,5,6,7,8,9,10}
		int[] nums = new int[strs.length];//10
		for(int i=0;i<strs.length;i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		// str의 값을 "," 를 기준으로 분리하여
		// int[] nums에 저장하고
		// 출력해주세요.
	}
}
