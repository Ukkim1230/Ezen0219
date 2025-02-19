package p0210;

import java.util.Scanner;

public class Gugudan3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		String dan = s.nextLine();
		System.out.println("입력하신단은 " + dan + "입니다.");
		//입력한 단의 구구단을 출력하는 구구단을 완성해주세요.
		int d = Integer.parseInt(dan);
		for(int i=1;i<=d;i++) {
			for(int j=1;j<=d;j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
}
