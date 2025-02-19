package p0206;

import java.util.Random;

public class Duple {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(2)+5;//5,6
			for(int j=0;j<i;j++) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);			
		}
	}
}
