package p0207;

public class Exam {
	static void test(int num) {
		num = 1;
	}
	static void test(int[] nums) {
		nums = new int[2];
	}
	
	public static void main(String[] args) {
		int num = 0;
		System.out.println(num);//0
		test(num);
		System.out.println(num);//0
		
		int[] nums = new int[1];
		System.out.println(nums.length);//1
		test(nums);
		System.out.println(nums.length);//1
	}
}
