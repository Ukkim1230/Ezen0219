package p0203;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// 반복문을 사용해서 1부터 50까지의 합을 구하세요.
		Scanner s = new Scanner(System.in);
		System.out.print(" 어디까지 더할지 숫자를 입력하세요 : ");
		String strNum = s.nextLine();
		int max = Integer.parseInt(strNum);
		int result = 0;
		for(int i=1;i<=max;i++) {
			result += i;
		}
		System.out.println(result);
	}
}
