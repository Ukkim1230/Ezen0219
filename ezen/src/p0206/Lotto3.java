package p0206;

public class Lotto3 {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6};
		int[] lotto = new int[] {2,11,4,21,2,41};
		
		int correctNum = 0;
		
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			for(int j=0;j<lotto.length;j++) {
				int targetNum = lotto[j];
				if(num == targetNum) {
					correctNum++;
				}
			}
		}
		System.out.println("맞은 갯수 : " + correctNum);
	}
}
