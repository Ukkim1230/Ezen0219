package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// 사용자한테 숫자를 입력받을 Scanner 를 만듬.
		Scanner scan = new Scanner(System.in);
		// 랜덤 숫자 1-100
		Random r = new Random();
		//맞출때까지 반복
		int rNum = r.nextInt(100)+1;
		int count = 1;
		while(true) {
			System.out.print("1-100까지 숫자입력 : ");
			String numStr = scan.nextLine();
			int num = Integer.parseInt(numStr);
			if(rNum< num) {
				System.out.println("DOWN");
			}else if(rNum>num) {
				System.out.println("UP");
			}else {
				System.out.println(count + "번 만에맞췄다.");
				break;
			}
			count++;
		}
		System.out.println("게임이 끝났습니다.");
		
	}
}
