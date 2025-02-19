package p0205;

import java.util.Random;

public class MethodTest3 {
	static void setArray(int[] nums) {
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(10)+1;
		}
	}

	static void printArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		// 1부터 10까지의 난수를 생성해서
		// nums의 각 방에 입력해주세요.
		setArray(nums);
		printArray(nums);

		int[] nums1 = new int[50];
		setArray(nums1);
		printArray(nums1);
	}
}
