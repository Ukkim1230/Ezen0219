package p0206;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// int[] nums라는 배열변수에
		// 0-9까지의 난수 3개를 입력하시고
		// 아래에서 비교하여 볼 스트라이크를 출력하고
		// 3개의 숫자와 자리수까지 다 맞으면 아웃이라고 출력후 반복문이 끝나면 됩니다.
		int[] nums = new int[3];
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(10);//0-9
		}
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자3개 : ");
			String num = s.nextLine();
			String[] strs = num.split(",");
			int[] myNums = new int[strs.length];
			for(int i=0;i<strs.length;i++) {
				myNums[i] = Integer.parseInt(strs[i]);
			}
			/*
			 * nums = 2,3,4
			 * myNums = 1,2,3
			 */
			int strike = 0;
			int ball = 0;
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<myNums.length;j++) {
					if(nums[i] == myNums[j]) {
						if(i==j) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			if(strike ==0 && ball ==0) {
				System.out.println("아웃");
			}else {
				System.out.println(strike + "스트라이크, " + ball + "볼");
			}
			if(strike==3) {
				break;
			}
		}
		System.out.println("게임이 끝났습니다.");
	}
}
