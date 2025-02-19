package p0206;

public class Lotto2 {
	static boolean exists(int[] nums, int num) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6};
		
		int[] lotto = new int[] {2,7,5,11,31,40};
		if(exists(nums,lotto[0])) {
			System.out.println(lotto[0] + "은 nums에 있다!!");
		}
		int correctNum = 0;
		for(int i=0;i<lotto.length;i++) {
			if(exists(nums,lotto[i])) {
				correctNum++;
			}
		}
		System.out.println("맞춘갯수 : " + correctNum);
	}
}
