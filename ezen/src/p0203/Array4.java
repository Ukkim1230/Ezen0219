package p0203;

public class Array4 {

	public static void main(String[] args) {
		
		int[][] nums = new int[3][3];

		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println("nums[" + i + "][" + j + "]=" + nums[i][j]);
			}
		}
	}
}
