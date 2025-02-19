package p0204;

public class Array {

	public static void main(String[] args) {
		// 배열
		// 배열은 반드시 사이즈를 정해줘야됨.
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		// 사이즈를 늘리거나 줄일수가 없음
		int[] tmps = nums; //3
		nums = new int[4];
		for(int i=0;i<tmps.length;i++) {
			nums[i] = tmps[i];
		}
		System.out.println(nums[0]);
		
		tmps = nums; //4
		nums = new int[3];
		for(int i=0;i<nums.length;i++) {
			nums[i] = tmps[i];
		}
		
	}
}
