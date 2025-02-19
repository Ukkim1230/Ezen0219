package p0204;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 6개의 사이즈를 가진 int배열 nums를 선언하고
		// 각방의 1부터 45까지의 난수를 대입해주세요.
		int[] nums = new int[6];
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(6)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		byte[] cs = new byte[3];
		System.out.println(cs);
	}
}
