package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1-10의 난수를 생성하구요
		// s의 nextLine()으로 값을 받아와서
		// 업앤다운을 완성하면 됩니다.
		// 예) 입력한 값이 4, 난수가 9 : 업
		// 입력한 값이 3, 난수가 1 :다운
		// 맞췄으면 맞췄따!
		
		System.out.print("숫자 입력 : ");
		String numStr = s.nextLine();
		Random r = new Random();
		int rNum = r.nextInt(10)+1; // 1부터 10까지의 난수가
		int num = Integer.parseInt(numStr); //입력한 숫자를 int로 변환
		if(num<rNum) {
			System.out.println("UP");
		}else if(num>rNum) {
			System.out.println("DOWN");
		}else {
			System.out.println("맞췄다");
		}
		System.out.println("난수 : " + rNum);
	}
}
