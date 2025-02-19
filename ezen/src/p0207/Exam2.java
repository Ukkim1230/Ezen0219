package p0207;

import java.util.ArrayList;

public class Exam2 {
	static void test(int num) {
		num = 1;
	}
	static void test(ArrayList<Integer> nums) {
		nums.add(2);
		nums = new ArrayList<>();
	}
	public static void main(String[] args) {
		int num = 0;
		test(num);
		System.out.println(num);//0
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		System.out.println(nums);//[1]
		test(nums);
		System.out.println(nums);//[] or [1] or [1,2] 
		
	}
}




