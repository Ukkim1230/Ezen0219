package p0207;

import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		// 1부터 100까지의 난수를 nums에 대입하는데
		// 짝수이면서 3의 배수이거나 5의 배수일때만 대입해주세요
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(100)+1;
			if(nums[i] % 2 == 1) {
				i--;
			}
		}
		Array.printArray(nums);
	}
}
