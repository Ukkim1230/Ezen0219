package p0211;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("로또번호를 ,를 기준으로 입력 : ");
		String lotto = scan.nextLine();
		System.out.println("니가 입력한 로또번호 : " + lotto);
		
		String[] strs = lotto.split(",");
		
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		while(nums.size()<6) {
			int rNum = r.nextInt(45)+1;
			if(nums.indexOf(rNum)==-1) {
				nums.add(rNum);
			}
		}
		System.out.println(nums);
		
		int count = 0;
		for(int i=0;i<strs.length;i++) {
			int num = Integer.parseInt(strs[i]);
			if(nums.indexOf(num)!=-1) {
				count++;
			}
		}
		System.out.println("맞은 갯수 : " + count);
	}
}
