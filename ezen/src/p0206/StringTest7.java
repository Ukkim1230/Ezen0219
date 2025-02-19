package p0206;

public class StringTest7 {

	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7,8,9,10";
		
		String[] strs = str.split(",");//{1,2,3,4,5,6,7,8,9,10}
		int[] nums = new int[strs.length];//10
		for(int i=0;i<strs.length;i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		// "," 를 기준으로 str을 분리하여
		// int[] nums에 저장한후
		// nums를 출력하면 됩니다.
	}
}
