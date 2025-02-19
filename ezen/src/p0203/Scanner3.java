package p0203;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력해주세요 : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		num *= 10;
		System.out.println("입력하신 숫자에 10을 곱한 값 : " + num);
	}
}
