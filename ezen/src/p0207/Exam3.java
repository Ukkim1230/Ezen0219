package p0207;

import java.util.ArrayList;

public class Exam3 {
	static void test(int[] nums) {
		nums[0] = 1;
		nums = new int[3];
		nums[1] = 2;
	}
	static void test(ArrayList<Integer> nums) {
		nums.add(2);
		nums = new ArrayList<>();
		nums.add(1);
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		System.out.println(nums);//[1]
		
		nums = new ArrayList<>();
		System.out.println(nums);//[]
		
		test(nums);
		System.out.println(nums);//[2]
	}
}







